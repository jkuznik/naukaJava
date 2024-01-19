package pl.jkuznik.webserviceexercise;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SequenceWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.google.common.base.Preconditions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

@RestController
public class UserController {

    private static final String filePath = "src/main/resources/users.csv";

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {

        List<User> currentUsersList = getUserList();

        return ResponseEntity.status(HttpStatus.OK).body(currentUsersList);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id) {

        List<User> currentUsersList = getUserList();
        User responseUser = null;

        if(!isUserIdValid(id)) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseUser);

        for (User user : currentUsersList) {
            if (user.id() == id) responseUser = user;
        }

        return ResponseEntity.status(HttpStatus.OK).body(responseUser);
    }

    @PostMapping("/users")
    @ResponseBody
    public ResponseEntity<String> addUser(@RequestBody User requestUser, UriComponentsBuilder uriComponentsBuilder) {

        File file = new File(filePath);
        ObjectWriter writer = getWriter();

        List<User> currentUsersList = getUserList();
        List<User> newUsersList = new ArrayList<>(currentUsersList);

        int lastId = currentUsersList.getLast().id();

        User newUser = new User(lastId + 1, requestUser.name(), requestUser.age(), requestUser.isMale());
        newUsersList.add(newUser);

        if(!isRequestDataValid(newUser)){
            return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).build();
        }

        try (SequenceWriter sequenceWriter = writer.writeValues(file)) {
            sequenceWriter.writeAll(newUsersList);
        } catch (IOException e) {
            System.out.println("Błąd zapisu pliku, nie dodano użytkownika");
            e.printStackTrace();
            throw new NoSuchElementException(e);
        }

        String newResourceUri = uriComponentsBuilder
                .path("/users/{id}")
                .buildAndExpand(newUser.id())
                .toUriString();

        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Dodano użytkownika, nowy użytkownik dostępny pod adresem " + newResourceUri);
    }

    @PutMapping("users/{id}")
    public ResponseEntity<User> updateUserAllValues(@PathVariable int id, @RequestBody User requestUser) {

        if(!isUserIdValid(id)) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(requestUser);

        if(!isRequestDataValid(requestUser)) {
            return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).build();
        }

        File file = new File(filePath);
        ObjectWriter writer = getWriter();

        List<User> currentUsersList = getUserList();
        List<User> newUsersList = new ArrayList<>();
        User newUser = null;

        for (User user : currentUsersList) {
            if (user.id() == id) {
                newUser = new User(id, requestUser.name(), requestUser.age(), requestUser.isMale());
                newUsersList.add(newUser);
            } else newUsersList.add(user);
        }

        try (SequenceWriter sequenceWriter = writer.writeValues(file)) {
            sequenceWriter.writeAll(newUsersList);
        } catch (IOException e) {
            System.out.println("Błąd zapisu pliku, nie dodano użytkownika");
            e.printStackTrace();
            throw new NoSuchElementException(e);
        }

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(newUser);
    }

    @PatchMapping("/users/{id}")
    public ResponseEntity<User> updateUserAnyValue(@PathVariable int id, @RequestBody User requestUser) {

        if(!isUserIdValid(id)) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(requestUser);

        File file = new File(filePath);
        ObjectWriter writer = getWriter();
        List<User> currentUsersList = getUserList();
        List<User> newUsersList = new ArrayList<>();
        User responseUser = null;
        String name;
        Integer age;
        Boolean isMale;

        for (User currentUser : currentUsersList) {
            if (currentUser.id() == id) {

                if (Objects.isNull(requestUser.name())) {    // Jeżeli podano
                    name = currentUser.name();
                } else name = requestUser.name();       // update imienia

                if (Objects.isNull(requestUser.age())) {    // Jeżeli podano
                    age = currentUser.age();
                } else age = requestUser.age();         // update wieku

                if (Objects.isNull(requestUser.isMale())) {   // Jeżeli podano
                    isMale = currentUser.isMale();
                } else isMale = requestUser.isMale();  // update płci ?? :/

                responseUser = new User(id, name, age, isMale);
                newUsersList.add(responseUser);
            } else newUsersList.add(currentUser);
        }

        try (SequenceWriter sequenceWriter = writer.writeValues(file)) {
            sequenceWriter.writeAll(newUsersList);
        } catch (IOException e) {
            System.out.println("Błąd zapisu pliku, nie dodano użytkownika");
            e.printStackTrace();
            throw new NoSuchElementException(e);
        }

        return ResponseEntity.status(HttpStatus.OK).body(responseUser);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id){

        if(!isUserIdValid(id)) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        File file = new File(filePath);
        ObjectWriter writer = getWriter();

        List<User> currentUsersList = getUserList();
        List<User> newUsersList = new ArrayList<>();

        for (User user : currentUsersList){
            if(user.id() != id) newUsersList.add(user);
        }

        try (SequenceWriter sequenceWriter = writer.writeValues(file)) {
            sequenceWriter.writeAll(newUsersList);
        } catch (IOException e) {
            System.out.println("Błąd zapisu pliku, nie dodano użytkownika");
            e.printStackTrace();
            throw new NoSuchElementException(e);
        }

        return ResponseEntity.status(HttpStatus.OK).build();
    }


    private ObjectReader getReader(boolean setUseHeader) {

        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = getSchema(true);

        ObjectReader reader = csvMapper.readerFor(User.class).with(schema);

        return reader;
    }

    private ObjectWriter getWriter() {

        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = getSchema(true);

        ObjectWriter writer = csvMapper.writerFor(User.class).with(schema);

        return writer;
    }

    private List<User> getUserList() {

        File file = new File(filePath);
        ObjectReader reader = getReader(true);
        List<User> usersList = new ArrayList<>();

        try (MappingIterator<User> usersMapping = reader.readValues(file)) {
            usersList = usersMapping.readAll();
        } catch (IOException e) {
            System.out.println("Problem z odczytaniem pliku");
        }

        return usersList;
    }

    private CsvSchema getSchema(boolean setUseHeaders) {

        CsvSchema schema = CsvSchema.builder()
                .addColumn("id")
                .addColumn("name")
                .addColumn("age")
                .addColumn("isMale")
                .setUseHeader(setUseHeaders)
                .build();

        return schema;
    }

    public boolean isUserIdValid(int id){

        List<User> currentUsersList = getUserList();
        boolean idValid = false;

        for (User user : currentUsersList){
            if(user.id() == id) idValid = true;
        }

        return idValid;
    }

    public boolean isRequestDataValid(User user){

//        Preconditions.checkArgument(user.id() instanceof Integer || user.id() == null,
//                "Podaj właściwie id");
//        Preconditions.checkArgument(user.name() instanceof String || user.name() == null,
//                "Podaj właściwie imię");
//        Preconditions.checkArgument(user.age() instanceof  Integer || user.age() == null,
//                "Podaj właściwie wiek");
//        Preconditions.checkArgument(user.isMale() instanceof Boolean || user.isMale() == null,
//                "Podaj właściwie płeć");

        if (user.id() == null || !(user.id() instanceof Integer)) return false;
        if (user.name() == null || !(user.name() instanceof String)) return false;
        if (user.age() == null || !(user.age() instanceof Integer)) return false;
        if (user.isMale() == null || !(user.isMale() instanceof Boolean)) return false;

        return true;
    }

}



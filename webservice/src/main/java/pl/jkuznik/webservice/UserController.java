package pl.jkuznik.webservice;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
public class UserController {

    private static final File file = new File("src/main/resources/users.csv");

    @GetMapping("users")
    public ResponseEntity<List<User>> getUsers() {

        List<User> users = getUserList();

        return ResponseEntity.ok(users);
    }

    @PostMapping("users")
    public ResponseEntity<User> addUser(@RequestBody User requestUser) {

        CSVPrinter printer = getCSVPrinter(true, true);
        List<User> usersList = getUserList();

        int lastId = usersList.getLast().id();

        User responseUser = new User((lastId + 1), requestUser.name(), requestUser.age(), requestUser.isMale());

        try (printer) {
            printer.printRecord((lastId + 1), requestUser.name(), requestUser.age(), requestUser.isMale());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(responseUser);
    }

    @PutMapping("users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User requestUser) {
        List<User> currentUserList = getUserList();
        List<User> newUserList = new ArrayList<>();
        CSVPrinter printer = getCSVPrinter(false, false);
        User updateUser = null;

        for (User currentUser : currentUserList) {
            if (currentUser.id() == id) {
                updateUser = new User(id, requestUser.name(), requestUser.age(), requestUser.isMale());
                newUserList.add(updateUser);
            } else {
                newUserList.add(currentUser);
            }
        }

        try (printer) {
            for (User user : newUserList) {
                printer.printRecord(user.id(), user.name(), user.age(), user.isMale());
            }
        } catch (IOException e) {
            System.out.println("tutaj wywala");
        }

        return ResponseEntity.ok(updateUser);
    }
    @DeleteMapping("users/{id}")
    private ResponseEntity<Void> deleteUser(@PathVariable int id){
        List<User> userList = getUserList();
        List<User> newUserList = new ArrayList<>();
        CSVPrinter printer = getCSVPrinter(false, false);

        for(User user : userList){
            if(!(user.id()==id)) newUserList.add(user);
        }

        try (printer) {
            for (User user : newUserList) {
                printer.printRecord(user.id(), user.name(), user.age(), user.isMale());
            }
        } catch (IOException e) {
            System.out.println("tutaj wywala");
        }

        return ResponseEntity.noContent().build();
    }
    private List<User> getUserList() {
        Reader userFile = getFileReader();
        CSVFormat csvFormat = getCSVFormat(true);
        CSVParser parser = getParser(csvFormat, userFile);

        return parser.stream()
                .map(record -> {
                    int id = Integer.parseInt(record.get("id"));
                    String name = record.get("name");
                    int age = Integer.parseInt(record.get("age"));
                    boolean isMale = Boolean.parseBoolean(record.get("isMale"));

                    return new User(id, name, age, isMale);
                })
                .sorted(Comparator.comparing(User::id))
                .toList();
    }
    private Reader getFileReader() {
        try {
            Reader users = new FileReader(file);
            return users;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private CSVFormat getCSVFormat(boolean setSkipHeaderRecord) {
        return CSVFormat.DEFAULT.builder()
                .setSkipHeaderRecord(setSkipHeaderRecord)
                .setHeader("id", "name", "age", "isMale")
                .build();
    }
    private CSVParser getParser(CSVFormat formatedFile, Reader file) {
        CSVParser parsedInputData;
        try {
            return parsedInputData = formatedFile.parse(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private FileWriter getFileWriter(boolean append) {

        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file, append);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return fileWriter;
    }
    private CSVPrinter getCSVPrinter(boolean append, boolean setSkipHeaderRecord) {

        CSVFormat csvFormat = getCSVFormat(setSkipHeaderRecord);
        CSVPrinter printer;
        try {
            printer = new CSVPrinter(getFileWriter(append), csvFormat);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return printer;
    }
}

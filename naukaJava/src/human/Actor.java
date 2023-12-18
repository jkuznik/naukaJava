package human;

import java.util.List;

public interface Actor{

    String getActingSchool();
    void setActingSchool(String actingSchool);
    List<String> getFilms();
    void setFilms(List<String> films);
    void addFilm(String filmName);
    Gender getGender();
    void setGender(Gender gender);


//    private String actingSchool;
//    private List<String> filmList;
//    private String genre;
//    private Gender gender;
//
//    public Actor(String name, int age, double height, String actingSchool, String genre, Gender gender) {
//        super(name, age, height);
//        this.actingSchool = actingSchool;
//        this.genre = genre;
//        this.gender = gender;
//    }

}

package human;

import java.util.List;

public interface Musician{

    String getMusicSchool();
    void setMusicSchool(String musicSchool);
    List<String> getSongs();
    void setSongs(List<String> songs);
    String getGenre();
    void setGenre(String genre);
    Gender getGender();
    void setGender(Gender gender);

//    private String musicSchool;
//    private String genre;
//    private List<String> songList;
//    private Gender gender;
//
//    public Musician(String name, int age, double height, String musicSchool, String genre, Gender gender) {
//        super(name, age, height);
//        this.musicSchool = musicSchool;
//        this.genre = genre;
//        this.gender = gender;
//
//    }
//
//    public Gender getGender(){
//        System.out.println(getComment());
//        return gender;
//    }
//
//    public String getComment(){
//        return gender.comment();
//    }                                 // Zakomentowana część to kod sprzed zmiany Musician z klasy na interface
}

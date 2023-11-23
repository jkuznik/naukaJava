package Human;

import java.util.List;

public class Musician extends Human {
    private String musicSchool;
    private String genre;
    private List<String> songs;

    public Musician(String name, int age, float height,
                    String musicSchool, String genre){

        super(name, age, height);
        this.musicSchool = musicSchool;
        this.genre = genre;
        this.songs = songs;

    }
    public Musician(int age, String musicSchool){
        super(age);
        this.musicSchool = musicSchool;
    }

    public int getTimeToLive() {
        return (LIFESPAN - getAge()) / 2;
    }
// other code omitted
}


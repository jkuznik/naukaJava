package human;

import java.util.List;

public class Performer extends Human implements Musician, Actor {

    private String musicSchool;
    private String genre;
    private List<String> songs;
    // fields specific to actor
    private String actingSchool;
    private List<String> films;

    public Performer(String name, int age, double height, Gender gender) {
        super(name, age, height, gender);
    }

    @Override
    public int getTimeToLive() {
        return (super.getTimeToLive() / 2);
    }

    public String getMusicSchool() {
        return musicSchool;
    }
    public void setMusicSchool(String musicSchool) {
        this.musicSchool = musicSchool;
    }

    public String getActingSchool() {
        return actingSchool;
    }
    public void setActingSchool(String actingSchool) {
        this.actingSchool = actingSchool;
    }

    @Override
    public List<String> getFilms() {
        return null;
    }

    @Override
    public void setFilms(List<String> films) {

    }

    @Override
    public void addFilm(String filmName) {

    }

    @Override
    public List<String> getSongs() {
        return null;
    }

    @Override
    public void setSongs(List<String> songs) {

    }

    @Override
    public String getGenre() {
        return null;
    }

    @Override
    public void setGenre(String genre) {

    }
}

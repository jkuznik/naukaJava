package Human;

public class Artist extends Human {

    private String nick;

    private String genre;

    public Artist(String name, int age, float height, String nick,
                  String genre){

        super(name, age, height);
        this.nick = nick;
        this.genre = genre;
    }
    public Artist(String name, int age, float height, String nick,
                  String genre, Gender gender){
        super(name, age, height);
        this.nick = nick;
        this.genre = genre;
        //this.getGender() = gender;

    }
    public int getTimeToLive(){
        return (LIFESPAN-getAge());
    }
}

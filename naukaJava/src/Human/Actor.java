package Human;

import java.util.List;

public class Actor extends Human {
    private String actingSchool;
    private List<String> films;

    public Actor(String name, int age, float height, String actingSchool,
                 List<String> films){

        super(name, age, height);
        this.actingSchool = actingSchool;
        this.films = films;
    }

    public int getTimeToLive(){
        return (LIFESPAN - getAge()) / 2;
    }
}

package Human;

public abstract class Human {

    public static final int LIFESPAN = 100;
    protected String name;
    protected int age;
    protected float height;
    protected int ttl;
    private Gender gender;


    // constructors below
    public Human(int age){
        this.age = age;
    }
    public Human(int age, float height){
        this.age = age;
        this.height = height;
    }
    public Human(String name, int age, float height){
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public Human(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Human(String name, int age, float height, Gender gender){
        this(name, age, gender);
        this.height = height;
    }

    // methods below
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void computAndPrintTtl (){
        ttl =LIFESPAN - age;
        System.out.println(name + "owi pozostało " + ttl + " lat życia");
    }


    /*public Gender getGender(){
        return gender;
    }*/

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public abstract int getTimeToLive();

}



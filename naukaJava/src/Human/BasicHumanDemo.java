package Human;

public class BasicHumanDemo {
    public static void main(String[] args) {

        for (Gender value : Gender.values()) {
            System.out.println(value.getClass());
        }

        Human human = new Musician("Jaś", 5, 10, "Opole", "Rock");
        Human michal = new Artist("Michal", 20, 20,"MJ", "Pop", Gender.MALE);

        human.setGender(Gender.MALE);    //human.name = "Fred";
        human.setAge(45);    //human.age = 45;
        human.setHeight(1.7f);    //human.height = 1.7f;






        System.out.println("Imie " + human.getName()); //        System.out.println("Imie :" + human.name);
        System.out.println("Wiek " + human.getAge()); //        System.out.println("Wiek :" + human.age);
        System.out.println("Wzrost " + human.getHeight()); //        System.out.println("Wzrost :" + human.height);
        System.out.println("Czas życia Freda:" + human.LIFESPAN);
        System.out.println("Czas życia ludzi:" + Human.LIFESPAN);

        human.computAndPrintTtl();

        System.out.println("Na potwierdzenie - Fredowi pozostało " + human.getTimeToLive() );
        

    }
}

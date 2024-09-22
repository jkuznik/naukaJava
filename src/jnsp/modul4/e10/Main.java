package jnsp.modul4.e10;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        LenghtValidator checkLenght = new LenghtValidator();
        CharacterVaidator checkChar = new CharacterVaidator();

        System.out.println(PasswordValidator.passValidate2("zgodne"));


        user.setPassword("Ja1adfs32", checkLenght, checkChar);
    }
}

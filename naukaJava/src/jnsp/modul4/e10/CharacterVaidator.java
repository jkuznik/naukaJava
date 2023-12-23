package jnsp.modul4.e10;

public class CharacterVaidator implements PasswordValidator{
    @Override
    public boolean passValidate(String password) {
        if (password.contains("#") || password.contains("$")){
            System.out.println("Hasło zawiera nie dozwolone znaki");
            return false;
        } else return true;
    }
}

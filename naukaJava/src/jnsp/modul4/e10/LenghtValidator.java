package jnsp.modul4.e10;

public class LenghtValidator implements PasswordValidator{
    @Override
    public boolean passValidate(String password) {
        if (password.length() < 8) {
            System.out.println("Hasło za krótkie");
            return false;
        }else return true;
    }
}

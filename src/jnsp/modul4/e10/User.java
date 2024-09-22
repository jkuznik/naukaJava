package jnsp.modul4.e10;

public class User {

    private boolean checkPass;
    public void setPassword(String password, PasswordValidator validator, PasswordValidator validator2){

        checkPass = (validator.passValidate(password) && validator2.passValidate(password));
        if( checkPass) {
            System.out.println("Hasło ustawione");
        }

    }

    protected void testDostepu(){
        System.out.println("Jest dostęp");
    }
}

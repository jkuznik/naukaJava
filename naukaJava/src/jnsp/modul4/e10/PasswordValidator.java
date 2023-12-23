package jnsp.modul4.e10;

public interface PasswordValidator {

    boolean passValidate(String password) ;
    static boolean passValidate2(String password){
        System.out.println("pasuje");
        return true;
    }
}

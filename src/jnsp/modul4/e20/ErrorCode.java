package jnsp.modul4.e20;

public enum ErrorCode {

    FORBIDDEN("Zaginiony"), NOT_FOUND("Nie znaleziono"), NO_ACCESS("Brak dostępu");


    private final String description;

    public String getDescription() {
        return description;
    }

    ErrorCode(String description){
        this.description = description;
    }

}

package jnsp.modul4.e20;

public class Main {
    public static void main(String[] args) {

        RequestHandler requestHandler = new RequestHandler();

        ErrorCode myCode = ErrorCode.NOT_FOUND;

        System.out.println(requestHandler.requestHandler());
        System.out.println(myCode);

        System.out.println(myCode.getDescription());

        ErrorCode[] values = ErrorCode.values();

        for(ErrorCode value : values){
            System.out.println(value);
        }
    }
}

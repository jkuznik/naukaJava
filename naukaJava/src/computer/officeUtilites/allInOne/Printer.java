package computer.officeUtilites;

public class Printer implements AllInOne{

    private String name;
    private String text;


    public Printer(String name){
        this.name = name;
    }
    @Override
    public String print(String text) {
        this.text = text;
        return text;
    }

    @Override
    public String scan(String text) {
        return "Scan is not available";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public AllInOneType getType() {
        return null;
    }
}

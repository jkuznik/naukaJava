package computer.allInOne;

public class OfiiceUtilites {

    private String name;
    private String text;

    AllInOne allInOne;

    public OfiiceUtilites(AllInOne allInOne){
        this.allInOne = allInOne;
    }

    public AllInOne allInOne() {
        return allInOne;
    }

    public String setText(String text) {
        this.text = text;
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

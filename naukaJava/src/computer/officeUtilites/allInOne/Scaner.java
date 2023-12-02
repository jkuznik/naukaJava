package computer.officeUtilites.allInOne;

import computer.officeUtilites.allInOne.AllInOne;

public class Scanner extends AllInOneAbstract implements AllInOne {

    public Scanner(String name) {
        this.name = name;
    }

    @Override
    public String print(String text) {
        return "Print is not avaiable";
    }

//    @Override
//    public String scan(String text) {
//        this.text = text;
//        return text;
//    }

//    @Override
//    public String getName() {
//        return name;
//    }

    @Override
    public AllInOneType getType() {
        return allInOneType.SCANNER;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Drzewo {
    private int liscie = 3000;

    public void opadanieLisci(){

        Random rand = new Random();

        int iloscZdarzen=0;
        int iloscZdarzen0=0;
        int iloscZdarzen03=0;
        int iloscZdarzen47=0;
        int iloscZdarzen810=0;
        int ileOpadlo;

        List<Integer> listaZdarzen = new ArrayList<>();
        int obecnyNajwiekszyOpad= 0;
        int indeksNajwiekszegoOpadu= 0;
        int ineksNajmniejszegoOpadu= 0;

        do{
            int obecneZdarzenie = rand.nextInt(100)+1;
            iloscZdarzen++;

            if(obecneZdarzenie<=20){
                iloscZdarzen810++;

                int min= 8;
                int max= 10;
                ileOpadlo = rand.nextInt(max - min +1) + min;
                
                if(liscie>ileOpadlo) {
                    liscie -= ileOpadlo;
                } else {
                    ileOpadlo = liscie;
                    liscie = 0;
                }
                
                listaZdarzen.add(ileOpadlo);
            } else if (obecneZdarzenie>20 && obecneZdarzenie<=50) {
                iloscZdarzen47++;

                int min= 4;
                int max= 7;
                ileOpadlo = rand.nextInt(max - min +1) + min;

                if(liscie>ileOpadlo) {
                    liscie -= ileOpadlo;
                } else {
                    ileOpadlo = liscie;
                    liscie = 0;
                }

                listaZdarzen.add(ileOpadlo);
            } else if (obecneZdarzenie>51) {
                iloscZdarzen03++;

                int min= 0;
                int max= 3;
                ileOpadlo = rand.nextInt(max - min +1) + min;

                if(liscie>ileOpadlo) {
                    liscie -= ileOpadlo;
                } else {
                    ileOpadlo = liscie;
                    liscie = 0;
                }

                if(ileOpadlo==0) iloscZdarzen0++;

                listaZdarzen.add(ileOpadlo);
            }
        }while(liscie==0);

        int sumaOpadow = listaZdarzen.stream()
                .skip(Math.max(0, iloscZdarzen - 10))
                .limit(Math.min(10, iloscZdarzen))
                .mapToInt(Integer::intValue)
                .sum();
        if(obecnyNajwiekszyOpad<sumaOpadow) {
            obecnyNajwiekszyOpad = sumaOpadow;
            indeksNajwiekszegoOpadu = iloscZdarzen;
        }
    }
}

package jnsp.modul3.endExercises;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Exercise7 {
    public static void main(String[] args) {

        String startText= """
                        
                        Witamy w naszej wypożyczalni!
   
                1. Wypożycz samochód
                2. Oddaj samochód
                3. Lista dostępnych samochodów
                4. Moja lista wypożyczonych samochodów
                5. Wyjście
                """;


        String car;
        String choice;
        int available;

        HashMap<String, Integer> carList = new HashMap<>();
        ArrayList<String> myCars = new ArrayList<>();

        carList.put("Audi", 2);
        carList.put("BMW", 1);
        carList.put("Citroen", 3);
        carList.put("Daihatsu", 9);
        carList.put("Ford", 2);
        carList.put("Honda", 1);
        carList.put("Kia", 2);
        carList.put("Vw", 2);


        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println(startText);
            choice = scanner.nextLine();

            switch(choice){
                case "1" ->{
                    if(myCars.size()==3) {
                        System.out.println("Nie możesz wypożyczyć kolejnego samochodu, posiadasz już 3");

                        for(String currentCar : myCars){
                            System.out.println("Samochód " + currentCar);
                        }
                        break;
                    }

                    System.out.println("Jaki samochód chcesz wypożyczyć: ");
                    car = scanner.nextLine();

                    if(carList.containsKey(car)) {
                        available = carList.get(car) -1;
                        if(available==0) carList.remove(car);
                        else carList.put(car, available);

                        myCars.add(car);
                    } else System.out.println("Nie posiadamy takiego samochodu");

                }

                case "2" ->{
                    System.out.println("Który samochód chcesz oddać: ");
                    car = scanner.nextLine();

                    if(!myCars.contains(car)){
                        System.out.println("Nie posiadasz takiego samochodu");
                        break;

                    } else if(myCars.contains(car)) {

                        if(carList.containsKey(car)){
                            available = carList.get(car) + 1;
                            carList.put(car, available);
                        } else carList.put(car, 1);

                        myCars.remove(car);

                    }
                }

                case "3" ->{
                    Set<String> cars = carList.keySet();

                    for(String currentCar : cars){
                        System.out.println("Samochód: " + currentCar + " , dostępnych " + carList.get(currentCar));
                    }
                }

                case "4" ->{
                    System.out.println("Lista obecnie posiadanych przez Ciebie samochodów: ");

                    if(myCars.size()==0) {
                        System.out.println("Obecnie nie posiadasz żadnego wypożyczonego samochodu");
                        break;
                    }

                    for(String currentCar : myCars){
                        System.out.println("Samochód " + currentCar);
                    }
                }

                case"5" ->{
                    break;
                }

                default -> System.out.println("Zły format wyboru");
            }

        } while(!choice.equals("5"));
    }
}



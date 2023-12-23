package jnsp.modul4.e07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Ford", "Mondeo", "Black", 2015, 55, 6.5, 184321);

        String name;
        double money;
        double loan;
        double fuelPrice;
        double fuelTank;
        double usedFuel;
        double currentFuel;
        double distance;
        double tripDistance=0;
        String choice;

        Scanner scanner = new Scanner(System.in);

        String text= """
                        Symulator podróży

                          --------0 
                         /                      
                        |
                         \\
                          |
                     -----/  
                X---/       
                """;

        System.out.println(text);

        System.out.println("Jak masz na imię ");
        name = scanner.nextLine();

        System.out.println("Podaj aktualną cenę paliwa [zł/L]");
        fuelPrice = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Podaj ile masz pięniędzy [zł]");
        money = scanner.nextDouble();
        scanner.nextLine();

        Driver driver = new Driver(money, name);

        System.out.println("Witaj " + driver.getName());

        do{
            System.out.println();
            System.out.println( driver.getName() + " wybierz czynność");
            System.out.println("1. Jedź ");
            System.out.println("2. Zatankuj");
            System.out.println("3. Sprawdz poziom paliwa");
            System.out.println("4. Sprawdz aktualny przebieg");
            System.out.println("5. Sprawdz dystans aktualnej wycieczki");
            System.out.println("6. Sprawdz zawartość portfela");
            System.out.println("7. Weź pożyczkę");
            System.out.println("8. Zakończ");
            choice = scanner.nextLine();

            switch(choice){
                case "1" -> {
                    System.out.println("\t\t\tJak daleko chcesz pojechać: ");
                    distance = scanner.nextDouble();
                    scanner.nextLine();

                    if(distance <= (   (100/ car.getCombustion()) * car.getFuelLevel() ) ) {

                        usedFuel = (car.getCombustion() * (distance/100) );

                        System.out.println("\t\t\tPrzejechałeś " + distance + " km i zużyłeś " + usedFuel);

                        tripDistance += distance;
                        car.drive(distance);
                        car.setMilage((car.getMilage() + distance));

                        currentFuel = (car.getFuelLevel() - usedFuel);
                        car.setFuelLevel(currentFuel);

                    } else System.out.println("\t\tNie możesz tak daleko jechać, musisz dotankować");
                }

                case "2" -> {
                    System.out.println("\t\t\tAktualna cena paliwa to " + fuelPrice);
                    System.out.println("\t\t\tIle paliwa chcesz zatankować:");
                    fuelTank = scanner.nextDouble();
                    scanner.nextLine();

                    if((   car.getTankCapacity() - car.getFuelLevel()   ) < fuelTank && (fuelTank * fuelPrice) < driver.getMoney()){
                        fuelTank = car.getTankCapacity() - car.getFuelLevel();
                        System.out.println("\t\t\tNie możesz tyle zatankować, do pełnego baku brakuje Ci " +
                                fuelTank + " i tyle zatankowano");
                    } else if((fuelTank * fuelPrice) > driver.getMoney()) {
                        System.out.println("\t\t\tNie masz tyle pieniędzy");
                        break;
                    }

                    car.setFuelLevel(car.getFuelLevel()+fuelTank);
                    driver.setMoney(   driver.getMoney() - (fuelTank * fuelPrice) );
                }

                case "3" -> System.out.println("\t\t\tTwój atkualny poziom paliwa to " + car.getFuelLevel() +
                        " z " + car.getTankCapacity());

                case "4" -> System.out.println("\t\t\tTwój aktualny przebieg to " + car.getMilage());

                case "5" -> System.out.println("\t\t\tDystans wycieczki: " + tripDistance);

                case "6" -> System.out.println("\t\t\tAkutalnie posiadasz " + driver.getMoney());

                case "7" -> {
                    System.out.println("\t\t\tIle chcesz pożyczyć: ");
                    loan = scanner.nextDouble();
                    scanner.nextLine();

                    driver.setMoney(   driver.getMoney() + loan);
                }
                case "8" -> {
                    break;
                }

                default -> System.out.println("\t\t\tZły format wyboru");
            }
        }while(!choice.equals("8"));

    }
}

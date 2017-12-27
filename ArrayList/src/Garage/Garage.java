package Garage;

import static Garage.Main.sc;
import java.util.ArrayList;

public class Garage {

    private static ArrayList<Car> myCar = new ArrayList<Car>();

    static Car c1 = new Car(En_Model.BMW, 40_000, En_Color.BLACK);
    static Car c2 = new Car(En_Model.AUDI, 10_000, En_Color.SILVER);
    static Car c3 = new Car(En_Model.HYUNDAI, 15_000, En_Color.SILVER);

    public void addToGarage() {
        myCar.add(c1);
        myCar.add(c2);
        myCar.add(c3);

        showCars();
    }

    public void addCarsByKeyboard() {

        while (true) {
            System.out.print("Model?");
            String model = sc.nextLine();

            System.out.print("Price");
            int price = sc.nextInt();
            sc.nextLine();

            System.out.println("Get Me color");
            String color = sc.nextLine();
            myCar.add(new Car(En_Model.valueOf(model.toUpperCase()), price, En_Color.valueOf(color.toUpperCase())));

            System.out.println("Do u want one more Car? Y/N?");
            String ans = sc.nextLine();

            if (ans.equalsIgnoreCase("n")) {
                System.out.println("Thanks!");
                break;
            }

        }
    }

    public void showCars() {
        System.out.println(myCar);
    }

    public void deleteCarById() {
        while (true) {
            Car temp = null;

            System.out.print("Id please: ");
            int idCar = Main.sc.nextInt();
            Main.sc.nextLine();

            for (Car c : myCar) {
                if (c.getIdCar() == idCar) {
                    temp = c;
                }
            }

            myCar.remove(temp);
            showCars();

            System.out.println("Another ID? Y/N");
            String answ = sc.nextLine();

            if (answ.equalsIgnoreCase("n")) {
                System.out.println("Thank you!");
                break;
            }
        }
    }
}

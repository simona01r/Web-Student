package Garage_Simple;

import Garage.En_Color;
import java.util.ArrayList;

public class ArrayList_Garage {

    private static ArrayList<ArrayList_Car> myCar = new ArrayList<ArrayList_Car>();

    public void addToGarage(ArrayList_Car car) {
        myCar.add(car);
    }

    public void showCars() {
        System.out.println(myCar);
    }

    public void deleteSomeCars(ArrayList_Car c) {
        myCar.remove(c);
    }

    public void deleteSomeCars(int price, En_Color color) {
        ArrayList_Car temp = null;

        
        
        for (ArrayList_Car c : myCar) {
            if (c.getPrice() == price && c.getColor().equals(color)) {
                temp = c;
            }
        }
        myCar.remove(temp);
    }

    
    
}

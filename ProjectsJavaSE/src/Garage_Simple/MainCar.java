
package Garage_Simple;

import Garage.En_Color;
import Garage.En_Model;


public class MainCar {
    public static void main(String[] args) {
        
        ArrayList_Garage g =new ArrayList_Garage();
        ArrayList_Car c = new ArrayList_Car(En_Model.BMW,40000,En_Color.BLACK);
        
        g.addToGarage(c);
        g.addToGarage(new ArrayList_Car(En_Model.VOLVO,10000,En_Color.RED));
        
        g.showCars();
        
        g.deleteSomeCars(40000,En_Color.BLACK);
         System.out.println("after delete the one item");
         
         g.showCars();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

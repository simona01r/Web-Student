
package Garage_Simple;

import Garage.En_Color;
import Garage.En_Model;


public class ArrayList_Car {
    private En_Model  model;
    private int price;
    private En_Color color;
    private static int id=1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public ArrayList_Car (En_Model model,int price, En_Color color){
        this.id=id;
        id++;
        this.model=model;
        this.price=price;
        this.color=color;
    }

    public En_Model getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public En_Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "[" + model + " " + price +" "+ color + " "+id+"]";
    }
  
}

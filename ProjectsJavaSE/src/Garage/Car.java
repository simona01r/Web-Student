package Garage;


public class Car {

    private En_Model model;
    private int price;
    private En_Color color;
    private int idCar;
    private static int idGenerator=100;
    
public Car(){}

    public Car(En_Model model,int price, En_Color color){
        this.model=model;
        this.price=price;
        this.color=color;
        this.idCar=idGenerator;
        idGenerator++;
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
    
        public int getIdCar() {
        return idCar;
    }
    

    @Override
    public String toString() {
        return "[Id: "+idCar+" Car: "+ " Model: " + model + ", price: " + price + ", color: " + color+"]";
    }

    public void setModel(En_Model model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(En_Color color) {
        this.color = color;
    }

}

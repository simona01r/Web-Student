
package Constructor;


public class ConstructorComputer {
    private int computerId;
    private String model;
    private String operaterSystem;
    private int price;
    
 public ConstructorComputer(int computerId,String model,String operaterSystem, int price){
    this.computerId=computerId;
    this.model=model;
    this.operaterSystem=operaterSystem;
    this.price=price;
     }   

    public int getComputerId() {
        return computerId;
    }

       public String getModel() {
        return model;
    }

    public String getOperaterSystem() {
        return operaterSystem;
    }

    public int getPrice() {
        return price;
    }
     
}

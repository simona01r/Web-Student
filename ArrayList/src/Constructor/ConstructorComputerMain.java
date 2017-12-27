package Constructor;

public class ConstructorComputerMain {

    public static void main(String[] args) {
        ConstructorComputer myComputer = new ConstructorComputer(123, "Acer 2000", "Linux", 8000);
        System.out.println(myComputer.getComputerId()+ " "+myComputer.getModel()+
        myComputer.getOperaterSystem()+ " "+ myComputer.getPrice() );
    }
}

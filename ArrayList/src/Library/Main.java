package Library;

public class Main {

    static Library lb = new Library();
    

    public static void main(String[] args) {
        while (true) {
            switchCase(menu());
        }
    }

    public static void switchCase(int choice) {
        switch (choice) {
            case 1:
                lb.addToLibrary();
                break;
            case 2:
                lb.addByKeyboard();
                break;
            case 3:
                lb.showBooks();
                break;
            case 4:
                lb.deleteById();
                break;
            case 5:
                lb.deleteByPrice();
                break;
            case 6:
                lb.deleteByType();
                break;
            case 7:
                lb.deleteBy_Type_Sample();
                break;
            case 8:
                break;
            default:
                System.out.println("Try again!!!");
        }
    }

    private static int menu() {
            
        System.out.println("\n****************Menu****************");

        System.out.println("1.Add  created book...b1,b2,b3...");
        System.out.println("2.Add books by KEYBOARD");
        System.out.println("3.Show Books");
        System.out.println("4.Delete Car by ID");
        System.out.println("5.Delete Car by PRICE");
        System.out.println("6.Delete Car by Type = {romans,poems,theatre,comedia,drama}");
        System.out.println("7.Delete Car by Price && Sample = {printable,pdf,powerpoint,word}");
        System.out.println("8.Terminate program\n");
        
        System.out.print("Make a choice: ");
        int choice = Library.sc.nextInt();
        Library.sc.nextLine();
        
        return choice;
    }

}

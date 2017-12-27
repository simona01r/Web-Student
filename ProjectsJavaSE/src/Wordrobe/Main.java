package Wordrobe;


public class Main {
    
 static Warderobe w= new Warderobe();   

    public static void main(String[] args) {

        while (true) {
            switchCase(menu());
        }
    }

    public static void switchCase(int option) {
        switch (option) {
            case 1:
                 w.addExistedCloth();
                break;
            case 2:
                 w.addClothByKeyboard();
                break;
            case 3:
                 w.showCloths();
                break;
            case 4:
                 w.deleteById();
                break;
            case 5:
                 w.deleteBy_Size_Color();
                break;
            case 6:
//                 w.addCloth();
                break;
            case 7:
//                 w.addCloth();
                break;
            case 8:
//                 w.addCloth();
                break;
            default:
                System.out.println("Try again!!!");
        }
        
    }
    
    public static int menu(){
        System.out.println("\n_________________________________________");
        System.out.println("___________________________________________");
        System.out.println("1. Add existed cloths");
        System.out.println("2. Add cloths by Keyboard");
        System.out.println("3. Show cloths");
        System.out.println("4. Delete By ID");
        System.out.println("5. Delete By Size && Color = {RED, BLACK,WITHE, BLUE,PURPLE,YELLOW,BROWN}");
        System.out.println("6. Delete By Size && Type = {SKIRT,SHIRT,PANT,BLOUSE,TOP,JEANS,SCARF;}");
        System.out.println("7. Show a cloth");
        System.out.println("8. Find a cloth by ID");
        System.out.println("9. Teriminate");
        
        System.out.println("Choose an option:");
        int option = Warderobe.sc.nextInt();
        Warderobe.sc.nextLine();

        return option;
        
        
    }
    
    
    
}


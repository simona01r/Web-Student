package Wordrobe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javafx.scene.paint.Color;

public class Warderobe {

    static Scanner sc = new Scanner(System.in);

    private ArrayList<Cloth> myCloth = new ArrayList<>();

    public void addExistedCloth() {
        myCloth.add(new Cloth(En_Type.PANT, En_Color.BLUE, 30));
        myCloth.add(new Cloth(En_Type.SKIRT, En_Color.RED, 34));
        myCloth.add(new Cloth(En_Type.TOP, En_Color.WHITE, 42));
        myCloth.add(new Cloth(En_Type.BLOUSE, En_Color.PURPLE, 46));
        myCloth.add(new Cloth(En_Type.SHIRT, En_Color.YELLOW, 36));
        showCloths();
    }

    public void addClothByKeyboard() {
        System.out.println("Insert type-> pant, skirt, top, blouse, shirt: ");
        String t = sc.nextLine();

        System.out.println("Insert colour-> blue, red, white,purple, yellow: ");
        String c = sc.nextLine();

        System.out.println("Insert a size: ");
        int s = sc.nextInt();
        sc.nextLine();

        myCloth.add(new Cloth(En_Type.valueOf(t.toUpperCase()), En_Color.valueOf(c.toUpperCase()), s));
        showCloths();
    }

    public void showCloths() {
        System.out.println(myCloth);
    }

    public void deleteById() {
// Since ID is uniq we gonna use a reference(temp) NOT an Array List (like case 5)
        Cloth temp = null;

        while (true) {

            System.out.println("Insert an Id:");
            int id = sc.nextInt();
            sc.nextLine();

            for (Cloth c : myCloth) {
                if (c.getIdCloth() == id) {
                    temp = c;
                }
            }
            myCloth.remove(temp);
            showCloths();

            System.out.println("Another ID?");
            String answ = sc.nextLine();

            if (answ.equalsIgnoreCase(answ)) {
                System.out.println("Thank you!");
                break;
            }
        }

    }

//    Case 5 with ArrayList
//    public void deleteBy_Size_Color() {
//
//        ArrayList<Cloth> temp = new ArrayList<>();
//
//
//        while (true) {
//            System.out.println("Insert size:");
//            int s = sc.nextInt();
//            sc.nextLine();
//            
//            System.out.println("Insert a colour!");
//            String c = sc.nextLine();
//            
//            for(Cloth stuff:myCloth){
//                if(stuff.getSize()==s && stuff.getColor().equals(En_Color.valueOf(c.toUpperCase()))) {
//                 temp.add(stuff);
//                }
//            }
//            myCloth.removeAll(temp);
//            showCloths();
//            
//            System.out.println("Delete by OTHER size & type? Y/N");
//            String answ = sc.nextLine();
//
//            if (answ.equalsIgnoreCase("n")) {
//                System.out.println("Tanks!");
//                break;
//            }
//        }
//    }
//    Case 5 with ITERATOR!!!
    public void deleteBy_Size_Color() {
        Cloth temp = null;

        while (true) {
            System.out.println("Insert size:");
            int s = sc.nextInt();
            sc.nextLine();

            System.out.println("Insert a colour!");
            String c = sc.nextLine();

            Iterator<Cloth> it = myCloth.iterator();
            while (it.hasNext()) {
                System.out.println("while");
               temp=it.next();
                if (temp.getColor().equals(En_Color.valueOf(c.toUpperCase())) &&  (temp.getSize()==s)){
                 //   if (it.next().getColor().equals(En_Color.valueOf(c.toUpperCase()))) {

                        System.out.println("if");
                        it.remove();
                        showCloths();
                    }
                }

            
            System.out.println("Delete by OTHER size & type? Y/N");
            String answ = sc.nextLine();
            if (answ.equalsIgnoreCase("n")) {
                System.out.println("Tanks!");
                break;
            }
        }
    }

}

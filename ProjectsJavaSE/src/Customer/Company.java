package Customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Company {

    static private ArrayList<Customer> myCust = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addCust() {
        myCust.add(new Customer(Gender.MISS, "Diana", 20));
        myCust.add(new Customer(Gender.MRS, "Maria", 65));
        myCust.add(new Customer(Gender.MRS, "Simona", 40));
        myCust.add(new Customer(Gender.MR, "Gunnar", 53));
        myCust.add(new Customer(Gender.MISS, "Addi", 19));

        showCust();
    }
//    public static void addParametru(Customer c){
//        myCust.add(c);
//    }

//    
//    public static void addByKeyboard() {
//
//        while (true) {
//            System.out.println("Insert a title = {mrs,mr,miss}");
//            String t = sc.nextLine();
//
//            System.out.println("Insert a name:");
//            String n = sc.nextLine();
//
//            System.out.println("Insert the age:");
//            int a = sc.nextInt();
//            sc.nextLine();
//
//            myCust.add(new Customer(Gender.valueOf(t.toUpperCase()), n.toUpperCase(), a));
////            myCust.add(new Customer(Gender.valueOf(t.toUpperCase()), n, a));
//            showCust();
//
//            System.out.println("Do u want one more item?Y/N?");
//            String ans = sc.nextLine();
//
//            if (ans.equalsIgnoreCase("n")) {
//                System.out.println("Thanks!");
//                break;
//
//            }
//        }
//    }
    public static void addByKeyboard() {

        while (true) {
            Customer c = new Customer();
            System.out.println("Insert a gender = {mrs,mr,miss}");
            c.setGender(Gender.valueOf(sc.nextLine().toUpperCase()));

            System.out.println("Insert a name:");
            c.setName(sc.nextLine());

            System.out.println("Insert the age:");
            c.setAge(sc.nextInt());
            sc.nextLine();

            myCust.add(new Customer(c.getGender(), c.getName(), c.getAge()));
            showCust();

//                              OR normal way/ without FORE:
//                System.out.println("Insert a gender = {mrs,mr,miss}");
//                String g= sc.nextLine();
//
//                System.out.println("Insert a name:");
//                String n= sc.nextLine();
//
//                System.out.println("Insert the age:");
//                int a=sc.nextInt();
//                sc.nextLine();
//            myCust.add(new Customer(Gender.valueOf(g.toUpperCase()), n.toUpperCase(), a));
//            myCust.add(new Customer(Gender.valueOf(g.toUpperCase()), n, a));
            System.out.println("Do u want one more item?Y/N?");
            String ans = sc.nextLine();

            if (ans.equalsIgnoreCase("n")) {
                System.out.println("Thanks!");
                break;
            }
        }
    }

    public static void showCust() {
        for (Customer c : myCust) {
            System.out.println(c);
        }
//        System.out.print(myCust);
    }

    public static void deleteById() {
        Customer temp = null;

        while (true) {
            System.out.println("Insert the id:");
            int id = sc.nextInt();
            sc.nextLine();

            for (Customer c : myCust) {
                if (c.getIdCust() == id) {
                    temp = c;
                }
            }
            myCust.remove(temp);
            showCust();

            System.out.println("Another Id? Y/N?");
            String ans = sc.nextLine();

            if (ans.equalsIgnoreCase("n")) {
                System.out.println("Thanks!");
                break;
            }
        }
    }


    public static void deleteBy_Gender_Name() {

        ArrayList<Customer> myTemp = new ArrayList<>();

        while (true) {
            System.out.println("Insert a gender:");
            String titlu = sc.nextLine();

            System.out.println("Insert a name:");
            String nume = sc.nextLine();

            for (Customer c : myCust) {
                if (c.getGender().equals(Gender.valueOf(titlu.toUpperCase())) && c.getName().equalsIgnoreCase(nume)) {
                    myTemp.add(c);
                }
            }

            myCust.removeAll(myTemp);
            showCust();

            System.out.println("\nAnother Title/Name? Y/N?");
            String ans = sc.nextLine();

            if (ans.equalsIgnoreCase("n")) {
                System.out.println("Thanks!");
                break;
            }
        }
    }

//      Case 6 cu Iterator!!!!!
    public static void deleteByGender() {

        Customer temp = null;

        while (true) {
            System.out.println("Insert gender ={mrs,miss,mr}");
            String gender = sc.nextLine();

            Iterator<Customer> it = myCust.iterator();
            while (it.hasNext()) {
                temp = it.next();
                if (temp.getGender().equals(Gender.valueOf(gender.toUpperCase()))) {
//                    System.out.println("if");
                    it.remove();
                    showCust();
                }
            }

            System.out.println("Delete by OTHER gender? Y/N");
            String answ = sc.nextLine();
            if (answ.equalsIgnoreCase("n")) {
                System.out.println("Tanks!");
                break;

            }
        }
    }

    public static void findById() {
        Customer temp = null;

        while (true) {
            System.out.println("Insert the id:");
            int id = sc.nextInt();
            sc.nextLine();

            for (Customer c : myCust) {
                if (c.getIdCust() == id) {
                    temp = c;
                }
            }

            System.out.println(temp);

            System.out.println("Another Id? Y/N?");
            String ans = sc.nextLine();

            if (ans.equalsIgnoreCase("n")) {
                System.out.println("Thanks!");
                break;
            }
        }
    }

    public static void findBy_Gender() {
        ArrayList<Customer> myTemp = new ArrayList<>();

        while (true) {
            System.out.println("Insert a gender:");
            String titlu = sc.nextLine();

            for (Customer c : myCust) {
                if (c.getGender().equals(Gender.valueOf(titlu.toUpperCase()))) {
                    myTemp.add(c);
                }
            }

            System.out.println(myTemp);

            System.out.println("\nAnother Title/Name? Y/N?");
            String ans = sc.nextLine();

            if (ans.equalsIgnoreCase("n")) {
                System.out.println("Thanks!");
                break;
            }
        }
    }

}

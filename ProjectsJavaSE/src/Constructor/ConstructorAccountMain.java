package Constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConstructorAccountMain {  
    
    static ArrayList<ConstructorAccount> accountList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;
    

    private static void createAccount() {
        System.out.println("Give me account id");
        int id= sc.nextInt();
          sc.nextLine();
          
        System.out.println("Give me account balance");
        int balance=sc.nextInt();
          sc.nextLine();
          
        System.out.println("Give me a name");
        String name=sc.nextLine();
        
        ConstructorAccount ac=new ConstructorAccount(id, name, balance);
        accountList.add(ac);
    }

  

    public static void main(String[] args) {
        while (loop) {
            switchChoice(menu());
        }
    //    ConstructorAccount myAccount = new ConstructorAccount(122, "Simona", 1000);
     //   System.out.println(myAccount.getName() + " " + myAccount.GetAccountId() + " " + myAccount.GetBalance());
    }

    private static void switchChoice(int choice) {

        switch (choice) {
            case 1:
                createAccount();
                break;

            case 2:
                showAll();
                break;

            case 3:
                loop=false;
                System.out.println("Tack och hej!");
                break;

        }

    }

    private static int menu() {
        System.out.println("1. Create accout");
        System.out.println("2. Show all accouts");
        System.out.println("3. Exit");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    private static void showAll() {
        System.out.println(accountList);
    }

}

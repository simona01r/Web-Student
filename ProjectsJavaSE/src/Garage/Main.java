package Garage;

import Garage.Garage;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;
    static Garage g = new Garage();

    public static void main(String[] args) {
        while (loop) {
            switchChoice(menu());
        }
    }

    public static void switchChoice(int choice) {

        switch (choice) {
            case 1:
                g.addCarsByKeyboard();
                break;
            case 2:
                g.addToGarage();
                break;
            case 3:
                g.deleteCarById();
                break;
            case 4:
                g.showCars();
                break;
            case 5:
                loop = false;
                break;
            default:
                System.out.println("No option/ try again");
        }
    }

    private static int menu() {
        System.out.println("\n****************Menu****************");
        System.out.println("************************************");
        System.out.println("1.Add cars by Keyboard");
        System.out.println("2.Add  created cars...c1,c2,c3...");
        System.out.println("3.Delete cars by ID");
        System.out.println("4.Show the cars");
        System.out.println("5.Terminate program\n");
        System.out.print("Make a choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        return choice;

    }

}

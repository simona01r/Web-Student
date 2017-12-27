package Constructor;

import java.util.Scanner;

public class CalculRest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        int a = sc.nextInt();

        System.out.println("Input the second number:");
        int b = sc.nextInt();
                    System.out.println(a-b*(a/b));

    }

}

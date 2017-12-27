package Constructor;

import java.util.Scanner;

public class ReturnMinIfRestIsEqual {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        int i = sc.nextInt();
        System.out.println("Input the second number:");
        int j = sc.nextInt();

        if (i%6!=j%6) {
            if (i>j)
                System.out.println("The result " + i);
            else
                System.out.println(""+j);
        }else
           if (i<j)
                System.out.println("The result " + i);
            else
                System.out.println(""+j);
   
        if (i == j) {
            System.out.println("Result is 0");
        } 

    }
}

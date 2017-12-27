package Constructor;

import java.util.Scanner;

public class Two_integers_common_digit {

    public static void main(String[] args) {
        boolean var = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        String a = sc.nextLine();

        System.out.println("Input the second number:");
        String b = sc.nextLine();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    var = true;
                    break;
                }
            }
            if (var == true) {
                System.out.println("Resultat : True");
            } else {
                System.out.println("No common digits");
            }
        }

    }
}

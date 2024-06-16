package testing;

import java.util.Scanner;

public class a6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lebar;
        System.out.print("Masukkan lebar : ");
        lebar = input.nextInt();

        for (int i = 0; i <= lebar; i++) {
            for (int j = 0; j < lebar - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
           
            for (int k = 0; k <= lebar; k++) {
                for (int j = 0; j <= k; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j < lebar - k; j++) {
                    System.out.print(" *");
                }
                System.out.println(" ");
            }
        

    }

}

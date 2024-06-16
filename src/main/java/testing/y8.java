package testing;

import java.util.Scanner;

public class y8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kotak;
        System.out.print("Masukkan kotak : ");
        kotak = input.nextInt();
        for (int i = 1; i <= kotak; i++) {

            for (int j = 1; j <= kotak; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}

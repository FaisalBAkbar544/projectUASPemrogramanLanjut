package testing;
//tinggi segitiga 3

import java.util.Scanner;

public class y6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tinggi, k = 0;
        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                k++;
                System.out.print(k + " ");
            }
            System.out.println();

        }
    }
}

package testing;

import java.util.Scanner;

public class a2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tinggi;
        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextInt();
        System.out.println();
        for (int i = 0; i < tinggi; i++) {
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

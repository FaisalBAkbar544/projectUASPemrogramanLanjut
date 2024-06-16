package testing;

import java.util.Scanner;

public class y1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2;
        System.out.print("Masukkan bilangan pertama : ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan terakhir : ");
        bil2 = input.nextInt();

        for (int i = bil1; i <= bil2; i++) {
            System.out.print(i + " ");
            if (i % 2 == 1) {
                System.out.println("Bilangan ganjil");
            } else {
                System.out.println("Bilangan genap");
            }
        }
    }

}

package testing;

import java.util.Scanner;

public class y3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal, akhir;
        System.out.print("Masukkan angka awal : ");
        awal = input.nextInt();
        System.out.print("Masukkan angka akhir : ");
        akhir = input.nextInt();

        while (awal <= akhir) {
            System.out.print(awal + " ");
            if (awal % 2 == 0) {
                System.out.println("Bilangan genap ");
            } else {
                System.out.println("Bilangan ganjil");
            }
            awal++;

        }
    }

}

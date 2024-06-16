package a1Tugas;

import java.util.Scanner;

public class latihan41 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, kali;
        System.out.print("Masukkan angka pilihan anda : ");
        angka = input.nextInt();

        System.out.print("Masukkan angka perkalian sampai berapa : ");
        kali = input.nextInt();

        for (int i = 1; i <= kali; i++) {
            angka *= kali;
            System.out.println(angka);
        }

    }

}

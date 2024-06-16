package a2UTS;

import java.util.Scanner;

public class perulangan4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan angka : ");
        angka = input.nextInt();
        System.out.println("Tek kotek kotek, anak ayam turun berkotek");
        while (angka >= 2) {
            System.out.println("Anak ayam turunlah," + angka + " mati satu tinggalah, " + (angka - 1));
            angka--;
        }
        System.out.println("Anak ayam turunlah,1 mati satu tinggalah induknya");

    }

}

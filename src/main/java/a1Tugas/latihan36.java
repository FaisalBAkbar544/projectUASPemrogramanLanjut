package a1Tugas;

import java.util.Scanner;

public class latihan36 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, bil1, bil2, hasil = 0;
        String operasi = null;
        System.out.println("Menu Aplikasi Matematika : ");
        System.out.println("1. Penambahan   2. Pengurangan   3. Perkalian  4. Pembagian");
        System.out.print("Pilih Menu : ");
        menu = input.nextInt();
        System.out.print("Masukkan angka pertama : ");
        bil1 = input.nextInt();
        System.out.print("Masukkan angka kedua : ");
        bil2 = input.nextInt();

        switch (menu) {
            case 1 :
                operasi = "Penambahan";
                hasil = bil1 + bil2;
                break;
            case 2:
                operasi = "Pengurangan";
                hasil = bil1 - bil2;
                break;
            case 3:
                operasi = "Perkalian";
                hasil = bil1 * bil2;
                break;
            case 4:
                operasi = "Pembagian";
                hasil = bil1 / bil2;
                break;
           
        }
        System.out.println("Hasil dari " + operasi + " antara " + bil1 + " dan " + bil2 + " adalah " + hasil);
    }

}

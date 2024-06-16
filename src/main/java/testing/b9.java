package testing;

import java.util.Scanner;

public class b9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah, cari, arr, i;
        int[] angka = new int[1000];
        System.out.print("Jumlah element array yang mau dimasukkan : ");
        jumlah = input.nextInt();

        System.out.println("Anda ingin memasukkan : " + jumlah + " angka ");
        for (i = 0; i < jumlah; i++) {
            System.out.print("Anda memasukkan angka ke-" + (i + 1) + " : ");
            angka[i] = input.nextInt();

        }
        System.out.print("Input index yang akan anda cari : ");
        cari = input.nextInt();

        for (int j = 0; j < jumlah; j++) {
            if (angka[j] == cari) {
                System.out.println("angka ditemukan pada index ke-" + j);
                break;
            }
        }

        if (i == jumlah) {
            System.out.println("Angka tidak ditemukan");
        }
        System.out.println();

    }
}

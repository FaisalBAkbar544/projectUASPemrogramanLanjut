package a1Tugas;

import java.util.Scanner;

public class ArrayStatistika {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[100_000];
        int jumlah, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        double average = 0;
        System.out.print("Jumlah angka yang ingin diinput : ");
        jumlah = input.nextInt();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            nilai[i] += input.nextInt();

            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        for (int j = 0; j <= jumlah; j++) {
            if (nilai[j] > max) {
                max = nilai[j];
            }

            average += (double) nilai[j];

        }
        average /= jumlah;
        System.out.println("Nilai terbesar : " + max);
        System.out.println("Nilai terkecil : " + min);
        System.out.println("Rata-rata : " + average);
    }

}

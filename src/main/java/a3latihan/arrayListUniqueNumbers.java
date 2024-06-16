package a3latihan;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class arrayListUniqueNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> angka = new ArrayList<>();
        int jumlahInput, angkaInputan;
        System.out.print("Masukkan jumlah inputan : ");
        jumlahInput = input.nextInt();

        for (int i = 0; i < jumlahInput; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            angkaInputan = input.nextInt();
            if (!angka.contains(angkaInputan)) {
                angka.add(angkaInputan);
            }

        }
        Collections.sort(angka);

        System.out.println(angka);

    }
}

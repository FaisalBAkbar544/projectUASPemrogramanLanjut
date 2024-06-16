package testing;

import java.util.Scanner;

public class b7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lesgo = 0, count, element;
        int[] angka = new int[1_000];
        System.out.print("Masukkan jumlah elemen Array : ");
        element = input.nextInt();

        System.out.println("Jumlah angka yang mau dimasukkan : " + element + " Click Enter");
        for (int i = 0; i < element; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            angka[i] = input.nextInt();
            lesgo += angka[i];
        }
        System.out.println("Hasilnya adalah : " + lesgo);
    }

}

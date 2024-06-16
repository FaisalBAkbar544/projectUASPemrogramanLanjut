package testing;

import java.util.Scanner;

public class b2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int akhir;
        System.out.print("Masukkan angka akhir : ");
        akhir = input.nextInt();
        for (int i = 1; i <= akhir; i++) {
            System.out.print(i + "  ");
        }
    }

}

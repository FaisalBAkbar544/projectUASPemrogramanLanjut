package testing;

import java.util.Scanner;

public class b5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deret, hasil = 0;
        System.out.print("Masukkan penjumlahan deret : ");
        deret = input.nextInt();

        for (int i = 1; i <= deret; i++) {
            hasil += i;
            System.out.print(i + " + ");

        }
        System.out.print(" = " + hasil);
    }

}

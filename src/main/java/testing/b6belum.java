package testing;

import java.util.Scanner;

public class b6belum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deret, angkaN = 0, bil1 = 0, bil2 = 1;
        System.out.print("Masukkan deret akhir : ");
        deret = input.nextInt();
        for (int i = 0; i <= deret; i++) {
            angkaN = bil1 + bil2;
            bil1 = bil2;
            angkaN = bil1;
            System.out.println(angkaN);

        }
        
    }
}

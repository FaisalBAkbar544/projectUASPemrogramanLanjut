package testing;

import java.util.Scanner;

public class b3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kelipatan, awal, akhir;
        System.out.print("Masukkan kelipatan : ");
        kelipatan = input.nextInt();
        System.out.print("Masukkan nilai awal : ");
        awal = input.nextInt();
        System.out.print("Masukkan nilai akhir : ");
        akhir = input.nextInt();

        for (int i = awal; i <= akhir; i += kelipatan) {
            System.out.print(i + " ");
        }
    }

}

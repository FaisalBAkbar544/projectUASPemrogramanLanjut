package testing;

import java.util.Scanner;

public class b8belum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama = new String[100];
        int ngulang, ambil, coun = 0;

        System.out.print("Berapa kali anda mau memasukkan nama : ");
        ngulang = input.nextInt();
        input.nextLine();
        System.out.println("Jumlah nama yang mau anda masukkan adalah : " + ngulang);
        System.out.println();
        for (int i = 0; i < ngulang; i++) {

            System.out.print("Masukkan nama yang ke-" + (i + 1) + " : ");
            nama[coun] = input.nextLine();
            coun++;
        }

        System.out.print("Masukkan index nama yang mau anda ambil : ");
        ambil = input.nextInt();

        String diambil = nama[ambil];
        System.out.print("Berikut nama yang anda ambil : " + diambil);

    }

}

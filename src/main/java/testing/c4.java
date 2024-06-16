package testing;

import java.util.Scanner;

public class c4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaBarang, si;
        int hargaBarang;
        System.out.println("----------------------");
        System.out.println("Program kenaikan pajak");
        System.out.println("----------------------");
        System.out.print("Masukkan nama barang : ");
        namaBarang = input.nextLine();
        System.out.print("Masukkan satuan barang : ");
        si = input.nextLine();
        System.out.print("Masukkan harga barang : ");
        hargaBarang = input.nextInt();

        System.out.println("Harga " + namaBarang + " sebanyak " + si + " setelah kenaikan pajak adalah " + kenaikanPajak(hargaBarang));
        
    }

    public static int kenaikanPajak(int harga) {
        return harga + (harga * 10 / 100);
    }

}

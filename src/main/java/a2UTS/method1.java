package a2UTS;

import java.util.Scanner;

public class method1 {

    public static void main(String[] args) {
        jumlah(2, 3);
        jumlah2(3, 4);
    }

    public static void print(String nama) {
        System.out.println("Nama = " + nama);
    }

    public static void jumlah(int a, int b) {
        int c = a + b;
        System.out.println("Hasil = " + c);
    }

    public static int jumlah2(int a, int b) {
        int c = a + b;
        return c;
    }

}

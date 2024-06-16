package testing;

import java.util.Scanner;

public class c3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double alas, tinggi, luas, variabel;
        System.out.println("---------------------");
        System.out.println("Program Luas Segitiga");
        System.out.println("---------------------");

        System.out.print("Masukkan alas : ");
        alas = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextDouble();

        variabel = hitungLuasSegitiga(alas, tinggi);
        System.out.println("Luas segitiganya adalah " + variabel);

    }

    public static double hitungLuasSegitiga(double alas1, double tinggi1) {
        double luas = (alas1 * tinggi1) / 2;
        return luas;
        //versi singkat :
        //return (alas1 * tinggi1)/2;
    }

}

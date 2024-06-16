package a2UTS;
//Array searching

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[5];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, indeksMax = 0, indeksMin = 0;
        nilai[0] = 2;
        nilai[1] = 12;
        nilai[2] = 1;
        nilai[3] = 23;
        nilai[4] = 20;

        for (int i = 0; i < nilai.length; i++) {

            if (nilai[i] > max) {
                max = nilai[i];
                indeksMax = i;
            }
            if (nilai[i] < min) {
                min = nilai[i];
                indeksMin = i;
            }

        }
//Versi Shortcut
//        for(int i : nilai){
//            System.out.print(i);
//        }

        System.out.println("Nilai indeks terbesar ada di : " + indeksMax);
        System.out.println("Nilai terbesar indeks : " + max);
        System.out.println("==================================================");
        System.out.println("Nilai indeks terkecil ada di : " + indeksMin);
        System.out.print("Nilai terkecil indeks : " + min);

    }
}

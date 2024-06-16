package a1Tugas;

import java.util.Scanner;

public class latihan37 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalBelanja = 500_000;
        int totalDiskon = totalBelanja >= 100_000 ? totalBelanja / 10 : 0;
        System.out.println("Diskon : " + totalDiskon);
    }

}

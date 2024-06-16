package a1Tugas;

import java.util.Scanner;

public class latihan12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sks = 0;
        float ip = 0;
        System.out.print("Masukkan ip semester anda : ");
        ip = input.nextFloat();

        if (ip >= 0 && ip < 2.5) {
            sks = 18;
        } else if (ip >= 2.5 && ip < 2.75) {
            sks = 20;
        } else if (ip >= 2.75 && ip < 3.0) {
            sks = 22;
        } else if (ip >= 3.0 && ip < 3.5) {
            sks = 23;
        } else if (ip >= 3.5 && ip  <=4) {
            sks = 24;
        } else {
            System.out.println("Maaf IP yang anda masukkan tidak valid");
        }
        System.out.println("Jatah semester berikutnya adalah : " + sks);

    }

}

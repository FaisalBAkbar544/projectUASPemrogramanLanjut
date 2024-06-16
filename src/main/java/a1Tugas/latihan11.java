package a1Tugas;
//Muhammad Faisal Akbar
import java.util.Scanner;

public class latihan11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float ip;
        int sks = 0;

        System.out.print("Masukkan IP anda semester ini : ");
        ip = input.nextFloat();

        if (ip >= 0 && ip <= 2) {
            sks = 16;
        } else if (ip >= 2 && ip <= 2.5) {
            sks = 20;
        } else if (ip >= 2.5 && ip <= 3) {
            sks = 22;
        } else if (ip >= 3 && ip <= 4) {
            sks = 24;
        } else {
            System.out.println("IP yang anda masukkan tidak valid");
        }
        System.out.println("Jatah SKS semester berikutnya adalah" + sks);
    }
}

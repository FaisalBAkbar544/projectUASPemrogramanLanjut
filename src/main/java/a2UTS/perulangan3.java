package a2UTS;

import java.util.Scanner;

/**
 *
 * @author Faisal
 */
public class perulangan3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int agk1, hasil;

        System.out.print("Masukkan sebuah angka : ");
        agk1 = input.nextInt();
        System.out.println("Tek kotek kotek kotek, anak ayam turun berkotek");

        while (true) {
            hasil = (agk1 - 1);

            if (agk1 == 1) {
                System.out.println("Anak ayam turunlah," + agk1 + " mati satu tinggalah induknya");
                break;
            }

            System.out.println("Anak ayam turunlah, " + agk1 + " mati satu tinggalah " + hasil);
            agk1--;

        }

    }
}

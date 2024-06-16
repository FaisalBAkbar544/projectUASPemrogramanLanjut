package a2UTS;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class perulangan2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, agk1, agk2, hasil = 0;
        String cek = null;

        do {
            System.out.println("Menu");
            System.out.println("1. Tambah ");
            System.out.println("2. Kurang");
            System.out.println("3. Keluar");
            System.out.print("Masukkan menu : ");
            menu = input.nextInt();
            System.out.print("Masukkan angka pertama : ");
            agk1 = input.nextInt();
            System.out.print("Masulkkan angka kedua : ");
            agk2 = input.nextInt();

            do {
                if (menu == 1) {
                    hasil = agk1 + agk2;
                } else if (menu == 2) {
                    hasil = agk1 - agk2;
                } else if (menu == 3) {
                    break;
                }
                System.out.print(hasil);
                input.nextInt();
                System.out.print("Ingin Menginputkan lagi : ");
                cek = input.nextLine();
                input.nextInt();
            } while (cek.equals("y"));

        } while (menu != 3);

    }

}

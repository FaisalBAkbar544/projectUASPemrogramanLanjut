package a2UTS;

/**
 *
 * @author Faisal
 */
import java.util.Scanner;

public class perulangan1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cek = null;
        int agk1, agk2, menu, hasil = 0;
        do {
            System.out.print("Masukkan angka pertama : ");
            agk1 = input.nextInt();
            System.out.print("Masukkan angka kedua :");
            agk2 = input.nextInt();
           
            System.out.println("Menu");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Keluar");
            System.out.print("Masukkan menu : ");
            menu = input.nextInt();

            if (menu == 1) {
                hasil = agk1 + agk2;
            } else if (menu == 2) {
                hasil = agk1 - agk2;
            } else if (menu == 3) {
                break;
            }
            System.out.println(hasil);
            input.nextLine();
            System.out.println("Apakah anda ingin keluar(y/n)");
            cek = input.nextLine();
        } while (cek.equals("y"));

    }

}

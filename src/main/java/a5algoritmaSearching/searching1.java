package a5algoritmaSearching;
import java.util.Scanner;

public class searching1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int element;
        String masuk;
        System.out.print("Masukkan jumlah elemen Array : ");
        element = input.nextInt();

        int[] angka = new int[element]; // Sesuaikan ukuran array dengan jumlah elemen yang dimasukkan

        System.out.println("Jumlah angka yang mau dimasukkan : " + element + " Click Enter");
        for (int i = 0; i < element; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            angka[i] = input.nextInt();
        }

        do {
            System.out.println("-----------------------------------");
            System.out.print("Masukkan angka yang mau anda cari : ");
            int cari = input.nextInt();
            boolean ditemukan = false;

            for (int i = 0; i < element; i++) {
                if (angka[i] == cari) {
                    System.out.println("Angka : " + angka[i] + " ditemukan pada indeks ke-" + i);
                    ditemukan = true;
                    break; 
                }
            }

            if (!ditemukan) {
                System.out.println("Angka tidak ditemukan");
            }

            input.nextLine(); 
            System.out.print("Apakah anda ingin mencari ulang(y/n) : ");
            masuk = input.nextLine();
        } while (masuk.equalsIgnoreCase("y")); 
    }
}

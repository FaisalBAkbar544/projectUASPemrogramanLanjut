package a5algoritmaSearching;
import java.util.Scanner;

public class searching2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int element;
        String masuk;
        System.out.print("Masukkan jumlah elemen Array : ");
        element = input.nextInt();

        String[] array = new String[element]; 

        System.out.println("Jumlah string yang mau dimasukkan : " + element + " Click Enter");
        input.nextLine();
        for (int i = 0; i < element; i++) {
            System.out.print("Masukkan string ke-" + (i + 1) + " : ");
            array[i] = input.nextLine();
        }

        do {
            System.out.println("-----------------------------------");
            System.out.print("Masukkan string yang mau anda cari : ");
            String cari = input.nextLine();
            boolean ditemukan = false;

            for (int i = 0; i < element; i++) {
                if (array[i].equals(cari)) {
                    System.out.println("String : " + array[i] + " ditemukan pada indeks ke-" + i);
                    ditemukan = true;
                    break; 
                }
            }

            if (!ditemukan) {
                System.out.println("String tidak ditemukan");
            }

            System.out.print("Apakah anda ingin mencari ulang(y/n) : ");
            masuk = input.nextLine();
        } while (masuk.equalsIgnoreCase("y")); 
    }
}

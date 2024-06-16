package a9Tekkom;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tekkom1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama = new String[10]; // Mengubah ukuran array ke 10

        System.out.println("================================================");
        System.out.println("Program Cek Apakah ada huruf a di tengah        ");
        System.out.println("================================================");
        // Mengisi array dengan nama
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nama : ");
            nama[i] = input.nextLine();
        }

        // Membuat pola regex
        Pattern pola = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");

        // Mencocokkan pola dengan setiap elemen dalam array nama
        for (String name : nama) {
            Matcher match = pola.matcher(name);

            // Menampilkan hasil cocok
            
            while (match.find()) {
                String result = match.group();
                System.out.println("Nama yang cocok: " + result);
            }
        }
    }
}


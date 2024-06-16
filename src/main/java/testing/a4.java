package testing;
import java.util.Scanner;
public class a4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tinggi;
        System.out.print("Masukkan tinggi segitiga : ");
        tinggi = input.nextInt();
        
        for (int i = 0; i <= tinggi; i++) {
            for (int j = 0; j < tinggi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}

package testing;
import java.util.Scanner;
public class a3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tinggi;
        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextInt();
        
        for (int i = 0; i < tinggi; i++) {
            
            for (int j = tinggi; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

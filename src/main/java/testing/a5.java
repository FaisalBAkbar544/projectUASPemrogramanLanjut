//Piramida terbalik
package testing;
import java.util.Scanner;
public class a5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tinggi;
        System.out.print("Masukkan tinggi segitiga : ");
        tinggi = input.nextInt();
        
        for (int i = 0; i <= tinggi ; i++) {
            
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= tinggi-i; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
    
}

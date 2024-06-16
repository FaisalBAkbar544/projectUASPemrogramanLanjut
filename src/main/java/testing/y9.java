package testing;
import java.util.Scanner;
public class y9 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tinggi, lebar;
        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextInt();
        System.out.print("Masukkan lebar : ");
        lebar = input.nextInt();
        
        for (int i = 1; i <= tinggi ; i++) {
            for (int j = 1; j <= lebar; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }

}

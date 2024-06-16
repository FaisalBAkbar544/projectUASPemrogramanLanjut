package testing;
import java.util.Scanner;
public class a8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tinggi;
        
        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextInt();
        
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}

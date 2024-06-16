package testing;
import java.util.Scanner;
public class b1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int besar;
        System.out.print("Masukkan besar persegi : ");
        besar = input.nextInt();
        
        for (int i = 1; i <= besar; i++) {
            for (int j = 1; j <= besar; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}

package testing2;
import java.util.Scanner;
public class y1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal,akhir;
        System.out.print("Masukkan bilangan awal : ");
        awal = input.nextInt();
        System.out.print("Masukkan bilangan akhir : ");
        akhir = input.nextInt();
        
        for (int i = awal; i <= akhir; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                
                System.out.print("Bilangan genap");
                
            }else  {
                System.out.print("Bilangan ganjil");
            }
            System.out.println();
        }
    }
}

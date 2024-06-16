package testing;
import java.util.Scanner;
public class y2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int awal,akhir;
        System.out.print("Masukkan angka pertama : ");
        awal = input.nextInt();
        System.out.print("Masukkan angka terakhir : ");
        akhir = input.nextInt();
        
        do {       
            System.out.print(awal + " ");
            if (awal % 2 == 0) {
                System.out.println("Bilangan genap");
            }else  {
                System.out.println("Bilangan ganjil");
            }
            awal++;
            
        } while (awal <= akhir);
        
        
    }

}

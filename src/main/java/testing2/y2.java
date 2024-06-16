package testing2;
import java.util.Scanner;

public class y2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        if (N < 10) {
            System.out.println("satuan");
        } else if (N < 100) {
            System.out.println("puluhan");
        } else if (N < 1000) {
            System.out.println("ratusan");
        } else if (N < 10000) {
            System.out.println("ribuan");
        } else {
            System.out.println("puluhribuan");
        }
        
        scanner.close();
    }
}
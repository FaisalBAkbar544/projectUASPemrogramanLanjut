package testing;

import java.util.Scanner;

public class b4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deret;
        System.out.print("Masukkan deret : ");
        deret = input.nextInt();
        for (int i = 1; i <= deret; i++) {
            System.out.print(i*i + " ");
        }
    }

}

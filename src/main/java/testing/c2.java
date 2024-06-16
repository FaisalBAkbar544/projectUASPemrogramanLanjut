package testing;

import java.util.Scanner;

public class c2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        System.out.println("-----------------------------------------------");
        System.out.println("Mengenal method prosedur dan method rekursif");
        System.out.println("-----------------------------------------------");
        System.out.print("Masukkan jumlah halo dunia yang mau diinputkan : ");
        nilai = input.nextInt();
        System.out.println("-----------------------------------------------");

        for (int i = 1; i <= nilai; i++) {
            haloDunia();
        }

    }

    //method prosedur atau method kosong, yaitu method yang tidak mengembalikan nilai
    public static void haloDunia() {
        System.out.println("Halo Dunia");
    }
    

}

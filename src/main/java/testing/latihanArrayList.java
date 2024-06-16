package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//menu terdiri dari :
//Tambahkan list, diawali dgn jumlah list yg mau ditambahkan dan nama list
//Remove list by satu saja atau semua
//Search list by index or value
//sorting data lalu tampilkanj

public class latihanArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;

        System.out.print("Masukkan jumlah list yg mau ditambahkan : ");
        int list = input.nextInt();
        input.nextLine();

        System.out.print("Apa list yang mau anda buat : ");
        nama = input.nextLine();

        ArrayList<String> namax = new ArrayList<>();
        for (int i = 0; i < list; i++) {

            System.out.print("Masukkan list " + nama + " yang mau ditambah : ");
            String nilaiList = input.nextLine();
            namax.add(nilaiList);

        }
        System.out.println(namax);
    }

}

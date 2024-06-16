package a1Tugas;

import java.util.Scanner;

public class ArraySKS3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mataKuliah;
        int jumlah;
        int[] sks = new int[5];
        double[] nilai = new double[5];
        double[] nilaiAkhir = new double[5];
        System.out.print("Masukkan jumlah mata kuliah : ");
        jumlah = input.nextInt();
        System.out.println("");

        for (int i = 0; i <= jumlah; i++) {
            System.out.println("Matakuliah : ");
            mataKuliah = input.nextLine();
            System.out.println("Jumlah  SKS " + mataKuliah + " :");
            sks[i] = input.nextInt();
            System.out.println("Nilai   :");
            nilai[i] = input.nextDouble();
            
            
            
            

        }

    }

}

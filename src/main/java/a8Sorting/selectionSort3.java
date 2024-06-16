package a8Sorting;

import java.util.Scanner;
import java.util.Random;
public class selectionSort3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] data = new int [1_000];
        Random angkaAcak = new Random();
        
        
        
        for (int i = 0; i < data.length; i++) {
            int angka = angkaAcak.nextInt(1_000);
            data[i] = angka;
        }
        selectionSort(data);
    }

    //secara ascending4
    public static void selectionSort(int dataMasuk[]) {
        int size = dataMasuk.length;
        for (int step = 0; step < size - 1; step++) {
            int minIndex = step;
            for (int j = step + 1; j < size; j++) {
                if (dataMasuk[j] < dataMasuk[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = dataMasuk[step];
            dataMasuk[step] = dataMasuk[minIndex];
            dataMasuk[minIndex] = temp;
        }

        System.out.println("Hasil sorting : ");
        for (int print : dataMasuk) {
            System.out.print(print + ",");
        }

    }

}

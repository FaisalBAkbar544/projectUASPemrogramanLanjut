package a8Sorting;

import java.util.Scanner;

public class selectionSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan data Array ke-" + (i + 1) + " : ");
            data[i] = in.nextInt();
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

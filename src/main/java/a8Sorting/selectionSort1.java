package a8Sorting;

import java.util.Scanner;

public class selectionSort1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = {3, 2, 5, 2, 1, 3, 5, 2, 1,11};
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

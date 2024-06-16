package a8Sorting;

import java.util.Scanner;

public class sorting1 {

    public static void main(String[] args) {
        int[] arrayData = {1, 5, 3, 1, 9, 2, 0, 32};
        bubbleSort(arrayData);

    }

    public static void bubbleSort(int[] arrayData) {

        for (int i = 0; i < arrayData.length - 1; i++) {
            for (int j = 0; j < arrayData.length - i - 1; j++) {
                if (arrayData[j] > arrayData[j + 1]) {
                    int temp = arrayData[j];
                    arrayData[j] = arrayData[j + 1];
                    arrayData[j + 1] = temp;
                }
            }

        }

        for (int p = 0; p < arrayData.length; p++) {
            System.out.print(arrayData[p] + ",");
        }
    }

}

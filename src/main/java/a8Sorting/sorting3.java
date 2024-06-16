package a8Sorting;

import java.util.Scanner;

public class sorting3 {

    //descending
    public static void bubbleSortdescen(int[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }

        }
        for (int p = 0; p < size; p++) {
            System.out.print(array[p] + ",");
        }
    }

    public static void bubbleSortascen(int[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }

        }
        for (int p = 0; p < size; p++) {
            System.out.print(array[p] + ",");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = new int[10];

        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan data Array ke-" + (i + 1) + " : ");
            data[i] = in.nextInt();
        }

        System.out.println("-------------------------");
        System.out.println("Secara ascending : ");
        bubbleSortascen(data);
        System.out.println("\nSecara descending : ");
        bubbleSortdescen(data);
    }
}

package a7methodAlgorithmStrukturDataandSearching;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Pindahkan elemen arr[0..i-1] yang lebih besar dari key ke satu posisi di depan posisi sekarang
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // Tempatkan key di posisi yang benar
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

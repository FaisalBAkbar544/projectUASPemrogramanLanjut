package a4KelasTerbuka;

import java.util.Arrays;

public class a3latihanArray {

    public static void main(String[] args) {
        int[] arrayAngka1 = {1, 5, 3, 2, 6, 7, 3, 5, 2};
        int[] arrayAngka2 = {4, 5, 2, 6, 7, 1, 3, 5, 7};

        System.out.println("=============================");
        System.out.println("Penjumlahan antara dua buah Array");
        int[] arrayHasil = tambahArray(arrayAngka1, arrayAngka2);
        printArray(arrayAngka1, "Array ke-1");
        printArray(arrayAngka2, "Array ke-2");
        printArray(arrayHasil, "Hasil ");

        System.out.println("Penggabungan antara 2 buah Array");
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayHasil2[i] = arrayAngka1[i];
        }
        for (int i = 0; i < arrayAngka2.length; i++) {
            arrayHasil2[i + arrayAngka1.length] = arrayAngka2[i];
        }
        printArray(arrayAngka1, "Array ke-1");
        printArray(arrayAngka2, "Array ke-2");
        printArray(arrayHasil2, "Hasil ");

        System.out.println("Array Reserved");
        printArray(arrayAngka1, "Array-1");
        reverseArray(arrayAngka1);
        printArray(arrayAngka1, "Reserve");

    }

    private static void reverseArray(int[] dataArray) {
        Arrays.sort(dataArray);
        printArray(dataArray, "Sorted");
        int[] arrayHasil3 = Arrays.copyOf(dataArray, dataArray.length);
        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = arrayHasil3[(arrayHasil3.length - 1) - i];
        }
       

    }

    public static int[] tambahArray(int[] arrayA1, int[] arrayA2) {
        int[] arrayHasil = new int[arrayA1.length];
        for (int i = 0; i < arrayA1.length; i++) {
            arrayHasil[i] = arrayA1[i] + arrayA2[i];
        }
        return arrayHasil;

    }

    public static void printArray(int[] dataArray, String pesan) {
        System.out.println(pesan + " = " + Arrays.toString(dataArray));
    }

}

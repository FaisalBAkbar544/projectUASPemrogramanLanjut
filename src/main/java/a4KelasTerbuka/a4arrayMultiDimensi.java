package a4KelasTerbuka;

import java.util.Arrays;

public class a4arrayMultiDimensi {

    public static void main(String[] args) {
        //int [baris][kolom]

        int[][] arrayAngka = new int[5][4];
        printArray(arrayAngka);
        System.out.println("------------------------------");

        //looping secara manual
        for (int i = 0; i < arrayAngka.length; i++) {
            for (int j = 0; j < arrayAngka[i].length; j++) {
                System.out.print(arrayAngka[i][j] + ",");
            }
            System.out.println("");
        }
        System.out.println("-------------------------------");

        //looping dengan for each
        for (int[] baris : arrayAngka) {
            System.out.print("[");
            for (int kolom : baris) {
                System.out.print(kolom + ",");
            }
            System.out.print("]\n");

        }
        System.out.println("-------------------------------");
        
        //looping pembuktian
        int[][] buktiMatriks = {
            {3, 6, 2, 6, 4, 3, 2, 4},
            {3, 5, 1, 8, 5, 4, 6, 7},
            {3, 5, 2, 5, 7, 34, 3, 2, 6, 3}
        };
        printArray(buktiMatriks);
    }

    public static void printArray(int[][] dataArray) {
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }

}

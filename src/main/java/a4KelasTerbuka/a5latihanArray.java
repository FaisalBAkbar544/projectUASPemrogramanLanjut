package a4KelasTerbuka;

import java.util.Arrays;

public class a5latihanArray {

    public static void main(String[] args) {

        int[][] matriksA = {
            {3, 4, 5},
            {3, 5, 2},
            {4, 6, 2}
        };
        int[][] matriksB = {
            {7, 9, 20},
            {1, 6, 3},
            {3, 6, 2}
        };
        printArray(matriksA);
        printArray(matriksB);
        printArray(tambahMatriks(matriksA, matriksB));
        printArray((kaliMatriks(matriksA, matriksB)));

    }

    public static int[][] tambahMatriks(int matriks1[][], int matriks2[][]) {

        int baris1 = matriks1.length;
        int kolom1 = matriks1[0].length;
        int baris2 = matriks2.length;
        int kolom2 = matriks2[0].length;
        int[][] hasil = new int[baris1][kolom1];

        if (baris1 == baris2 && kolom1 == kolom2) {
            for (int i = 0; i < baris1; i++) {
                for (int j = 0; j < kolom1; j++) {
                    hasil[i][j] = matriks1[i][j] + matriks2[i][j];
                }
            }
        } else {
            System.out.println("Jumlah baris atau kolom tidak sama");
        }

        return hasil;
    }

    public static int[][] kaliMatriks(int matriks1[][], int matriks2[][]) {

        int baris1 = matriks1.length;
        int kolom1 = matriks1[0].length;
        int baris2 = matriks2.length;
        int kolom2 = matriks2[0].length;
        int[][] hasil = new int[baris1][kolom1];

        if (kolom1 == baris2) {
            for (int i = 0; i < baris1; i++) {
                for (int j = 0; j < kolom1; j++) {
                    hasil[i][j] = matriks1[i][j] * matriks2[i][j];
                }
            }
        } else {
            System.out.println("Jumlah kolom matriks A tidak sama dengan jumlah baris matriks B");
        }

        return hasil;
    }

    public static void printArray(int[][] dataArray) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;
        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataArray[i][j]);
                if (j < kolom - 1) {
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}

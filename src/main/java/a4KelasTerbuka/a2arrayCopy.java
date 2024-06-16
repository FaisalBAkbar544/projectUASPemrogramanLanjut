package a4KelasTerbuka;

import java.util.Arrays;

public class a2arrayCopy {

    public static void main(String[] args) {
        int[] angkaArray1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Cek Angka");
        printArray(angkaArray1);

        System.out.println("mengkopi Array\n=====================>>>>>>>");
        int[] angkaArray2 = new int[angkaArray1.length];
        printArray(angkaArray1);
        System.out.println(angkaArray1);
        printArray(angkaArray2);
        System.out.println(angkaArray2);
        System.out.println("");

        System.out.println("menggunakan loop\n===================>>>>>>>");
        for (int i = 0; i < angkaArray2.length; i++) {
            angkaArray2[i] = angkaArray1[i];
        }
        printArray(angkaArray1);
        System.out.println(angkaArray1);
        printArray(angkaArray2);
        System.out.println(angkaArray2);
        System.out.println("");

        System.out.println("mengcopy dengan copyOf\n===================>>>>>>>");
        int[] angkaArray3 = Arrays.copyOf(angkaArray1, angkaArray1.length);
        printArray(angkaArray1);
        System.out.println(angkaArray1);
        printArray(angkaArray3);
        System.out.println(angkaArray3);
        System.out.println("");

        System.out.println("mengcopy dengan copyOfRange\n===================>>>>>>>");
        int[] angkaArray4 = Arrays.copyOfRange(angkaArray1, 2, 6);
        printArray(angkaArray1);
        System.out.println(angkaArray1);
        printArray(angkaArray4);
        System.out.println(angkaArray4);
        System.out.println("");

        System.out.println("mengcopy dengan teknik fill\n================>>>>>>>>");
        int[] angkaArray5 = new int[angkaArray1.length];
        printArray(angkaArray5);
        Arrays.fill(angkaArray5, 2);
        printArray(angkaArray5);
        System.out.println("");

        System.out.println("Komparasi Arrays\n================>>>>>>>>");
        int[] angkaArray6 = {1, 2, 3, 4, 5};
        int[] angkaArray7 = {1, 2, 3, 4, 6};
        System.out.println("");

        System.out.println("Membandingkan 2 buah array\n================>>>>>>>>");
        if (Arrays.equals(angkaArray6, angkaArray7)) {
            System.out.println("Arraynya sama");
        } else {
            System.out.println("Arraynya beda");
        }
        System.out.println("");

        System.out.println("Membandingkan mana yang lebih besar\n================>>>>>>>>");
        System.out.println(Arrays.compare(angkaArray6, angkaArray7));
        System.out.println("");

        System.out.println("Membandingkan index mana yang berbeda\n================>>>>>>>>");
        System.out.println(Arrays.mismatch(angkaArray6, angkaArray7));

        System.out.println("Array sort\n================>>>>>>>>");
        int[] angkaArray8 = {7, 8, 4, 32, 3, 9, 10};
        printArray(angkaArray8);
        Arrays.sort(angkaArray8);
        printArray(angkaArray8);
        System.out.println("");

        System.out.println("Array searching\n================>>>>>>>>");
        int angka = 9;
        printArray(angkaArray8);
        System.out.println("Angka-" + angka + " ada di index-" + Arrays.binarySearch(angkaArray8, angka));
        printArray(angkaArray8);

    }

    public static void printArray(int[] dataArray) {
        System.out.println("Array = " + Arrays.toString(dataArray));
    }
}

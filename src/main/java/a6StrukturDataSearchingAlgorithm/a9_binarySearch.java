package a6StrukturDataSearchingAlgorithm;

import java.util.*;
import java.util.Arrays;

public class a9_binarySearch {

    public static void main(String[] args) {
        int[] data = new int[100_000];
        int target = 9488;
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }

        int index = binarySearch(data, target);
        if (index == -1) {
            System.out.println("Index not found");
        } else {
            System.out.println("Index found");
        }

    }

    private static int binarySearch(int[] data, int target) {
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            int middle = (high + low) / 2;
            int value = data[middle];
            System.out.println("Middle " + value);

            if (value < target) {
                low = middle + 1;

            } else if (value > target) {
                high = middle - 1;
            } else {
                return middle;
            }

        }
        return -1;
    }

}

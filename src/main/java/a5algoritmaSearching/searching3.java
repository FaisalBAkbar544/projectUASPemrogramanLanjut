package a5algoritmaSearching;
import java.util.*;
public class searching3 {

    public static void main(String[] args) {
        int[] data = {2, 3, 4, 2, 3};
        int cari = 11;
        int i = 0;
        boolean ditemukan = false;
        while (cari != data[i]) {
            if (i < data.length - 1) {
                ditemukan = true;
            }
        };

        if (ditemukan) {
            System.out.println("Ketemu di index : " + i);

        } else {
            System.out.println("Angka tidak ditemukan");
        }
        Arrays.sort(data);

    }

}

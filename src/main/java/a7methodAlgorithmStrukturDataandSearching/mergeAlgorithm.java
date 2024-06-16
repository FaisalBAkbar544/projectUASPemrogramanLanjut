package a7methodAlgorithmStrukturDataandSearching;

public class mergeAlgorithm {

    static int[] merge(int array[], int left, int mid, int right) {
        //membagi array menjadi 2 buah antara kiri dan kanan
        int inKiri = mid - left + 1;
        int inKanan = right - mid;  

        //inisialisasi array sementara dengan jumlah index sesuai inKiri dan inKanan
        int[] l = new int[inKiri];
        int[] r = new int[inKanan];

        //masukkan data ke dalam array sementara
        for (int i = 0; i < inKiri; i++) {
            l[i] = array[left + i];
        }
        for (int j = 0; j < inKanan; j++) {
            r[j] = array[mid + 1 + j];
        }
        //inisialisasi index dari merge subarray array
        int i = 0, j = 0, k = left;

        while (i < inKiri && j < inKanan) {
            if (l[i] <= r[j]) {
                array[k] = l[i];
                i++;
            } else {
                array[k] = r[j];
                j++;
            }
            k++;
        }
        //copy element pada array yang sudah di merge di array l dan r
        while (i < inKiri) {
            array[k] = l[i];
            i++;
            k++;
        }
        while (i < inKanan) {
            array[k] = r[j];
            j++;
            k++;
        }
        return array;
    }

    static void sorting(int data[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            //sorting array setengah kiri dan setengah kanan
            sorting(data, left, mid);
            sorting(data, mid + 1, right);
            //gabungkan array yang relah di sort
            merge(data, left, mid, right);
        }
    }

    //ini method untuk memprint array
    static int[] print(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    public static void main(String[] args) {
        //inisialisasi array
        int[] data = {10, 5, 6, 28, 1, 9};
        System.out.println("Array sebelum di sorting : ");
        print(data);
        System.out.println();
        sorting(data, 0, data.length - 1);
        System.out.println("Array setelah di sorting : ");
        print(data);
    }
}

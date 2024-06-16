package a8Sorting;

public class sorting4 {

    public static void ngeprint(int[] dataMasuk) {
        for (int print : dataMasuk) {
            System.out.print(dataMasuk + ",");
        }
    }

    public static int[] data(int[] dataArray, boolean cek) {
        int size = dataArray.length;
        if (cek) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (dataArray[j] > dataArray[j + 1]) {
                        int temp = dataArray[j];
                        dataArray[j] = dataArray[j + 1];
                        dataArray[j + 1] = temp;

                    }

                }

            }

            return dataArray;

        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (dataArray[j] < dataArray[j + 1]) {
                    int temp = dataArray[j];
                    dataArray[j] = dataArray[j + 1];
                    dataArray[j + 1] = temp;

                }

            }

        }

        return dataArray;

    }

    public static void main(String[] args) {
        int[] dataUrutan = {3, 56, 2, 12, 5, 2, 1};
        System.out.print("Array Ascending : " + data(dataUrutan, true));
        
        System.out.print("\nArray Descending : " + data(dataUrutan, false));
    }

}

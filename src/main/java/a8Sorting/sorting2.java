package a8Sorting;

public class sorting2 {

    public static void main(String[] args) {
        int[] data = {2, 4, 1, 4, 2, 4, 1, 9, 43, 22};
        bubbleSort(data);
    }

    //ascending
    public static void bubbleSort(int[] array) {
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
}

package a6StrukturDataSearchingAlgorithm;

public class a8_LinearSearch {

    public static void main(String[] args) {
        int[] data = {3, 6, 2, 1, 5, 3, 9, 10};
        int index = searchSequental(data, 9);
        if (index != -1) {
            System.out.println("Index found at : " + index);
        } else {
            System.out.println("Index not found");
        }
    }

    private static int searchSequental(int[] data, int nilai) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == nilai) {
                return i;
            }
        }
        return -1;
    }
}

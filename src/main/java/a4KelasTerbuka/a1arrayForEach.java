package a4KelasTerbuka;

public class a1arrayForEach {

    public static void main(String[] args) {
        int[] arrayAngka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Looping Array standar");
        for (int i = 0; i < 10; i++) {
            System.out.println("Index ke-" + i + " adalah : " + arrayAngka[i]);
        }
        System.out.println("");
        System.out.println("Lopping menggunakan properti");
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println("Index ke-" + i + " adalah : " + arrayAngka[i]);
        }

        System.out.println("");
        System.out.println("Lopping for each");
        for (int angkaVariabel : arrayAngka) {
            System.out.println("Looping tanpa index bernilai-" + angkaVariabel);
        }

    }
}

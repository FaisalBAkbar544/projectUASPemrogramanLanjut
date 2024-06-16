package a3latihan;

import java.util.*;

public class arrayListMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> angka = new ArrayList<>();
        int choice;
        do {
            theMenu();
            
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    add(angka, input);
                    break;
                case 2:
                    remove(angka, input);
                    break;
                case 3:
                    display(angka, input);
                    break;
                case 4:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Masukkan menu yang benar");

            };

        } while (choice != 4);

    }

    private static void theMenu() {  
        System.out.println("--------------------------------------------");
        System.out.println("The Menu\n1.Add\n2.Remove\n3.Display\n4.Exit");
        System.out.print("Your choice :");        

    }

    public static void add(ArrayList<Integer> numbers1, Scanner input) {
        int angka2;
        System.out.print("Masukkan angka : ");
        angka2 = input.nextInt();
        numbers1.add(angka2);
        System.out.println("Numbers add");
    }

    public static void remove(ArrayList<Integer> numbers2, Scanner input) {
        int angka3;
        System.out.print("Masukkan index : ");
        angka3 = input.nextInt();
        if (angka3 >= 0 && angka3 < numbers2.size()) {
            numbers2.remove(angka3);
            System.out.println("Numbers removed");
        } else {
            System.out.println("The index is not have");
        }

    }

    public static void display(ArrayList<Integer> numbers3, Scanner input) {

        for (Integer angka4 : numbers3) {
            System.out.print(angka4 + ",");
        }
        System.out.println("");

    }

}

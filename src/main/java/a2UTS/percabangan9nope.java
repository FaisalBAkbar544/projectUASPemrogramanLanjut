package a2UTS;

import java.util.Scanner;

public class percabangan9nope {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "", b = "", c = "", d = "", e = "";
        System.out.print("a : ");
        a = input.nextLine();
        System.out.print("b : ");
        b = input.nextLine();
        System.out.print("c : ");
        c = input.nextLine();
        System.out.print("d : ");
        d = input.nextLine();
        System.out.print("e : ");
        e = input.nextLine();

        String hasilA = null;
        if (!a.equals(b) && !a.equals(c) && !a.equals(d) && !a.equals(e)) {
            hasilA = a;
        }
        if (a.equals(b)) {
            hasilA = a + "2";
        }
        if (a.equals(b) && a.equals(c)) {
            hasilA = a + "3";
        }
        if (a.equals(b) && a.equals(c) && a.equals(d)) {
            hasilA = a + "4";
        }
        if (a.equals(b) && a.equals(c) && a.equals(d) && a.equals(e)) {
            hasilA = a + "5";
        }

        String akhir = hasilA + b + c + d + e;
        System.out.print(akhir);
    }
}

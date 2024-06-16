package a2UTS;

import java.util.Scanner;

public class percabangan8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "b", b = "b", c = "a", d = "d", e = "b";

        String hasilA = "", hasilB = "", hasilC = "", hasilD = "", hasilE = "";

        if (!a.equals(b) && !a.equals(c) && !a.equals(d) && !a.equals(e)) {
            hasilA = a;
        }
        if (a.equals(b)) {
            hasilA = a + "2";
            if (a.equals(c)) {
                hasilA = a + "3";
                if (a.equals(d)) {
                    hasilA = a + "4";
                    if (a.equals(e)) {
                        hasilA = a + "5";
                    }
                }
            }
        }

        if (!b.equals(a) && !b.equals(c) && !b.equals(d) && !b.equals(e)) {
            hasilB = b;
        }
        if (b.equals(a)) {
            hasilB = "";
        }
        if (b.equals(c) && !b.equals(a)) {
            hasilB = b + "2";
            if (b.equals(d)) {
                hasilB = b + "3";
                if (b.equals(e)) {
                    hasilB = b + "4";
                }
            }
        }

        if (!c.equals(a) && !c.equals(b) && !c.equals(d) && !c.equals(e)) {
            hasilC = c;
        }
        if (c.equals(b)) {
            hasilC = "";
        }
        if (c.equals(d) && !c.equals(b)) {
            hasilC = c + "2";
            if (c.equals(e)) {
                hasilC = c + "3";
            }
        }

        if (!d.equals(a) && !d.equals(b) && !d.equals(c) && !d.equals(e)) {
            hasilD = d;
        }
        if (d.equals(c)) {
            hasilD = "";
        }
        if (d.equals(e) && !d.equals(c)) {
            hasilD = d + "2";
        }

        if (!e.equals(a) || !e.equals(b) || !e.equals(c) || !e.equals(d)) {
            hasilE = e;
        }
        String akhir = hasilA + hasilB + hasilC + hasilD + hasilE;
        System.out.print(akhir);
    }
}

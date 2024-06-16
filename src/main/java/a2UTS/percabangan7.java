package a2UTS;

public class percabangan7 {

    public static void main(String[] args) {
        String a = "b";
        String b = "b";
        String c = "b";
        String d = "d";
        String e = "b";
        String hasil1 = "", hasil2 = "", hasil3 = "", hasil4 = "", hasil5 = "";

        int countA = (a.equals("a") ? 1 : 0) + (b.equals("a") ? 1 : 0) + (c.equals("a") ? 1 : 0) + (d.equals("a") ? 1 : 0) + (e.equals("a") ? 1 : 0);
        int countB = (a.equals("b") ? 1 : 0) + (b.equals("b") ? 1 : 0) + (c.equals("b") ? 1 : 0) + (d.equals("b") ? 1 : 0) + (e.equals("b") ? 1 : 0);
        int countC = (a.equals("c") ? 1 : 0) + (b.equals("c") ? 1 : 0) + (c.equals("c") ? 1 : 0) + (d.equals("c") ? 1 : 0) + (e.equals("c") ? 1 : 0);
        int countD = (a.equals("d") ? 1 : 0) + (b.equals("d") ? 1 : 0) + (c.equals("d") ? 1 : 0) + (d.equals("d") ? 1 : 0) + (e.equals("d") ? 1 : 0);
        int countE = (a.equals("e") ? 1 : 0) + (b.equals("e") ? 1 : 0) + (c.equals("e") ? 1 : 0) + (d.equals("e") ? 1 : 0) + (e.equals("e") ? 1 : 0);

        if (countA > 1) {
            hasil1 += "a" + countA;
        }
        if (countB > 1) {
            hasil1 += "b" + countB;
        }
        if (countC > 1) {
            hasil1 += "c" + countC;
        }
        if (countD > 1) {
            hasil1 += "d" + countD;
        }
        if (countE > 1) {
            hasil1 += "e" + countE;
        }

        System.out.println(hasil1);
    }

}

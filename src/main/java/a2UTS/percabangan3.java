package a2UTS;

public class percabangan3 {

    public static void main(String[] args) {

        String a = "a";
        String b = "z";
        String c = "+";
        String d = "e";
        String e = "d";
        String q;

        if ("+".equals(c)) {
            b = b.toUpperCase();
            q = " ";
        } else if ("-".equals(c)) {
            d = d.toLowerCase();
            q = " ";

            //a2bde
            //b3de
            //b2adb
            System.out.println(a + b + c + d + e);
        }

    }
}

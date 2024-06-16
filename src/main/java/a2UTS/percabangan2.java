package a2UTS;

public class percabangan2 {

    public static void main(String[] args) {
        String a = "a", b = "b", c = "-", d = "d", e = "e";

        if (c.equals("+")) {
            System.out.print((b).toUpperCase());
            c = "";
        } else if (c.equals("-")) {
            System.out.print((d).toLowerCase());
            c = "";
        } else {
            System.out.print("Masukkan anda eror");
        }
        System.out.println(a + b + c + d + e);

    }

}

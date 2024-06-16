package a2UTS;

public class percabangan5 {

    public static void main(String[] args) {
        String a = "a", b = "a", c = "b", d = "d", e = "e";
        if (a == "a" && b == "a") {
            b = "2";
        }

        if (a == "b" && b == "b" && c == "b") {
            a = "b";
            b = "3";
            c = "";
        } else if (a == "b" && b == "b") {
            b = "2";
        }

        //a2bde
        //b3de
        //b2adb
        System.out.println(a + b + c + d + e);
    }

}

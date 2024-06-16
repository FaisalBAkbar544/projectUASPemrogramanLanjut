package a9Tekkom;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tekkom2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nickname: ");
        String nickname = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();
        cekNickname(nickname);
        cekPassword(password);
        System.out.println("--------------------------------");
        cekATengah(input);
        input.close();
    }

    public static void cekNickname(String nickname) {
        String nicknamePattern = "[a-zA-Z0-9._-]{3,}";
        Pattern nicknameRegex = Pattern.compile(nicknamePattern);

        Matcher matcher = nicknameRegex.matcher(nickname);
        if (matcher.matches()) {
            System.out.println(nickname + " adalah nickname yang valid");
        } else {
            System.out.println(nickname + " adalah nickname yang tidak valid");
        }
    }

    public static void cekPassword(String password) {
        String passwordPattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{6,}";
        Pattern passwordRegex = Pattern.compile(passwordPattern);

        Matcher matcher = passwordRegex.matcher(password);

        if (matcher.find()) {
            System.out.println(password + " adalah password yang valid");
        } else {
            System.out.println(password + " adalah password yang tidak valid");
        }
    }

    public static void cekATengah(Scanner input) {
        String[] nama = new String[5];

        System.out.println("================================================");
        System.out.println("         Apakah ada huruf a di tengah nama         ");
        System.out.println("================================================");

        System.out.println(">>>Silakan masukkan 5 nama ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama ke" + (i+1) + " : ");
            nama[i] = input.nextLine();
        }

        Pattern pola = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");

        System.out.println("Nama yang ada a di tengah nama :");
        for (String name : nama) {
            Matcher match = pola.matcher(name);
            
            while (match.find()) {
                String result = match.group();
                System.out.println("-" + result);
            }
        }

    }

}

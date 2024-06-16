package a1Tugas;

import java.util.Scanner;

public class latihan35 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo = 100_000, cekSaldo, sUang = 0, aUang = 0, menu;

        System.out.println("Menu ATM");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Simpan Uang");
        System.out.println("3. Ambil Uang");
        System.out.print("Pilih Menu : ");
        menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Saldo anda adalah : " + saldo);
                break;
            case 2:
                System.out.print("Masukkan jumlah uang yang anda simpan : ");
                sUang = input.nextInt();
                saldo += sUang;
                System.out.println("Jumlah Uang yang anda simpan adalah " + sUang);
                System.out.println("Saldo anda adalah " + saldo);
                break;
            case 3:
                System.out.print("Masukkan jumlah uang yang anda ambil : ");
                aUang = input.nextInt();
                if (aUang > saldo) {
                    System.out.println("Saldo anda tidak mencukupi");
                } else {
                    saldo -= aUang;
                    System.out.println("Jumlah Uang yang anda simpan adalah " + sUang);
                    System.out.println("Saldo anda adalah " + saldo);

                }
                break;
            default:
                System.out.println("Maaf eror");
                break;
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1UTS;

import java.util.Scanner;

/**
 *
 * @author Lenovo G40-80
 */
public class TESTING    {
    static Scanner input = new Scanner(System.in);
    static String p[], nama[], status[];
    static double ip[], tot = 0;
    static int po, n, nilai[];

    public static void main(String[] args) {
        isi();
    }

    public static void isi() {

        System.out.print("Masukan Jumlah Mahasiswa : ");
        n = input.nextInt();

        nama = new String[n];
        status = new String[n];
        nilai = new int[n];
        p = new String[n];
        ip = new double[n];

        nilai();

        hasil();
    }

    public static void nilai() {
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa Ke : " + (i + 1));
            System.out.print("Nama      : ");
            nama[i] = input.next();

            System.out.print("SKS       : ");
            int sk = input.nextInt();

            System.out.print("Nilai     : ");
            nilai[i] = input.nextInt();

            if (nilai[i] >= 85) {
                p[i] = "A";
                po = 4;
                status[i] = "  Lulus";
            } else if (nilai[i] >= 75) {
                p[i] = "B";
                po = 3;
                status[i] = "  Lulus";
            } else if (nilai[i] >= 65) {
                p[i] = "C";
                po = 2;
                status[i] = "  Lulus";
            } else if (nilai[i] >= 55) {
                p[i] = "D";
                po = 2;
                status[i] = "Tidak Lulus";
            } else {
                p[i] = "E";
                po = 1;
                status[i] = "Tidak Lulus";
            }

            System.out.println("Predikat  : " + p[i]);

            tot = po * sk;
            ip[i] = tot / sk;

            System.out.println("IP        : " + ip[i]);
            System.out.println(" ");
        }
    }

    public static void hasil() {
        System.out.println("              DAFTAR NILAI MAHASISWA");
        System.out.println("==================================================");
        System.out.println("NO   NAMA     NILAI   PREDIKAT    IP      STATUS   ");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "    " + nama[i] + "       " + nilai[i] + "        " + p[i] + "       " + ip[i] + "    " + status[i]);
        }
    }
}


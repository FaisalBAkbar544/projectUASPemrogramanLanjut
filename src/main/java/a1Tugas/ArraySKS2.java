package a1Tugas;

import java.util.Scanner;

public class ArraySKS2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahMatkul;

        System.out.println("==============================");
        System.out.println("     Program Mata Kuliah      ");
        System.out.println("==============================");
        System.out.print("Jumlah Mata Kuliah : ");
        jumlahMatkul = input.nextInt();
        System.out.println("-------------------------------");
        input.nextLine();

        String mataKuliah = null;
        int[] sks = new int[jumlahMatkul];
        double[] nilai = new double[jumlahMatkul];
        double[] nilaiAkhir = new double[jumlahMatkul];

        input(input, jumlahMatkul, mataKuliah, sks, nilai, nilaiAkhir);

    }

    public static void input(Scanner input, int jumlahMatkul, String mataKuliah, int[] sks, double[] nilai, double[] nilaiAkhir) {
        double ips, totalNilaiAkhir = 0, totalSks = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Mata Kuliah\t\t : ");
            mataKuliah = input.nextLine();
            System.out.print("SKS Mata Kuliah " + mataKuliah + " : ");
            sks[i] = input.nextInt();
            System.out.print("Nilai Mata Kuliah " + mataKuliah + " : ");
            nilai[i] = input.nextInt();
            input.nextLine();
            double bobotNilai = bobot(nilai[i]);
            nilaiAkhir[i] = nilaiAkhir(sks[i], bobotNilai);
            totalNilaiAkhir += nilaiAkhir[i];
            totalSks += sks[i];
            System.out.println("\t Nilai Huruf : " + indeks(nilai[i]));
            System.out.println("\t Bobot       : " + bobotNilai);
            System.out.println("\t Nilai Akhir : " + nilaiAkhir[i]);
            System.out.println("--------------------------------");
        }
        ips = (totalNilaiAkhir / totalSks);
        System.out.println("Nilai IPS : " + ips);
        System.out.println("======================");
        System.out.println("-------------------------------------");
        System.out.println("        Rangkuman Hasil Akhir        ");
        System.out.println("-------------------------------------");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Mata Kuliah\t: " + mataKuliah);
            System.out.println("SKS\t\t: " + sks[i]);
            System.out.println("Nilai\t\t: " + nilai[i]);
            System.out.println("Nilai Huruf\t: " + indeks(nilai[i]));
            System.out.println("Bobot\t\t: " + bobot(nilai[i]));
            System.out.println("Nilai Akhir\t: " + nilaiAkhir[i]);
            System.out.println("=====================================");
        }

    }

    public static double bobot(double nilai) {
        double bobot = 0.0;

        if (nilai >= 80 && nilai <= 100) {
            bobot = 4.0;
        } else if (nilai >= 77 && nilai < 80) {
            bobot = 3.75;
        } else if (nilai >= 75 && nilai < 77) {
            bobot = 3.50;
        } else if (nilai >= 70 && nilai < 75) {
            bobot = 3.0;
        } else if (nilai >= 67 && nilai < 70) {
            bobot = 2.75;
        } else if (nilai >= 64 && nilai < 67) {
            bobot = 2.50;
        } else if (nilai >= 60 && nilai < 64) {
            bobot = 2.0;
        } else if (nilai >= 50 && nilai < 60) {
            bobot = 1.5;
        } else if (nilai >= 0 && nilai < 50) {
            bobot = 1.0;
        } else {
            System.out.println("Nilai tidak valid");
        }

        return bobot;
    }

    public static String indeks(double nilai) {
        String indeks = " ";

        if (nilai >= 80 && nilai <= 100) {
            indeks = "A";

        } else if (nilai >= 77 && nilai < 80) {
            indeks = "A-";

        } else if (nilai >= 75 && nilai < 77) {
            indeks = "B+";

        } else if (nilai >= 70 && nilai < 75) {
            indeks = "B";

        } else if (nilai >= 67 && nilai < 70) {
            indeks = "B-";

        } else if (nilai >= 64 && nilai < 67) {
            indeks = "C+";

        } else if (nilai >= 60 && nilai < 64) {
            indeks = "C";

        } else if (nilai >= 50 && nilai < 60) {
            indeks = "D";

        } else if (nilai >= 0 && nilai < 50) {
            indeks = "E";

        } else {
            indeks = "Nilai tidak valid";
        }

        return indeks;
    }

    public static double nilaiAkhir(int sks, double bobot) {
        return sks * bobot;
    }

}

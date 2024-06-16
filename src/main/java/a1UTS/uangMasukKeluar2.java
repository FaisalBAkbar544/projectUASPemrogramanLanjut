package a1UTS;
//Catatan
//Tinggal masukkan sisanya dan cek apa yg eror

import java.util.ArrayList;
import java.util.Scanner;

public class uangMasukKeluar2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> transaksi = new ArrayList<>();
        ArrayList<Double> kasMasuk = new ArrayList<>();
        ArrayList<Double> kasKeluar = new ArrayList<>();
        double saldo = 0;
        int choice;
        System.out.println("================================");
        System.out.println(" Pencatatan Transaksi Keuangan ");
        System.out.println("================================");

        do {
            tampilMenu();
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    tambahTransaksi(transaksi, kasMasuk, kasKeluar, input);
                    break;
                case 2:
                    hapusTransaksi(transaksi, kasMasuk, kasKeluar, input);
                    break;
                case 3:
                    tampilkanLaporan(transaksi, kasMasuk, kasKeluar);
                    break;
                case 5:
                    tampilkanTotalKas(kasMasuk, kasKeluar);
                    System.out.println("------------------------------------------");
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (choice != 5);
    }

    private static void tampilMenu() {
        for (int i = 0; i < 2; i++) {
            System.out.print("=============================");
        }
        System.out.println("");
        System.out.println("Menu:");
        System.out.println("1. Tambahkan Transaksi");
        System.out.println("2. Hapus transaksi");
        System.out.println("3. Tampilkan Laporan Uang Kas");
        System.out.println("4. Cari Transaksi");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
    }

    private static void tambahTransaksi(ArrayList<String> transaksi, ArrayList<Double> kasMasuk, ArrayList<Double> kasKeluar, Scanner input) {
        System.out.print("Masukkan deskripsi transaksi: ");
        input.nextLine();
        String deskripsi = input.nextLine();

        System.out.print("Masukkan jumlah uang: ");
        double jumlah = input.nextDouble();
        input.nextLine();

        System.out.print("Pilih jenis transaksi (1. Masuk / 2. Keluar): ");
        int jenisChoice = input.nextInt();
        input.nextLine();

        String jenis;
        switch (jenisChoice) {
            case 1:
                jenis = "Masuk";
                break;
            case 2:
                jenis = "Keluar";
                break;
            default:
                System.out.println("Pilihan tidak valid. Transaksi dibatalkan.");
                return;
        }

        if (jenis.equalsIgnoreCase("Masuk")) {
            kasMasuk.add(jumlah);
            kasKeluar.add(0.0);
        } else {
            kasKeluar.add(jumlah);
            kasMasuk.add(0.0);
        }

        transaksi.add(deskripsi);
        System.out.println("Transaksi berhasil ditambahkan!");
    }

    private static void updateSaldo(ArrayList<Double> kasMasuk, ArrayList<Double> kasKeluar) {
        double totalKasMasuk = 0;
        double totalKasKeluar = 0;

        for (Double masuk : kasMasuk) {
            totalKasMasuk += masuk;
        }

        for (Double keluar : kasKeluar) {
            totalKasKeluar += keluar;
        }

        // Menghitung saldo
        double saldo = totalKasMasuk - totalKasKeluar;
    }

    //array transaksi, kas masuk,kas keluar
    private static void hapusTransaksi(ArrayList<String> transaksi, ArrayList<Double> kasMasuk, ArrayList<Double> kasKeluar, Scanner input) {
        if (transaksi.isEmpty()) {
            System.out.println("Belum ada transaksi yang dicatat.");
            return;
        }

        // Menampilkan data transaksi dalam format tabel
        System.out.println("Daftar Transaksi:");
        tampilkanLaporan(transaksi, kasMasuk, kasKeluar);
        System.out.println("");

        System.out.print("Masukkan nomor transaksi yang ingin dihapus: ");
        int nomorHapus = input.nextInt();
        input.nextLine(); // Membersihkan newline character

        if (nomorHapus > 0 && nomorHapus <= transaksi.size()) {
            kasMasuk.remove(nomorHapus - 1);
            kasKeluar.remove(nomorHapus - 1);
            transaksi.remove(nomorHapus - 1);
            System.out.println("Transaksi berhasil dihapus!");

            // Update saldo setelah transaksi dihapus
            updateSaldo(kasMasuk, kasKeluar);
        } else {
            System.out.println("Nomor transaksi tidak valid.");
        }
    }

    private static void tampilkanLaporan(ArrayList<String> transaksi, ArrayList<Double> kasMasuk, ArrayList<Double> kasKeluar) {
        if (transaksi.isEmpty()) {
            System.out.println("Belum ada transaksi yang dicatat.");
            return;
        }

        for (int i = 0; i < 4; i++) {
            System.out.print("---------------------------");
        }
        System.out.println("");
        System.out.printf("| %-4s | %-20s | %-10s | %-10s | %-10s | \n", " No", "Deskripsi", "Kas Masuk", "Kas Keluar", "Saldo ");
        for (int i = 0; i < 4; i++) {
            System.out.print("---------------------------");
        }
        System.out.println("");

        double saldoSaatIni = 0;
        int b = 0;
        for (b = 0; b < transaksi.size(); b++) {
            double saldoTransaksi = kasMasuk.get(b) - kasKeluar.get(b);
            saldoSaatIni += saldoTransaksi; // Menambahkan saldo transaksi ke saldo saat ini
            System.out.printf("| %-4d | %-20s | %-10.2f | %-10.2f | %-10.2f | \n", b + 1, transaksi.get(b), kasMasuk.get(b), kasKeluar.get(b), saldoSaatIni);
        }

        double saldoKeseluruhan = hitungTotalKas(kasMasuk) - hitungTotalKas(kasKeluar);

        System.out.printf("| %-4s | %-20s | %-10.2f | %-10s | %-10s | \n", b + 1, "TOTAL", hitungTotalKas(kasMasuk), hitungTotalKas(kasKeluar), saldoKeseluruhan);

        for (int i = 0; i < 4; i++) {
            System.out.print("---------------------------");
        }
        System.out.println("");

    }

    private static double hitungTotalKas(ArrayList<Double> kas) {
        double total = 0;
        for (double jumlah : kas) {
            total += jumlah;
        }
        return total;
    }
    

    private static void tampilkanTotalKas(ArrayList<Double> kasMasuk, ArrayList<Double> kasKeluar) {
        System.out.println("Jumlah Kas Masuk Keseluruhan: " + hitungTotalKas(kasMasuk));
        System.out.println("Jumlah Kas Keluar Keseluruhan: " + hitungTotalKas(kasKeluar));
    }
}

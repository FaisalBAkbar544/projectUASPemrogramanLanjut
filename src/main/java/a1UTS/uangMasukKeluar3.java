package a1UTS;
//Catatan
//Tinggal masukkan sisanya dan cek apa yg eror
//Tambahkan satuan transaksi

import java.util.ArrayList;
import java.util.Scanner;

public class uangMasukKeluar3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> transaksi = new ArrayList<>();
        ArrayList<Double> kasMasuk = new ArrayList<>();
        ArrayList<Double> kasKeluar = new ArrayList<>();
        double saldo = 0;
        int pilihMenu;
        System.out.println("================================");
        System.out.println(" Pencatatan Transaksi Keuangan ");
        System.out.println("================================");

        do {
            menu();
            pilihMenu = input.nextInt();

            switch (pilihMenu) {
                case 1:
                    tambahTransaksi(transaksi, kasMasuk, kasKeluar, input);
                    break;
                case 2:
                    hapusTransaksi(transaksi, kasMasuk, kasKeluar, input);
                    break;
                case 3:
                    tampilkanLaporan(transaksi, kasMasuk, kasKeluar);
                    break;
                case 4:
                    cariTransaksi(transaksi, kasMasuk, kasKeluar, input);
                    break;
                case 5:
                    totalKasAkhir(kasMasuk, kasKeluar);
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihMenu != 5);
    }

    private static void menu() {
        for (int i = 0; i < 2; i++) {
            System.out.print("=============================");
        }
        System.out.println("");
        System.out.println("Menu:");
        System.out.println("1. Tambahkan Transaksi\n2. Hapus transaksi\n3. Tampilkan Laporan Uang Kas\n4. Cari transaksi\n5. Keluar");
        System.out.print("Pilih menu: ");
    }

    private static void tambahTransaksi(ArrayList<String> transaksi, ArrayList<Double> kasMasuk, ArrayList<Double> kasKeluar, Scanner input) {
        System.out.print("Masukkan deskripsi transaksi: ");
        input.nextLine();
        String deskripsiTransaksi = input.nextLine();

        System.out.print("Masukkan jumlah uang (Rp.): ");
        double jumlah = input.nextDouble();
        input.nextLine();

        System.out.print("Pilih jenis transaksi (1. Masuk / 2. Keluar) Kas : ");
        int jenisTransaksi = input.nextInt();
        input.nextLine();

        String jenis;
        switch (jenisTransaksi) {
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

        transaksi.add(deskripsiTransaksi);
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

        double saldo = totalKasMasuk - totalKasKeluar;
    }

    private static void hapusTransaksi(ArrayList<String> transaksi, ArrayList<Double> kasMasuk, ArrayList<Double> kasKeluar, Scanner input) {
        if (transaksi.isEmpty()) {
            System.out.println("Belum ada transaksi yang dicatat.");
            return;
        }

        System.out.println("Daftar Transaksi:");
        tampilkanLaporan(transaksi, kasMasuk, kasKeluar);
        System.out.println("");

        System.out.print("Masukkan nomor transaksi yang ingin dihapus: ");
        int nomorHapus = input.nextInt();
        input.nextLine();

        if (nomorHapus > 0 && nomorHapus <= transaksi.size()) {
            kasMasuk.remove(nomorHapus - 1);
            kasKeluar.remove(nomorHapus - 1);
            transaksi.remove(nomorHapus - 1);
            System.out.println("Transaksi berhasil dihapus!");

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

        //garis 
        for (int i = 0; i < 4; i++) {
            System.out.print("---------------------------");
        }
        System.out.println();
        System.out.printf("| %-4s | %-20s | %-10s | %-10s | %-10s | \n", " No", "Deskripsi", "Kas Masuk", "Kas Keluar", "Saldo ");
        //garis
        for (int i = 0; i < 4; i++) {
            System.out.print("---------------------------");
        }
        System.out.println("");

        double saldoSaatIni = 0, saldoTransaksi, saldoKeseluruhan;
        int b = 0;
        for (b = 0; b < transaksi.size(); b++) {
            saldoTransaksi = kasMasuk.get(b) - kasKeluar.get(b);
            saldoSaatIni += saldoTransaksi;
            System.out.printf("| %-4d | %-20s | %-10.2f | %-10.2f | %-10.2f | \n", b + 1, transaksi.get(b), kasMasuk.get(b), kasKeluar.get(b), saldoSaatIni);
        }

        saldoKeseluruhan = hitungTotalKas(kasMasuk) - hitungTotalKas(kasKeluar);

        System.out.printf("| %-4s | %-20s | %-10.2f | %-10s | %-10s | \n", b + 1, "TOTAL", hitungTotalKas(kasMasuk), hitungTotalKas(kasKeluar), saldoKeseluruhan);

        for (int i = 0; i < 4; i++) {
            System.out.print("---------------------------");
        }
        System.out.println("");

    }

    private static void cariTransaksi(ArrayList<String> transaksi, ArrayList<Double> kasMasuk, ArrayList<Double> kasKeluar, Scanner input) {
        if (transaksi.isEmpty()) {
            System.out.println("Belum ada transaksi yang dicatat.");
            return;
        }

        System.out.print("Masukkan deskripsi yang dicari : ");
        input.nextLine();
        String kataKunci = input.nextLine();

        boolean ditemukan = false;
        System.out.println("");
        System.out.println("Hasil Pencarian:");
        for (int i = 0; i < 4; i++) {
            System.out.print("------------------");
        }
        System.out.println();
        System.out.printf("| %-4s | %-20s | %-10s | %-10s | %-10s | \n", "No", "Deskripsi", "Kas Masuk", "Kas Keluar", "Saldo");
        for (int i = 0; i < 4; i++) {
            System.out.print("------------------");
        }
        System.out.println("");

        for (int i = 0; i < transaksi.size(); i++) {
            if (transaksi.get(i).toLowerCase().contains(kataKunci.toLowerCase())) {
                System.out.printf("| %-4d | %-20s | %-10.2f | %-10.2f | %-10.2f | \n", i + 1, transaksi.get(i), kasMasuk.get(i), kasKeluar.get(i), (kasMasuk.get(i) - kasKeluar.get(i)));
                ditemukan = true;
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print("------------------");
        }
        System.out.println();

        if (!ditemukan) {
            System.out.println("Transaksi tidak ditemukan.");
        }
    }

    private static double hitungTotalKas(ArrayList<Double> kas) {
        double total = 0;
        for (double jumlah : kas) {
            total += jumlah;
        }
        return total;
    }

    private static void totalKasAkhir(ArrayList<Double> kasMasuk, ArrayList<Double> kasKeluar) {
        System.out.println("----------------------------------------------");
        System.out.println("Jumlah Kas Masuk Keseluruhan: " + hitungTotalKas(kasMasuk));
        System.out.println("Jumlah Kas Keluar Keseluruhan: " + hitungTotalKas(kasKeluar));
        System.out.println("----------------------------------------------");
    }
}

package a1UTS;

import java.util.ArrayList;
import java.util.Scanner;

public class pencatatanKeuanganUMKM4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> transaksiPenjualan = new ArrayList<>();
        ArrayList<Double> nominalPenjualan = new ArrayList<>();
        ArrayList<String> transaksiPengeluaran = new ArrayList<>();
        ArrayList<Double> nominalPengeluaran = new ArrayList<>();
        int pilih;

        do {
            tampilMenu();
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    tambahTransaksiPenjualan(transaksiPenjualan, nominalPenjualan, input);
                    break;
                case 2:
                    tambahTransaksiPengeluaran(transaksiPengeluaran, nominalPengeluaran, input);
                    break;
                case 3:
                    tampilkanTransaksi(transaksiPenjualan, nominalPenjualan, nominalPengeluaran);
                    break;
                case 4:
                    cariTransaksi(transaksiPenjualan, nominalPenjualan, nominalPengeluaran, input);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilih != 5);
    }

    private static void tampilMenu() {
        System.out.println("-----------------------------------------");
        System.out.println("Menu:");
        System.out.println("1. Tambahkan Transaksi Penjualan");
        System.out.println("2. Tambahkan Transaksi Pengeluaran");
        System.out.println("3. Tampilkan Semua Transaksi");
        System.out.println("4. Cari Transaksi Pengeluaran");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
    }

    private static void tambahTransaksiPenjualan(ArrayList<String> transaksi, ArrayList<Double> nominal, Scanner input) {
        System.out.print("Masukkan deskripsi transaksi penjualan: ");
        input.nextLine(); // Membersihkan newline character
        String deskripsi = input.nextLine();

        System.out.print("Masukkan nominal transaksi penjualan (Rp.): ");
        double jumlah = input.nextDouble();
        input.nextLine(); // Membersihkan newline character

        transaksi.add(deskripsi);
        nominal.add(jumlah);

        System.out.println("Transaksi penjualan berhasil ditambahkan!");
    }

    private static void tambahTransaksiPengeluaran(ArrayList<String> transaksi, ArrayList<Double> nominal, Scanner input) {
        System.out.print("Masukkan deskripsi transaksi pengeluaran: ");
        input.nextLine(); // Membersihkan newline character
        String deskripsi = input.nextLine();

        System.out.print("Masukkan nominal transaksi pengeluaran (Rp.): ");
        double jumlah = input.nextDouble();
        input.nextLine(); // Membersihkan newline character

        transaksi.add(deskripsi);
        nominal.add(jumlah);

        System.out.println("Transaksi pengeluaran berhasil ditambahkan!");
    }

    private static void tampilkanTransaksi(ArrayList<String> transaksi, ArrayList<Double> nominalJual, ArrayList<Double> nominalKeluar) {
        if (transaksi.isEmpty()) {
            System.out.println("Belum ada transaksi yang dicatat.");
            return;
        }

        for (int i = 0; i < transaksi.size(); i++) {
            System.out.print("------------------");
        }
        // Menampilkan judul kolom
        System.out.printf("%-4s | %-20s | %-10s | %-10s\n", "No", "Deskripsi", "Nominal Penjualan(Rp)", "Nominal Pengeluaran(Rp)");

        // Menampilkan garis pemisah antara judul kolom dan data
        for (int i = 0; i < transaksi.size(); i++) {
            System.out.print("------------------");
        }
        System.out.println();

        // Menampilkan data transaksi dalam format tabel
        for (int i = 0; i < transaksi.size(); i++) {
            System.out.printf("%-4d | %-20s | %-10.2f |%-10.2f\n", i + 1, transaksi.get(i), nominalJual.get(i), nominalKeluar.get(i));
        }

        // Menampilkan garis pembatas bawah tabel
        for (int i = 0; i < transaksi.size(); i++) {
            System.out.print("------------------");
        }
        System.out.println();
    }

    private static void cariTransaksi(ArrayList<String> transaksi, ArrayList<Double> nominalJual, ArrayList<Double> nominalKeluar, Scanner input) {
        if (transaksi.isEmpty()) {
            System.out.println("Belum ada transaksi yang dicatat.");
            return;
        }

        System.out.print("Masukkan deskripsi atau bagian dari deskripsi transaksi yang ingin dicari: ");
        input.nextLine(); // Membersihkan newline character
        String kataKunci = input.nextLine();

        boolean ditemukan = false;

        // Mencari transaksi berdasarkan deskripsi
        System.out.println("----------------------------------------");
        System.out.println("Hasil Pencarian:");
        for (int i = 0; i < transaksi.size(); i++) {
            if (transaksi.get(i).toLowerCase().contains(kataKunci.toLowerCase())) {
                System.out.printf("%-4d | %-20s | %-10.2f | 10.2f\n", i + 1, transaksi.get(i), nominalJual.get(i), nominalKeluar.get(i));
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("TransaksiS tidak ditemukan.");
        }
    }
}

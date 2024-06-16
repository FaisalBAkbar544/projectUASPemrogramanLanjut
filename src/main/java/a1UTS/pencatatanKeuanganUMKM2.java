package a1UTS;
//jobdesk tambahan
//penambahan satuan transaksi

import java.util.ArrayList;
import java.util.Scanner;

public class pencatatanKeuanganUMKM2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> transaksiJual = new ArrayList<>();
        ArrayList<String> transaksiBeli = new ArrayList<>();
        ArrayList<String> satuanTransaksi = new ArrayList<>();
        ArrayList<Double> nominal = new ArrayList<>();
        int choice;

        do {
            tampilMenu();
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    tambahTransaksi(transaksiJual, nominal, input);
                    break;
                case 2:
                    hapusTransaksi(transaksiJual, nominal, input);
                    break;
                case 3:
                    tampilkanTransaksi(transaksiJual, nominal);
                    break;
                case 4:
                    cariTransaksi(transaksiJual, nominal, input);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (choice != 5);
    }

    private static void tampilMenu() {
        System.out.println("-----------------------------------------");
        System.out.println("Menu:");
        System.out.println("1. Tambahkan Transaksi");
        System.out.println("2. Hapus Transaksi");
        System.out.println("3. Tampilkan Semua Transaksi");
        System.out.println("4. Cari Transaksi");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
    }

    private static void tambahTransaksi(ArrayList<String> transaksiJual, ArrayList<Double> nominal, Scanner input) {
        System.out.print("Masukkan deskripsi transaksi: ");
        input.nextLine(); // Membersihkan newline character
        String deskripsi = input.nextLine();

        System.out.print("Masukkan nominal transaksi (Rp.): ");
        double jumlah = input.nextDouble();
        input.nextLine(); // Membersihkan newline character

        transaksiJual.add(deskripsi);
        nominal.add(jumlah);

        System.out.println("Transaksi berhasil ditambahkan!");
    }

    private static void hapusTransaksi(ArrayList<String> transaksi, ArrayList<Double> nominal, Scanner input) {
        if (transaksi.isEmpty()) {
            System.out.println("Belum ada transaksi yang dicatat.");
            return;
        }

        // Menampilkan garis pembatas atas tabel
        for (int i = 0; i < transaksi.size(); i++) {
            System.out.print("------------------");
        }
        System.out.println();

        // Menampilkan judul kolom
        System.out.printf("%-4s | %-20s | %-10s\n", "No", "Deskripsi", "Nominal (Rp)");

        // Menampilkan garis pemisah antara judul kolom dan data
        for (int i = 0; i < transaksi.size(); i++) {
            System.out.print("------------------");
        }
        System.out.println();

        // Menampilkan data transaksi dalam format tabel
        for (int i = 0; i < transaksi.size(); i++) {
            System.out.printf("%-4d | %-20s | %-10.2f\n", i + 1, transaksi.get(i), nominal.get(i));
        }

        // Menampilkan garis pembatas bawah tabel
        for (int i = 0; i < transaksi.size(); i++) {
            System.out.print("------------------");
        }
        System.out.println();

        System.out.print("Masukkan nomor transaksi yang ingin dihapus: ");
        int nomorHapus = input.nextInt();
        input.nextLine(); // Membersihkan newline character

        if (nomorHapus > 0 && nomorHapus <= transaksi.size()) {
            transaksi.remove(nomorHapus - 1);
            nominal.remove(nomorHapus - 1);
            System.out.println("Transaksi berhasil dihapus!");
        } else {
            System.out.println("Nomor transaksi tidak valid.");
        }
    }

    private static void tampilkanTransaksi(ArrayList<String> transaksi, ArrayList<Double> nominal) {
        if (transaksi.isEmpty()) {
            System.out.println("Belum ada transaksi yang dicatat.");
            return;
        }

        // Menampilkan garis pembatas atas tabel
        for (int i = 0; i < transaksi.size(); i++) {
            System.out.print("------------------");
        }
        System.out.println();

        // Menampilkan judul kolom
        System.out.printf("%-4s | %-20s | %-10s\n", "No", "Deskripsi", "Nominal (Rp)");

        // Menampilkan garis pemisah antara judul kolom dan data
        for (int i = 0; i < transaksi.size(); i++) {
            System.out.print("------------------");
        }
        System.out.println();

        // Menampilkan data transaksi dalam format tabel
        for (int i = 0; i < transaksi.size(); i++) {
            System.out.printf("%-4d | %-20s | %-10.2f\n", i + 1, transaksi.get(i), nominal.get(i));
        }

        // Menampilkan garis pembatas bawah tabel
        for (int i = 0; i < transaksi.size(); i++) {
            System.out.print("------------------");
        }
        System.out.println();

    }

    private static void cariTransaksi(ArrayList<String> transaksi, ArrayList<Double> nominal, Scanner input) {
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
                System.out.printf("%-4d | %-20s | %-10.2f\n", i + 1, transaksi.get(i), nominal.get(i));
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Transaksi tidak ditemukan.");
        }
    }

}

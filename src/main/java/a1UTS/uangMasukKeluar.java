package a1UTS;
import java.util.*;
public class uangMasukKeluar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> transaksi = new ArrayList<>();
        ArrayList<Double> kasMasuk = new ArrayList<>();
        ArrayList<Double> kasKeluar = new ArrayList<>();
        ArrayList<String> satuanTransaksi = new ArrayList<>();
        int pilihMenu;
        System.out.println("======================================");
        System.out.println(" Pencatatan Transaksi Keuangan UMKM   ");
        System.out.println("======================================");

        do {
            menu();
            pilihMenu = input.nextInt();

            switch (pilihMenu) {
                case 1:
                    tambahTransaksi(transaksi, kasMasuk, kasKeluar, satuanTransaksi, input);
                    break;
                case 2:
                    hapusTransaksi(transaksi, kasMasuk, kasKeluar, satuanTransaksi, input);
                    break;
                case 3:
                    tampilTransaksi(transaksi, kasMasuk, kasKeluar, satuanTransaksi);
                    break;
                case 4:
                    cariTransaksi(transaksi, kasMasuk, kasKeluar, satuanTransaksi, input);
                    break;
                case 5:
                    tampilkanTotalKas(kasMasuk, kasKeluar);
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

    private static void tambahTransaksi(ArrayList<String> transaksi, ArrayList<Double> kasMasuk, ArrayList<Double> kasKeluar, ArrayList<String> satuanTransaksi, Scanner input) {
        System.out.print("Masukkan keterangan transaksi: ");
        input.nextLine();
        String deskripsiTransaksi = input.nextLine();

        System.out.print("Masukkan jumlah uang : Rp.");
        double jumlah = input.nextDouble();
        input.nextLine();

        System.out.print("Pilih jenis transaksi (1. Kas Masuk / 2. Kas Keluar) : ");
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

        System.out.print("Masukkan satuan transaksi: ");
        String satuan = input.nextLine();

        if (jenis.equalsIgnoreCase("Masuk")) {
            kasMasuk.add(jumlah);
            kasKeluar.add(0.0);
        } else {
            kasKeluar.add(jumlah);
            kasMasuk.add(0.0);
        }

        transaksi.add(deskripsiTransaksi);
        satuanTransaksi.add(satuan); 
        System.out.println("Transaksi berhasil ditambahkan!");
    }

    private static void hapusTransaksi(ArrayList<String> transaksi, ArrayList<Double> kasMasuk, ArrayList<Double> kasKeluar, ArrayList<String> satuanTransaksi, Scanner input) {
        if (transaksi.isEmpty()) {
            System.out.println("Belum ada transaksi yang dicatat.");
            return;
        }

        System.out.println("Daftar Transaksi:");
        tampilTransaksi(transaksi, kasMasuk, kasKeluar, satuanTransaksi);
        System.out.println("");

        System.out.print("Masukkan nomor transaksi yang ingin dihapus: ");
        int nomorHapus = input.nextInt();
        input.nextLine();

        if (nomorHapus > 0 && nomorHapus <= transaksi.size()) {
            kasMasuk.remove(nomorHapus - 1);
            kasKeluar.remove(nomorHapus - 1);
            transaksi.remove(nomorHapus - 1);
            satuanTransaksi.remove(nomorHapus - 1);
            System.out.println("Transaksi berhasil dihapus!");
        } else {
            System.out.println("Nomor transaksi tidak valid.");
        }
    }

    private static void tampilTransaksi(ArrayList<String> transaksi, ArrayList<Double> kasMasuk, ArrayList<Double> kasKeluar, ArrayList<String> satuanTransaksi) {
        double saldoSaatIni = 0, saldoKeseluruhan;
        int b = 0,p;

        if (transaksi.isEmpty()) {
            System.out.println("Belum ada transaksi yang dicatat.");
            return;
        }

        System.out.println("Neraca Saldo Keuangan :");
        for ( p = 0; p < 4; p++) {
            System.out.print("---------------------------");
        }
        System.out.println();

        System.out.printf("| %-4s | %-25s | %-15s | %-13s | %-13s | %-13s |\n", " No", "Deskripsi", "Satuan", "Kas Masuk", "Kas Keluar", "Saldo ");
        for (int i = 0; i < 4; i++) {
            System.out.print("---------------------------");
        }
        System.out.println("");

        for (b = 0; b < transaksi.size(); b++) {
            double saldoTransaksi = kasMasuk.get(b) - kasKeluar.get(b);
            saldoSaatIni += saldoTransaksi;
            System.out.printf("| %-4d | %-25s | %-15s | %13.2f | %13.2f |  %13.2f |\n", b + 1, transaksi.get(b), satuanTransaksi.get(b), kasMasuk.get(b), kasKeluar.get(b), saldoSaatIni);
        }

        saldoKeseluruhan = hitungTotalKas(kasMasuk) - hitungTotalKas(kasKeluar);
        System.out.printf("| %-4s | %-25s | %-15s | %13.2f | %13.2f |  %13.2f |\n", "-", "TOTAL", "-", hitungTotalKas(kasMasuk), hitungTotalKas(kasKeluar), saldoKeseluruhan);

        for (p = 0; p < 4; p++) {
            System.out.print("---------------------------");
        }
        System.out.println("");
    }

    private static void cariTransaksi(ArrayList<String> transaksi, ArrayList<Double> kasMasuk, ArrayList<Double> kasKeluar, ArrayList<String> satuanTransaksi, Scanner input) {
        boolean cek = false;
        String cari;
        if (transaksi.isEmpty()) {
            System.out.println("Belum ada transaksi yang dicatat.");
            return;
        }

        System.out.print("Masukkan keterangan transaksi yang dicari : ");
        input.nextLine();
        cari = input.nextLine();
        System.out.println();

        System.out.println("Hasil Pencarian:");
        for (int i = 0; i < 4; i++) {
            System.out.print("---------------------------");
        }
        System.out.println();
        System.out.printf("| %-4s | %-25s | %-15s | %-13s | %-13s | %-13s |\n", "No", "Deskripsi", "Kas Masuk", "Kas Keluar", "Satuan", "Saldo");
        for (int i = 0; i < 4; i++) {
            System.out.print("---------------------------");
        }
        System.out.println();

        for (int i = 0; i < transaksi.size(); i++) {
            if (transaksi.get(i).toLowerCase().contains(cari.toLowerCase())) {
                System.out.printf("| %-4d | %-25s | %-15s | %13.2f | %13.2f | %13.2f |\n", i + 1, transaksi.get(i), satuanTransaksi.get(i), kasMasuk.get(i), kasKeluar.get(i), (kasMasuk.get(i) - kasKeluar.get(i)));
                cek = true;
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print("---------------------------");
        }
        System.out.println();

        if (!cek) {
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

    private static void tampilkanTotalKas(ArrayList<Double> kasMasuk, ArrayList<Double> kasKeluar) {
        System.out.println("==============================================");
        System.out.println("          Ringkasan Keuangan Keseluruhan      ");
        System.out.println("==============================================");
        System.out.printf("| %-20s | %-20s |\n", "Jenis", "Jumlah");
        System.out.println("----------------------------------------------");
        System.out.printf("| %-20s | %20.2f |\n", "Kas Masuk ", hitungTotalKas(kasMasuk));
        System.out.printf("| %-20s | %20.2f |\n", "Kas Keluar", hitungTotalKas(kasKeluar));
        System.out.printf("| %-20s | %20.2f |\n", "Keuntungan", hitungTotalKas(kasMasuk)-hitungTotalKas(kasKeluar));
        System.out.println("----------------------------------------------\n");
        System.out.println("---------------------------------------------");
        System.out.println("Terima kasih telah menggunakan aplikasi ini\n Semoga rezeki anda dilancarkan Allah SWT");
        System.out.println("---------------------------------------------");
    }

}

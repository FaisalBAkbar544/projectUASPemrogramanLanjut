package b1GUI;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class gui1dasar {

    public static void main(String[] args) {
        //=================BAGIAN CONTAINER========================
        //inisialisasi objek
        JFrame kotak = new JFrame("Aplikasi Perpustakaan");
        //mengatur ukuran form
        kotak.setSize(400, 550);
        //mengatur agar tertutup otomatis >> Posisi pojok kanan atar
        kotak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //mengatur lokasi kotak agar di tengah
//        kotak.setLocationRelativeTo(null);
        //mengatur lokasi kotak di tengah
        kotak.setLayout(null);

        //==================End bagian container=====================
        //==================Bagian Komponen==========================
        //inisialisasi objek label ke-1
        JLabel label = new JLabel("Label Perpustakaan");
        //mengatur letak label
        label.setBounds(120, 30, 150, 30);
        //menambahkan komponen
        kotak.add(label);

        //inisialisasi objek label ke-2
        JLabel labelKode = new JLabel("Kode Buku");
        labelKode.setBounds(20, 75, 150, 30);
        kotak.add(labelKode);

        //inisialisasi objek input text di kode buku
        JTextField txtKodeBuku = new JTextField();
        txtKodeBuku.setBounds(150, 80, 150, 25);
        kotak.add(txtKodeBuku);

        //inisialisasi objek label ke-3
        JLabel namaBuku = new JLabel("Nama Buku");
        namaBuku.setBounds(20, 110, 150, 30);
        kotak.add(namaBuku);

        JTextField inputBuku = new JTextField();
        inputBuku.setBounds(150, 110, 150, 25);
        kotak.add(inputBuku);

        //inisialisasi objek label ke-4 >>Membership
        JLabel membership = new JLabel("Membership ");
        membership.setBounds(20, 140, 150, 25);
        kotak.add(membership);
        //radio button ke-1
        JRadioButton memberEks = new JRadioButton();
        memberEks.setText("Ekslusif");
        memberEks.setBounds(150, 140, 80, 25);
        //radio button ke-2
        JRadioButton memberUmum = new JRadioButton();
        memberUmum.setText("Umum");
        memberUmum.setBounds(230, 140, 80, 25);

        //add button
        kotak.add(memberEks);
        kotak.add(memberUmum);

        //mengelompokkan pilihan agar menjadi salah satu
        ButtonGroup grupMember = new ButtonGroup();
        grupMember.add(memberEks);
        grupMember.add(memberUmum);

        //Bagian biaya per hari
        JLabel biaya = new JLabel("Biaya Per hari");
        biaya.setBounds(20, 170, 150, 30);
        kotak.add(biaya);

        //inisialisasi objek input text di kode buku
        JTextField txtBiaya = new JTextField();
        txtBiaya.setBounds(150, 170, 150, 25);
        kotak.add(txtBiaya);

        //Bagian tanggal pinjam
        JLabel tPinjam = new JLabel("Tanggal pinjam");
        tPinjam.setBounds(20, 200, 150, 30);
        kotak.add(tPinjam);

        //combo Box Tanggal Hari
        String hari[] = new String[31];
        for (int i = 0; i < hari.length; i++) {
            hari[i] = Integer.toString(i + 1);

        }
        JComboBox cbHari = new JComboBox(hari);
        cbHari.setBounds(150, 200, 50, 25);
        kotak.add(cbHari);

        String bulan[] = {"Jan", "Feb", "Mar", "April", "Mei", "Juni",
            "Juli", "Agus", "Sep", "Okto", "Nov", "Des"};
        JComboBox cbBulan = new JComboBox(bulan);
        cbBulan.setBounds(200, 200, 55, 25);
        kotak.add(cbBulan);

        JTextField txtTahun = new JTextField();
        txtTahun.setBounds(260, 200, 45, 25);
        kotak.add(txtTahun);

        //>>Bagian Lama Pinjam
        JLabel lamaPinjam = new JLabel("Lama Pinjam");
        lamaPinjam.setBounds(20, 230, 150, 25);
        kotak.add(lamaPinjam);

        //>Rentang pinjam
        String rentangPinjam[] = {"1", "2", "3", "4", "5", "6", "7"};
        JComboBox cbLamaPinjam = new JComboBox(rentangPinjam);
        cbLamaPinjam.setBounds(150, 230, 70, 25);
        kotak.add(cbLamaPinjam);

//        //>>Bagian total biaya
//        JLabel tBiaya = new JLabel("Total biaya");
//        tBiaya.setBounds(20, 260, 150, 25);
//        kotak.add(tBiaya);
//
//        JTextField txtTBiaya = new JTextField();
//        txtTBiaya.setBounds(150, 260, 150, 25);
//        kotak.add(txtTBiaya);
//        
//        //>>Bagian jumlah bayar
//        JLabel jumlahBayar = new JLabel("Jumlah Bayar");
//        jumlahBayar.setBounds(20, 290, 150, 25);
//        kotak.add(jumlahBayar);
//
//        JTextField txtJBiaya = new JTextField();
//        txtJBiaya.setBounds(150, 290, 150, 25);
//        kotak.add(txtJBiaya);
//        
//        //>>Bagian total kembalian
//        JLabel totalKembalian = new JLabel("Kembalian");
//        totalKembalian.setBounds(20, 320, 150, 25);
//        kotak.add(totalKembalian);
//
//        JTextField txtKembalian = new JTextField();
//        txtKembalian.setBounds(150, 320, 150, 25);
//        kotak.add(txtKembalian);
//        
//        //Simpan reset
//        JLabel simpan = new JLabel("Simpan");
//        jumlahBayar.setBounds(150, 330, 55, 25);
//        JLabel reset = new JLabel("Reset");
//        jumlahBayar.setBounds(200, 330, 55, 25);
//        kotak.add(simpan);
//        kotak.add(reset);

        //mengatur agar kotak muncul
        kotak.setVisible(true);

    }

}

package pengelolaan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class a5DataBarang extends javax.swing.JFrame {

    private a5SearchData laporanData; // 

    public a5DataBarang() {
        initComponents();
        getSumBarang();
        laporanData = new a5SearchData(); // Inis
        transferDataToLaporanData();

    }

    private void transferDataToLaporanData() {
        TableModel model1 = tabelBarang.getModel();
        ArrayList<Object[]> dataList1 = new ArrayList<>(); // Inisialisasi ArrayList
        Object[] row = new Object[6];
        DefaultTableModel model3 = (DefaultTableModel) laporanData.tabelBarangS.getModel(); // Ambil model tabel dari frame2
        model3.setRowCount(0); // Bersihkan model tabel di frame2 sebelum menambahkan data baru

        // Loop melalui semua baris di model1
        for (int i = 0; i < model1.getRowCount(); i++) {
            row[0] = model1.getValueAt(i, 0);
            row[1] = model1.getValueAt(i, 1);
            row[2] = model1.getValueAt(i, 2);
            row[3] = model1.getValueAt(i, 3);
            row[4] = model1.getValueAt(i, 4);
            row[5] = model1.getValueAt(i, 5);

            model3.addRow(row);
            dataList1.add(row); // Gunakan clone() untuk mencegah data yang sama diubah
        }
        laporanData.updateData2(dataList1);

    }

    public int getSumBarang() {
        int sum = 0;
        for (int i = 0; i < tabelBarang.getRowCount(); i++) {
            try {
                int jumlah = Integer.parseInt(tabelBarang.getValueAt(i, 3).toString());
                // Tangani jika nilai tidak dapat diubah menjadi bilangan bulat
                sum += jumlah;
            } catch (NumberFormatException e) {
                // Tangani jika ada kesalahan parsing nilai
                System.err.println("Error parsing value at row " + i);
                e.printStackTrace();
            }
        }
        hasil.setText(String.valueOf(sum));
        return sum;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupButton = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        hasil = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtKeterangan = new javax.swing.JTextArea();
        boxKategori = new javax.swing.JComboBox<>();
        txtBarang = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        buttonBersih = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonPerbarui = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        radioMasuk = new javax.swing.JRadioButton();
        radioKeluar = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTambahKategori = new javax.swing.JTextField();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        buttonSimpan1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 153), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengelolaan/people icon (1).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("name");

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengelolaan/dataBarang.png"))); // NOI18N
        jButton3.setText("Data Barang");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengelolaan/karyawan-removebg-preview (1).png"))); // NOI18N
        jButton4.setText("Karyawan");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 102, 102));
        jButton9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengelolaan/alat-removebg-preview (2).png"))); // NOI18N
        jButton9.setText("Data Alat");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 102, 102));
        jButton11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengelolaan/alat-removebg-preview (2).png"))); // NOI18N
        jButton11.setText("Laporan");
        jButton11.setMaximumSize(new java.awt.Dimension(119, 37));
        jButton11.setMinimumSize(new java.awt.Dimension(119, 37));
        jButton11.setPreferredSize(new java.awt.Dimension(119, 37));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total Barang :");

        hasil.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        hasil.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(925, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengelolaan/many people.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pengelolaan Barang Bangunan");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(746, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(51, 102, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Nama Barang", "Kategori", "Jumlah ", "Keterangan", "Masuk/Keluar"
            }
        ));
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 320));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tanggal              :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama Barang    :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kategori             :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jumlah               :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Keterangan       :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtKeterangan.setColumns(20);
        txtKeterangan.setRows(5);
        jScrollPane2.setViewportView(txtKeterangan);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 210, 120));

        boxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Paku", "Gembok", "Kayu", "Cat" }));
        jPanel3.add(boxKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 210, 30));
        jPanel3.add(txtBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 210, -1));
        jPanel3.add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 210, -1));

        buttonBersih.setText("Bersih");
        buttonBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBersihActionPerformed(evt);
            }
        });
        jPanel3.add(buttonBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 250, 100, 30));

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });
        jPanel3.add(buttonHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 290, 100, 30));

        buttonPerbarui.setText("Perbarui");
        buttonPerbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPerbaruiActionPerformed(evt);
            }
        });
        jPanel3.add(buttonPerbarui, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 110, 30));

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Barang :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 150, 30));

        grupButton.add(radioMasuk);
        radioMasuk.setText("Masuk");
        radioMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMasukActionPerformed(evt);
            }
        });
        jPanel3.add(radioMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        grupButton.add(radioKeluar);
        radioKeluar.setText("Keluar");
        jPanel3.add(radioKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 65, -1));

        jPanel10.setBackground(new java.awt.Color(0, 153, 153));

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel14.setText("Data Barang");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(680, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tambahkan Kategori :");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 130, -1));

        txtTambahKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTambahKategoriActionPerformed(evt);
            }
        });
        jPanel3.add(txtTambahKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 170, -1));
        jPanel3.add(txtTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 210, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 51, 102));

        jLabel11.setText("Information");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 149, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 230, 180));

        buttonSimpan1.setText("Simpan");
        buttonSimpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpan1ActionPerformed(evt);
            }
        });
        jPanel3.add(buttonSimpan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 110, 30));

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        a5DataBarang keDataBarang = new a5DataBarang();
        keDataBarang.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        a5DataAlat keDataAlat = new a5DataAlat();
        keDataAlat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        a7MenuTambahKaryawan keKaryawan = new a7MenuTambahKaryawan();
        keKaryawan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtTambahKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTambahKategoriActionPerformed

    }//GEN-LAST:event_txtTambahKategoriActionPerformed

    private void radioMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMasukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMasukActionPerformed

    private void buttonPerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPerbaruiActionPerformed
        Date tanggal = txtTanggal.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String setTanggal = dateFormat.format(tanggal);

        int i = tabelBarang.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tabelBarang.getModel();

        if (i >= 0) {
            model.setValueAt(setTanggal, i, 0);
            model.setValueAt(txtBarang.getText(), i, 1);
            model.setValueAt(boxKategori.getSelectedItem(), i, 2);
            model.setValueAt(txtJumlah.getText(), i, 3);
            model.setValueAt(txtKeterangan.getText(), i, 4);

            String tipeTransaksi = radioMasuk.isSelected() ? "Masuk" : "Keluar";
            model.setValueAt(tipeTransaksi, i, 5);
            getSumBarang();
            JOptionPane.showMessageDialog(this, "Berhasil memperbarui");
        } else {
            JOptionPane.showMessageDialog(null, "Pilih baris yang akan diperbarui");
        }
    }//GEN-LAST:event_buttonPerbaruiActionPerformed

    private void buttonSimpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpan1ActionPerformed
        Date tanggal = txtTanggal.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String setTanggal = dateFormat.format(tanggal);

        String tipeTransaksi;
        if (radioMasuk.isSelected()) {
            tipeTransaksi = radioMasuk.getText();
        } else {
            tipeTransaksi = radioKeluar.getText();
        }

        DefaultTableModel model = (DefaultTableModel) tabelBarang.getModel();
        model.addRow(new Object[]{setTanggal, txtBarang.getText(), boxKategori.getSelectedItem(), txtJumlah.getText(), txtKeterangan.getText(), tipeTransaksi
        });
        getSumBarang();
        JOptionPane.showMessageDialog(this, "Berhasil menyimpan");
    }//GEN-LAST:event_buttonSimpan1ActionPerformed

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        DefaultTableModel model = (DefaultTableModel) tabelBarang.getModel();
        int selectedRowIndex = tabelBarang.getSelectedRow();
        if (selectedRowIndex >= 0) {

            String tanggalStr = model.getValueAt(selectedRowIndex, 0).toString();

            try {
                Date tanggal = new SimpleDateFormat("dd-MM-yyyy").parse(tanggalStr);
                txtTanggal.setDate(tanggal);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }

            txtBarang.setText(model.getValueAt(selectedRowIndex, 1).toString());
            boxKategori.setSelectedItem(model.getValueAt(selectedRowIndex, 2).toString());
            txtJumlah.setText(model.getValueAt(selectedRowIndex, 3).toString());
            txtKeterangan.setText(model.getValueAt(selectedRowIndex, 4).toString());

            String tipeTransaksi = model.getValueAt(selectedRowIndex, 5).toString();
            radioMasuk.setSelected("Masuk".equals(tipeTransaksi));
            radioKeluar.setSelected(!"Masuk".equals(tipeTransaksi));
        }

    }//GEN-LAST:event_tabelBarangMouseClicked

    private void buttonBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBersihActionPerformed
        txtTanggal.setDate(null);
        txtBarang.setText("");
        boxKategori.setSelectedIndex(0);
        txtJumlah.setText("");
        txtKeterangan.setText("");
        grupButton.clearSelection();
        txtTambahKategori.setText("");
        JOptionPane.showMessageDialog(this, "Berhasil membersihkan");
    }//GEN-LAST:event_buttonBersihActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelBarang.getModel();
        try {
            int SelectedRowIndex = tabelBarang.getSelectedRow();
            model.removeRow(SelectedRowIndex);
            getSumBarang();
                 JOptionPane.showMessageDialog(this, "Berhasil menghapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        transferDataToLaporanData();
        laporanData.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a5DataBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxKategori;
    private javax.swing.JButton buttonBersih;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonPerbarui;
    private javax.swing.JButton buttonSimpan1;
    private javax.swing.ButtonGroup grupButton;
    private javax.swing.JLabel hasil;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioKeluar;
    private javax.swing.JRadioButton radioMasuk;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTextField txtBarang;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextArea txtKeterangan;
    private javax.swing.JTextField txtTambahKategori;
    private com.toedter.calendar.JDateChooser txtTanggal;
    // End of variables declaration//GEN-END:variables
}

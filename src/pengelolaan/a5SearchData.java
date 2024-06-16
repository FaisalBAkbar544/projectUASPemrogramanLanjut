//ada fitur edit date gitu biar keren, nanti keluarnya di textField
package pengelolaan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ButtonModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class a5SearchData extends javax.swing.JFrame {

    private DefaultTableModel model2;
    private DefaultTableModel model3;

    public a5SearchData() {
        initComponents();
        model2 = (DefaultTableModel) tabelAlatS.getModel();
        model3 = (DefaultTableModel) tabelBarangS.getModel();
    }

    public a5SearchData(ArrayList<Object[]> dataList) {
        initComponents();
        model2 = (DefaultTableModel) tabelAlatS.getModel();
        model3 = (DefaultTableModel) tabelBarangS.getModel();
        updateData1(dataList);
        updateData2(dataList); // Gunakan metode baru untuk mengupdate data
    }

    private Object[][] data_table(DefaultTableModel model) {
        int rowCount = model.getRowCount();
        int colCount = model.getColumnCount();
        Object[][] data = new Object[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                data[i][j] = model.getValueAt(i, j);
            }
        }
        return data;
    }

    private void _bubble_asc(Object[][] data, int n, int columnIndex) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date date1 = dateFormat.parse((String) data[i][columnIndex]);
                Date date2 = dateFormat.parse((String) data[i + 1][columnIndex]);
                if (date1.compareTo(date2) > 0) {
                    Object[] temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
        _bubble_asc(data, n - 1, columnIndex);
    }

    private void _bubble_des(Object[][] data, int n, int columnIndex) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date date1 = dateFormat.parse((String) data[i][columnIndex]);
                Date date2 = dateFormat.parse((String) data[i + 1][columnIndex]);
                if (date1.compareTo(date2) < 0) {
                    Object[] temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
        _bubble_des(data, n - 1, columnIndex);
    }

    private void data_table_update(Object[][] data, DefaultTableModel model) {
        model.setRowCount(0); // Bersihkan model tabel sebelum menambahkan data baru
        for (Object[] rowData : data) {
            model.addRow(rowData); // Tambahkan setiap baris data ke model tabel
        }
    }

    public void updateData1(ArrayList<Object[]> dataList1) {
        model2.setRowCount(0); // Bersihkan model tabel sebelum menambahkan data baru
        for (Object[] rowData : dataList1) {
            model2.addRow(rowData); // Tambahkan setiap baris data ke model tabel
        }
    }

    public void updateData2(ArrayList<Object[]> dataList1) {
        model3.setRowCount(0); // Bersihkan model tabel sebelum menambahkan data baru
        for (Object[] rowData : dataList1) {
            model3.addRow(rowData); // Tambahkan setiap baris data ke model tabel
        }
    }

    private void _bubble_sort_date(Object[][] data, int n, int columnIndex, boolean ascending) {
        if (ascending) {
            _bubble_asc(data, n, columnIndex);
        } else {
            _bubble_des(data, n, columnIndex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        grupButton = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonBarang = new javax.swing.JButton();
        buttonKaryawan = new javax.swing.JButton();
        buttonAlat = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        alatAscen = new javax.swing.JRadioButton();
        alatDescen = new javax.swing.JRadioButton();
        searchAlat = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelAlatS = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        barangAscen = new javax.swing.JRadioButton();
        barangDescen = new javax.swing.JRadioButton();
        searchBarang = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelBarangS = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        buttonBarang.setBackground(new java.awt.Color(0, 102, 102));
        buttonBarang.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        buttonBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengelolaan/dataBarang.png"))); // NOI18N
        buttonBarang.setText("Data Barang");
        buttonBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBarangActionPerformed(evt);
            }
        });

        buttonKaryawan.setBackground(new java.awt.Color(0, 102, 102));
        buttonKaryawan.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        buttonKaryawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengelolaan/karyawan-removebg-preview (1).png"))); // NOI18N
        buttonKaryawan.setText("Karyawan");
        buttonKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKaryawanActionPerformed(evt);
            }
        });

        buttonAlat.setBackground(new java.awt.Color(0, 102, 102));
        buttonAlat.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        buttonAlat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengelolaan/alat-removebg-preview (2).png"))); // NOI18N
        buttonAlat.setText("Data Alat");
        buttonAlat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlatActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonKaryawan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAlat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonBarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(buttonBarang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAlat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jPanel3.setMinimumSize(new java.awt.Dimension(810, 500));
        jPanel3.setPreferredSize(new java.awt.Dimension(810, 500));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(0, 153, 51));

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel14.setText("Data Alat");

        buttonGroup1.add(alatAscen);
        alatAscen.setText("Ascending");

        buttonGroup1.add(alatDescen);
        alatDescen.setText("Descending");

        searchAlat.setBackground(new java.awt.Color(0, 102, 102));
        searchAlat.setText("Search");
        searchAlat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAlatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(alatAscen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alatDescen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(searchAlat, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(alatAscen)
                    .addComponent(alatDescen)
                    .addComponent(searchAlat)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        tabelAlatS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Nama Alat", "Kategori", "Jumlah", "Keterangan", "Kondisi", "Masuk/Keluar"
            }
        ));
        jScrollPane3.setViewportView(tabelAlatS);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 810, 230));

        jPanel9.setBackground(new java.awt.Color(0, 153, 51));

        barangAscen.setText("Ascending");
        barangAscen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barangAscenActionPerformed(evt);
            }
        });

        barangDescen.setText("Descending");

        searchBarang.setBackground(new java.awt.Color(0, 102, 102));
        searchBarang.setText("Search");
        searchBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarangActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("Data Barang");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(barangAscen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barangDescen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barangAscen)
                            .addComponent(barangDescen)
                            .addComponent(searchBarang))))
                .addContainerGap())
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 810, 50));

        tabelBarangS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Nama Barang", "Kategori", "Jumlah", "Keterangan", "Masuk/Keluar"
            }
        ));
        jScrollPane4.setViewportView(tabelBarangS);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 810, 260));

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBarangActionPerformed
        a5DataBarang keDataBarang = new a5DataBarang();
        keDataBarang.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_buttonBarangActionPerformed

    private void buttonAlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlatActionPerformed
        a5DataAlat keDataAlat = new a5DataAlat();
        keDataAlat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonAlatActionPerformed

    private void buttonKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKaryawanActionPerformed
        a7MenuTambahKaryawan keKaryawan = new a7MenuTambahKaryawan();
        keKaryawan.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_buttonKaryawanActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
//        transferDataToLaporanData();
//        laporanData.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void searchAlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAlatActionPerformed
        Object[][] data = data_table(model2);
        int n = data.length;
        int columnIndex = 0; // Indeks kolom untuk pengurutan berdasarkan tanggal, sesuaikan dengan kolom yang benar
        if (alatAscen.isSelected()) {
            _bubble_sort_date(data, n, columnIndex, true);
        } else if (alatDescen.isSelected()) {
            _bubble_sort_date(data, n, columnIndex, false);
        }

        data_table_update(data, model2); // Per
    }//GEN-LAST:event_searchAlatActionPerformed

    private void searchBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarangActionPerformed
        Object[][] data = data_table(model3);
        int n = data.length;
        int columnIndex = 0; // Indeks kolom untuk pengurutan berdasarkan tanggal, sesuaikan dengan kolom yang benar
        if (barangAscen.isSelected()) {
            _bubble_sort_date(data, n, columnIndex, true);
        } else if (barangDescen.isSelected()) {
            _bubble_sort_date(data, n, columnIndex, false);
        }

        data_table_update(data, model3); // Perbarui model tabel barang


    }//GEN-LAST:event_searchBarangActionPerformed

    private void barangAscenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barangAscenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barangAscenActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a5SearchData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton alatAscen;
    private javax.swing.JRadioButton alatDescen;
    private javax.swing.JRadioButton barangAscen;
    private javax.swing.JRadioButton barangDescen;
    private javax.swing.JButton buttonAlat;
    private javax.swing.JButton buttonBarang;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buttonKaryawan;
    private javax.swing.ButtonGroup grupButton;
    private javax.swing.JButton jButton11;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton searchAlat;
    private javax.swing.JButton searchBarang;
    public javax.swing.JTable tabelAlatS;
    public javax.swing.JTable tabelBarangS;
    // End of variables declaration//GEN-END:variables
}

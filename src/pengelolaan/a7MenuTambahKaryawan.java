package pengelolaan;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class a7MenuTambahKaryawan extends javax.swing.JFrame {

    public a7MenuTambahKaryawan() {
        initComponents();
        getSumKaryawan();
    }

    public int getSumKaryawan() {
        int sum = 0;
        for (int i = 0; i < tabelKaryawan.getRowCount(); i++) {
            try {
                String value = tabelKaryawan.getValueAt(i, 0).toString();
                if (value != null && !value.isEmpty()) {
                    sum++;
                }

            } catch (NumberFormatException e) {

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        hasil = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKaryawan = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        boxPosisi = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAlamat = new javax.swing.JTextArea();
        txtTelepon = new javax.swing.JTextField();
        boxGender = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        buttonUpdate = new javax.swing.JButton();

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

        jButton9.setBackground(new java.awt.Color(0, 102, 102));
        jButton9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengelolaan/alat-removebg-preview (2).png"))); // NOI18N
        jButton9.setText("Data Alat");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
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

        hasil.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        hasil.setForeground(new java.awt.Color(255, 255, 255));
        hasil.setText("0");

        jLabel15.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total Karyawan :");

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
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(925, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengelolaan/many people.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pengelolaan Barang Bangunan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(726, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setPreferredSize(new java.awt.Dimension(925, 665));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTextField5.setText("Klik Tabel untuk melakukan Search");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        tabelKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Lengkap", "No.Telepon", "Username", "Password", "Posisi", "Gender", "Alamat"
            }
        ));
        tabelKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelKaryawan);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 790, 330));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama Lengkap :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 100, 30));
        jPanel3.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 145, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tambah Pegawai");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 248, 20));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("No. Telepon      :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 100, 20));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Alamat   :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 60, 20));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Username         :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 100, 30));

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password          :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 110, 30));

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gender   :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 76, 30));

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Posisi     :");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 76, -1));
        jPanel3.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 144, -1));
        jPanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 144, -1));

        jButton5.setBackground(new java.awt.Color(0, 102, 51));
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 90, 40));

        jButton6.setBackground(new java.awt.Color(0, 102, 51));
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 90, 40));

        buttonAdd.setBackground(new java.awt.Color(0, 102, 51));
        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        jPanel3.add(buttonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 80, 40));

        boxPosisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Costumer Service", "Penjaga Toko", "Supplier", " ", " " }));
        jPanel3.add(boxPosisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 120, 30));

        textAlamat.setColumns(20);
        textAlamat.setRows(5);
        jScrollPane2.setViewportView(textAlamat);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 184, 162));
        jPanel3.add(txtTelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 145, -1));

        boxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Laki-laki", "Perempuan", " ", " " }));
        jPanel3.add(boxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 120, 30));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel14.setText("Tambah Karyawan");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(612, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 790, 50));

        buttonUpdate.setBackground(new java.awt.Color(0, 102, 51));
        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(buttonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 80, 40));

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed

    }//GEN-LAST:event_jTextField5ActionPerformed

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

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelKaryawan.getModel();
        model.addRow(new Object[]{txtNama.getText(), txtTelepon.getText(), txtUsername.getText(), txtPassword.getText(), boxPosisi.getSelectedItem(), boxGender.getSelectedItem(), textAlamat.getText()
        });
        getSumKaryawan();
        JOptionPane.showMessageDialog(this, "Berhasil menambahkan");
    }//GEN-LAST:event_buttonAddActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txtNama.setText("");
        txtTelepon.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        boxPosisi.setSelectedIndex(0);
        boxGender.setSelectedIndex(0);
        textAlamat.setText("");
        JOptionPane.showMessageDialog(this, "Berhasil membersihkan");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelKaryawan.getModel();
        try {
            int SelectedRowIndex = tabelKaryawan.getSelectedRow();
            model.removeRow(SelectedRowIndex);
            getSumKaryawan();
            JOptionPane.showMessageDialog(this, "Berhasil menghapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tabelKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKaryawanMouseClicked
        DefaultTableModel model = (DefaultTableModel) tabelKaryawan.getModel();
        int selectedRowIndex = tabelKaryawan.getSelectedRow();
        txtNama.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtTelepon.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtUsername.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtPassword.setText(model.getValueAt(selectedRowIndex, 0).toString());
        boxPosisi.setSelectedItem(model.getValueAt(selectedRowIndex, 1).toString());
        boxGender.setSelectedItem(model.getValueAt(selectedRowIndex, 2).toString());
        textAlamat.setText(model.getValueAt(selectedRowIndex, 0).toString());

    }//GEN-LAST:event_tabelKaryawanMouseClicked

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed

        int i = tabelKaryawan.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tabelKaryawan.getModel();
        if (i >= 0) {
            model.setValueAt(txtNama.getText(), i, 0);
            model.setValueAt(txtTelepon.getText(), i, 1);
            model.setValueAt(txtUsername.getText(), i, 2);
            model.setValueAt(txtPassword.getText(), i, 3);
            model.setValueAt(boxPosisi.getSelectedItem(), i, 4);
            model.setValueAt(boxGender.getSelectedItem(), i, 5);
            model.setValueAt(textAlamat.getText(), i, 6);
            getSumKaryawan();
            JOptionPane.showMessageDialog(this, "Berhasil memperbarui");
        } else {
            JOptionPane.showMessageDialog(null, "Pilih baris yang akan diperbarui");
        }
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        a5SearchData keLaporan = new a5SearchData();
        keLaporan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(a7MenuTambahKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(a7MenuTambahKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(a7MenuTambahKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(a7MenuTambahKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a7MenuTambahKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxGender;
    private javax.swing.JComboBox<String> boxPosisi;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JLabel hasil;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tabelKaryawan;
    private javax.swing.JTextArea textAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelepon;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

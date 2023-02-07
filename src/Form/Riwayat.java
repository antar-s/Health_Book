package Form;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Riwayat extends javax.swing.JDialog {

    public Riwayat(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tampil_Pasien();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_karyawan = new javax.swing.JPanel();
        b_refersh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_history = new javax.swing.JTable();
        b_cari = new javax.swing.JButton();
        t_cari = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_karyawan.setBackground(java.awt.Color.darkGray);

        b_refersh.setBackground(java.awt.Color.lightGray);
        b_refersh.setFont(new java.awt.Font("Ubuntu Medium", 0, 12)); // NOI18N
        b_refersh.setForeground(java.awt.Color.darkGray);
        b_refersh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/refresh.png"))); // NOI18N
        b_refersh.setText("Refresh");
        b_refersh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_refersh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refershActionPerformed(evt);
            }
        });

        tbl_history.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_history.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tbl_history);

        b_cari.setBackground(java.awt.Color.lightGray);
        b_cari.setFont(new java.awt.Font("Ubuntu Medium", 0, 14)); // NOI18N
        b_cari.setForeground(java.awt.Color.darkGray);
        b_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/search 24x24.png"))); // NOI18N
        b_cari.setText("Cari");
        b_cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cariActionPerformed(evt);
            }
        });

        t_cari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cari.setToolTipText("Ketikkan yang akan dicari DISINI");
        t_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cariKeyTyped(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 153, 102));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Data History Pasien");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_karyawanLayout = new javax.swing.GroupLayout(panel_karyawan);
        panel_karyawan.setLayout(panel_karyawanLayout);
        panel_karyawanLayout.setHorizontalGroup(
            panel_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_karyawanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
                    .addGroup(panel_karyawanLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_refersh, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(panel_karyawanLayout.createSequentialGroup()
                        .addComponent(b_cari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_cari)))
                .addContainerGap())
        );
        panel_karyawanLayout.setVerticalGroup(
            panel_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_karyawanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_refersh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_karyawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_karyawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private DefaultTableModel tabmode;
    Connection conn = new Koneksi().getConnection();

    public void tampil_Pasien() {
        Object[] baris = {"ID/No Pasien", "Nama Pasien", "Jenis Kelamin", "Alamat", "No Tlp", "Kode Kamar", "Lantai", "No Kamar", "Tipe Kamar", "Harga/Malam", "Tanggal Cek In", "Tanggal Cek CekOut", "Lama Menginap", "Total Biaya"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_history.setModel(tabmode);
        try {
            String sql = "SELECT * FROM tb_history_pasien ORDER BY no_pasien asc";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String no_pasien = hasil.getString("no_pasien");
                String nama_pasien = hasil.getString("nama_pasien");
                String jenis_kelamin = hasil.getString("jenis_kelamin");
                String alamat = hasil.getString("alamat");
                String no_tlp = hasil.getString("no_tlp");
                String kode_kamar = hasil.getString("kode_kamar");
                String lantai = hasil.getString("lantai");
                String no_kamar = hasil.getString("no_kamar");
                String tipe_kamar = hasil.getString("tipe_kamar");
                String harga = hasil.getString("harga_permalam");
                String tgl_cekin = hasil.getString("cek_in");
                String tgl_cekout = hasil.getString("cek_out");
                String lama_menginap = hasil.getString("lama_menginap");
                String total_biaya = hasil.getString("total_biaya");
                String[] data = {no_pasien, nama_pasien, jenis_kelamin, alamat, no_tlp, kode_kamar, lantai, no_kamar, tipe_kamar, harga, tgl_cekin, tgl_cekout, lama_menginap, total_biaya};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void cari_Pasien() {
        String cari = t_cari.getText();
        Object[] baris = {"ID/No Pasien", "Nama Pasien", "Jenis Kelamin", "Alamat", "No Tlp", "Kode Kamar", "Lantai", "No Kamar", "Tipe Kamar", "Harga/Malam", "Tanggal Cek In", "Tanggal Cek CekOut", "Lama Menginap", "Total Biaya"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_history.setModel(tabmode);
        try {
            String sql = "SELECT * from tb_history_pasien WHERE "
                    + "no_pasien like '%" + cari + "%' "
                    + "OR nama_pasien like '%" + cari + "%' "
                    + "OR jenis_kelamin like '%" + cari + "%' "
                    + "OR alamat like '%" + cari + "%' "
                    + "OR no_tlp like '%" + cari + "%' "
                    + "OR kode_kamar like '%" + cari + "%' "
                    + "OR lantai like '%" + cari + "%' "
                    + "OR no_kamar like '%" + cari + "%' "
                    + "OR tipe_kamar like '%" + cari + "%' "
                    + "OR cek_in like '%" + cari + "%' "
                    + "OR cek_out like '%" + cari + "%' "
                    + "OR harga_permalam like '%" + cari + "%' "
                    + "OR lama_menginap like '%" + cari + "%' "
                    + "OR total_biaya like '%" + cari + "%' "
                    + "order by no_pasien asc";
            Statement stmt = conn.createStatement();
            ResultSet hasil = stmt.executeQuery(sql);
            while (hasil.next()) {
                String no_pasien = hasil.getString("no_pasien");
                String nama_pasien = hasil.getString("nama_pasien");
                String jenis_kelamin = hasil.getString("jenis_kelamin");
                String alamat = hasil.getString("alamat");
                String no_tlp = hasil.getString("no_tlp");
                String kode_kamar = hasil.getString("kode_kamar");
                String lantai = hasil.getString("lantai");
                String no_kamar = hasil.getString("no_kamar");
                String tipe_kamar = hasil.getString("tipe_kamar");
                String harga = hasil.getString("harga_permalam");
                String tgl_cekin = hasil.getString("cek_in");
                String tgl_cekout = hasil.getString("cek_out");
                String lama_menginap = hasil.getString("lama_menginap");
                String total_biaya = hasil.getString("total_biaya");
                String[] data = {no_pasien, nama_pasien, jenis_kelamin, alamat, no_tlp, kode_kamar, lantai, no_kamar, tipe_kamar, harga, tgl_cekin, tgl_cekout, lama_menginap, total_biaya};
                tabmode.addRow(data);
            }
        } catch (Exception ex) {
        }
    }
    private void b_refershActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refershActionPerformed

    }//GEN-LAST:event_b_refershActionPerformed

    private void b_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cariActionPerformed
        cari_Pasien();
    }//GEN-LAST:event_b_cariActionPerformed

    private void t_cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            cari_Pasien();
        }
    }//GEN-LAST:event_t_cariKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Riwayat dialog = new Riwayat(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cari;
    public javax.swing.JButton b_refersh;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_karyawan;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTable tbl_history;
    // End of variables declaration//GEN-END:variables
}

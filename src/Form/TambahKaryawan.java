package Form;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TambahKaryawan extends javax.swing.JDialog {

    Connection conn = new Koneksi().getConnection();

    public TambahKaryawan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cek_judul();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        l_judul = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t_id_karyawan = new javax.swing.JTextField();
        t_nama = new javax.swing.JTextField();
        c_jk = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_alamat = new javax.swing.JTextArea();
        t_no_tlp = new javax.swing.JTextField();
        b_simpan = new javax.swing.JButton();
        b_reset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        t_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.lightGray);

        jPanel2.setBackground(java.awt.Color.darkGray);

        l_judul.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        l_judul.setForeground(new java.awt.Color(255, 255, 255));
        l_judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_judul.setText("Tambah Data karyawan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("ID Karyawan");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("Jenis Kelamin");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("Alamat");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 102));
        jLabel5.setText("No Tlp");

        c_jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Laki-laki", "Perempuan" }));

        t_alamat.setColumns(20);
        t_alamat.setRows(5);
        jScrollPane1.setViewportView(t_alamat);

        b_simpan.setBackground(java.awt.Color.darkGray);
        b_simpan.setFont(new java.awt.Font("Ubuntu Medium", 0, 14)); // NOI18N
        b_simpan.setForeground(java.awt.Color.lightGray);
        b_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/accept.png"))); // NOI18N
        b_simpan.setText("Simpan");
        b_simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_simpanActionPerformed(evt);
            }
        });

        b_reset.setBackground(java.awt.Color.darkGray);
        b_reset.setFont(new java.awt.Font("Ubuntu Medium", 0, 14)); // NOI18N
        b_reset.setForeground(java.awt.Color.lightGray);
        b_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/refresh.png"))); // NOI18N
        b_reset.setText("Reset");
        b_reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_resetActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 102));
        jLabel6.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(b_simpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(t_nama, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_password, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_no_tlp, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c_jk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_id_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_id_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_jk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_no_tlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_simpan)
                    .addComponent(b_reset))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //public String judul = 
    private void cek_judul() {
        l_judul.setText(l_judul.getText());
    }

    public void cari_Id() {
        String sql = "SELECT * FROM tb_karyawan WHERE id_karyawan='" + t_id_karyawan.getText() + "'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                t_nama.setText(rs.getString("nama_karyawan"));
                c_jk.setSelectedItem(rs.getString("jenis_kelamin"));
                t_alamat.setText(rs.getString("alamat"));
                t_no_tlp.setText(rs.getString("no_tlp"));
                t_password.setText("password");
            } else {
                JOptionPane.showMessageDialog(null, "ID Karyawan TIDAK DITEMUKAN", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e, "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void reset() {
        t_id_karyawan.setText(null);
        t_nama.setText(null);
        c_jk.setSelectedItem(null);
        t_alamat.setText(null);
        t_no_tlp.setText(null);
    }

    private void update() {
        String sql = "update tb_karyawan set nama_karyawan=?, jenis_kelamin=?, alamat=?, no_tlp=?, password=? where id_karyawan='" + t_id_karyawan.getText() + "'";
        java.sql.PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(sql);
            stat.setString(1, t_nama.getText());
            stat.setString(2, (String) c_jk.getSelectedItem());
            stat.setString(3, t_alamat.getText());
            stat.setString(4, t_no_tlp.getText());
            stat.setString(5, t_password.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update data BERHASIL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            Home form_utama = new Home();
            form_utama.tampil_karyawan();
            this.dispose();
            reset();
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Update data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void simpan() {
        String sql = "INSERT INTO tb_karyawan VALUES (?,?,?,?,?,?)";
        java.sql.PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(sql);
            stat.setString(1, t_id_karyawan.getText());
            stat.setString(2, t_nama.getText());
            stat.setString(3, (String) c_jk.getSelectedItem());
            stat.setString(4, t_alamat.getText());
            stat.setString(5, t_no_tlp.getText());
            stat.setString(6, t_password.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menyimpan data BERHASIL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            Home form_utama = new Home();
            form_utama.tampil_karyawan();
            this.dispose();
            reset();
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Menyimpan data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void b_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_simpanActionPerformed
        // TODO add your handling code here:
        if ("".equals(t_id_karyawan.getText())) {
            JOptionPane.showMessageDialog(null, "Kolom ID karyawam masih KOSONG", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if ("".equals(t_nama.getText())) {
            JOptionPane.showMessageDialog(null, "Kolom Nama masih KOSONG", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if (!(c_jk.getSelectedIndex() == 1 || c_jk.getSelectedIndex() == 2)) {
            JOptionPane.showMessageDialog(null, "Pemilihan Jenis Kelamin masih SALAH", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if ("".equals(t_alamat.getText())) {
            JOptionPane.showMessageDialog(null, "Kolom Alamat masih KOSONG", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if ("".equals(t_no_tlp.getText())) {
            JOptionPane.showMessageDialog(null, "Kolom No Tlp masih KOSONG", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            cek_judul();
            if ("EDIT DATA KARYAWAN".equals(l_judul.getText())) {
                update();
            } else if ("TAMBAH KARYAWAN".equals(l_judul.getText())) {
                String sql = "SELECT * FROM tb_karyawan WHERE id_karyawan='" + t_id_karyawan.getText() + "'";
                try {
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "ID Karyawan " + t_id_karyawan.getText() + " SUDAH ADA", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        simpan();
                    }
                } catch (SQLException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_b_simpanActionPerformed

    private void b_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_resetActionPerformed
        reset();
    }//GEN-LAST:event_b_resetActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TambahKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TambahKaryawan dialog = new TambahKaryawan(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton b_reset;
    private javax.swing.JButton b_simpan;
    private javax.swing.JComboBox<String> c_jk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel l_judul;
    private javax.swing.JTextArea t_alamat;
    public static javax.swing.JTextField t_id_karyawan;
    private javax.swing.JTextField t_nama;
    private javax.swing.JTextField t_no_tlp;
    private javax.swing.JPasswordField t_password;
    // End of variables declaration//GEN-END:variables
}

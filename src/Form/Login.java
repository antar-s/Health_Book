package Form;

import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Login extends javax.swing.JFrame {

    Connection conn = new Koneksi().getConnection();

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        c_user = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        t_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t_password = new javax.swing.JPasswordField();
        b_login = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 102));
        jLabel6.setText("User");

        c_user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        c_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Admin", "Karyawan" }));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("ID/Username");

        t_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_usernameKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("Password");

        t_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_passwordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_passwordKeyTyped(evt);
            }
        });

        b_login.setBackground(java.awt.Color.darkGray);
        b_login.setFont(new java.awt.Font("Ubuntu Medium", 0, 14)); // NOI18N
        b_login.setForeground(java.awt.Color.lightGray);
        b_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/unlock3.png"))); // NOI18N
        b_login.setText("Login");
        b_login.setBorder(null);
        b_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_loginActionPerformed(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setPreferredSize(new java.awt.Dimension(956, 100));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Health_Book");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel1)
                .addContainerGap(380, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(t_username, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_user, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t_password, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(b_login, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(c_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_username, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(b_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Timer timer;
    ActionListener action;

    private void pemilihan_user() {
        if (c_user.getSelectedIndex() == 1) {
            masuk_admin();
        } else if (c_user.getSelectedIndex() == 2) {
            masuk_karyawan();
        }
    }

    private void masuk_admin() {
        String sql = "SELECT * FROM tb_admin WHERE username=? and password=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t_username.getText());
            ps.setString(2, t_password.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Home form_utama = new Home();
                form_utama.l_id_admin.setText(rs.getString("id_admin"));
                form_utama.l_admin.setText(rs.getString("nama_admin"));
                form_utama.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Username atau Password yang anda masukkan SALAH", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Username atau Password yang anda masukkan SALAH", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void masuk_karyawan() {
        String sql = "SELECT * FROM tb_karyawan WHERE id_karyawan=? and password=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t_username.getText());
            ps.setString(2, t_password.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Home form_utama = new Home();
                form_utama.l_id_admin.setText(rs.getString("id_karyawan"));
                form_utama.l_admin.setText(rs.getString("nama_karyawan"));
                form_utama.b_tambah_karyawan.setEnabled(false);
                form_utama.b_edit_karyawan.setEnabled(false);
                form_utama.b_delete_karyawan.setEnabled(false);
                form_utama.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Username atau Password yang anda masukkan SALAH", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Username atau Password yang anda masukkan SALAH", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void b_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_loginActionPerformed
        if (!(c_user.getSelectedIndex() == 1 || c_user.getSelectedIndex() == 2)) {
            JOptionPane.showMessageDialog(null, "Pemilihan User SALAH", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if ("".equals(t_username.getText())) {
            JOptionPane.showMessageDialog(null, "Kolom Username masih KOSONG", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if ("".equals(t_password.getText())) {
            JOptionPane.showMessageDialog(null, "Kolom Password masih KOSONG", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            pemilihan_user();
        }
    }//GEN-LAST:event_b_loginActionPerformed

    private void t_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_passwordKeyTyped
//        char c = evt.getKeyChar();
//        if (c == KeyEvent.VK_ENTER){
//            if (!(c_user.getSelectedIndex() == 1 || c_user.getSelectedIndex() == 2)){
//                JOptionPane.showMessageDialog(null, "Pemilihan User SALAH","Informasi", JOptionPane.INFORMATION_MESSAGE);
//            }
//            else if ("".equals(t_username.getText())){
//                JOptionPane.showMessageDialog(null, "Kolom Username masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
//            }
//            else if ("".equals(t_password.getText())){
//                JOptionPane.showMessageDialog(null, "Kolom Password masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
//            }
//            else {
//                pemilihan_user();
//            }
//        }
    }//GEN-LAST:event_t_passwordKeyTyped

    private void t_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_passwordKeyPressed
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            if (!(c_user.getSelectedIndex() == 1 || c_user.getSelectedIndex() == 2)) {
                JOptionPane.showMessageDialog(null, "Pemilihan User SALAH", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } else if ("".equals(t_username.getText())) {
                JOptionPane.showMessageDialog(null, "Kolom Username masih KOSONG", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } else if ("".equals(t_password.getText())) {
                JOptionPane.showMessageDialog(null, "Kolom Password masih KOSONG", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } else {
                pemilihan_user();
            }
        }
    }//GEN-LAST:event_t_passwordKeyPressed

    private void t_usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_usernameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            if (!(c_user.getSelectedIndex() == 1 || c_user.getSelectedIndex() == 2)) {
                JOptionPane.showMessageDialog(null, "Pemilihan User SALAH", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } else if ("".equals(t_username.getText())) {
                JOptionPane.showMessageDialog(null, "Kolom Username masih KOSONG", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } else if ("".equals(t_password.getText())) {
                JOptionPane.showMessageDialog(null, "Kolom Password masih KOSONG", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } else {
                pemilihan_user();
            }
        }
    }//GEN-LAST:event_t_usernameKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_login;
    private javax.swing.JComboBox<String> c_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField t_password;
    private javax.swing.JTextField t_username;
    // End of variables declaration//GEN-END:variables
}

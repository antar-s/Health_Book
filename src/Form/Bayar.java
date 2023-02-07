package Form;

import static Form.Registrasi.l_judul;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.text.*;
import java.awt.print.*;
import javax.swing.JTextField;

public class Bayar extends javax.swing.JDialog {

    public Bayar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Tanggal_sekarang();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        l_judul = new javax.swing.JLabel();
        b_ok = new javax.swing.JButton();
        b_reset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        l_total_bayar = new javax.swing.JLabel();
        l_lama_meginap = new javax.swing.JLabel();
        l_harga_kamar = new javax.swing.JLabel();
        l_tipe_kamar = new javax.swing.JLabel();
        l_no_kamar = new javax.swing.JLabel();
        l_lantai = new javax.swing.JLabel();
        l_kode_kamar = new javax.swing.JLabel();
        l_lama_meginap1 = new javax.swing.JLabel();
        l_total_bayar2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        c_no_pasien = new javax.swing.JComboBox<>();
        l_nama = new javax.swing.JLabel();
        l_jk = new javax.swing.JLabel();
        l_alamat = new javax.swing.JLabel();
        l_no_tlp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        l_tgl_cekout = new javax.swing.JLabel();
        l_tgl_cekin = new javax.swing.JLabel();
        l_info = new javax.swing.JLabel();
        l_jam2 = new javax.swing.JLabel();
        l_jam3 = new javax.swing.JLabel();
        t_bayar = new javax.swing.JTextField();
        t_kembalian = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jPanel2.setBackground(java.awt.Color.darkGray);

        l_judul.setBackground(java.awt.Color.darkGray);
        l_judul.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        l_judul.setForeground(new java.awt.Color(255, 255, 255));
        l_judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_judul.setText("Pembayaran");

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
                .addComponent(l_judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        b_ok.setBackground(java.awt.Color.darkGray);
        b_ok.setFont(new java.awt.Font("Ubuntu Medium", 0, 14)); // NOI18N
        b_ok.setForeground(java.awt.Color.lightGray);
        b_ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/accept.png"))); // NOI18N
        b_ok.setText("Cek Out");
        b_ok.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));
        b_ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_okActionPerformed(evt);
            }
        });

        b_reset.setBackground(java.awt.Color.lightGray);
        b_reset.setFont(new java.awt.Font("Ubuntu Medium", 0, 14)); // NOI18N
        b_reset.setForeground(java.awt.Color.darkGray);
        b_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/refresh.png"))); // NOI18N
        b_reset.setText("Reset");
        b_reset.setBorder(new javax.swing.border.LineBorder(java.awt.Color.darkGray, 2, true));
        b_reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_resetActionPerformed(evt);
            }
        });

        jPanel3.setBackground(java.awt.Color.darkGray);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Kamar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lantai");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kode Kamar");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("No Kamar");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tipe Kamar");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Harga/kamar");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total Bayar");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Lama Menginap");

        l_total_bayar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_total_bayar.setForeground(new java.awt.Color(255, 255, 255));
        l_total_bayar.setText("-");

        l_lama_meginap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_lama_meginap.setForeground(new java.awt.Color(255, 255, 255));
        l_lama_meginap.setText("-");

        l_harga_kamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_harga_kamar.setForeground(new java.awt.Color(255, 255, 255));
        l_harga_kamar.setText("-");

        l_tipe_kamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_tipe_kamar.setForeground(new java.awt.Color(255, 255, 255));
        l_tipe_kamar.setText("-");

        l_no_kamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_no_kamar.setForeground(new java.awt.Color(255, 255, 255));
        l_no_kamar.setText("-");

        l_lantai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_lantai.setForeground(new java.awt.Color(255, 255, 255));
        l_lantai.setText("-");

        l_kode_kamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_kode_kamar.setForeground(new java.awt.Color(255, 255, 255));
        l_kode_kamar.setText("-");

        l_lama_meginap1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_lama_meginap1.setForeground(new java.awt.Color(255, 255, 255));
        l_lama_meginap1.setText("Malam");

        l_total_bayar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_total_bayar2.setForeground(new java.awt.Color(255, 255, 255));
        l_total_bayar2.setText("Rupiah");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(l_total_bayar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_lama_meginap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(l_total_bayar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_lama_meginap1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(l_kode_kamar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                        .addComponent(l_lantai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l_no_kamar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l_tipe_kamar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l_harga_kamar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(l_kode_kamar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l_lantai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l_no_kamar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l_tipe_kamar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l_harga_kamar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_lama_meginap)
                            .addComponent(l_lama_meginap1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_total_bayar)
                            .addComponent(l_total_bayar2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jPanel4.setBackground(java.awt.Color.darkGray);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Pasien", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setDoubleBuffered(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No Tlp");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Alamat");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jenis Kelamin");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID/No KTP");

        c_no_pasien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c_no_pasien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--" }));
        c_no_pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_no_pasienActionPerformed(evt);
            }
        });

        l_nama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_nama.setForeground(new java.awt.Color(255, 255, 255));
        l_nama.setText("-");

        l_jk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_jk.setForeground(new java.awt.Color(255, 255, 255));
        l_jk.setText("-");

        l_alamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_alamat.setForeground(new java.awt.Color(255, 255, 255));
        l_alamat.setText("-");

        l_no_tlp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_no_tlp.setForeground(new java.awt.Color(255, 255, 255));
        l_no_tlp.setText("-");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tanggal Masuk");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tanggal Keluar");

        l_tgl_cekout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_tgl_cekout.setForeground(new java.awt.Color(255, 255, 255));
        l_tgl_cekout.setText("-");

        l_tgl_cekin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_tgl_cekin.setForeground(new java.awt.Color(255, 255, 255));
        l_tgl_cekin.setText("-");

        l_info.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_no_pasien, 0, 305, Short.MAX_VALUE)
                            .addComponent(l_nama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_jk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_alamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_tgl_cekout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_no_tlp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_tgl_cekin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c_no_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(l_nama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(l_jk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(l_alamat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(l_no_tlp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(l_tgl_cekin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(l_tgl_cekout))
                .addGap(18, 18, 18)
                .addComponent(l_info, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        l_jam2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        l_jam2.setForeground(java.awt.Color.darkGray);
        l_jam2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l_jam2.setText("Bayar");

        l_jam3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        l_jam3.setForeground(java.awt.Color.darkGray);
        l_jam3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l_jam3.setText("Kembalian");

        t_bayar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t_bayar.setText("0");
        t_bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_bayarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_bayarKeyTyped(evt);
            }
        });

        t_kembalian.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_jam2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_jam3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_kembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                            .addComponent(t_bayar))
                        .addGap(113, 113, 113)
                        .addComponent(b_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_jam2)
                            .addComponent(t_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_jam3)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b_reset)
                        .addComponent(b_ok)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void cek_judul() {
        l_judul.setText(l_judul.getText());
    }

    Connection conn = new Koneksi().getConnection();

    private void reset() {
        c_no_pasien.setSelectedIndex(0);
        l_alamat.setText("-");
        l_harga_kamar.setText("-");
        l_jk.setText("-");
        l_kode_kamar.setText("-");
        l_lama_meginap.setText("-");
        l_lantai.setText("-");
        l_nama.setText("-");
        l_no_kamar.setText("-");
        l_no_tlp.setText("-");
        l_tgl_cekin.setText("-");
        l_tipe_kamar.setText("-");
        l_total_bayar.setText("-");
        l_total_bayar2.setText("");
        t_bayar.setText("0");
        t_kembalian.setText("-");
        l_info.setText("");
    }

    public void cari_ID_Pasien() {
        String sql = "SELECT * FROM tb_pasien WHERE no_pasien='" + c_no_pasien.getSelectedItem() + "'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                l_nama.setText(rs.getString("nama_pasien"));
                l_jk.setText(rs.getString("jenis_kelamin"));
                l_alamat.setText(rs.getString("alamat"));
                l_no_tlp.setText(rs.getString("no_tlp"));
                l_tgl_cekin.setText(rs.getString("tgl_cek_in"));
                l_kode_kamar.setText(rs.getString("kode_kamar"));
                cari_Kode_Kamar();
            } else {
                l_info.setText("ID Pasien TIDAK COCOK");
                reset();
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e, "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void cari_Kode_Kamar() {
        String sql = "SELECT * FROM tb_kamar WHERE kode_kamar='" + l_kode_kamar.getText() + "'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                l_lantai.setText(rs.getString("lantai"));
                l_no_kamar.setText(rs.getString("no_kamar"));
                l_tipe_kamar.setText(rs.getString("tipe_kamar"));
                l_harga_kamar.setText(rs.getString("harga_permalam"));
                hitung_Hari();
            } else {
                l_info.setText("ID Pasien TIDAK COCOK");
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e, "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void ketemu_Pasien() {
        try {
            String sql = "SELECT * FROM tb_pasien order by no_pasien asc";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String kode_kamar = hasil.getString("no_pasien");
                c_no_pasien.addItem(kode_kamar);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Kode Kamar TIDAK DITEMUKAN", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void Tanggal_sekarang() {
        java.util.Date sekarang = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd-MM-yyyy");
        l_tgl_cekout.setText(kal.format(sekarang));
    }

    public void jamDigital() {
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String nol_jam = "";
                String nol_menit = "";
                String nol_detik = "";
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                if (nilai_jam <= 9) {
                    nol_jam = "0";
                }
                if (nilai_menit <= 9) {
                    nol_menit = "0";
                }
                if (nilai_detik <= 9) {
                    nol_detik = "0";
                }
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
            }
        };
        new Timer(1000, taskPerformer).start();
    }

    public void hitung_Hari() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        if ("".equals(l_tgl_cekin.getText()) || "".equals(l_tgl_cekout.getText()) || "-".equals(l_tgl_cekin.getText()) || "-".equals(l_tgl_cekout.getText())) {
            l_lama_meginap.setText("-");
        } else {
            try {

                Date tanggal_cekin = df.parse(l_tgl_cekin.getText());
                Date tanggal_cekout = df.parse(l_tgl_cekout.getText());

                long tanggalCekin = tanggal_cekin.getTime();
                long tanggalCekout = tanggal_cekout.getTime();
                long diff = tanggalCekout - tanggalCekin;
                long Lama_menginap = diff / (24 * 60 * 60 * 1000) + 1;
                l_lama_meginap.setText(Long.toString(Lama_menginap));
                hitung_TotalBayar();
            } catch (Exception e) {
                l_lama_meginap.setText("-");
            }
        }
    }

    public void hitung_TotalBayar() {
        NumberFormat nf = NumberFormat.getInstance();
        int harga_permalam = 0, lama_menginap = 0, total_bayar;
        lama_menginap = Integer.parseInt(l_lama_meginap.getText());
        harga_permalam = Integer.parseInt(l_harga_kamar.getText());
        if ("".equals(l_lama_meginap.getText()) || "-".equals(l_lama_meginap.getText()) || "".equals(l_harga_kamar.getText()) || "-".equals(l_harga_kamar.getText())) {
            l_total_bayar.setText("-");
        } else {
            if (lama_menginap == 0) {
                total_bayar = 1 * harga_permalam;
                l_total_bayar.setText(String.valueOf(total_bayar));
                l_total_bayar2.setText(String.valueOf("===> " + nf.format(total_bayar) + " Rupiah"));
            } else if (lama_menginap >= 1) {
                total_bayar = harga_permalam * lama_menginap;
                l_total_bayar.setText(String.valueOf(total_bayar));
                l_total_bayar2.setText(String.valueOf("===> " + nf.format(total_bayar) + " Rupiah"));
            }
        }
    }

    public void hitung_Kembalian() {
        NumberFormat nf = NumberFormat.getInstance();
        int bayar = 0, total_bayar, kembalian;
        total_bayar = Integer.parseInt(l_total_bayar.getText());
        bayar = Integer.parseInt(t_bayar.getText());
        if ("".equals(l_total_bayar.getText()) || "-".equals(l_total_bayar.getText()) || "".equals(t_bayar.getText()) || "-".equals(t_bayar.getText())) {
            t_kembalian.setText("-");
        } else {
            kembalian = bayar - total_bayar;
            t_kembalian.setText(String.valueOf(nf.format(kembalian) + " Rupiah"));
            //JOptionPane.showMessageDialog(null, "Cek Out BERHASIL\n Kembalian uang anda : "+t_kembalian.getText(),"Informasi", JOptionPane.INFORMATION_MESSAGE);
            simpan();
        }
    }

    private void hanyaAngka(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            l_info.setText("Kolom hanya bisa diisi dengan ANGKA");
        } else {
            l_info.setText("");
        }
    }

    private void simpan() {
        String sql = "INSERT INTO tb_history_pasien VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(sql);
            stat.setString(1, (String) c_no_pasien.getSelectedItem());
            stat.setString(2, l_nama.getText());
            stat.setString(3, l_jk.getText());
            stat.setString(4, l_alamat.getText());
            stat.setString(5, l_no_tlp.getText());
            stat.setString(6, l_kode_kamar.getText());
            stat.setString(7, l_lantai.getText());
            stat.setString(8, l_no_kamar.getText());
            stat.setString(9, l_tipe_kamar.getText());
            stat.setString(10, l_harga_kamar.getText());
            stat.setString(11, l_tgl_cekin.getText());
            stat.setString(12, l_tgl_cekout.getText());
            stat.setString(13, l_lama_meginap.getText());
            stat.setString(14, l_total_bayar.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cek Out BERHASIL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            delete_Pasien();
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Cek Out GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void delete_Pasien() {
        try {
            String sql = "DELETE FROM tb_pasien WHERE no_pasien ='" + c_no_pasien.getSelectedItem() + "'";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            reset();
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Meghapus data GAGAL");
        }
    }

    private void b_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_okActionPerformed
        if ("".equals(c_no_pasien.getSelectedItem()) || "--Pilih--".equals(c_no_pasien.getSelectedItem())) {
            JOptionPane.showMessageDialog(null, "Pemilihan kode kamar SALAH", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if ("".equals(t_bayar.getText())) {
            l_info.setText("Pembayaran TIDAK SESUAI");
        } else {
            int total_bayar, bayar;
            total_bayar = Integer.parseInt(l_total_bayar.getText());
            bayar = Integer.parseInt(t_bayar.getText());
            if (bayar < total_bayar) {
                l_info.setText("Pembayaran TIDAK SESUAI");
            } else if (bayar >= total_bayar) {
                hitung_Kembalian();

            }
        }
    }//GEN-LAST:event_b_okActionPerformed

    private void b_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_resetActionPerformed
        reset();
    }//GEN-LAST:event_b_resetActionPerformed

    private void c_no_pasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_no_pasienActionPerformed
        cari_ID_Pasien();
        t_bayar.setText("0");
        t_kembalian.setText("0");
    }//GEN-LAST:event_c_no_pasienActionPerformed

    private void t_bayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_bayarKeyTyped
        hanyaAngka(evt);
    }//GEN-LAST:event_t_bayarKeyTyped

    private void t_bayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_bayarKeyPressed

    }//GEN-LAST:event_t_bayarKeyPressed

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
            java.util.logging.Logger.getLogger(Bayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Bayar dialog = new Bayar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton b_ok;
    private javax.swing.JButton b_reset;
    public javax.swing.JComboBox<String> c_no_pasien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel l_alamat;
    private javax.swing.JLabel l_harga_kamar;
    private javax.swing.JLabel l_info;
    private javax.swing.JLabel l_jam2;
    private javax.swing.JLabel l_jam3;
    private javax.swing.JLabel l_jk;
    public static javax.swing.JLabel l_judul;
    private javax.swing.JLabel l_kode_kamar;
    private javax.swing.JLabel l_lama_meginap;
    private javax.swing.JLabel l_lama_meginap1;
    private javax.swing.JLabel l_lantai;
    private javax.swing.JLabel l_nama;
    private javax.swing.JLabel l_no_kamar;
    private javax.swing.JLabel l_no_tlp;
    private javax.swing.JLabel l_tgl_cekin;
    private javax.swing.JLabel l_tgl_cekout;
    private javax.swing.JLabel l_tipe_kamar;
    private javax.swing.JLabel l_total_bayar;
    private javax.swing.JLabel l_total_bayar2;
    private javax.swing.JTextField t_bayar;
    private javax.swing.JTextField t_kembalian;
    // End of variables declaration//GEN-END:variables
}

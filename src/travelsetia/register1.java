/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package travelsetia;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException;

/**
 *
 * @author dimas
 */
public class register1 extends javax.swing.JFrame {

    private Connection conn;
    
    
    
    public register1() {
        initComponents();
        conn = Koneksi.bukaKoneksi();
    }
    
    private  static void saveDataAkun (String Nama, String jenisKelamin, String kewarganegaraan, String noHP, String email, String tanggalLahir, String password, String statusAkun){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            conn = Koneksi.bukaKoneksi();
            if (conn != null) {
                
                String periksaQuery = "SELECT COUNT(*) FROM akun WHERE email = ?";
                ps = conn.prepareStatement(periksaQuery);
                ps.setString(1, email);
                rs = ps.executeQuery();
            
                if(rs.next() && rs.getInt(1) > 0 ){
                    JOptionPane.showMessageDialog(null, "Email sudah terdaftar!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                
                String query = "INSERT INTO akun (namaPenumpang, jenisKelamin, kewarganegaraan, nomorTelepon, email, tglLahir, userPassword, statusAkun) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)";
                ps = conn.prepareStatement(query);

                ps.setString(1, Nama);
                ps.setString(2, jenisKelamin);
                ps.setString(3, kewarganegaraan);
                ps.setString(4, noHP);
                ps.setString(5, email);
                ps.setString(6, tanggalLahir);
                ps.setString(7, password);
                ps.setString(8, statusAkun);
                
                int hasil = ps.executeUpdate();
               
                
            }
        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        } 

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfJenisKelaminRegister = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfKewarganegaraanRegister = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfNohpRegister = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfTanggalLahirRegister = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEmailRegister = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfPasswordRegister = new javax.swing.JPasswordField();
        btLoginRegister = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        LoginRegister = new javax.swing.JLabel();
        tfNamaRegister = new javax.swing.JTextField();
        invisible2 = new javax.swing.JLabel();
        show2 = new javax.swing.JLabel();
        BackroundBali = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(53, 114, 239));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Sign Up!");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_icon/icons8-palm-tree-50.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 50, 90));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("TRAVEL SETIA");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        exit.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("x");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 40, 40));

        minimize.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 255, 255));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("-");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 110));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register !");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 62, -1, 32));

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nama");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Jenis Kelamin");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, 20));

        tfJenisKelaminRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(tfJenisKelaminRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 207, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Kewarganegaraan");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        tfKewarganegaraanRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(tfKewarganegaraanRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 207, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("No HP");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        tfNohpRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(tfNohpRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 207, 30));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Tanggal Lahir");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        tfTanggalLahirRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(tfTanggalLahirRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 207, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        tfEmailRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfEmailRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(tfEmailRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 207, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, 20));

        tfPasswordRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(tfPasswordRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 207, 33));

        btLoginRegister.setBackground(new java.awt.Color(53, 114, 239));
        btLoginRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btLoginRegister.setForeground(new java.awt.Color(255, 255, 255));
        btLoginRegister.setText("Sign Up!");
        btLoginRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btLoginRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 207, 32));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("I've an account, ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, 24));

        LoginRegister.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LoginRegister.setForeground(new java.awt.Color(255, 255, 255));
        LoginRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginRegister.setText("Login!");
        LoginRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginRegisterMouseClicked(evt);
            }
        });
        jPanel1.add(LoginRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, -1, 24));

        tfNamaRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfNamaRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(tfNamaRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 210, 30));

        invisible2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_icon/Invisible.png"))); // NOI18N
        invisible2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invisible2MouseClicked(evt);
            }
        });
        jPanel1.add(invisible2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 30, 30));

        show2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_icon/Eye.png"))); // NOI18N
        show2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show2MouseClicked(evt);
            }
        });
        jPanel1.add(show2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 30, 30));

        BackroundBali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_icon/pexels-timrael-2474689.jpg"))); // NOI18N
        jPanel1.add(BackroundBali, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 670));

        setSize(new java.awt.Dimension(527, 666));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginRegisterActionPerformed
        String Nama = tfNamaRegister.getText();
            String jenisKelamin = tfJenisKelaminRegister.getText();
            String kewarganegaraan = tfKewarganegaraanRegister.getText();
            String noHp = tfNohpRegister.getText();
            String email = tfEmailRegister.getText();
            String tanggalLahir = tfTanggalLahirRegister.getText();
            String password = tfPasswordRegister.getText();
           
            
            if(Nama.equals("") || jenisKelamin.equals("") || kewarganegaraan.equals("") || noHp.equals("") || email.equals("") || tanggalLahir.equals("") || password.equals("")){
                JOptionPane.showMessageDialog(this, "Isi yang kosong yah!");
            } else {
        
                saveDataAkun(Nama, jenisKelamin, kewarganegaraan, noHp, email, tanggalLahir, password, "user");
                Login1 JFrameLogin =  new Login1();
      this.dispose();
      JFrameLogin.setVisible(true);
            }
    }//GEN-LAST:event_btLoginRegisterActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(register1.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void tfNamaRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaRegisterActionPerformed

    private void invisible2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invisible2MouseClicked
        // password beralih ke 
        tfPasswordRegister.setEchoChar((char)0);
        invisible2.setVisible(false);
        invisible2.setEnabled(false);
        show2.setEnabled(true);
        show2.setEnabled(true);
    }//GEN-LAST:event_invisible2MouseClicked

    private void show2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show2MouseClicked
        // 
        tfPasswordRegister.setEchoChar((char)8226);
        invisible2.setVisible(true);
        invisible2.setEnabled(true);
        show2.setEnabled(false);
        show2.setEnabled(false);
    }//GEN-LAST:event_show2MouseClicked

    private void LoginRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginRegisterMouseClicked
        // text tombol beralih ke frame Login
        Login1 Login1Frame = new Login1();
        Login1Frame.setVisible(true);
        Login1Frame.pack();
        Login1Frame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LoginRegisterMouseClicked

    private void tfEmailRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackroundBali;
    private javax.swing.JLabel LoginRegister;
    private javax.swing.JButton btLoginRegister;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel invisible2;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel show2;
    private javax.swing.JTextField tfEmailRegister;
    private javax.swing.JTextField tfJenisKelaminRegister;
    private javax.swing.JTextField tfKewarganegaraanRegister;
    private javax.swing.JTextField tfNamaRegister;
    private javax.swing.JTextField tfNohpRegister;
    private javax.swing.JPasswordField tfPasswordRegister;
    private javax.swing.JTextField tfTanggalLahirRegister;
    // End of variables declaration//GEN-END:variables
}

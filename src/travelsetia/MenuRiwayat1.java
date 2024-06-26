/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package travelsetia;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableRowSorter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dimas
 */
public class MenuRiwayat1 extends javax.swing.JPanel {

    /**
     * Creates new form MenuRiwayat1
     */
    private Connection conn;
    public MenuRiwayat1() {
        initComponents();
        loadDataToTable();
    }
    
    private void loadDataToTable() {

        conn = Koneksi.bukaKoneksi();
        System.out.println(conn);
        String sql = "SELECT namaPenumpang, jumlahPembayaran, tanggalTransaksi FROM detail_transaksi;";
        try (PreparedStatement pst = conn.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {

            // Inisialisasi DefaultTableModel dengan kolom yang ditentukan
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{
                "Nama Penumpang",
                "Jumlah Pembayaran",
                "Tanggal Transaksi",
            });

            // Memproses ResultSet dan menambahkan data ke model
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("namaPenumpang"),
                    rs.getString("jumlahPembayaran"),
                    rs.getString("tanggalTransaksi"),
                });
            }

            // Set the model to your JTable
            tabelRiwayat.setModel(model);
            tabelRiwayat.setDefaultEditor(Object.class, null); // Nonaktifkan pengeditan sel
            tabelRiwayat.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Hanya pilih satu baris
          

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelRiwayat = new javax.swing.JTable();
        iconMember = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(53, 114, 239));
        jPanel1.setPreferredSize(new java.awt.Dimension(928, 599));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Riwayat pemesanan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 190, 30));

        tabelRiwayat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelRiwayat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 760, 490));

        iconMember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_icon/People.png"))); // NOI18N
        jPanel1.add(iconMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 50, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Master Data > Riwayat pemesanan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 260, 30));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconMember;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelRiwayat;
    // End of variables declaration//GEN-END:variables
}

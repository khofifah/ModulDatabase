

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khofi Muffin
 */
public class frmMain extends javax.swing.JFrame {

    
    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nis = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kelas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rumah = new javax.swing.JTextArea();
        gender1 = new javax.swing.JRadioButton();
        gender2 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("The Real Informatic Schools");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 50, 940, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FORM BIODATA SISWA SMK TELKOM");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 11, 940, 30);

        jPanel6.add(jPanel1);
        jPanel1.setBounds(0, 0, 970, 80);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("NIS");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 10, 19, 15);

        nis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(nis);
        nis.setBounds(10, 30, 240, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nama");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 70, 50, 15);

        nama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(nama);
        nama.setBounds(10, 90, 240, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Jenis Kelamin");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 130, 80, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Kelas");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 190, 40, 15);

        kelas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(kelas);
        kelas.setBounds(10, 210, 240, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Email");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 250, 40, 15);

        email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(email);
        email.setBounds(10, 270, 240, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Alamat");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 310, 40, 15);

        rumah.setColumns(20);
        rumah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rumah.setRows(5);
        jScrollPane1.setViewportView(rumah);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 330, 240, 110);

        gender1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(gender1);
        gender1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gender1.setText("Laki-laki");
        jPanel2.add(gender1);
        gender1.setBounds(10, 150, 110, 30);

        gender2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(gender2);
        gender2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gender2.setText("Perempuan");
        jPanel2.add(gender2);
        gender2.setBounds(119, 150, 130, 30);

        jPanel6.add(jPanel2);
        jPanel2.setBounds(10, 150, 260, 450);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ISIAN DATA SISWA");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(40, 10, 180, 30);

        jPanel6.add(jPanel3);
        jPanel3.setBounds(10, 90, 260, 50);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(550, 10, 90, 30);

        save.setBackground(new java.awt.Color(255, 255, 255));
        save.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel4.add(save);
        save.setBounds(30, 10, 90, 30);

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel4.add(delete);
        delete.setBounds(160, 10, 90, 30);

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel4.add(clear);
        clear.setBounds(290, 10, 90, 30);

        refresh.setBackground(new java.awt.Color(255, 255, 255));
        refresh.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel4.add(refresh);
        refresh.setBounds(420, 10, 90, 30);

        jPanel6.add(jPanel4);
        jPanel4.setBounds(280, 90, 670, 50);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        tabel.setForeground(new java.awt.Color(255, 255, 255));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NamaSiswa", "JenisKelamin", "Kelas", "Email", "Alamat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);
        if (tabel.getColumnModel().getColumnCount() > 0) {
            tabel.getColumnModel().getColumn(0).setResizable(false);
            tabel.getColumnModel().getColumn(1).setResizable(false);
            tabel.getColumnModel().getColumn(2).setResizable(false);
            tabel.getColumnModel().getColumn(3).setResizable(false);
            tabel.getColumnModel().getColumn(4).setResizable(false);
            tabel.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(10, 11, 650, 430);

        jPanel6.add(jPanel5);
        jPanel5.setBounds(280, 150, 670, 450);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(-1, -1, 970, 620);

        setBounds(0, 0, 980, 653);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        if ("".equals(nis.getText()) || "".equals(nama.getText()) || 
                "".equals(kelas.getText()) || "".equals(nama.getText()) ||
                "".equals(email.getText())){
            JOptionPane.showMessageDialog(this, "Harap Datanya Dilengkapi ya Sayang :*", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String JK = "";
            if (gender1.isSelected()){
                JK = "L";
            } else {
                JK = "P";
            }
            
            String SQL = "INSERT INTO t_siswa (NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat) "
                    + "VALUES('"+nis.getText()+"','"+nama.getText()+"','"+JK+"','"
                    +kelas.getText()+"','"+email.getText()+"','"+rumah.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1){
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
                
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
       int baris = tabel.getSelectedRow();
       if (baris != -1){
           String NIS = tabel.getValueAt(baris, 0).toString();
           String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
           int status = KoneksiDB.execute(SQL);
           if (status==1){
               JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
           } else {
               JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
           }
       } else {
           JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        nis.setText("");
        nama.setText("");
        kelas.setText("");
        buttonGroup1.clearSelection();
        email.setText("");
        rumah.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_refreshActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if ("".equals(nis.getText()) || "".equals(nama.getText()) || 
                "".equals(kelas.getText()) || "".equals(nama.getText()) ||
                "".equals(email.getText())){
            JOptionPane.showMessageDialog(this, "Harap Datanya Dilengkapi ya Sayang :*", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String JK = "";
            if (gender1.isSelected()){
                JK = "L";
            } else {
                JK = "P";
            }
            
            String SQL = "UPDATE t_siswa SET "
                    +"WHERE NIS='"+nis.getText()+"',"
                    +"WHERE NamaSiswa"+nama.getText()+"',"
                    +"WHERE JenisKelamin='"+JK+"',"
                    +"WHERE Kelas='"+kelas.getText()+"',"
                    +"WHERE Email='"+email.getText()+"',"
                    +"WHERE Alamat='"+rumah.getText()+"'";
            int status = KoneksiDB.execute(SQL);
            if (status == 0){
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
                
            }
                    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        int baris = tabel.getSelectedRow();
        if (baris != -1){
            nis.setText(tabel.getValueAt(baris, 0).toString());
            nama.setText(tabel.getValueAt(baris, 1).toString());
            if("Laki-laki".equals(tabel.getValueAt(baris, 2).toString())){
                gender1.setSelected(true);
            } else {
                gender2.setSelected(true);
            }
            kelas.setText(tabel.getValueAt(baris, 3).toString());
            email.setText(tabel.getValueAt(baris, 4).toString());
            rumah.setText(tabel.getValueAt(baris, 5).toString());
        }
    }//GEN-LAST:event_tabelMouseClicked

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton gender1;
    private javax.swing.JRadioButton gender2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kelas;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nis;
    private javax.swing.JButton refresh;
    private javax.swing.JTextArea rumah;
    private javax.swing.JButton save;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables

    public void selectData() {
        String kolom[] = {"NIS","NamaSiswa","JenisKelamin","Kelas","Email","Alamat"};
        DefaultTableModel dtm = new DefaultTableModel(null,kolom);
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try{
            while(rs.next()){
                String NIS = rs.getString(0);
                String NamaSiswa = rs.getString(1);
                String JenisKelamin = "";
                if ("L".equals(rs.getString(2))){
                    JenisKelamin = "Laki-laki";
                } else {
                    JenisKelamin = "Perempuan";
                }
                String Kelas = rs.getString(3);
                String Email = rs.getString(4);
                String Alamat = rs.getString(5);
                String data[] = {"NIS","NamaSiswa","JenisKelamin","Kelas","Email","Alamat"};
                dtm.addRow(data);
            }
        } catch(SQLException ex){
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tugasopp.DataBase;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    //import class 'Connector'
    Connector connect = new Connector();

    public NewJFrame() {
        initComponents();
        this.setTitle("Java Database");

        
        //koneksi ke MySql dengan CLASS 'Connector
        connect.connection();
        //menampilkan "status koneksi" pada box ui
        outConnectionStatus.setText(connect.status);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headPane = new javax.swing.JPanel();
        head1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fill1 = new javax.swing.JPanel();
        tagNim = new javax.swing.JLabel();
        tagNama = new javax.swing.JLabel();
        tagAlamat = new javax.swing.JLabel();
        tagGender = new javax.swing.JLabel();
        inNim = new javax.swing.JTextField();
        inNama = new javax.swing.JTextField();
        inAlamat = new javax.swing.JTextField();
        insertbtn = new javax.swing.JButton();
        outConnectionStatus = new javax.swing.JTextField();
        inGender = new javax.swing.JComboBox<>();
        panel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOut = new javax.swing.JTable();
        TableTitle = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        fill2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setForeground(new java.awt.Color(0, 102, 102));

        headPane.setBackground(new java.awt.Color(16, 9, 27));

        head1.setFont(new java.awt.Font("Poor Richard", 1, 48)); // NOI18N
        head1.setForeground(new java.awt.Color(189, 73, 248));
        head1.setText("Database");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Pictures\\WhatsApp Image 2024-12-10 at 04.00.16.jpeg")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 255));
        jLabel2.setText("Computer Sience Java Programming");

        fill1.setBackground(new java.awt.Color(16, 9, 27));
        fill1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(189, 73, 248), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        fill1.setForeground(new java.awt.Color(244, 229, 250));

        tagNim.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tagNim.setForeground(new java.awt.Color(204, 255, 255));
        tagNim.setText("NIM");

        tagNama.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tagNama.setForeground(new java.awt.Color(204, 255, 255));
        tagNama.setText("Name");

        tagAlamat.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tagAlamat.setForeground(new java.awt.Color(204, 255, 255));
        tagAlamat.setText("Adress");

        tagGender.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tagGender.setForeground(new java.awt.Color(204, 255, 255));
        tagGender.setText("Gender");

        inNim.setBackground(new java.awt.Color(16, 9, 27));
        inNim.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        inNim.setForeground(new java.awt.Color(204, 204, 255));
        inNim.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inNim.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(189, 73, 248), null, null));
        inNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inNimActionPerformed(evt);
            }
        });

        inNama.setBackground(new java.awt.Color(16, 9, 27));
        inNama.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        inNama.setForeground(new java.awt.Color(204, 204, 255));
        inNama.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(189, 73, 248), null, null));
        inNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inNamaActionPerformed(evt);
            }
        });

        inAlamat.setBackground(new java.awt.Color(16, 9, 31));
        inAlamat.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        inAlamat.setForeground(new java.awt.Color(204, 204, 255));
        inAlamat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(189, 73, 248), null, null));

        insertbtn.setBackground(new java.awt.Color(24, 25, 45));
        insertbtn.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        insertbtn.setForeground(new java.awt.Color(204, 255, 255));
        insertbtn.setText("Insert");
        insertbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(189, 73, 248), new java.awt.Color(51, 51, 51), null));
        insertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbtnActionPerformed(evt);
            }
        });

        outConnectionStatus.setBackground(new java.awt.Color(16, 9, 27));
        outConnectionStatus.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        outConnectionStatus.setForeground(new java.awt.Color(255, 255, 102));
        outConnectionStatus.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        outConnectionStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status Hubungan ?", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 0, 12), new java.awt.Color(204, 255, 255))); // NOI18N
        outConnectionStatus.setCaretColor(new java.awt.Color(255, 255, 255));
        outConnectionStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outConnectionStatusActionPerformed(evt);
            }
        });

        inGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "laki", "perempuan" }));
        inGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inGenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fill1Layout = new javax.swing.GroupLayout(fill1);
        fill1.setLayout(fill1Layout);
        fill1Layout.setHorizontalGroup(
            fill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fill1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(fill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outConnectionStatus)
                    .addGroup(fill1Layout.createSequentialGroup()
                        .addGroup(fill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tagNim)
                            .addComponent(tagNama)
                            .addComponent(tagAlamat)
                            .addComponent(tagGender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(fill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fill1Layout.createSequentialGroup()
                                .addComponent(inGender, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(insertbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inAlamat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                            .addComponent(inNama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inNim, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(20, 20, 20))
        );
        fill1Layout.setVerticalGroup(
            fill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fill1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(fill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inNim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tagNim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inNama, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(tagNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tagAlamat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tagGender)
                    .addComponent(insertbtn)
                    .addComponent(inGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(outConnectionStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        panel2.setBackground(new java.awt.Color(16, 9, 27));
        panel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(189, 73, 248), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));

        tableOut.setBackground(new java.awt.Color(21, 8, 37));
        tableOut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(189, 73, 248), null, null));
        tableOut.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        tableOut.setForeground(new java.awt.Color(255, 255, 255));
        tableOut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "Name", "Adress", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableOut.setSelectionBackground(new java.awt.Color(21, 8, 37));
        tableOut.setSelectionForeground(new java.awt.Color(204, 204, 255));
        tableOut.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableOutAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tableOut);

        TableTitle.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        TableTitle.setForeground(new java.awt.Color(204, 255, 255));
        TableTitle.setText("Database Result");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TableTitle)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(TableTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jProgressBar1.setForeground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout headPaneLayout = new javax.swing.GroupLayout(headPane);
        headPane.setLayout(headPaneLayout);
        headPaneLayout.setHorizontalGroup(
            headPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPaneLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(headPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(head1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headPaneLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(headPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fill1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        headPaneLayout.setVerticalGroup(
            headPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPaneLayout.createSequentialGroup()
                .addGroup(headPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headPaneLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(head1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headPaneLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fill1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        fill2.setBackground(new java.awt.Color(16, 9, 27));

        javax.swing.GroupLayout fill2Layout = new javax.swing.GroupLayout(fill2);
        fill2.setLayout(fill2Layout);
        fill2Layout.setHorizontalGroup(
            fill2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        fill2Layout.setVerticalGroup(
            fill2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fill2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(headPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fill2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inNimActionPerformed

    private void inNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inNamaActionPerformed

    private void outConnectionStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outConnectionStatusActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_outConnectionStatusActionPerformed

    private void insertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbtnActionPerformed
        // TODO add your handling code here:
        
        Insert in = new Insert();
        int nim = Integer.parseInt(inNim.getText());
        String nama = inNama.getText();
        String alamat = inAlamat.getText();
        String gender = inGender.getToolTipText();
        in.insert(nim, nama, alamat, gender);
        

    }//GEN-LAST:event_insertbtnActionPerformed

    private void inGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inGenderActionPerformed

    private void tableOutAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableOutAncestorAdded
        //menghubungkan tabel dengan MySql
        Connector connect = new Connector();
        connect.connection();
        System.out.println("tabel System is  "+connect.status);//indikator koneksi tabel dengan MySql
        //membuat model tabel
        DefaultTableModel tab = new DefaultTableModel();
        tab.addColumn("NIM");
        tab.addColumn("Nama");
        tab.addColumn("alamat");
        tab.addColumn("Gender");
       
        tableOut.setModel(tab);  //setting model table default dengan 'tab'
        //eksekusi pengambilan data
        try {
            Statement state = connect.con.createStatement();
            String sql = "select*from mahasiswa19";
            ResultSet rs = state.executeQuery(sql);

            while (rs.next()) {
                tab.addRow(new Object[]{
                    rs.getString("nim"),
                    rs.getString("nama"),
                    rs.getString("alamat"),
                    rs.getString("gender")}
                );
            }
            System.out.println("Query Berhasil di import");
        }
         
         
        catch ( Exception e){
            System.out.println(e);
              JOptionPane.showMessageDialog(null, "MAAF gabisa Import Query :   "+e);
        }    
        

// TODO add your handling code here:
         
    }//GEN-LAST:event_tableOutAncestorAdded

  
   
     
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
                if ("FlatLaf Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TableTitle;
    private javax.swing.JPanel fill1;
    private javax.swing.JPanel fill2;
    private javax.swing.JLabel head1;
    private javax.swing.JPanel headPane;
    private javax.swing.JTextField inAlamat;
    private javax.swing.JComboBox<String> inGender;
    private javax.swing.JTextField inNama;
    private javax.swing.JTextField inNim;
    private javax.swing.JButton insertbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField outConnectionStatus;
    private javax.swing.JPanel panel2;
    private javax.swing.JTable tableOut;
    private javax.swing.JLabel tagAlamat;
    private javax.swing.JLabel tagGender;
    private javax.swing.JLabel tagNama;
    private javax.swing.JLabel tagNim;
    // End of variables declaration//GEN-END:variables
}
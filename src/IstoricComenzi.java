
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Cozmina
 */
public class IstoricComenzi extends javax.swing.JFrame {

    /**
     * Creates new form IstoricComenzi
     */
    public IstoricComenzi() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        meniuCaini2 = new javax.swing.JButton();
        meniuCaini3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        meniuCaini4 = new javax.swing.JButton();
        meniuCaini5 = new javax.swing.JButton();
        idComanda = new javax.swing.JTextField();
        rezervare = new javax.swing.JTextField();
        meniuCaini6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(739, 735));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(204, 134, 87));
        jPanel1.setPreferredSize(new java.awt.Dimension(845, 900));

        jPanel3.setBackground(new java.awt.Color(246, 237, 217));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.PNG"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 0));
        jLabel4.setText("Comenzi Si Rezervari");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(137, 137, 137)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        meniuCaini2.setBackground(new java.awt.Color(34, 28, 14));
        meniuCaini2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        meniuCaini2.setForeground(new java.awt.Color(255, 130, 0));
        meniuCaini2.setText("Comanda Expediata");
        meniuCaini2.setFocusable(false);
        meniuCaini2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniuCaini2ActionPerformed(evt);
            }
        });

        meniuCaini3.setBackground(new java.awt.Color(34, 28, 14));
        meniuCaini3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        meniuCaini3.setForeground(new java.awt.Color(255, 130, 0));
        meniuCaini3.setText("Afisare Comezni");
        meniuCaini3.setFocusable(false);
        meniuCaini3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniuCaini3ActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Utilizator", "Produs+Bucati", "Pret", "Status"
            }
        ));
        jScrollPane2.setViewportView(tabel);

        meniuCaini4.setBackground(new java.awt.Color(34, 28, 14));
        meniuCaini4.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        meniuCaini4.setForeground(new java.awt.Color(255, 130, 0));
        meniuCaini4.setText("Inapoi");
        meniuCaini4.setFocusable(false);
        meniuCaini4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniuCaini4ActionPerformed(evt);
            }
        });

        meniuCaini5.setBackground(new java.awt.Color(34, 28, 14));
        meniuCaini5.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        meniuCaini5.setForeground(new java.awt.Color(255, 130, 0));
        meniuCaini5.setText("Afisare Rezervari");
        meniuCaini5.setFocusable(false);
        meniuCaini5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniuCaini5ActionPerformed(evt);
            }
        });

        idComanda.setBackground(new java.awt.Color(71, 54, 15));
        idComanda.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        idComanda.setForeground(new java.awt.Color(255, 130, 0));
        idComanda.setText("Introdu ID pentru comanda care a fost expediata");
        idComanda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(24, 28, 14), 3, true));
        idComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idComandaActionPerformed(evt);
            }
        });

        rezervare.setBackground(new java.awt.Color(71, 54, 15));
        rezervare.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        rezervare.setForeground(new java.awt.Color(255, 130, 0));
        rezervare.setText("Introdu ID pentru rezervarea care a fost expediata");
        rezervare.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(24, 28, 14), 3, true));
        rezervare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rezervareActionPerformed(evt);
            }
        });

        meniuCaini6.setBackground(new java.awt.Color(34, 28, 14));
        meniuCaini6.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        meniuCaini6.setForeground(new java.awt.Color(255, 130, 0));
        meniuCaini6.setText("Rezervare Expediata");
        meniuCaini6.setFocusable(false);
        meniuCaini6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniuCaini6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rezervare, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(meniuCaini6, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(idComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(meniuCaini2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meniuCaini4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(meniuCaini3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(meniuCaini5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(meniuCaini3)
                        .addGap(37, 37, 37)
                        .addComponent(meniuCaini5)
                        .addGap(214, 214, 214)
                        .addComponent(meniuCaini4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meniuCaini2)
                    .addComponent(idComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rezervare, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meniuCaini6))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meniuCaini2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniuCaini2ActionPerformed
        try {
            // TODO add your handling code here:
            Comanda.expediereComanda(Integer.parseInt(idComanda.getText()));
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(IstoricComenzi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        idComanda.setText("Introdu ID pentru comanda care a fost expediata");
    }//GEN-LAST:event_meniuCaini2ActionPerformed

    private void meniuCaini3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniuCaini3ActionPerformed
        // TODO add your handling code here:
        tabel.removeAll();
        afis();
    }//GEN-LAST:event_meniuCaini3ActionPerformed

    private void meniuCaini4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniuCaini4ActionPerformed
        // TODO add your handling code here:
        dispose();
        InterfataAdmin i= new InterfataAdmin();
        i.setVisible(true);
    }//GEN-LAST:event_meniuCaini4ActionPerformed

    private void meniuCaini5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniuCaini5ActionPerformed
        // TODO add your handling code here:
        
         afis1();
    }//GEN-LAST:event_meniuCaini5ActionPerformed

    private void idComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idComandaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idComandaActionPerformed

    private void rezervareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rezervareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rezervareActionPerformed

    private void meniuCaini6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniuCaini6ActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            Comanda.expediereRezervare(Integer.parseInt(rezervare.getText()));
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(IstoricComenzi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         rezervare.setText("Introdu ID pentru rezervarea care a fost expediata");
    }//GEN-LAST:event_meniuCaini6ActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(IstoricComenzi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IstoricComenzi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IstoricComenzi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IstoricComenzi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IstoricComenzi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idComanda;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton meniuCaini2;
    private javax.swing.JButton meniuCaini3;
    private javax.swing.JButton meniuCaini4;
    private javax.swing.JButton meniuCaini5;
    private javax.swing.JButton meniuCaini6;
    private javax.swing.JTextField rezervare;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
 public void afis(){
     DefaultTableModel tblModel = (DefaultTableModel) tabel.getModel();
            //add string array data into jtbale
            tblModel.setRowCount(0);
    Connection dbconn= ConectareDB.connectDB();
    if(dbconn != null){
    try{
     PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("select * from comenzi where status =1");   
            
            
           ResultSet res= st.executeQuery();
            while(res.next())
            {
                Comanda comanda=new Comanda(Integer.parseInt(res.getString("id")),Integer.parseInt(res.getString("pret")),res.getString("status"));
                
               comanda.setCumparatorID(res.getString("cumparatorId"));
               comanda.setProduseID(res.getString("produseId"));
                comanda.setBuc(res.getString("nrBuc"));
              
                
                String client=Utilizator.cautaUtilizatorDupaId(comanda.getCumparatorID());
                ArrayList<String> produse=Produs.listaIdProdus(comanda);
                ArrayList<String> bucati=Produs.listaBucProdus(comanda);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < produse.size(); i++) {
                    Produs produs= new Produs(Produs.cautaProdus(Integer.parseInt(produse.get(i))));
                    sb.append(produs.getNume()+" ");
                    sb.append(bucati.get(i)+" ");
                    } 
            //String array
            String tbDta[] = {Integer.toString(comanda.getId()),client,sb.toString(),Integer.toString(comanda.getPret()),comanda.getStatus()};
           // DefaultTableModel tblModel = (DefaultTableModel) tabel.getModel();
            //add string array data into jtbale
            tblModel.addRow((tbDta));
            
            }
          
                JOptionPane.showMessageDialog(this, "Datele despre comenzi  ","Suces",JOptionPane.INFORMATION_MESSAGE);
    
    }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Conectare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
}}
 
 public void afis1(){
     DefaultTableModel tblModel = (DefaultTableModel) tabel.getModel();
            //add string array data into jtbale
            tblModel.setRowCount(0);
    Connection dbconn= ConectareDB.connectDB();
    if(dbconn != null){
    try{
     PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("select * from rezervari where status =1");   
            
            
           ResultSet res= st.executeQuery();
            while(res.next())
            {
                Comanda comanda=new Comanda(Integer.parseInt(res.getString("id")),Integer.parseInt(res.getString("pret")),res.getString("status"));
                
               comanda.setCumparatorID(res.getString("cumparatorId"));
               comanda.setProduseID(res.getString("produseId"));
                comanda.setBuc(res.getString("nrBuc"));
              
                
                String client=Utilizator.cautaUtilizatorDupaId(comanda.getCumparatorID());
                ArrayList<String> produse=Produs.listaIdProdus(comanda);
                ArrayList<String> bucati=Produs.listaBucProdus(comanda);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < produse.size(); i++) {
                    Produs produs= new Produs(Produs.cautaProdus(Integer.parseInt(produse.get(i))));
                    sb.append(produs.getNume()+" ");
                    sb.append(bucati.get(i)+" ");
                    } 
            //String array
            String tbDta[] = {Integer.toString(comanda.getId()),client,sb.toString(),Integer.toString(comanda.getPret()),comanda.getStatus()};
           // DefaultTableModel tblModel = (DefaultTableModel) tabel.getModel();
            //add string array data into jtbale
            tblModel.addRow((tbDta));
            
            }
          
                JOptionPane.showMessageDialog(this, "Datele despre rezervari ","Suces",JOptionPane.INFORMATION_MESSAGE);
    
    }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Conectare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
}}
 
}

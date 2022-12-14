
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Cozmina
 */
public class MagazinOnline extends javax.swing.JFrame {

    /**
     * Creates new form MagazinOnline
     */
    public MagazinOnline() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        meniuCaini = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        recomandari = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        recomandarea = new javax.swing.JTextArea();
        inapoiMeniuIntrare1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 134, 87));

        jPanel2.setBackground(new java.awt.Color(247, 236, 217));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.PNG"))); // NOI18N

        meniuCaini.setBackground(new java.awt.Color(34, 28, 14));
        meniuCaini.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        meniuCaini.setForeground(new java.awt.Color(255, 130, 0));
        meniuCaini.setText("Caini");
        meniuCaini.setFocusable(false);
        meniuCaini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniuCainiActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(34, 28, 14));
        jButton5.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 130, 0));
        jButton5.setText("Pisici");
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(34, 28, 14));
        jButton7.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 130, 0));
        jButton7.setText("Animale Mici");
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(34, 28, 14));
        jButton10.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 130, 0));
        jButton10.setText("Rezervari");
        jButton10.setFocusable(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(meniuCaini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(meniuCaini)
                .addGap(30, 30, 30)
                .addComponent(jButton5)
                .addGap(37, 37, 37)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(16, 16, 16))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundal-Magazin-animale (1).jpeg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 28, 14));
        jLabel2.setText("Alege categoria de animale pe care vrei sa o vizitezi.");

        recomandari.setBackground(new java.awt.Color(34, 28, 14));
        recomandari.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        recomandari.setForeground(new java.awt.Color(255, 130, 0));
        recomandari.setText("Recomandari");
        recomandari.setFocusable(false);
        recomandari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recomandariActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(34, 28, 14));
        jButton8.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 130, 0));
        jButton8.setText("Vizualizare Profil");
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(34, 28, 14));
        jButton9.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 130, 0));
        jButton9.setText("Vizualizare Cos");
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        recomandarea.setBackground(new java.awt.Color(204, 134, 87));
        recomandarea.setColumns(20);
        recomandarea.setRows(5);
        recomandarea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        recomandarea.setFocusable(false);
        jScrollPane1.setViewportView(recomandarea);

        inapoiMeniuIntrare1.setBackground(new java.awt.Color(34, 28, 14));
        inapoiMeniuIntrare1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        inapoiMeniuIntrare1.setForeground(new java.awt.Color(255, 130, 0));
        inapoiMeniuIntrare1.setText("Inapoi ");
        inapoiMeniuIntrare1.setFocusable(false);
        inapoiMeniuIntrare1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inapoiMeniuIntrare1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(recomandari, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(586, Short.MAX_VALUE)
                    .addComponent(inapoiMeniuIntrare1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(58, 58, 58)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8)
                .addGap(19, 19, 19)
                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(recomandari))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(inapoiMeniuIntrare1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(451, 451, 451)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meniuCainiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniuCainiActionPerformed
        // TODO add your handling code here:
        dispose();
        Caini caini=new Caini();
        caini.setVisible(true);
    }//GEN-LAST:event_meniuCainiActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
        Pisici p= new Pisici();
        p.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        dispose();
        AnimaleMici a= new AnimaleMici();
        a.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void recomandariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recomandariActionPerformed
        // TODO add your handling code here:
        if(!Utilizator.verificConectarea()){
            JPanel thi=new JPanel();
                JOptionPane.showMessageDialog(thi, "Pentru recomandari conecteazate!.","Suces",JOptionPane.INFORMATION_MESSAGE);
        
        }
        else{
           Comanda comanda=new Comanda(Comanda.lastComanda());
           ArrayList<String> produse = (ArrayList<String>) Produs.listaIdProdus(comanda);
           String recomandare=Produs.elementRecomandare(produse);
           if(recomandare!="none"){
           recomandarea.setText(Produs.afisareProdusR(Produs.cautaProdus(Integer.parseInt(recomandare))));
        }}
    }//GEN-LAST:event_recomandariActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(!Utilizator.verificConectarea()){
             JPanel thi=new JPanel();
                JOptionPane.showMessageDialog(thi, "Pentru a vizualiza profilul trebuie sa fiti conectat.","Suces",JOptionPane.INFORMATION_MESSAGE);
        }else{
        dispose();
       VizualizareProfil cos= new VizualizareProfil();
        cos.setVisible(true); }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(!Utilizator.verificConectarea()){
             JPanel thi=new JPanel();
                JOptionPane.showMessageDialog(thi, "Pentru a vizualiza cosul de cumparaturi trebuie sa fiti conectat.","Suces",JOptionPane.INFORMATION_MESSAGE);
        }else{
        dispose();
        CosCumparaturi cos= new CosCumparaturi();
        cos.setVisible(true); }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void inapoiMeniuIntrare1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inapoiMeniuIntrare1ActionPerformed
        // TODO add your handling code here:
        dispose();
        MeniuIntrare m= new MeniuIntrare();
        m.setVisible(true);
    }//GEN-LAST:event_inapoiMeniuIntrare1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(!Utilizator.verificConectarea()){
             JPanel thi=new JPanel();
                JOptionPane.showMessageDialog(thi, "Pentru efectua rezervari trebuie sa fi conectat.","Suces",JOptionPane.INFORMATION_MESSAGE);
        }else{
        dispose();
        VizualizareRezervare cos= new VizualizareRezervare();
        cos.setVisible(true); }
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(MagazinOnline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MagazinOnline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MagazinOnline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MagazinOnline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MagazinOnline().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inapoiMeniuIntrare1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton meniuCaini;
    private javax.swing.JTextArea recomandarea;
    private javax.swing.JButton recomandari;
    // End of variables declaration//GEN-END:variables


}

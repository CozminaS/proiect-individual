
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Cozmina
 */
public class RegisterAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public RegisterAdmin() {
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        registerUtilizator = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        actiuneRegister = new javax.swing.JButton();
        inapoiMeniuIntrare = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 28, 14));

        jPanel2.setBackground(new java.awt.Color(246, 237, 217));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.PNG"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 0));
        jLabel4.setText("PROMOVARE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(152, 152, 152)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        registerUtilizator.setBackground(new java.awt.Color(71, 54, 15));
        registerUtilizator.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        registerUtilizator.setForeground(new java.awt.Color(255, 130, 0));
        registerUtilizator.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(24, 28, 14), 3, true));
        registerUtilizator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerUtilizatorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 130, 0));
        jLabel1.setText("   Utilizator:");

        actiuneRegister.setBackground(new java.awt.Color(204, 134, 87));
        actiuneRegister.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        actiuneRegister.setForeground(new java.awt.Color(102, 51, 0));
        actiuneRegister.setText("Promoveaza la admin");
        actiuneRegister.setFocusable(false);
        actiuneRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actiuneRegisterActionPerformed(evt);
            }
        });

        inapoiMeniuIntrare.setBackground(new java.awt.Color(204, 134, 87));
        inapoiMeniuIntrare.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        inapoiMeniuIntrare.setForeground(new java.awt.Color(102, 51, 0));
        inapoiMeniuIntrare.setText("Inapoi");
        inapoiMeniuIntrare.setFocusable(false);
        inapoiMeniuIntrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inapoiMeniuIntrareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerUtilizator, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(inapoiMeniuIntrare, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(actiuneRegister)))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerUtilizator, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inapoiMeniuIntrare, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actiuneRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerUtilizatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerUtilizatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerUtilizatorActionPerformed

    private void actiuneRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actiuneRegisterActionPerformed
        // TODO add your handling code here:
        Utilizator utilizator=new Utilizator();
        

        utilizator.setUtilizator(registerUtilizator.getText());
        utilizator.setNivelPermisiune("1");
        Connection dbconn= ConectareDB.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("Select * from users WHERE utilizator =?");   
            st.setString(1, utilizator.getUtilizator());
            ResultSet res= st.executeQuery();
            
             
            if(res.next()){
                
                utilizator.setNume(res.getString("nume"));
                utilizator.setPrenume(res.getString("prenume"));
                utilizator.setEmail(res.getString("email"));
               
            }else{
                JOptionPane.showMessageDialog(this, "Utilizatorul/Parola nu au fost gasite","Eroare",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else
        {
            System.out.println("Conexiunea nu este disponibila.");
        }
        if(utilizator.getUtilizator().isEmpty() )
        {
            JOptionPane.showMessageDialog(this, "Toate campurile trebuie copletate","Eroare",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            //start the logIn process.
            promoveazaUser(utilizator.getUtilizator() ,utilizator.getNivelPermisiune());
            emailsend(utilizator.getEmail(),utilizator.getUtilizator(), utilizator.getNume(), utilizator.getPrenume());
        }
    }//GEN-LAST:event_actiuneRegisterActionPerformed

    private void inapoiMeniuIntrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inapoiMeniuIntrareActionPerformed
        // TODO add your handling code here:
        dispose();
       InterfataAdmin m=new InterfataAdmin();
        m.setVisible(true);
    }//GEN-LAST:event_inapoiMeniuIntrareActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actiuneRegister;
    private javax.swing.JButton inapoiMeniuIntrare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField registerUtilizator;
    // End of variables declaration//GEN-END:variables

    private void promoveazaUser(String utilizator,String lvlpermi) {
        Connection dbconn= ConectareDB.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("UPDATE users SET lvlpermi=? where utilizator=?");   
            st.setString(2, utilizator);
            st.setString(1, lvlpermi);
            st.executeUpdate();
          
                JOptionPane.showMessageDialog(this, "Datele despre utilizator au fost salvate cu succes","Suces",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else
        {
            System.out.println("Conexiunea nu este disponibila.");
        }
    }
    
    public static void emailsend(String mail,String utilizator,String nume, String prenume) {
        // Set system properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Create a session
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("cozminascorobete@gmail.com", "iyyj opdl ldrm nufh");
                    }
                });

        try {
            // Create a message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("cozminascorobete@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(mail));
            message.setSubject("Anima Promovare Admin");
            message.setText("Buna ziua "+ nume+ " "+ prenume+", contul dumeanvoastra cu utilizatorul " +utilizator+" a fost promovat la grad de admin.");

            // Send the message
            Transport.send(message);
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}

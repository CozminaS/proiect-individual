
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cozmina
 */
public class Comanda {
    private int id;
    private int pret;
    private String status;
    private String cumparatorID;
    private String produseID;
    private String buc;

    public Comanda(int id, int pret, String status) {
        this.id = id;
        this.pret = pret;
        this.status = status;
    }
    
    public Comanda(Comanda comanda){
    this.id=comanda.getId();
    this.pret=comanda.getPret();
    this.status=comanda.getStatus();
    this.cumparatorID=comanda.getCumparatorID();
    this.buc=comanda.getBuc();
    this.produseID=comanda.getProduseID();}
    

    public Comanda() {
        this.id = 0;
        this.pret = 0;
        this.status = "none";
        this.cumparatorID = "none";
        this.produseID = "none";
        this.buc = "none";
    }
    
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCumparatorID() {
        return cumparatorID;
    }

    public void setCumparatorID(String cumparatorID) {
        this.cumparatorID = cumparatorID;
    }

    public String getProduseID() {
        return produseID;
    }

    public void setProduseID(String produseID) {
        this.produseID = produseID;
    }

    public String getBuc() {
        return buc;
    }

    public void setBuc(String buc) {
        this.buc = buc;
    }

   

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public static StringBuilder idProduseList()
    { 
        
        
        StringBuilder list=new StringBuilder();
      try (BufferedReader reader = new BufferedReader(new FileReader("comanda.txt"))) {
      String line;
      int lineNr=0;
     
      while ((line = reader.readLine()) != null) {
          lineNr++;
          if(lineNr>3){
              lineNr=1;}
          if(lineNr==1){
              list.append(line);list.append(" ");
          }
         
       
       
      } 
    } catch (IOException e) {
    }
      return list;
    }
    
    public static StringBuilder nrBucList()
    { 
        
        
        StringBuilder list=new StringBuilder();
      try (BufferedReader reader = new BufferedReader(new FileReader("comanda.txt"))) {
      String line;
      int lineNr=0;
     
      while ((line = reader.readLine()) != null) {
          lineNr++;
          if(lineNr>3){
              lineNr=1;}
          if(lineNr==3){
               list.append(line);list.append(" ");
          }
         
       
       
      } 
    } catch (IOException e) {
    }
      return list;
    }
    
    public static  int idCumparator()
    {
         int idi=0;
          try (BufferedReader reader = new BufferedReader(new FileReader("dateConectare.txt"))) {
      String line;

     
     line = reader.readLine();
     idi=Utilizator.cautaUtilizator(line);
       
       
      } 
     catch (IOException e) {
    
    }
          return idi;
    }
    
    public static StringBuilder generareFactura(){
        StringBuilder factura=new StringBuilder();
        
          try (BufferedReader reader = new BufferedReader(new FileReader("factura.txt"))) {
      String line;
      int lineNr=0;
     
      while ((line = reader.readLine()) != null) {
          lineNr++;
         factura.append(line);
         factura.append("\n");
       
       
      } 
    } catch (IOException e) {
    }
    return factura;        
    }
    
    
    public static void emailsend() {
        // Set system properties
        Utilizator utilizator= new Utilizator(Utilizator.suntConectat());
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
                    InternetAddress.parse(utilizator.getEmail()));
            message.setSubject("Anima Comanda");
            message.setText("Buna ziua "+ utilizator.getNume()+ " "+ utilizator.getPrenume()+" comanda dumneavoastra a fost plasata cu succes, veti primi un email cand cand va fi trimisa catre curieri.\n" +generareFactura().toString()+"\n"+dateFacturare().toString());

            // Send the message
            Transport.send(message);
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static StringBuilder dateFacturare(){
        Utilizator utilizator = new Utilizator(Utilizator.suntConectat());
        StringBuilder factura=new StringBuilder();
        factura.append("Nume: ");
        factura.append(utilizator.getNume());
        factura.append(" Prenume: ");
        factura.append(utilizator.getPrenume());
        factura.append("\nNumar de telefon: ");
        factura.append(utilizator.getNrTelefon());
        factura.append("\nEmail: ");
        factura.append(utilizator.getEmail());
        factura.append("\nAdresa:");
        factura.append(utilizator.getTara()).append(" ").append(utilizator.getJudet()).append(" ").append(utilizator.getOras()).append(" ").append(utilizator.getStrada());
        
        return factura;
    }
    
    public static void comandaBd(int id, StringBuilder prodId,StringBuilder buc,int pret){
         Connection dbconn= ConectareDB.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("INSERT INTO comenzi (cumparatorId,produseId,nrBuc,pret,status) VALUES(?,?,?,?,?)");   
            st.setString(1, Integer.toString(id));
            st.setString(2, prodId.toString());
            st.setString(3, buc.toString());
            st.setString(4, Integer.toString(pret));
            st.setString(5, "1");
           
            st.executeUpdate();
                JPanel thi=new JPanel();
                JOptionPane.showMessageDialog(thi, "Comanda plasata cu succes, veti primi un email de confirmare.","Suces",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else
        {
            System.out.println("Conexiunea nu este disponibila.");
        }
       
    }
    
    public static Comanda lastComanda(){
        StringBuilder id=new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("dateConectare.txt"))) {
      String line;
     line = reader.readLine();
     id.append(line);
      } 
     catch (IOException e) {
    }
        int idu=Utilizator.cautaUtilizator(id.toString());
    Comanda comanda=new Comanda();
    Connection dbconn= ConectareDB.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("Select max(id) from comenzi WHERE cumparatorId =? ");   
            st.setString(1, Integer.toString(idu));
           
            ResultSet resi= st.executeQuery();
            
            
            
            if(resi.next()){
                String rez=resi.getString(1);
            if(rez!=null){
                PreparedStatement sti=(PreparedStatement)
                        dbconn.prepareStatement("Select * from comenzi WHERE id =?");
                sti.setString(1,rez);
                ResultSet res=sti.executeQuery();
                res.next();
                comanda.setId(res.getInt("id"));
                comanda.setProduseID(res.getString("produseId"));
                comanda.setCumparatorID(res.getString("cumparatorId"));
                comanda.setPret(Integer.parseInt(res.getString("pret")));
                comanda.setBuc(res.getString("nrBuc"));
                comanda.setStatus(res.getString("status"));
                //afiseaza meniu nou
              
                
            }else{
                JPanel j= new JPanel();
                JOptionPane.showMessageDialog(j, "Se pare ca sunteti la prima comanda, nu va putem afisa o recomandare personalizata, scuze!","Eroare",JOptionPane.ERROR_MESSAGE);
            }}
        } catch (SQLException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else
        {
            System.out.println("Conexiunea nu este disponibila.");
        }
    
        return comanda;
    
    }

      public static StringBuilder dateFacturareR(){
        Utilizator utilizator = new Utilizator(Utilizator.suntConectat());
        StringBuilder factura=new StringBuilder();
        factura.append("Nume: ");
        factura.append(utilizator.getNume());
        factura.append(" Prenume: ");
        factura.append(utilizator.getPrenume());
        factura.append("\nNumar de telefon: ");
        factura.append(utilizator.getNrTelefon());
        factura.append("\nEmail: ");
        factura.append(utilizator.getEmail());
        factura.append("\nAdresa:");
        factura.append(utilizator.getTara()).append(" ").append(utilizator.getJudet()).append(" ").append(utilizator.getOras()).append(" ").append(utilizator.getStrada());
        
        return factura;
    }
      
      public static void comandaBdR(int id, StringBuilder prodId,StringBuilder buc,int pret){
         Connection dbconn= ConectareDB.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("INSERT INTO rezervari (cumparatorId,produseId,nrBuc,pret,status) VALUES(?,?,?,?,?)");   
            st.setString(1, Integer.toString(id));
            st.setString(2, prodId.toString());
            st.setString(3, buc.toString());
            st.setString(4, Integer.toString(pret));
            st.setString(5, "1");
           
            st.executeUpdate();
                JPanel thi=new JPanel();
                JOptionPane.showMessageDialog(thi, "Rezervare plasata cu succes, veti primi un email de confirmare.","Suces",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else
        {
            System.out.println("Conexiunea nu este disponibila.");
        }
       
    }
      
         
    public static void emailsendR() {
        // Set system properties
        Utilizator utilizator= new Utilizator(Utilizator.suntConectat());
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
                    InternetAddress.parse(utilizator.getEmail()));
            message.setSubject("Rezervare Comanda");
            message.setText("Buna ziua "+ utilizator.getNume()+ " "+ utilizator.getPrenume()+" rezervarea dumneavoastra a fost plasata cu succes, veti primi un email cand cand va fi trimisa catre curieri.\n" +generareFacturaR().toString()+"\n"+dateFacturare().toString());

            // Send the message
            Transport.send(message);
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static StringBuilder generareFacturaR(){
        StringBuilder factura=new StringBuilder();
        
          try (BufferedReader reader = new BufferedReader(new FileReader("facturaR.txt"))) {
      String line;
      int lineNr=0;
     
      while ((line = reader.readLine()) != null) {
          lineNr++;
         factura.append(line);
         factura.append("\n");
       
       
      } 
    } catch (IOException e) {
    }
    return factura;        
    }
    
       
    public static StringBuilder idProduseListR()
    { 
        
        
        StringBuilder list=new StringBuilder();
      try (BufferedReader reader = new BufferedReader(new FileReader("rezervare.txt"))) {
      String line;
      int lineNr=0;
     
      while ((line = reader.readLine()) != null) {
          lineNr++;
          if(lineNr>3){
              lineNr=1;}
          if(lineNr==1){
              list.append(line);list.append(" ");
          }
         
       
       
      } 
    } catch (IOException e) {
    }
      return list;
    }
    
    public static StringBuilder nrBucListR()
    { 
        
        
        StringBuilder list=new StringBuilder();
      try (BufferedReader reader = new BufferedReader(new FileReader("rezervare.txt"))) {
      String line;
      int lineNr=0;
     
      while ((line = reader.readLine()) != null) {
          lineNr++;
          if(lineNr>3){
              lineNr=1;}
          if(lineNr==3){
               list.append(line);list.append(" ");
          }
         
       
       
      } 
    } catch (IOException e) {
    }
      return list;
    }
    
    public static String idComnadaClient(){
        String caca=null;
        return caca;
    }
    
    public static void emailsendComandaExpediata(Utilizator utilizator, Comanda comanda) {
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
                    InternetAddress.parse(utilizator.getEmail()));
            message.setSubject("Anima Comanda");
            message.setText("Buna ziua "+ utilizator.getNume()+ " "+ utilizator.getPrenume()+" comanda dumneavoastra in valoare de "+Integer.toString(comanda.getPret())+" a fost trimisa catre curier si v-a ajunge la dumneavoastra in 5-10 zile lucratoare.\n" );

            // Send the message
            Transport.send(message);
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void emailsendComandaRezervare(Utilizator utilizator, Comanda comanda) {
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
                    InternetAddress.parse(utilizator.getEmail()));
            message.setSubject("Rezervare Comanda");
            message.setText("Buna ziua "+ utilizator.getNume()+ " "+ utilizator.getPrenume()+" rezervarea dumneavoastra "+Integer.toString(comanda.getPret())+" a fost trimisa catre curier si v-a ajunge la dumneavoastra in 5-10 zile lucratoare.\n" +generareFactura().toString()+"\n"+dateFacturare().toString());

            // Send the message
            Transport.send(message);
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
   
    public static void expediereComanda(int id) throws SQLException{
     Comanda comanda=new Comanda();
    
    
    Connection dbconn= ConectareDB.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("UPDATE comenzi SET status=? where id=?");   
            st.setString(2, Integer.toString(id));
            st.setString(1, "2");
            st.executeUpdate();
             JPanel thi=new JPanel();
                JOptionPane.showMessageDialog(thi, "Datele au fost salvate si a fost trimis email de confirmare.","Suces",JOptionPane.INFORMATION_MESSAGE);
            
            
             
        } catch (SQLException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else
        {
            System.out.println("Conexiunea nu este disponibila.");
        }
    
     PreparedStatement sti=(PreparedStatement)
                    dbconn.prepareStatement("Select * from comenzi WHERE id =? ");   
            sti.setString(1, Integer.toString(id));
           
            ResultSet res= sti.executeQuery();
            if(res.next()){
            String idUti=res.getString("cumparatorId");
            Utilizator utilizator=new Utilizator(Utilizator.cautaUtilizatorClasaDupaId(idUti));
            emailsendComandaExpediata(utilizator,comanda);
            }
    }
    
    public static void expediereRezervare(int id) throws SQLException{
     Comanda comanda=new Comanda();
    
    
    Connection dbconn= ConectareDB.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("UPDATE rezervari SET status=? where id=?");   
           st.setString(2, Integer.toString(id));
            st.setString(1, "2");
            st.executeUpdate();
           
              JPanel thi=new JPanel();
                JOptionPane.showMessageDialog(thi, "Datele au fost salvate si a fost trimis email de confirmare.","Suces",JOptionPane.INFORMATION_MESSAGE);
            
             
        } catch (SQLException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else
        {
            System.out.println("Conexiunea nu este disponibila.");
        }
    
     PreparedStatement sti=(PreparedStatement)
                    dbconn.prepareStatement("Select * from rezervari WHERE id =? ");   
            sti.setString(1, Integer.toString(id));
           
            ResultSet res= sti.executeQuery();
            if(res.next()){
            String idUti=res.getString("cumparatorId");
            Utilizator utilizator=new Utilizator(Utilizator.cautaUtilizatorClasaDupaId(idUti));
            emailsendComandaRezervare(utilizator,comanda);
            }
    }
    
    
}

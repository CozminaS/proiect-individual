/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Cozmina
 */
public class Utilizator {
    int id;
    private String utilizator;
    private String parola;
    private String email;
    private String nrTelefon;
    private String tara;
    private String oras;
    private String judet;
    private String nume;
    private String prenume;
    private String strada;
    private String nivelPermisiune;
    
    
    public Utilizator(int metID, String metUtilizator, String metParola, String metEmail, String metNrTelefon, String metTara,String metOras, String metJudet,String metStrada, String metNume,String metPrenume, String metNivelPermisiune )
    {
        this.id=metID;
        this.utilizator=metUtilizator;
        this.parola=metParola;
        this.email=metEmail;
        this.nrTelefon=metNrTelefon;
        this.tara=metTara;
        this.oras=metOras;
        this.judet=metJudet;
        this.strada=metStrada;
        this.nivelPermisiune=metNivelPermisiune;
        this.nume=metNume;
        this.prenume=metPrenume;
    }
     public Utilizator( String metUtilizator, String metParola, String metNume,String metPrenume,String metNrTelefon, String metEmail, String metTara,String metJudet, String metOras, String metStrada, String metNivelPermisiune)    {
        
        this.utilizator=metUtilizator;
        this.parola=metParola;
        this.email=metEmail;
        this.nrTelefon=metNrTelefon;
        this.tara=metTara;
        this.oras=metOras;
        this.judet=metJudet;
        this.strada=metStrada;
        this.nivelPermisiune=metNivelPermisiune;
        this.nume=metNume;
        this.prenume=metPrenume;
    }
    public Utilizator( String metNume,String metPrenume,String metNrTelefon, String metEmail, String metTara,String metJudet, String metOras, String metStrada, String metNivelPermisiune)    {
        
      
        this.email=metEmail;
        this.nrTelefon=metNrTelefon;
        this.tara=metTara;
        this.oras=metOras;
        this.judet=metJudet;
        this.strada=metStrada;
        this.nivelPermisiune=metNivelPermisiune;
        this.nume=metNume;
        this.prenume=metPrenume;
    }
    public Utilizator(Utilizator utilizator){
        this.utilizator=utilizator.getUtilizator();
        this.parola=utilizator.getParola();
        this.email=utilizator.getEmail();
        this.nrTelefon=utilizator.getNrTelefon();
        this.tara=utilizator.getTara();
        this.oras=utilizator.getOras();
        this.judet=utilizator.getJudet();
        this.strada=utilizator.getStrada();
        this.nivelPermisiune=utilizator.getNivelPermisiune();
        this.nume=utilizator.getNume();
        this.prenume=utilizator.getPrenume();
    }
    public Utilizator(){
        this.id=0;
        this.utilizator="none";
        this.parola="none";
        this.email="none";
        this.nrTelefon="none";
        this.tara="none";
        this.oras="none";
        this.judet="none";
        this.strada="none";
        this.nume="none";
        this.prenume="none";
        
    }
    public Utilizator(String utilizator,String parola){
    this.utilizator=utilizator;
    this.parola=parola;}
    
     public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }
    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }
    
    public Utilizator(String nivPermi){
    this.nivelPermisiune=nivPermi;}
    
    public void setId(int metID)
    {this.id=metID;}
    public int getId()
    {return this.id;}
    
    public void setUtilizator(String metUtilizator)
    {this.utilizator=metUtilizator;}
    public String getUtilizator(){return this.utilizator;}
    
    public void setParola(String metParola)
    {this.parola=metParola;}
    public String getParola(){return this.parola;}
    
    public void setEmail(String metEmail){this.email=metEmail;}
    public String getEmail(){return this.email;}
    
    public void setNrTelefon(String metNrTelefon){this.nrTelefon=metNrTelefon;}
    public String getNrTelefon(){return this.nrTelefon;}
  
    public String getNivelPermisiune(){return this.nivelPermisiune;}
     public void setNivelPermisiune(String per){ this.nivelPermisiune=per;}
    
    public void setNume(String metNume){this.nume=metNume;}
    public String getNume(){return this.nume;}
    
    public void setPrenume(String metPrenume){this.prenume=metPrenume;}
    public String getPrenume(){return this.prenume;}
    
    public static boolean isValidEmail(String email) {
        final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        boolean isValid=matcher.matches();
     return isValid;
        
        
    }
    

    public static boolean isValidPhoneNumber(String phoneNumber) {
        final String PHONE_REGEX = "^(0[1-9]\\s\\d{4}\\s\\d{3})|(\\+4\\d\\s\\d{3}\\s\\d{3}\\s\\d{3})|(0\\d{9})$";
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    

    public static boolean isValidNume(String nume) {
        final String NUME_REGEX = "^[A-Z][a-z]+$";
        Pattern pattern = Pattern.compile(NUME_REGEX);
        Matcher matcher = pattern.matcher(nume);
        return matcher.matches();
    }
     public static boolean isValidPrenume(String Prenume) {
        final String PRENUME_REGEX = "^[A-Z][a-z]+-[A-Z][a-z]+$|^[A-Z][a-z]+$";
        Pattern pattern = Pattern.compile(PRENUME_REGEX);
        Matcher matcher = pattern.matcher(Prenume);
       return matcher.matches();
    }
     
    public static boolean isValidTara(String tara) {
        final String TARA_REGEX = "Romania";
        Pattern pattern = Pattern.compile(TARA_REGEX);
        Matcher matcher = pattern.matcher(tara);
        return matcher.matches();
    }
     public static boolean isValidJudet(String judet) {
        final String TARA_REGEX = "^[A-Z][a-z]+-[A-Z][a-z]+$|^[A-Z][a-z]+$";
        Pattern pattern = Pattern.compile(TARA_REGEX);
        Matcher matcher = pattern.matcher(judet);
        return matcher.matches();
    }
     public static boolean isValidOras(String oras) {
        final String TARA_REGEX = "^[A-Z][a-z]+-[A-Z][a-z]+$|^[A-Z][a-z]+$";
        Pattern pattern = Pattern.compile(TARA_REGEX);
        Matcher matcher = pattern.matcher(oras);
        return matcher.matches();
    }
    
     public static boolean isValidUtilizator(String utilizator)
     {final String USERNAME_REGEX = "^[a-zA-Z0-9._-]{3,15}$";
      Pattern pattern = Pattern.compile(USERNAME_REGEX);
        Matcher matcher = pattern.matcher(utilizator);
        return matcher.matches();
     }
     
     public static boolean isValidParola(String parola){
    final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+-=])[a-zA-Z\\d!@#$%^&*()_+-=]{8,}$";
    Pattern pattern = Pattern.compile(PASSWORD_REGEX);
    Matcher matcher = pattern.matcher(parola);
    return matcher.matches();
    }
     
    public static void mamConectat(Utilizator utilizator){
      try {
          try (FileWriter writer = new FileWriter("dateConectare.txt")) {
              writer.write(utilizator.getUtilizator()+"\n");
              writer.write(utilizator.getParola()+"\n");
              writer.write(utilizator.getNume()+"\n");
              writer.write(utilizator.getPrenume()+"\n");
              writer.write(utilizator.getEmail()+"\n");
              writer.write(utilizator.getNrTelefon()+"\n");
              writer.write(utilizator.getTara()+"\n");
              writer.write(utilizator.getJudet()+"\n");
              writer.write(utilizator.getOras()+"\n");
              writer.write(utilizator.getStrada()+"\n");
              writer.write(utilizator.getNivelPermisiune()+"\n");
              writer.close();
          }
        } catch (IOException e) {
        }
      System.out.println("Scris in fisier cu succes");
      try {
          try (FileWriter writer = new FileWriter("comanda.txt")) {
             
              writer.close();
          }
        } catch (IOException e) {
        }
       try {
          try (FileWriter writer = new FileWriter("factura.txt")) {
             
              writer.close();
          }
        } catch (IOException e) {
        }
       
       try {
          try (FileWriter writer = new FileWriter("facturaR.txt")) {
             
              writer.close();
          }
        } catch (IOException e) {
        }
       try {
          try (FileWriter writer = new FileWriter("rezervare.txt")) {
             
              writer.close();
          }
        } catch (IOException e) {
        }
    }
    
    public static Utilizator suntConectat(){
    Utilizator utilizator=new Utilizator();
    try {
            BufferedReader reader = new BufferedReader(new FileReader("dateConectare.txt"));
            String line;
            int i=1;
            while (i<=11) {
                line = reader.readLine();
               // System.out.println(line);
               switch (i) {
               case 1 -> utilizator.setUtilizator(line);
              case 2 -> utilizator.setParola(line);
              case 3 -> utilizator.setNume(line);
              case 4 -> utilizator.setPrenume(line);
              case 5 -> utilizator.setEmail(line);
              case 6 -> utilizator.setNrTelefon(line);
             case 7 -> utilizator.setTara(line);
             case 8 -> utilizator.setJudet(line);
             case 9 -> utilizator.setOras(line);
             case 10 -> utilizator.setStrada(line);
             case 11 -> utilizator.setNivelPermisiune(line);
    default -> System.out.println("ce naiba?");
    
}//System.out.println(i);
i++;
            }
            reader.close();
        } catch (IOException e) {
        }
  
    return utilizator;
    }
    
    public static boolean verificConectarea(){
     String verf=new String();
        try {
        BufferedReader reader = new BufferedReader(new FileReader("dateConectare.txt"));
            String line;
            
            
            line = reader.readLine();
            // System.out.println(line);
            verf=line;
        reader.close();
        } catch (IOException e) {
        }
      
        if(verf.equals("null"))
        {
        return false;
    }
        else return true;
        
}

    
  public static void nuMamConectat(){
      try {
          try (FileWriter writer = new FileWriter("dateConectare.txt")) {
              writer.write("null"+"\n");
              writer.write("null"+"\n");
              writer.write("null"+"\n");
              writer.write("null"+"\n");
              writer.write("null"+"\n");
              writer.write("null"+"\n");
              writer.write("null"+"\n");
              writer.write("null"+"\n");
              writer.write("null"+"\n");
              writer.write("null"+"\n");
              writer.write("null"+"\n");
              writer.close();
          }
        } catch (IOException e) {
        }
      System.out.println("Scris in fisier cu succes");
    }
  
   public static int cautaUtilizator(String id){
    int idut = 0;
    
    
    Connection dbconn= ConectareDB.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("Select * from users WHERE utilizator =? ");   
            st.setString(1, id);
           
            ResultSet res= st.executeQuery();
            
             
            if(res.next()){
                
              
                idut=Integer.parseInt(res.getString("userID"));
           
              
                
            }else{
                JPanel j= new JPanel();
                JOptionPane.showMessageDialog(j, "Utilizatorul nu a fost gasit nu au fost gasite","Eroare",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else
        {
            System.out.println("Conexiunea nu este disponibila.");
        }
    
    return idut;
    }
   
    public static StringBuilder vizualizareProfil(){
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
        
        factura.append("\n__________________________________________________");
        factura.append("\nUtilizator: "+utilizator.getUtilizator());
        factura.append("\nParola: "+utilizator.getParola());
        
        return factura;
    }
    
    public static String selecteazaUsername(){
     String verf=new String();
        try {
        BufferedReader reader = new BufferedReader(new FileReader("dateConectare.txt"));
            String line;
            
            
            line = reader.readLine();
            // System.out.println(line);
            verf=line;
        reader.close();
        } catch (IOException e) {
        }
      
      return verf;
        
}
   
    public static String cautaUtilizatorDupaId(String id){
    String idut = new String();
    
    
    Connection dbconn= ConectareDB.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("Select * from users WHERE userID =? ");   
            st.setString(1, id);
           
            ResultSet res= st.executeQuery();
            
             
            if(res.next()){
                
              
                idut=res.getString("utilizator");
           
              
                
            }else{
                JPanel j= new JPanel();
                JOptionPane.showMessageDialog(j, "Utilizatorul nu a fost gasit nu au fost gasite","Eroare",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else
        {
            System.out.println("Conexiunea nu este disponibila.");
        }
    
    return idut;
    }
    
     public static Utilizator cautaUtilizatorClasaDupaId(String id){
    Utilizator utilizator=new Utilizator();
    
    
    Connection dbconn= ConectareDB.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("Select * from users WHERE userID =? ");   
            st.setString(1, id);
           
            ResultSet res= st.executeQuery();
            
             
            if(res.next()){
                
              utilizator.setId(Integer.parseInt(id));
               utilizator.setUtilizator(res.getString("utilizator"));
               utilizator.setParola(res.getString("parola"));
               utilizator.setEmail(res.getString("email"));
               utilizator.setNume(res.getString("nume"));
               utilizator.setPrenume(res.getString("prenume"));
               utilizator.setNrTelefon(res.getString("telefon"));
               utilizator.setTara(res.getString("tara"));
               utilizator.setJudet(res.getString("judet"));
               utilizator.setOras(res.getString("oras"));
               utilizator.setStrada(res.getString("strada"));
               utilizator.setNivelPermisiune(res.getString("lvlpermi"));
              
                
            }else{
                JPanel j= new JPanel();
                JOptionPane.showMessageDialog(j, "Utilizatorul nu a fost gasit nu au fost gasite","Eroare",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else
        {
            System.out.println("Conexiunea nu este disponibila.");
        }
    
    return utilizator;
    }
}

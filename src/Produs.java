
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cozmina
 */
public class Produs {
    private int id;
    private String nume;
    private int cantitate;
    private int pret;
    private String descriere;
    private String categorie;
    private String animal;

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
    

    public Produs(int id, String nume, int cantitate, int pret, String descriere) {
        this.id = id;
        this.nume = nume;
        this.cantitate = cantitate;
        this.pret = pret;
        this.descriere=descriere;
    }
    
    public Produs( String nume, int cantitate, int pret, String descriere) {
       
        this.nume = nume;
        this.cantitate = cantitate;
        this.pret = pret;
        this.descriere=descriere;
    }
    
    public Produs(Produs produs){
    this.id=produs.getId();
    this.nume=produs.getNume();
    this.cantitate=produs.getCantitate();
    this.pret=produs.pret;
    this.descriere=produs.getDescriere();}
    
    public Produs(Produs produs, String c){
    this.id=produs.getId();
    this.nume=produs.getNume();
    this.cantitate=Integer.parseInt(c);
    this.pret=produs.pret;
    this.descriere=produs.getDescriere();}
    
    public Produs(int id, int pret){
    this.id=id;
    this.pret=pret;
    }
     public Produs(int id){
    this.id=id;

    }
    public Produs(){
    this.id=0;
    this.nume="none";
    this.descriere="none";
    this.cantitate=0;
    this.pret=0;}
    
    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
    
   
    
    
    public static void adaugaProdus(Produs produs){
    try{
     BufferedWriter writer= new BufferedWriter(new FileWriter("comanda.txt", true)) ;  
            writer.write(produs.getId()+"\n");
            writer.write(produs.getPret()+"\n");
            writer.close();
          
    }catch(IOException e){}
     System.out.println("produs adaugat cu succes");
      }
    public static void adaugaNrBucati(Produs produs){
    try{
     BufferedWriter writer= new BufferedWriter(new FileWriter("comanda.txt", true)) ;  
            writer.write(produs.getCantitate()+"\n");
            writer.close();
          
    }catch(IOException e){}
     System.out.println("Cantitate adaugata");
      }

    public static void cumparaProdus(String a){
      Utilizator utilizator=new Utilizator();
      Produs baza=new Produs(cautaProdus(Integer.parseInt(a)));
      JPanel j= new JPanel();
        if(!Utilizator.verificConectarea())
        {JOptionPane.showMessageDialog(j, "Pentru a cumpara trebuie sa va conectati.","UPS",JOptionPane.INFORMATION_MESSAGE);}
        else{
        utilizator=new Utilizator(Utilizator.suntConectat());
        //String id=cumpara3.getAccessibleContext().getAccessibleDescription();
        Produs produs=new Produs(cautaProdus(Integer.parseInt(a)));
        produs.setId(Integer.parseInt(a));
       
        adaugaId(produs);
        int id=Integer.parseInt(a);
        NrBucati nr=new NrBucati();
        nr.setVisible(true);
        }
  
    }
    
    public static Produs cautaProdus(int id){
    Produs produs= new Produs();
    
    
    Connection dbconn= ConectareDB.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("Select * from produs WHERE id =? ");   
            st.setString(1, Integer.toString(id));
           
            ResultSet res= st.executeQuery();
            
             
            if(res.next()){
                
                produs.setId(id);
                produs.setNume(res.getString("nume"));
                produs.setDescriere(res.getString("descriere"));
                produs.setCantitate(Integer.parseInt(res.getString("nrBuc")));
                produs.setPret(Integer.parseInt(res.getString("pret")));
                //afiseaza meniu nou
              
                
            }else{
                JPanel j= new JPanel();
                JOptionPane.showMessageDialog(j, "Produsul nu a fost gasit nu au fost gasite","Eroare",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else
        {
            System.out.println("Conexiunea nu este disponibila.");
        }
    
    
    return produs;
    }
    
    public static void updateNrBuc(Produs produsBaza, Produs produsFisier){
        Connection dbconn= ConectareDB.connectDB();
        int nrBucCur=produsBaza.getCantitate()-produsFisier.getCantitate();
        if(dbconn != null){
        try {
            PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("UPDATE produs SET nrBuc=? where id=?");   
            st.setString(2, Integer.toString(produsBaza.getId()));
            st.setString(1, Integer.toString(nrBucCur));
            st.executeUpdate();   
        } catch (SQLException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else
        {
            System.out.println("Conexiunea nu este disponibila.");
        }
    }
    
    public static int sumaCos()
    {
        int totalPlata=0;
        
        
         BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader("comanda.txt"));
      String line;
      int lineNr = 0;
      //reader.readLine();
     
      int pret=0;
       while ((line = reader.readLine()) != null) {
          lineNr++;
          if(lineNr>3){
              lineNr=1;}
          if(lineNr==1){
          // System.out.println(Integer.toString(lineNr)+name+line);
          }
          else if(lineNr==2){pret=Integer.parseInt(line);}
          else if(lineNr==3){
       totalPlata=totalPlata+pret*Integer.parseInt(line);
       //  System.out.println(name);
           }
         //  System.out.println(line);
         // System.out.println(lineNr);
       //  Produs produsFisier=new Produs( produsBaza,buc);
       //  Produs.updateNrBuc(produsBaza,produsFisier);
       
      }
    } catch (IOException e) {
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
        }
      }
    }
        
        
        return totalPlata;
    }
    
   public static StringBuilder cautaNume(int id){
    StringBuilder nume=new StringBuilder("blala");
    
    
    Connection dbconn= ConectareDB.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("Select * from produs WHERE id =? ");   
            st.setString(1, Integer.toString(id));
           
            ResultSet res= st.executeQuery();
            
             
            if(res.next()){
                nume.delete(0, nume.length());
                nume.append(res.getString("nume"));
               
                //afiseaza meniu nou
              
                
            }else{
                JPanel j= new JPanel();
                JOptionPane.showMessageDialog(j, "Produsul nu a fost gasit nu au fost gasite","Eroare",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else
        {
            System.out.println("Conexiunea nu este disponibila.");
        }
    
    
    return nume;
    }
   
   public static boolean verifNrBuc(Produs produsBaza, Produs produsFisier )
   {
        return produsBaza.getCantitate() >= produsFisier.getCantitate();
   }
    public static void adaugaId(Produs produs){
    try{
     FileWriter writer = new FileWriter("temporar.txt");  
            writer.write(produs.getId()+"\n");
            writer.write(produs.getPret()+"\n");
            writer.close();
          
    }catch(IOException e){}
     
      }
    
    public static Produs produsTemp(){
        Produs produs=new Produs();
      BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader("temporar.txt"));
      String line;
      int lineNr = 0;
      //reader.readLine();
     line=reader.readLine();
     produs.setId(Integer.parseInt(line));
     line=reader.readLine();
     produs.setPret(Integer.parseInt(line));
     
      
    } catch (IOException e) {
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
        }
      }}
    return produs;}
  
    public static ArrayList<String> listaIdProdus(Comanda comanda) {
    ArrayList<String> parts = new ArrayList<String>();
    String[] temp = comanda.getProduseID().split(" ");
    for (String s : temp) {
        parts.add(s);
    }
    return parts;
}
    public static ArrayList<String> listaBucProdus(Comanda comanda) {
    ArrayList<String> parts = new ArrayList<String>();
    String[] temp = comanda.getBuc().split(" ");
    for (String s : temp) {
        parts.add(s);
    }
    return parts;
}
    public static String elementRecomandare(ArrayList<String> list) {
    Random rand = new Random();
    int index = rand.nextInt(list.size());
    return list.get(index);
}

    public static String afisareProdusR(Produs produs){
    String s=("\n\nUn produs potrivit pentru tine\n\n"+produs.getNume()+" \n\n" + produs.getDescriere());
    
    return s;
    }
     public static void adaugaProdusR(Produs produs){
    try{
     BufferedWriter writer= new BufferedWriter(new FileWriter("rezervare.txt", true)) ;  
            writer.write(produs.getId()+"\n");
            writer.write(produs.getPret()+"\n");
            writer.close();
          
    }catch(IOException e){}
     System.out.println("produs adaugat cu succes");
      }
    public static void adaugaNrBucatiR(Produs produs){
    try{
     BufferedWriter writer= new BufferedWriter(new FileWriter("rezervare.txt", true)) ;  
            writer.write(produs.getCantitate()+"\n");
            writer.close();
          
    }catch(IOException e){}
     System.out.println("Cantitate adaugata");
      }
  public static int sumaCosR()
    {
        int totalPlata=0;
        
        
         BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader("rezervare.txt"));
      String line;
      int lineNr = 0;
      //reader.readLine();
     
      int pret=0;
       while ((line = reader.readLine()) != null) {
          lineNr++;
          if(lineNr>3){
              lineNr=1;}
          if(lineNr==1){
          // System.out.println(Integer.toString(lineNr)+name+line);
          }
          else if(lineNr==2){pret=Integer.parseInt(line);}
          else if(lineNr==3){
       totalPlata=totalPlata+pret*Integer.parseInt(line);
       //  System.out.println(name);
           }
         //  System.out.println(line);
         // System.out.println(lineNr);
       //  Produs produsFisier=new Produs( produsBaza,buc);
       //  Produs.updateNrBuc(produsBaza,produsFisier);
       
      }
    } catch (IOException e) {
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
        }
      }
    }
        
        
        return totalPlata;
    }
    
    public static Produs produsTempR(){
        Produs produs=new Produs();
      BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader("temporarR.txt"));
      String line;
      int lineNr = 0;
      //reader.readLine();
     line=reader.readLine();
     produs.setId(Integer.parseInt(line));
     line=reader.readLine();
     produs.setPret(Integer.parseInt(line));
     
      
    } catch (IOException e) {
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
        }
      }}
    return produs;}
public static void adaugaIdR(Produs produs){
    try{
     FileWriter writer = new FileWriter("temporarR.txt");  
            writer.write(produs.getId()+"\n");
            writer.write(produs.getPret()+"\n");
            writer.close();
          
    }catch(IOException e){}
     
      }    
public static void cumparaProdusR(String a, String b){
      Utilizator utilizator=new Utilizator();
      Produs baza=new Produs(cautaProdus(Integer.parseInt(a)));
      JPanel j= new JPanel();
        if(!Utilizator.verificConectarea())
        {JOptionPane.showMessageDialog(j, "Pentru a cumpara trebuie sa va conectati.","UPS",JOptionPane.INFORMATION_MESSAGE);}
        else{
        utilizator=new Utilizator(Utilizator.suntConectat());
        //String id=cumpara3.getAccessibleContext().getAccessibleDescription();
        Produs produs=new Produs();
        produs.setId(Integer.parseInt(a));
        produs.setPret(Integer.parseInt(b));
        adaugaIdR(produs);
        int id=Integer.parseInt(a);
        NrBucati nr=new NrBucati();
        nr.setVisible(true);
        }}

 public static int nrBucTotDupaAdaugare(Produs produsBaza, Produs produsFisier )
   {
        return produsBaza.getCantitate() + produsFisier.getCantitate();
   }
 public static void updateNrBucDupaAdaugare(Produs produsBaza, Produs produsFisier){
        Connection dbconn= ConectareDB.connectDB();
        int nrBucCur=produsBaza.getCantitate()+produsFisier.getCantitate();
        if(dbconn != null){
        try {
            PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("UPDATE produs SET nrBuc=? where id=?");   
            st.setString(2, Integer.toString(produsBaza.getId()));
            st.setString(1, Integer.toString(nrBucCur));
            st.executeUpdate();   
            JPanel j= new JPanel();
            JOptionPane.showMessageDialog(j, "Datele au fost salvate cu succes.","UPS",JOptionPane.INFORMATION_MESSAGE);
       
        } catch (SQLException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else
        {
            System.out.println("Conexiunea nu este disponibila.");
        }
    }
 
 
 public static void inserareProdus(Produs produs){
 Connection dbconn= ConectareDB.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("INSERT INTO produs(nume,descriere,pret,nrBuc,animal,categorie) VALUES(?,?,?,?,?,?)");   
            st.setString(1, produs.getNume());
            st.setString(2, produs.getDescriere());
            st.setString(3, Integer.toString(produs.getPret()));
            st.setString(4, Integer.toString(produs.getCantitate()));
             st.setString(5, produs.getAnimal());
            st.setString(6, produs.getCategorie());
           
            st.executeUpdate();
                JPanel j=new JPanel();
                JOptionPane.showMessageDialog(j, "Produsul a fost adaugat.","Suces",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conectare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else
        {
            System.out.println("Conexiunea nu este disponibila.");
        }}
 
 

public static String afisProdusFrame(Produs produs)
{   String ss=new String();
    if(produs.getCantitate()==-9999)
        ss="indisponibil";
    else
        ss="disponibil";
    StringBuilder s=new StringBuilder();
        StringBuilder append;
        append = s.append(" ").append(produs.getNume()).append("\n").append(produs.getDescriere()).append("\n    Pret: ").append(Integer.toString(produs.getPret())).append("           ID: ").append(Integer.toString(produs.getId())).append(" \n").append(ss);
   
        return append.toString();
}



}


              
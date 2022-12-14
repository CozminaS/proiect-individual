/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
    private String adresa;
    private String nume;
    private String prenume;
    private String nivelPermisiune;
    
    
    public Utilizator(int metID, String metUtilizator, String metParola, String metEmail, String metNrTelefon, String metAdresa, String metNume,String metPrenume, String metNivelPermisiune )
    {
        this.id=metID;
        this.utilizator=metUtilizator;
        this.parola=metParola;
        this.email=metEmail;
        this.nrTelefon=metNrTelefon;
        this.adresa=metAdresa;
        this.nivelPermisiune=metNivelPermisiune;
        this.nume=metNume;
        this.prenume=metPrenume;
    }
    
    public Utilizator(){
        this.id=0;
        this.utilizator="none";
        this.parola="none";
        this.email="none";
        this.nrTelefon="none";
        this.adresa="none";
        this.nivelPermisiune="none";
        this.nume="none";
        this.prenume="none";
        
    }
    
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
    
    public void setAdresa(String metAdresa){this.adresa=metAdresa;}
    public String getAdresa(){return this.adresa;}
    
    public String getNivelPermisiune(){return this.nivelPermisiune;}
     public void setNivelPermisiune(String per){ this.nivelPermisiune=per;}
    
    public void setNume(String metNume){this.nume=metNume;}
    public String getNume(){return this.nume;}
    
    public void setPrenume(String metPrenume){this.prenume=metPrenume;}
    public String getPrenume(){return this.prenume;}
    
    
    
    
}

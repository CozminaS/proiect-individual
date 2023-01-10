

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */



/**
 *
 * @author Cozmina
 */

/**
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilizatorTest {
    @Test
    public void testSetId() {
        Utilizator u = new Utilizator();
        u.setId(1);
        Assertions.assertEquals(1, u.getId());
    }

    @Test
    public void testSetUtilizator() {
        Utilizator u = new Utilizator();
        u.setUtilizator("utilizator1");
        Assertions.assertEquals("utilizator1", u.getUtilizator());
    }

    @Test
    public void testSetParola() {
        Utilizator u = new Utilizator();
        u.setParola("parola1");
        Assertions.assertEquals("parola1", u.getParola());
    }

    @Test
    public void testSetEmail() {
        Utilizator u = new Utilizator();
        u.setEmail("utilizator1@example.com");
        Assertions.assertEquals("utilizator1@example.com", u.getEmail());
    }

    @Test
    public void testSetNrTelefon() {
        Utilizator u = new Utilizator();
        u.setNrTelefon("1234567890");
        Assertions.assertEquals("1234567890", u.getNrTelefon());
    }

    @Test
    public void testSetAdresa() {
        Utilizator u = new Utilizator();
        u.setAdresa("adresa1");
        Assertions.assertEquals("adresa1", u.getAdresa());
    }

    @Test
    public void testSetNume() {
        Utilizator u = new Utilizator();
        u.setNume("nume1");
        Assertions.assertEquals("nume1", u.getNume());
    }

    @Test
    public void testSetPrenume() {
        Utilizator u = new Utilizator();
        u.setPrenume("prenume1");
        Assertions.assertEquals("prenume1", u.getPrenume());
    }

    @Test
    public void testSetNivelPermisiune() {
        Utilizator u = new Utilizator();
        u.setNivelPermisiune("admin");
        Assertions.assertEquals("admin", u.getNivelPermisiune());
    }
}
**/
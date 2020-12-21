/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juliet
 */
public class TriangoloTest {
    
    public TriangoloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of tipologia method, of class Triangolo.
     */
    @Test
    public void testTipologia() {
        System.out.println("tipologia");
        Triangolo instance =  new Triangolo(4.0,5.0,3.0);
        String expResult = "scaleno, rettangolo";
        String result = instance.tipologia();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of perimetro method, of class Triangolo.
     */
    @Test
    public void testPerimetro() {
        System.out.println("perimetro");
        Triangolo instance = new Triangolo(4.0,5.0,3.0);
        double expResult = 12.0;
        double result = instance.perimetro();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of area method, of class Triangolo.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Triangolo instance = new Triangolo(4.0,5.0,3.0);
        double expResult = 6.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        
    }
    
}

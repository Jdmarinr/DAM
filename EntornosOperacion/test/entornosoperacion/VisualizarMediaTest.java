/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornosoperacion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aritz y Juan David
 */
public class VisualizarMediaTest {
    
    public VisualizarMediaTest() {
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
     * Test of visualizarMedia method, of class VisualizarMedia.
     */
    @Test
    public void testVisualizarMedia() {
        System.out.println("visualizarMedia");
        float x = 4.0F;
        float y = 2.0F;
        VisualizarMedia.visualizarMedia(x, y);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

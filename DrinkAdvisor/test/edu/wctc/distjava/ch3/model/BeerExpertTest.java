package edu.wctc.distjava.ch3.model;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for BeerExpert class.
 * @author  Jim Lombardo
 * @version 1.00
 */
public class BeerExpertTest {
    private BeerExpert expert;
    
    public BeerExpertTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        expert = new BeerExpert();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBrands method, of class BeerExpert, with input 'light'.
     */
    @Test
    public void testGetBrandsLight() {
        List advice = expert.getBrands("light");
        
        String expected = "Miller Lite";
        assertEquals(expected, advice.get(0).toString());
        expected = "Michelob Ultra";
        assertEquals(expected, advice.get(1).toString());
    }
}

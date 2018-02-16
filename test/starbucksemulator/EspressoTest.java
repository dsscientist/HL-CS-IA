/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbucksemulator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shirdav18
 */
public class EspressoTest {
    
    public EspressoTest() {
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
     * Test of setShots method, of class Espresso.
     */
    @Test
    public void testSetShots() {
        System.out.println("setShots");
        int i = 0;
        Espresso instance = null;
        instance.setShots(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDecaf method, of class Espresso.
     */
    @Test
    public void testSetDecaf() {
        System.out.println("setDecaf");
        Espresso instance = null;
        instance.setDecaf();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoast method, of class Espresso.
     */
    @Test
    public void testSetRoast() {
        System.out.println("setRoast");
        Roast r = null;
        Espresso instance = null;
        instance.setRoast(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRistretto method, of class Espresso.
     */
    @Test
    public void testSetRistretto() {
        System.out.println("setRistretto");
        Espresso instance = null;
        instance.setRistretto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShotNum method, of class Espresso.
     */
    @Test
    public void testGetShotNum() {
        System.out.println("getShotNum");
        Espresso instance = null;
        int expResult = 0;
        int result = instance.getShotNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Espresso.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Espresso instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

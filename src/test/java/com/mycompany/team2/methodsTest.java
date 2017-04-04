/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.team2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class methodsTest {
    
    public methodsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Setup");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDown");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addNum method, of class methods.
     */
    @Test
    public void testAddNum() {
        System.out.println("addNum");
        int x = 9;
        int y = 6;
        methods instance = new methods();
        int expResult = 15;
        int result = instance.addNum(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of subNum method, of class methods.
     */
    @Test
    public void testSubNum() {
        System.out.println("subNum");
        int x = 3;
        int y = 2;
        methods instance = new methods();
        int expResult = 1;
        int result = instance.subNum(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of mulNum method, of class methods.
     */
    @Test
    public void testMulNum() {
        System.out.println("mulNum");
        int x = 3;
        int y = 3;
        methods instance = new methods();
        int expResult = 9;
        int result = instance.mulNum(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divNum method, of class methods.
     */
    @Test
    public void testDivNum() {
        System.out.println("divNum");
        int x = 10;
        int y = 2;
        methods instance = new methods();
        int expResult = 5;
        int result = instance.divNum(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retCountry method, of class methods.
     */
   /* @Test
    public void testRetCountry() {
        System.out.println("retCountry");
        int x = 0;
        int y = 0;
        methods instance = new methods();
        int expResult = 0;
        int result = instance.retCountry(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
*/
    /**
     * Test of getCountry method, of class methods.
     */
  /*  @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        methods instance = new methods();
        String expResult = "";
        String result = instance.getCountry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
*/
    
}
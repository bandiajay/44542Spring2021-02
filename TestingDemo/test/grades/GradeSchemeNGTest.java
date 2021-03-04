/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ajay
 */
public class GradeSchemeNGTest {
    
    public GradeSchemeNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("executes before the class");
                
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("executes after the class");
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.out.println("executes before a method");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        System.out.println("executes after a method");
    }

    /**
     * Test of getGrade method, of class GradeScheme.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        int score = 0;
        String expResult = "F";
        String result = GradeScheme.getGrade(score);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isFreezing method, of class GradeScheme.
     */
    @Test
    public void testIsFreezing() {
        System.out.println("isFreezing");
        double temprature = 0.0;
        boolean expResult = true;
        boolean result = GradeScheme.isFreezing(temprature);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

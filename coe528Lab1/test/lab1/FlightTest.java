/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ahnaf
 */
public class FlightTest {

    //Test of constructor of class Flight
    @Test
    public void testConstructor()
    {
        System.out.println("Constructor");
        boolean exceptionCaught = false;
        try{
           Flight f1 = new Flight(4, "Toronto", "New York", "09/03/2019 12:30",450, 500.60);
        }
        catch (Exception ex)
        {
            exceptionCaught = true;
        }
        
        assertFalse(exceptionCaught);
    }
             
       
    @Test
    public void testInvalidConstructor()
    {
        System.out.println("InvalidConstructor");
        try 
        {
            Flight f2 = new Flight(1, "origin", "destination", "time", 4, 4.40);
        }
        catch(Exception ex)
        {
            assertEquals(ex, new IllegalArgumentException());
        }
    }
    
    /**
     * Test of getflightNumber method, of class Flight.
     */
    @Test
    public void testGetflightNumber() {
        System.out.println("getflightNumber");
        Flight instance = null;
        int expResult = 0;
        int result = instance.getflightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setflightNumber method, of class Flight.
     */
    @Test
    public void testSetflightNumber() {
        System.out.println("setflightNumber");
        int fn = 0;
        Flight instance = null;
        instance.setflightNumber(fn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getorigin method, of class Flight.
     */
    @Test
    public void testGetorigin() {
        System.out.println("getorigin");
        Flight instance = null;
        String expResult = "";
        String result = instance.getorigin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setorigin method, of class Flight.
     */
    @Test
    public void testSetorigin() {
        System.out.println("setorigin");
        String og = "";
        Flight instance = null;
        instance.setorigin(og);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdestination method, of class Flight.
     */
    @Test
    public void testGetdestination() {
        System.out.println("getdestination");
        Flight instance = null;
        String expResult = "";
        String result = instance.getdestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdestination method, of class Flight.
     */
    @Test
    public void testSetdestination() {
        System.out.println("setdestination");
        String ds = "";
        Flight instance = null;
        instance.setdestination(ds);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdepartureTime method, of class Flight.
     */
    @Test
    public void testGetdepartureTime() {
        System.out.println("getdepartureTime");
        Flight instance = null;
        String expResult = "";
        String result = instance.getdepartureTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdepartureTime method, of class Flight.
     */
    @Test
    public void testSetdepartureTime() {
        System.out.println("setdepartureTime");
        String dp = "";
        Flight instance = null;
        instance.setdepartureTime(dp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getcapacity method, of class Flight.
     */
    @Test
    public void testGetcapacity() {
        System.out.println("getcapacity");
        Flight instance = null;
        int expResult = 0;
        int result = instance.getcapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setcapacity method, of class Flight.
     */
    @Test
    public void testSetcapacity() {
        System.out.println("setcapacity");
        int c = 0;
        Flight instance = null;
        instance.setcapacity(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getnumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetnumberOfSeatsLeft() {
        System.out.println("getnumberOfSeatsLeft");
        Flight instance = null;
        int expResult = 0;
        int result = instance.getnumberOfSeatsLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setnumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetnumberOfSeatsLeft() {
        System.out.println("setnumberOfSeatsLeft");
        int sl = 0;
        Flight instance = null;
        instance.setnumberOfSeatsLeft(sl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getoriginalPrice method, of class Flight.
     */
    @Test
    public void testGetoriginalPrice() {
        System.out.println("getoriginalPrice");
        Flight instance = null;
        double expResult = 0.0;
        double result = instance.getoriginalPrice();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setoriginalPrice method, of class Flight.
     */
    @Test
    public void testSetoriginalPrice() {
        System.out.println("setoriginalPrice");
        double op = 0.0;
        Flight instance = null;
        instance.setoriginalPrice(op);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = null;
        boolean expResult = false;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

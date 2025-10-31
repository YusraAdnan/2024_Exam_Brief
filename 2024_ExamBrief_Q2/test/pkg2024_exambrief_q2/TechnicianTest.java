/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pkg2024_exambrief_q2;

import org.junit.Test;
import static org.junit.Assert.*;


public class TechnicianTest {
    
    Technician t = new Technician();
    public TechnicianTest() 
    {
    }

    @Test
    public void CalculatePay_PayCalculatedSuccessfully() 
    {
        double result = t.CalculatePay("1500","10");
        assertEquals(150.0, result, 0.001);
    }
    
    @Test
    public void CalculatePay_PayCalculatedUnSuccessfully()
    {
        double notExpected = 700.0; // wrong expected pay
        double actual = t.CalculatePay("1500", "0.5");

        //This assertion is used when the method being tested is returning a value NOT boolean
        assertNotEquals(notExpected, actual, 0.001);
    }
    @Test
     public void ValidationTest_InvalidRepairCost()
     {
        // invalid repair cost (0 should fail validation)
        Data d = new Data("Durban", "Alex", 0, 0.5);
        boolean valid = t.ValidateData(d);

        //Assert false is used as this method was returning boolean
        assertFalse("Validation should fail when repair cost is 0", valid);
    }
    
}

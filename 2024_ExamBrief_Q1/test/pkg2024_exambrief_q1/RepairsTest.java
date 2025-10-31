/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pkg2024_exambrief_q1;

import org.junit.Test;
import static org.junit.Assert.*;


public class RepairsTest 
{
    private final Repairs r = new Repairs();

    public RepairsTest()
    { 
        
    }

    @Test
    public void testRepairCosts()
    {
        double[] joeRepairs = {8000, 2500, 5000};
        
        double result = r.RepairCosts(joeRepairs);
        
        assertEquals(15500, result, 0.001);
    }

    @Test
    public void testTechnicianPay()
    { 
        double totalRepairs = 15500.0;
        
        double result = r.TechnicianPay(totalRepairs);

        assertEquals(1550, result, 0.001);
    }
    

    @Test
    public void testTopTechnician()
    {
        double[] totals = {15500.0, 14800.0};
        int expectedIndex = 0; // Joe Bloggs has higher repairs
        int resultIndex = r.TopTechnician(totals);

        assertEquals(expectedIndex, resultIndex);
    }
    
}

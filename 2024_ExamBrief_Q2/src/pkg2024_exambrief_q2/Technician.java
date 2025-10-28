/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_exambrief_q2;

/**
 *
 * @author yusra
 */
public class Technician implements ITechnician 
{
    // Calculates technician pay as repairCost × rate
    @Override
    public double CalculatePay(String repairCost, String rate)
    {
        double cost = Double.parseDouble(repairCost);
        double r = Double.parseDouble(rate)/100;
        
        double pay = cost * r;
        
        return pay;
    }

    // Validates input data before processing
    @Override
    public boolean ValidateData(Data d) 
    {
        
        if(d.Technician_Name.isEmpty())
        {
            return false;
        }
        if(d.Technician_Name.isEmpty())
        {
            return false;
        }
        if(d.Repair_Cost <=0)
        {
            return false;
        }
        if(d.Technician_Rate <=0)
        {
            return false;
        }
        
        return true;
    } 
    
}

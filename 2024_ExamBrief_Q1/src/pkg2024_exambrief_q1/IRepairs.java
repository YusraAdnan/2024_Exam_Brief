/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pkg2024_exambrief_q1;

/**
 *
 * @author yusra
 */
public interface IRepairs
{
    //Method takes in a 1D array NOT 2D array: Hints that you will need to extract each technicians row from the repairs[][] 2D array you created
    double RepairCosts(double[] repairCosts); 
    
    double TechnicianPay(double amount); 
    
    int TopTechnician(double[] repairs); 
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_exambrief_q2;

/**
 *
 * @author yusra
 */
public interface ITechnician 
{
    double CalculatePay(String repairCost, String rate); 
    boolean ValidateData(Data dataToValidate); 
}

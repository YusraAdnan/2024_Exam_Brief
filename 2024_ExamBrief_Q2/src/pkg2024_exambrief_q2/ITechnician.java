/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_exambrief_q2;


public interface ITechnician 
{
    //The variables here are string, in the implementation in the metho you will have to convert these 
    double CalculatePay(String repairCost, String rate); 
    
    //Have to create a class called Data of which an object will be made 
    boolean ValidateData(Data dataToValidate); 
}

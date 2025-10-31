
package pkg2024_exambrief_q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //Rows
        String[] techs = {"Joe Bloggs", "Jane Doe"};
        //columns
        String[] months = {"January", "February", "March"};
                
        //[Rows][Columns]
        double[][] repairs = new double[techs.length][months.length];
        
        /* example of how the repairs 2D would look like when populated
           repairs [][] = {
            {8000, 2500, 5000}  first row is a 1D array in the 2D array: representing Joe Bloggs vehicle repairs
            {7000, 2200, 5600}  second row is also 1D array in the 2D array: representing Jane Doe vehicle repairs
        }
        */
        Scanner input = new Scanner(System.in);

        //1. Populate the array
        for (int i = 0; i < repairs.length; i++)
        {
         System.out.println("Enter repairs for " + techs[i]);
            for (int j = 0; j < repairs[i].length; j++) 
            {
               System.out.print("  " + months[j] + ": ");
               repairs[i][j] = input.nextDouble();
            }
        }
        
        //2. Print the report 
        System.out.println("TECHNICIAN VEHICLE REPAIR REPORT");
        System.out.println("\t\t\tJAN\tFEB\tMAR");
        System.out.println("------------------------------------------------------");

        //For every technition name we want to print out the cost 
        for(int i = 0; i < techs.length; i++ ) //prints out the row (Name)
        {
            System.out.printf("%-25s", techs[i]);//
            
            for(int j = 0; j < repairs[i].length; j++)//prints out the column value (repair amount)
            {
                System.out.print(repairs[i][j] + "\t");
            }
            System.out.println();
        }            
        System.out.println();
        
        //---- Use the methods in interface to calculate the technician summary -----
        
        //Array that holds the total repair cost for each technician
        double[] totalRepairs = new double[techs.length];
        
       //Array that holds the total comissions earned by each technician 
        double[] comissions = new double[techs.length];

        Repairs r = new Repairs();

        //Calculate the total repair cost for each techncian
        for (int i = 0; i < repairs.length; i++)//2D array .length returns the row (meanining each 1D array inside the 2D array)
        {
            //Repair cost method needs a 1D array, thus you pass it the first row of the 2D array which is repairs[0]
            totalRepairs[i] = r.RepairCosts(repairs[i]);
            
            /* TechnicianPay needs an amount on which it will perform the 10% commision and return the commision 
               Commission needs to be calculated on totalRepairs
               Total Repairs is sitting in the totalRepairs[]
               totalRepairs[i] means at the 0th position of the totalRepairs [] get the value
               and send it to the TechnicianPay method as the amount value
               The method will calculate the commision on that amount and return the commission value
               The commission value will be stored in the 0th position of the comission[] 
               The loop carries on to the next technician */
            
            comissions[i] = r.TechnicianPay(totalRepairs[i]);
            
            //The loop iterates 2 times because of repairs.length )
        }
        
        //The 1D array totalRepairs is now holding the total values per technition
        System.out.println("Total vehicle repairs for Joe Bloggs = R " + totalRepairs[0]);
        System.out.println("Total vehicle repairs for Jane Doe = R " + totalRepairs[1]);
        
        System.out.println(); 
        System.out.println("Repair Commission for Joe Blogss = R" + comissions[0]);
        System.out.println("Repair Commission for Jane Doe = R " + comissions[1]);
        
        System.out.println(); 

        int index_TopTechnician = r.TopTechnician(totalRepairs);
        
        System.out.println("Top performing vehicle technician: " + techs[index_TopTechnician]);

    }
    
}

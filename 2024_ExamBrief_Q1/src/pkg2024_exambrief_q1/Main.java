
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
            
            //TechnicianPay methodm also needs a 1D array, thus you pass it the first row of the 2D array which is repairs[0]
            comissions[i] = r.TechnicianPay(totalRepairs[i]);
            
            //The loop iterateds 2 times because of repairs.length )
        }
        
        //The 1D array totalRepairs is now holding the total values per technition
        System.out.println("Total vehicle repairs for Joe Bloggs = R " + totalRepairs[0]);
        System.out.println("Total vehicle repairs for Jane Doe = R " + totalRepairs[1]);
        
        System.out.println(); 
        System.out.println("Repair Commission for Joe Blogss = R" + comissions[0]);
        System.out.println("Total vehicle repairs for Jane Doe = R " + comissions[1]);
        
        System.out.println(); 

        int index_TopTechnician = r.TopTechnician(totalRepairs);
        
        System.out.println("Top performing vehicle technician: " + techs[index_TopTechnician]);

    }
    
}

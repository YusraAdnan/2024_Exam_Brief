
package pkg2024_exambrief_q1;

/**
 *
 * @author yusra
 */
public class Repairs implements IRepairs
{
    @Override
    public double RepairCosts(double[] repairCosts)
    {
        double totalCost = 0;
        for(double cost: repairCosts)
        {
            totalCost += cost;
        }
        return totalCost;
    }
    
    @Override
    public double TechnicianPay(double amount)
    {
        double pay = 0.10 * amount;
        return pay;
    }
    
    @Override
    public int TopTechnician(double[] repairs)
    {
        int topIndex = 0; 

        for(int i = 0; i < repairs.length; i++)
        {
            if (repairs[i] > repairs[topIndex])
            {
                topIndex = i;
            }
        }
        return topIndex;
    }

    
    
}

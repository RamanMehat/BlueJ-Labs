import java.util.ArrayList;

/**
 * SYSC 2004 Winter 2015 Lab 9
 * 
 * Class Company maintains a collection of employees.
 */
public class Company
{   
    
    private ArrayList<IEmployee> company;
    
    /**
     * Constructor for objects of class Company
     */
    public Company()
    {
        company = new ArrayList<IEmployee>();
    }
    
    /**
     * Determine if the specified employee is in the list of employees.
     * 
     * @return true if e is in the company's list of employees;
     *         otherwise false.
     */
    public boolean lookupEmployee(IEmployee e)
    {
        for (IEmployee x : company){
            if(x.equals(e)){
                return true;
            }
        }
        return false;
    }    
    
    /**
     * Add the specified employee to the this company's list of
     * employees, but only if the employee is not already in
     * the list.
     * 
     * @return true if the employee was added to the list, otherwise return false. 
     */
    public boolean addEmployee(IEmployee e)
    {
        if(this.lookupEmployee(e)){
            return false;
        }
        company.add((Employee) e);
        return true;
    }
    
    /**
     * Calculate the total payroll for a two-week period.
     * 
     * @return the amount paid to all employees every twoo weeks. 
     */
    public double calculatePayroll()
    {
       double total = 0.0;
       for (IEmployee x : company){
            total += x.calculatePay();
       }
       return total;
    }  
}
        

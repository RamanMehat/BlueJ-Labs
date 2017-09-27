 import java.util.ArrayList;

/**
 * SYSC 2004 Winter 2015 Lab 8.
 * 
 * Class Company maintains a collection of employees.
 */
public class Company
{   
    
    private ArrayList<Employee> company;
    
    /**
     * Constructor for objects of class Company
     */
    public Company()
    {
        company = new ArrayList<Employee>();
    }
    
    /**
     * Determine if the specified employee is in the list of employees.
     * 
     * @return true if the employee is in the company's list of employees;
     *         otherwise false.
     */
    public boolean lookupEmployee(Employee e)
    {
        for (Employee x : company){
            if(x.hasSameID(e)){
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
    public boolean addEmployee(Employee e)
    {
        if(this.lookupEmployee(e)){
            return false;
        }
        company.add(e);
        return true;
    }

    /**
     * Calculate the total payroll for a two-week period.
     * 
     * @return the amount paid to all employees every twoo weeks. 
     * SalariedEmployee.calculatePay() + HourlyEmployee.calculatePay();
     */
    public double calculatePayroll()
    {
        double total = 0.0;
        for (Employee x : company){
            total += x.calculatePay();
        }
        return total;
    }
}
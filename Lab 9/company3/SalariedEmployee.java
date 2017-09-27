
/**
 * SYSC 2004 Winter 2015 Lab 9.
 * 
 * Class SalariedEmployee models employees who have an annual salary. 
 */
public class SalariedEmployee extends Employee
{
    private double salary;
    
    public SalariedEmployee(String name,int id)
    {
        super(name,id);
        salary = 0;
    }
    
    public void setAnnualSalary(double salary)
    {
        this.salary = salary;
    }
    
    /**
     * Return a string representation of this employee.
     * 
     * @return a string of the form "name: id"; for example,
     *         "Cathy Coder: 123456"
     */
    public double calculatePay()
    {
        return (this.salary / 26);
    }
}
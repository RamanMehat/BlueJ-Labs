/**
 * SYSC 2004 Winter 2015 Lab 8.
 * 
 * Class Employee is the superclass for classes that 
 * model all types of employees.
 * Raman Mehat 100881045
 */
public abstract class Employee
{   
    
    private String name;
    private int id;
    
    /**
     * Calculate two week's pay for this employee.
     * 
     * @return the amount this employee is paid every two weeks.
     */
    public abstract double calculatePay();
    
    public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }
    
    /**
     * Determines if this employee and employee emp are the same employee, based on their ID.
     * @return true if employee emp has the same ID as this employee; otherwise false.
     */
    public  boolean hasSameID(Employee emp)
    {
        if(emp.id == this.id){
            return true;
        }
        return false;
    }
    
    /**
     * Return a string representation of this employee.
     * 
     * @return a string of the form "name: id"; for example,
     *         "Cathy Coder: 123456"
     */
    public String toString()
    {
        return (name+": "+id);
    }    
}

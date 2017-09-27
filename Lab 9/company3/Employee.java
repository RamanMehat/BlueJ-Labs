
/**
 * SYSC 2004 Winter 2015 Lab 9.
 * 
 * Class Employee is the superclass for classes that 
 * model all types of employees.
 */
public abstract class Employee implements IEmployee
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
    
    public boolean equals(Object obj)
    {
        if (this == obj){
            return true;
        }
        
        if (obj == null){
            return false;
        }        
        
        if (getClass() != obj.getClass()){
            return false;
        }
        
        Employee other = (Employee) obj;
        return (toString().equals(other.toString()));
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
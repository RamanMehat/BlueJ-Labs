/**
 * SYSC 2004 Winter 2015 Lab 9.
 * 
 * Class HourlyEmployee models employees who work a number of bours
 * per week for an hourly wage. 
 */
public class HourlyEmployee extends Employee
{
    private double wage;
    private double hours;
    
    public HourlyEmployee(String name,int id)
    {
        super(name,id);
        wage = 0;
        hours = 0;
    }
    
    public void setHourlyWage(double wage)
    {
        this.wage = wage;
    }
    
    public void setHoursWorked(double hours)
    {
        this.hours = hours;
    }
    
    public double calculatePay()
    {
        return (wage * hours * 2);
    }
}
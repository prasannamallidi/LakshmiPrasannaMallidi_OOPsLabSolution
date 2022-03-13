package oops;

public class Employee
{
    private String firstName;
    private String lastName;
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setFirstName()
    {
        this.firstName = firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setLastName()
    {
        this.lastName = lastName;
    }
    
    public Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
import oops.Employee;
import oops.CredentialService;
import java.util.*;
import java.lang.*;

public class EmailApplication
{
    public static void main(String[] args)
    {
        String company = "Oracle";
        
        System.out.println("Please enter the department from the following");
        System.out.println("1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
        
        Employee emp = new Employee("Lakshmi", "Mallidi");
        CredentialService cs = new CredentialService();
        
        Scanner sc = new Scanner(System.in);
        Integer inputChoice = sc.nextInt();
        
        switch(inputChoice)
        {
            case 1 : {
                        cs.showCredentials((emp.getFirstName()).toLowerCase(), emp.getLastName().toLowerCase(), "tech", company.toLowerCase());
                        break;
                     }
            case 2 : {
                        cs.showCredentials((emp.getFirstName()).toLowerCase(), emp.getLastName().toLowerCase(), "adm", company.toLowerCase());
                        break;
                      }
            case 3 : {
                        cs.showCredentials((emp.getFirstName()).toLowerCase(), emp.getLastName().toLowerCase(), "hr", company.toLowerCase());
                        break;
                     }
            case 4 : {
                        cs.showCredentials((emp.getFirstName()).toLowerCase(), emp.getLastName().toLowerCase(), "lg", company.toLowerCase());
                        break;
                     }
            default : System.out.println("Please enter a valid input");
        }
        
    }
}

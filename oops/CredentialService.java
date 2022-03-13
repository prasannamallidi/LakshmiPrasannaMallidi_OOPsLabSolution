package oops;
import java.util.*;

public class CredentialService
{
    public char[] generatePassword()
    {
        String values = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz" + "!@#$%^&*<>?=+";
        
        Random random = new Random();
        
        char[] pwd = new char[8];
        for (int i = 0; i < 8; i++) 
        {
            pwd[i] =  values.charAt(random.nextInt(values.length()));   
        }
        return pwd;  
    }
    public String generateEmailAddress(String firstName, String lastName, String department, String company)
    {
        String emailGen = firstName + lastName + "@" + department + "." + company + ".com";
        return emailGen;    
    }
    public void showCredentials(String firstName, String lastName, String department, String company)
    {
        System.out.println("Dear " + firstName + " your generated credentials are as follows");
        System.out.println("Email --->" + generateEmailAddress(firstName, lastName, department, company));
        System.out.println("Password --->" + generatePassword());
        
    }
}
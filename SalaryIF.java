/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class SalaryIF {
  
  
  public static void main(String[] args) { 
    double salary;
    
    Scanner s=new Scanner(System.in);
    System.out.println("Please enter salary to know the tax value");
    salary=s.nextDouble();
    
    if (salary<15000)
      System.out.println("No tax with value of "+salary);
    
    if (salary>=15000 && salary<25000)
      System.out.println("Tax with value of "+salary*0.10);
    
    if (salary>25000)
      System.out.println("Taxax with value of "+salary*0.20);
    
  }
  
  /* ADD YOUR CODE HERE */
  
}

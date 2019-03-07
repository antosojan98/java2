/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class SampleQClass {
  
  String name;
  double price;
  double quantity;
  double value;
  double total;
  
  
  public void get_data() { 
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your name:");
    name=scan.nextLine();
    System.out.println("Enter your price:");
    price=scan.nextDouble();
    System.out.println("Enter your quantity:");
    quantity=scan.nextDouble();
    
  }
  public double get_val(double a,double b)
  {
    price=a;
    quantity=b;
    value=a*b;
    
    return (value);
  }
 
  public static void main(String[] args) { 
    SampleQClass qc=new SampleQClass();
    qc.get_data();
    
    double x=qc.get_val(qc.price,qc.quantity);
    System.out.println(x);
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}

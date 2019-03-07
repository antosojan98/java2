/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class SumProg {
  
  public SumProg() { 
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  public int sum(int x){

  int s=0;
  for(int i=0;i<=x;i++)
    s=s+1;
  
  return (s);
  
  
  }
  
  public static void main(String[] args) { 
    int n;
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your number");
    n=scan.nextInt();
    
    
    SumProg p=new SumProg();

    
    System.out.println("Sum is: "+p.sum(n));
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}

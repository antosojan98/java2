/**
 * Auto Generated Java Class.
 */
import java.util.Random;
import java.util.*;
public class RandomNumber {
  
  
  public static void main(String[] args) { 
     Random g=new Random();
     Scanner scan=new Scanner(System.in);
     
     int b;
     System.out.println("Enter your number between 0-9");
     b=scan.nextInt();
  
  int a;
  a=g.nextInt(10);
  if(b==a)
    System.out.println("Success");
  else
  System.out.println("Failure");
    
  }
  
  /* ADD YOUR CODE HERE */
  
}

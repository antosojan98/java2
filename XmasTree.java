/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class XmasTree {
  
  
  public static void main(String[] args) { 
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your value");
    int n=scan.nextInt();
    
    for (int i = 0; i < n; i++) {
         for (int j = 0; j < n-i-1; j++) {
             System.out.print(" ");
         }
         for (int j = 0; j < i*2+1; j++) {
             System.out.print("*");
         }
         System.out.println("");
     }

    
  }
  
  /* ADD YOUR CODE HERE */
  
}

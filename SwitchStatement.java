/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class SwitchStatement {
  
  
  public static void main(String[] args) { 
    int a,b;
    char op;
    String s;
    
    Scanner s1=new Scanner(System.in);
   
    Scanner s3=new Scanner(System.in);
    
    System.out.println("Enter your first integer");
    a=s1.nextInt();
    
    System.out.println("Enter your second integer");
    b=s1.nextInt();
    
    System.out.println("Enter the operator");
    s=s3.nextLine();
    op=s.charAt(0);
    
    switch (op)
    {
      case '+':
      System.out.println(a+b);
      break;
      
      case '-':
      System.out.println(a-b);
      break;
      
      case '/':
      System.out.println(a/b);
      break;
      
      case '*':
      System.out.println(a*b);
      break;
      
      default:
        System.out.println("It cannot be performed");
    }
    
    
  }
  

  
}

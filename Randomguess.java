/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Randomguess {
  
  
  public static void main(String[] args) { 
    int r=new Random().nextInt(11)+1;
    int x;
    int counter=0;
    do{
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter your number, enter 0 to stop");
      x=scan.nextInt();
        
        if(x!=r)
      {
        counter++;
        if(x>r)
        {
          System.out.println("Low");
        }
         if(x<r)
        {
          System.out.println("High");
         }}
          if(x==r)
        {
          x=0;
        }
    }while(x!=0);
    System.out.println("Number of tries "+counter);
        
      }
    }
    
  
  
  /* ADD YOUR CODE HERE */
  


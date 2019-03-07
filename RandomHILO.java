/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class RandomHILO {
  
  public RandomHILO() { 
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  
  public static void main(String[] args) { 
    int ran;
    int guess;
    
    Random generator=new Random();
    ran=generator.nextInt(100);
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your guess number");
    guess=scan.nextInt();
    
    for(int i=0;i<=ran;i++){
    if(ran==guess)
      System.out.println("Correct");
    if(ran>guess)
      System.out.println("Its high");
    if(ran<guess)
      System.out.println("Its low");
     if(ran!=guess)
      System.out.println("Try Again");
    }
    
    System.out.println("Play again");
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}

/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class TicketCalc {
  
  
  public static void main(String[] args) { 
   
    int total=100;
    int ticket;
    int remain=0;
    int count=0;
    for(int i=0;i<20;i++){
       Scanner scan=new Scanner(System.in);
    System.out.println("Enter the no. of ticket you wanna buy");
    ticket=scan.nextInt();
    remain=total-ticket;
    System.out.println("Remaining "+remain);
    count++;
    remain=remain-remain;
    
    }
      System.out.println("Can't buy more than 20 ");
  }
  
  /* ADD YOUR CODE HERE */
  
}

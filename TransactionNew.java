/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class TransactionNew {
  
  
  public static void main(String[] args) { 
    Scanner scan=new Scanner(System.in);
    double cheq,sav;
    //entering the initial amount for chequing and savings
    System.out.println("Enter your initial amount for chequing");
    cheq=scan.nextDouble();
    
    System.out.println("Enter your initial amount for savings");
    sav=scan.nextDouble();
    
    //terminator code for balance below or eqaul to zero
    if(cheq<=0 || sav<=0)
      System.out.println("You can't proceed");
    else{
      System.out.println("Enter transaction type");
      System.out.println("1.Deposit"+"\n"+"2.Withdrawal"+"\n"+"3.Transfer");}
    int x=scan.nextInt();
    
    //if x=1 you enter the deposited amount in either saving or chequing
    if(x==1){
    System.out.println("Enter your amount you want to deposit");
    double d=scan.nextDouble();
      System.out.println("Which account you want to deposit?"+"\n"+"1.Chequing"+"\n"+"2.Saving");
      int x1=scan.nextInt();
      //for entering in chequing
    if(x1==1)
    cheq=cheq+d;
    //for entering in savings
    if(x1==2)
    sav=sav+d;
    System.out.println("New details"+"\n"+"Chequing: "+cheq+"\n"+"Savings: "+sav);}
    
    //if x=2 you withdraw amount in either saving or chequing
    if(x==2){
    System.out.println("Enter your amount you want to withdraw");
    double w=scan.nextDouble();
      System.out.println("Which account you want to withdraw?"+"\n"+"1.Chequing"+"\n"+"2.Saving");
      int x2=scan.nextInt();
      //for entering in chequing
    if(x2==1)
    cheq=cheq-w;
    //for entering in saving
    if(x2==2)
    sav=sav-w;
    System.out.println("New details"+"\n"+"Chequing: "+cheq+"\n"+"Savings: "+sav);}
    
    
    //if x=1 you transact or send amount in either from saving to chequing or chequing to saving
    if(x==3){
    System.out.println("Enter your amount you want to transfer");
    double t=scan.nextDouble();
      System.out.println("Which account you want to transfer from?"+"\n"+"1.Chequing"+"\n"+"2.Saving");
      int x3=scan.nextInt();
      //for entering in chequing
      if(x3==1){
    cheq=cheq-t;
    sav=sav+t;}
    //for entering in chequing
      if(x3==2){
        sav=sav-t;
      cheq=cheq+t;}
    System.out.println("New details"+"\n"+"Chequing: "+cheq+"\n"+"Savings: "+sav);}
      
       
       
      
      
      
  }
  
  /* ADD YOUR CODE HERE */
  
}

/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class TaxiClass1 {
  int Taxi_Year;
  String TaxiBrand;
  double Taxi_Speed;
  double Acc;

public TaxiClass1()
{
}
  public TaxiClass1 (int y,String b)
  {
    Taxi_Year=y;
    TaxiBrand=b;
    Taxi_Speed=0;
    
  }
  public void Read_Data()
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your taxi year");
    Taxi_Year=scan.nextInt();
    
    Scanner scan1=new Scanner(System.in);
    System.out.println("Enter your taxi brand");
    TaxiBrand=scan1.nextLine();
    
    Scanner scan2=new Scanner(System.in);
    System.out.println("Enter your taxi speed");
    Taxi_Speed=scan2.nextInt();
  }
  public double Acc()
  {
    return (Taxi_Speed=Taxi_Speed+5);
  }
  
  public double Brake()
  {
    return(Taxi_Speed=Taxi_Speed-5);
  }
  
  public static void main(String[] args) { 
    TaxiClass1 t=new TaxiClass1(2006,"Honda");
    System.out.println("The make and model is"+);
    t.Read_Data();
    double x= t.Acc();
    System.out.println("Acceleration is "+x);
    double y=t.Brake();
    System.out.println("Braking is "+y);
    

    
  }
  
  /* ADD YOUR CODE HERE */
  
}

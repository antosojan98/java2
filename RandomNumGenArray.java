/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class RandomNumGenArray {
  
  
  public static void main(String[] args) { 
    int num[]=new int[100];
     int n=5,newnum,temp;
     
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your number");
    newnum=scan.nextInt();
    
      for(int i = 0; i < n ; i++)
    {
      for(int j = i + 1;j < n; j++)
      {
        if (num[i] > num[j])
        {
          temp=num[i];
          num[i]=num[j];
          num[j]=temp;
        }
      }
    }
      System.out.println("Numbers");
      for(int i=0;i<n-1;i++)
    {
      System.out.print(num[i]+",");
    }
    System.out.print(num[n-1]);
  }
  
  /* ADD YOUR CODE HERE */
  
}

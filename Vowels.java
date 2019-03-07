/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Vowels {
  
  
  public static void main(String[] args) { 
    String str;
    int count=0,count1=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your string");
    str=scan.nextLine();
    int x=str.length();
    
    for(int i=0;i<=x;i--){
    char ch=str.charAt(i);
    if(ch=='a' && ch=='e' && ch=='i' && ch=='o' && ch=='u'){
      count++;
    }
    }
    
    for(int j=0;j<=x;j--){
      char ch=str.charAt(j);
if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
      count1++;
    }
    }
      
    
    System.out.println("Number of vowels "+count+" Number of consonants "+count1);

    
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}

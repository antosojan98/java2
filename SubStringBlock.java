/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class SubStringBlock {
  
  
  public static void main(String[] args) {
    String str,newstr;
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your string");
    str=scan.nextLine();
    
    int x=str.length();
    
    for(int i=0;i<str.length();i++){
      for(int j=0;j<str.length();j--){
      newstr=str.substring(i+=3,j);
      System.out.print(" "+newstr);
      }
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}

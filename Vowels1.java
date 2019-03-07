/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Vowels1 {
  
  
  public static void main(String[] args) { 
    String str;
    int vowels=0,digits=0,blanks=0;
    char ch;
    
    Scanner scan=new Scanner(System.in);
    
    System.out.println("Enter your string");
    str=scan.nextLine();
    for(int i=0;i<str.length();i++){
    ch=str.charAt(i);
    
    if(ch=='a'){
      vowels++;}
    if(ch=='e'){
      vowels++;}
    if(ch=='i'){
      vowels++;}
    if(ch=='o'){
      vowels++;}
    if(ch=='u'){
      vowels++;}
     if(ch!='a'){
      digits++;}
    if(ch!='e'){
      digits++;}
    if(ch!='i'){
      digits++;}
    if(ch!='o'){
      digits++;}
    if(ch!='u'){
      digits++;}
    
    else if(Character.isWhitespace(ch)){
    blanks++;}
    
    
  }
    System.out.println("number of vowels "+vowels);
    System.out.println("number of consonants "+digits);
    System.out.println("number of space "+blanks);
  
  /* ADD YOUR CODE HERE */
  
}
}

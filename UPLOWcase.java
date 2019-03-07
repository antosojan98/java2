/**
 * Auto Generated Java Class.
 */
public class UPLOWcase {
  
  
  public static void main(String[] args) { 
    // Create a String of character having mixture of 
     // upper-case, lower-case letters, digits and symbols
 // in between just for a test
 String characters = "hH1u2U3b4B5b sS9pPo0Ot^%T";
 
 // we take the length of characters by length()
 int length = characters.length();
 
 // we than loop each character one by one 
 for(int i = 0; i < length; i++) {
    // we store each character in a variable
    // for each loop
    char character = characters.charAt(i);
          
    // checking for each character that its a Upper-case or Lower-case
    // letter or not by calling Character class isUpperCase() method,
    // and isLowerCase() by passing the character. It returns true 
    // if the character passed is lower-case or upper-case and false 
    // if not separately
    if(Character.isUpperCase(character)) {
         System.out.println("Given character : " + characters.charAt(i)
    + " is an Uppercase letter");
    }
    else if(Character.isLowerCase(character)) {
  System.out.println("Given character : " + characters.charAt(i)
    + " is a Lowercase letter");
    }
    else {
  System.out.println("Given character : " + characters.charAt(i)
    + " is neither Uppercase nor Lowercase letter");
    }
       }
    
  }
  
  /* ADD YOUR CODE HERE */
  
}

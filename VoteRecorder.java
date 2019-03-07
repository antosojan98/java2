/**
 * Auto Generated Java Class.
 */
public class VoteRecorder {
  
  public VoteRecorder() { 
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  static String nameCandidatePresident1;
  static String nameCandidatePresident2;
  static String nameCandidateVicePresident1;
  static String nameCandidateVicePresident2;
  
  static int votesCandidatePresident1;
  static int votesCandidatePresident2;
  static int votesCandidateVicePresident1;
  static int votesCandidateVicePresident2;
  
  int myVotesForPresident;
  int myVotesForVicePresident;
  
  static void setCandidatesPresident(String name1, String name2){
    nameCandidatePresident1=name1;
    nameCandidatePresident2=name2;
  }
  
   static void setCandidatesVicePresident(String name1, String name2){
    nameCandidateVicePresident1=name1;
    nameCandidateVicePresident2=name2;
  }
   
   static void resetVotes{
   votesCandidatePresident1=0;
   votesCandidatePresident2=0;
   votesCandidateVicePresident1=0;
   votesCandidateVicePresident2=0;
   
   }
   
   static void getCurrentVotePresident{
   String result=nameCandidatePresident1+nameCandidatePresident2;
   return result;
   }
   static void getCurrentVoteVicePresident{
   String result1=nameCandidateVicePresident1+nameCandidateVicePresident2;
   return result1;
   }
   
   public void getAndConfirmVotes{
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter vote for your president first choice");
   votesCandidatePresident1=scan.nextInt();
   
   System.out.printlnZ("Enter vote for your president second choice");
   
   
   
   }
  
  
  public static void main(String[] args) { 
    
  }
  
  /* ADD YOUR CODE HERE */
  
}

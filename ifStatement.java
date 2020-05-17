/* In this lesson, an 'if statement' is demonstrated in Java;
 a simple logic program is run,
 representing different testscores: A, B, C, D and Fail.public class ifStatement{
 **/
public class ifStatement{
  public static void main(String[] args){

    int testscore  = 96;
    char grade;

    if(testscore >= 90){
      grade = 'A';
    }else if(testscore >= 80){
      grade = 'B';
    }else if(testscore >= 70){
      grade = 'C';
    }else if(testscore >= 60){
      grade = 'D';
    }else{
      grade = 'F';
    }

    System.out.print("Grade = " + grade);
  }
}

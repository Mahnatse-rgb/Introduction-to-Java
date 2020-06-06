/*In this lesson, enabling user input in Java, is demonstrated;
users can be asked to input data,
which is then processed before the output is given.
**/
import java.util.Scanner;
public class userinput{
  public static void main(String[] args){

    //Creare scanner object
    Scanner input = new Scanner(System.in);

    //output
    System.out.print("Enter a floating point value please ");

    //wait for the user to enter something
    double value = input.nextDouble();

    //Tell the user what was entered
    System.out.print("You entered " + value);
  }
}

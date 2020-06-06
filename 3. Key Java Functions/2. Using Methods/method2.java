/*In this lesson, the use of methods is demonstrated in Java. There can be multiple methods within a program;
used to save time performing functions.*/

public class method2{

  public static void main(String[] args){
    for(int x = 0; x < 5 ; x++){
      counter();
    }
  }
  public static void counter(){
    for(int x = 1; x <=5; x++){
      System.out.print(x);
    }
  }
}

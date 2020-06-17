/*In this lesson, the use of methods is demonstrated in Java. There can be multiple methods within a program;
used to save time performing functions.*/

public class method2{
  int x = 0;
  int y = 1;

  public static void main(String[] args){
    for(int i = 0; i < 5 ; i++){
      counter();
    }
  }
  public void counter(){
    for(int i = 1; i <=5; i++){
      System.out.print(x);
    }
  }
}

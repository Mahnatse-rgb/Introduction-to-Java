/* In this lesson, the use of Java arrays is demonstrated;
instead of declaring a single variable, a range of variables can be declared in one array.
*/

public class testarray{
  public static void main(String[] args){

    double[] mylist = {1.2,3.4,5.6,7.6};

    //Print all the array elements
    for(int i = 0; i < mylist.length; i++) {
      System.out.print("\n" + mylist[i] + " ");
    }
    // Summing of all elements
    double total = 0;
    for(int i=0; i < mylist.length; i++){
      total += mylist[i];
    }
    System.out.print("\nThe total is :" + total);
  }
}

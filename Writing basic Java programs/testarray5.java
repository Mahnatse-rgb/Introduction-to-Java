/* In this lesson, Java string arrays are demonstrated.
String arrays allow the user to declare, populate and iterate values and they are frequently used in Java.
**/
public class testarray5{
  public static void main(String[] args){

    //Declare a string array with initial size
    String [] schoolbag = new String(4);

    //add elements to array
    schoolbag[0] = "Books";
    schoolbag[1] = "Pens";
    schoolbag[2] = "Pencil";
    schoolbag[3] = "Notebooks"

    String[] schoolbag2 = ["Sharpner","lunchbox","Diary","laptop"];
    int size = schoolbag2.length;
    System.out.print("The size of the array is " + size);
    for(int i = 0;i < size;i ++){
      Systeem.out.print("\n index["+ i +"] = " + schoolbag2[i]);
    }
  }
}

//creating an object within a class

public class Puppy{
  public Puppy(String name){
    //This constructor has only one paramentter called name
    System.out.println("Passed name is :" + name);
  }
  public static void main(String[] arg){
    //Now we are going to create a object
    new Puppy("tommy");
  }
}

public class arrayofarraysdemo{
  public static void main(String[] args){
    String[][] people ={
      {"Joe", "Zindi", "Len", "Mat"},
      {"Gloria","Tim","Florance"},
      {"Jack", "James","Joesph"},
      {"Zanele","Sanele", "Mpho"}};

    for(int i = 0; i<people.length; i++){
      System.out.print("\n" + people[i][0] + ":");

      for(int j = 0; j < people[i].length; j++){
        System.out.print(people[i][j] + ";");
      }
    }
  }
}

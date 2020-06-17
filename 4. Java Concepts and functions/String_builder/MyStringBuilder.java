class MyStringBuilder{
  public static void main(String args[]){
    //ineffecient method

    String info = " ";

     info += "hi there,";
     info += " ";
     info += "I am an ambitious solutionist. ";

    System.out.println(info);

    //effecient method

    StringBuilder sb = new StringBuilder(" ");

    sb.append("My name is Mahnatse, ");
    sb.append("I am from the Choung clan");

    System.out.println(sb);

  }
}

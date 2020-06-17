class MyStringBuilder1{
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("hello ");

    // adding new String
    sb.append("there!");
    System.out.println(sb);

    //using insert
    sb.insert(1, "-insert-");
    System.out.println(sb);

    //using replace
    sb.replace(1,3,"-replaced-");
    System.out.println(sb);
  }
}

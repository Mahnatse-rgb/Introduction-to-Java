class methodparam{
  public static void main(String[] args) {
    int a = 13;
    int b = 5;
    int c = minfunction(a,b);

    System.out.println("Minimum value is " + c);
  }
// method to return min value

public static int minfunction(int n1, int n2){

  int min;
  if(n1>n2)
    min = n2;
  else
    min = n1;

  return min;
}
}

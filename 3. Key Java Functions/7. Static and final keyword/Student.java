class Student{
  int rollno;
  String name;
  static String college = "UCT";

Student(int r, String n){
  rollno = r;
  name = n;
}
void display(){System.out.println(rollno +" "+ name+" "+ college);}

public static void main(String[] args) {
  Student s1 = new Student(489, "Rick");
  Student s2 = new Student(126, "Joe");

  s1.display();
  s2.display();
}
}

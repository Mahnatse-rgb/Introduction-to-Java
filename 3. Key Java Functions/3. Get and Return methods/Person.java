/* In this lesson, the Get and Return method in Java is demonstrated; variables are created to calculate years left to retirement,
 based on a person's age.*/

class Person{

   String name;
   int age;

   // void speak(){
   //   System.out.println("My name is " + name);
   }

   int calculateRetirementYears(){
     int yearsLeft = 65 - age;

     return yearsLeft;
   }

   int getAge(){
     return age;
   }

   String getName(){
     return name;
   }
 }

public class getter {
   public static void main(String[] args){
     Person person1 = new Person();

     person1.name = "Peter";
     person1.age = 30;

     int years = person1.calculateRetirementYears();
     System.out.println("Years till retirement " + years);

     int age = person1.getAge();
     String name = person1.getName();

     System.out.println("My name is " + name );
     System.out.println("My age is " + age);
   }
 }

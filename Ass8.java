import java.util.Scanner;

class Ass8{
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Input first number: ");
    int a1 = sc.nextInt();

    System.out.println("Input second number: ");
    int a2 = sc.nextInt();

    System.out.println("Before swapping: ");
    System.out.println("First Number: " + a1);
    System.out.println("Second Number: " + a2);

   a1 = a1 + a2;
   a2 = a1 - a2;
   a1 = a1 - a2;

    System.out.println("After swapping: ");
    System.out.println("First Number: " + a1);
    System.out.println("Second Number: " + a2);


}
}
/*
C:\Users\Admin\OneDrive\Desktop\CDAC\Logic building\Day1>javac Ass8.java

C:\Users\Admin\OneDrive\Desktop\CDAC\Logic building\Day1>java Ass8
Input first number:
10
Input second number:
20
Before swapping:
First Number: 10
Second Number: 20
After swapping:
First Number: 20
Second Number: 10

  */  




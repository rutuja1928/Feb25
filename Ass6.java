/*
Write a Java program to print the sum, multiplication, subtraction, division, and remainder of
two numbers.
Test Data:
 Input first number: 125
 Input second number: 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5

*/
import java.util.Scanner;

class Ass6{
   public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Input first number:");
    int num1 = sc.nextInt();

    System.out.println("Input second number:");
    int num2 = sc.nextInt();

    int add = num1 + num2;
    int sub = num1 - num2;
    int mul = num1 * num2;
    int div = num1 / num2;
    int mod = num1 % num2;

    System.out.println("OUTPUT:");
    System.out.println(num1 + " + " + num2 + " = " + add);
    System.out.println(num1 + " - " + num2 + " = " + sub);
    System.out.println(num1 + " * " + num2 + " = " + mul);
    System.out.println(num1 + " / " + num2 + " = " + div);
    System.out.println(num1 + " % " + num2 + " = " + mod);

 }
}

/*
C:\Users\Admin\OneDrive\Desktop\CDAC\Logic building\Day1>javac Ass6.java

C:\Users\Admin\OneDrive\Desktop\CDAC\Logic building\Day1>java Ass6
Input first number:
125
Input second number:
24
OUTPUT:
125 + 24 = 149
125 - 24 = 101
125 * 24 = 3000
125 / 24 = 5
125 % 24 = 5

*/
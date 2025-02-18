import java.util.Scanner;

class Ass7{
  public static void main(String args[]){

  Scanner sc = new Scanner(System.in);

  System.out.println("Input a number:");
  int n = sc.nextInt();

  for(int i = 1; i <= 10 ; i++){

   System.out.println(n + " * " + i + " = " + (n * i));
 }
}
}
/*
C:\Users\Admin\OneDrive\Desktop\CDAC\Logic building\Day1>javac Ass7.java

C:\Users\Admin\OneDrive\Desktop\CDAC\Logic building\Day1>java Ass7
Input a number:
8
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
8 * 4 = 32
8 * 5 = 40
8 * 6 = 48
8 * 7 = 56
8 * 8 = 64
8 * 9 = 72
8 * 10 = 80
 */
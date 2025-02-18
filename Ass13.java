import java.util.Scanner;

class Ass13{
   public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number:");
        double num1 = sc.nextDouble();

        System.out.println("Input second number:");
        double num2 = sc.nextDouble();

        System.out.println("Input third number:");
        double num3 = sc.nextDouble();

        double avg = (num1 + num2 + num3)/3;

        System.out.println("The average is :" + avg);
   }
}
/*
C:\Users\Admin\OneDrive\Desktop\CDAC\Logic building\Day1>javac Ass13.java

C:\Users\Admin\OneDrive\Desktop\CDAC\Logic building\Day1>java Ass13
Input first number:
20
Input second number:
40
Input third number:
60
The average is :40.0

*/
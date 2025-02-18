import java.util.Scanner;

class Ass11{
   public static void main(String args[]){

       Scanner sc = new Scanner(System.in);

       System.out.println("Input first number:");
       int num1 = sc.nextInt();

       System.out.println("Input second number:");
       int num2 = sc.nextInt();

       System.out.println("Input third number:");
       int num3 = sc.nextInt();

       if(num1 > num2 && num1 > num3)
            {
                System.out.println("The largest number is " + num1 +" .");
}

       else if(num2 > num1 && num2 > num3)
            {
                System.out.println("The largest number is " + num2 +" .");
}

       else
          {
              System.out.println("The largest number is " + num3 +" .");
}
}
}

/*
C:\Users\Admin\OneDrive\Desktop\CDAC\Logic building\Day1>javac Ass11.java

C:\Users\Admin\OneDrive\Desktop\CDAC\Logic building\Day1>java Ass11
Input first number:
12
Input second number:
45
Input third number:
22
The largest number is 45 .

*/


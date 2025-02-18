import java.util.Scanner;

class Ass9{
   public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Input a radius:");
    double radius = sc.nextDouble();
  
    double area = 3.14 * radius * radius;

    System.out.println("Area of circle:" + area);
  }
}

/*
C:\Users\Admin\OneDrive\Desktop\CDAC\Logic building\Day1>javac Ass9.java

C:\Users\Admin\OneDrive\Desktop\CDAC\Logic building\Day1>java Ass9
Input a radius:
7
Area of circle:153.86

*/
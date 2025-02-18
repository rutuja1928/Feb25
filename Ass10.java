import java.util.Scanner;

class Ass10{
  public static void main(String args[]){

  Scanner sc = new Scanner(System.in);

  System.out.println("Input a number:");
  int n = sc.nextInt();

  if(n%2==0){
     System.out.println("The number " + n + " is even");
}
else
 {
    System.out.println("The number " + n + " is odd");
 }
}
}
/*
C:\Users\Admin\OneDrive\Desktop\CDAC\Logic building\Day1>javac Ass10.java

C:\Users\Admin\OneDrive\Desktop\CDAC\Logic building\Day1>java Ass10
Input a number:
15
The number 15 is odd
*/

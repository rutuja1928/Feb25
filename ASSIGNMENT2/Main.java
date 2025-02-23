/*

public class Main {
 public static void main(String[] args) {
 int value = 2;
 switch(value) {
 case 1:
 System.out.println("Value is 1");
 case 2:
 System.out.println("Value is 2");
 case 3:
 System.out.println("Value is 3");
 default:
 System.out.println("Default case");
 }
 }
} 

the default case print after "Value is 2 because of the there is no break statement used
after excuting case 2 it continue execute case 3 and default case

you can prevent the program from executing the default case use break statement after each case
*/

public class Main {
 public static void main(String[] args) {
 int value = 2;
 switch(value) {
 case 1:
 System.out.println("Value is 1");
 break;
 case 2:
 System.out.println("Value is 2");
 break;
 case 3:
 System.out.println("Value is 3");
 break;
 default:
 System.out.println("Default case");
 }
 }
}




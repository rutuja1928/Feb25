public class IncorrectWhileCondition {
 public static void main(String[] args) {
 int count = 5;
 while (count = 0) {
 System.out.println(count);
 count--;
 }
 }
} 

/*

count = 0 is assignment statement
the assignement operator = sets count to 0 
assignment return the ssigned value ,while(count = 0) means loop condation always false and loop would never execute.

*/


public class IncorrectWhileCondition {
 public static void main(String[] args) {
 int count = 5;
 while (count > 0) {
 System.out.println(count);
 count--;
 }
 }
} 

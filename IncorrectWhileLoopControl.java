public class IncorrectWhileLoopControl {
 public static void main(String[] args) {
 int num = 10;
 while (num = 10) {
 System.out.println(num);
 num--;
 }
 }
} 

/*

The condition inside while (num = 10) uses = (assignment)  of == comparison
in java = is an assignment operator the assign a value as 10 ,
it not a boolean condition
while accept boolean condition so its compilation error

*/

public class IncorrectWhileLoopControl {
 public static void main(String[] args) {
 int num = 10;
 while (num == 10) {
 System.out.println(num);
 num--;
 }
 }
} 


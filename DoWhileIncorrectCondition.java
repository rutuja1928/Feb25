public class DoWhileIncorrectCondition {
 public static void main(String[] args) {
 int num = 0;
 do {
 System.out.println(num);
 num++;
 } while (num > 0);
 }
}

/*

A do-while loop always executes at least once , beacuse the condition is checked after the loop 
num start with 0 , so the first iteration print 0 and increment 0 and num increment 1
after the first iteration num is 1 , so the condition num > 0 is true and loop is again executes
num increasing every loop , so its a infinite loop , not just single exucution.

*/

public class DoWhileIncorrectCondition {
 public static void main(String[] args) {
 int num = 0;
 do {
 System.out.println(num);
 num++;
 } while (num < 0);
 }
}

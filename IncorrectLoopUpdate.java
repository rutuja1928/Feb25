public class IncorrectLoopUpdate {
 public static void main(String[] args) {
 int i = 0;
 while (i < 5) {
 System.out.println(i);
 i += 2; // Error: This may cause unexpected results in output
 }
 }
} 

/*

Initialization: i = 0
Condition: while (i < 5) → The loop runs as long as i is less than 5.
Update Step: i += 2 → Increments i by 2 in each iteration.

*/

public class IncorrectLoopUpdate {
 public static void main(String[] args) {
 int i = 0;
 while (i < 5) {
 System.out.println(i);
 i++; }
 }
} 

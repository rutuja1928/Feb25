public class WrongInitializationForLoop {
 public static void main(String[] args) {
 for (int i = 10; i >= 0; i++) {
 System.out.println(i);
 }
 }
} 

/*
Initialization (int i = 10;) → Starts from 10
Condition (i >= 0) → Runs as long as i is greater than or equal to 0
Update (i++) → Increases i by 1 in each iteration 

The loop starts at i = 10.
The update step (i++) increases i of decreasing.
The condition i >= 0 is always true as i keeps increasing (11, 12, 13,...).
This results in an infinite loop.

*/

public class WrongInitializationForLoop {
 public static void main(String[] args) {
 for (int i = 10; i >= 0; i--) {
 System.out.println(i);
 }
 }
} 

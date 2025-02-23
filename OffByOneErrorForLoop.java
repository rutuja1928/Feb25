public class OffByOneErrorForLoop {
 public static void main(String[] args) {
 for (int i = 1; i <= 10; i++) {
 System.out.println(i);
 }
 // Expected: 10 iterations with numbers 1 to 10
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
 }
} 
/*
The loop starts at 1 and runs while i <= 10, meaning it prints numbers from 1 to 10.
the expectation is to print only 1 to 9, meaning the loop runs one extra time.

The loop starts at i = 1.
It runs while i < 10 so its stop before 10.
The numbers printed will be 1, 2, 3, 4, 5, 6, 7, 8, 9.

*/

public class OffByOneErrorForLoop {
 public static void main(String[] args) {
 for (int i = 1; i < 10; i++) {
 System.out.println(i);
 }
  }
} 
public class LoopVariableScope {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++) {
 int x = i * 2;
 }
 System.out.println(x); // Error: 'x' is not accessible here
 }
} 

/*

Variable x is declared inside the for loop block.
Scope of x is limited to inside the loop, meaning x exists only within {}.
After the loop ends, x no exists, so System.out.println(x); cannot access it.

*/

public class LoopVariableScope {
 public static void main(String[] args) {
 int x=0;
 for (int i = 0; i < 5; i++) {
 x = i * 2;
 }
 System.out.println(x); // Error: 'x' is not accessible here
 }
} 


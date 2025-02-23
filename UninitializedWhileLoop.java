public class UninitializedWhileLoop {
 public static void main(String[] args) {
 int count;
 while (count < 10) {
 System.out.println(count);
 count++;
 }
 }
} 

/*

count is declared but not initialized before using the while loop condition
in java local variable must be initialized before they are used
count has not assigned value , the compiler does not know count value

*/

public class UninitializedWhileLoop {
 public static void main(String[] args) {
 int count = 0;
 while (count < 10) {
 System.out.println(count);
 count++;
 }
 }
} 
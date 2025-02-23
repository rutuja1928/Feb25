public class OffByOneDoWhileLoop {
 public static void main(String[] args) {
 int num = 1;
 do {
 System.out.println(num);
 num--;
 } while (num > 0);
 }
}

/*

the variable num is initialized to 1
the do-while loop executes at least once , printing 1 
the next step decrement num-- is num = 0 after the first iteration
the condition is while(num>0), is false so loop stop

*/

public class OffByOneDoWhileLoop {
 public static void main(String[] args) {
 int num = 1;
 do {
 System.out.println(num);
 num++;
 } while (num >= 5);
 }
}

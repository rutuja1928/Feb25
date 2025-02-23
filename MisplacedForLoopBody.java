public class MisplacedForLoopBody {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++)
 System.out.println(i);
 System.out.println("Done");
 } 
}

/*
The for-loop syntax in Java only considers the first statement after it as part of the loop if no curly braces {} are used.
Here, System.out.println(i); is the only statement inside the loop.
The next line, System.out.println("Done");, is not part of the loop, so it executes only once, after the loop has finished.

*/

public class MisplacedForLoopBody {
 public static void main(String[] args) {
   for (int i = 0; i < 5; i++) {
     System.out.println(i);
     System.out.println("Done"); // Now inside the loop
   }
 }
}
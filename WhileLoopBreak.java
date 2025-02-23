public class WhileLoopBreak {
 public static void main(String[] args) {
 int count = 0;
 while (count < 5) {
 System.out.print(count + " ");
 count++;
 if (count == 3) break;
 }
 System.out.println(count);
 }
} 

/*

count=0

iteration 1 

   count<5 true

   print 0
   
   count++ -> 1

   count==3   false

iteration 2 

   count<5 true

   print 1
   
   count++ -> 2

   count==3   false

iteration 3

   count<5 true

   print 2
   
   count++ -> 3

   count==3   true

   count ==3 so break the statement

     print 0 1 2 3

*/








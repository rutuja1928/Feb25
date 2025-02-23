public class DecrementingLoop {
 public static void main(String[] args) {
 int total = 0;
 for (int i = 5; i > 0; i--) {
 total += i;
 if (i == 3) continue;
 total -= 1;
 }
 System.out.println(total);
 }
} 

/*
 i            total             
 5(f)         0+5=5
 4(f)         5+4=9              
 3(t)         9+3=12


     total= total-1
          = 12-1
          = 11

output: 11

*/

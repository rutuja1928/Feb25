public class LoopIncrement {
 public static void main(String[] args) {
 int count = 0;
 for (int i = 0; i < 4; i++) {
 count += i++ - ++i;
 }
 System.out.println(count);
 } 
}

/*

count    I     i++       ++I        count=count + i++ - ++I

0        0      0 (1)     2              0+0-2=-2

-2       2      2 (3)     4              -2+2-4=4

-4       4(f)

output 4


*/

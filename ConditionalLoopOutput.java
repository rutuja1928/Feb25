public class ConditionalLoopOutput {
 public static void main(String[] args) {
 int num = 1;
 for (int i = 1; i <= 4; i++) {
 if (i % 2 == 0) {
 num += i;
 } else {
 num -= i;
 }
 }
 System.out.println(num);
 }
} 

/*

  false  num-i
  true   num +i

i     num      condition       oper       update num

1      1          false          0            0

2      0          true           2            2

3      2          false          -1           -1

4      -1         true           3             3

*/


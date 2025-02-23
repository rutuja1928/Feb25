public class DoWhileLoop {
 public static void main(String[] args) {
 int i = 1;
 do {
 System.out.print(i + " ");
 i++;
 } while (i < 5);
 System.out.println(i);
 }
}

/*

i    print     incr i      condi      upda i

1      1         2           t           2

2      2         3           t           3

3      3         4           t           4

4      4         5           f           5

5      5

*/



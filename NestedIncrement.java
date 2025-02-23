public class NestedIncrement {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = ++a * b-- - --a + b++;
 System.out.println(result);
 }
}

/*
a = 10                      b = 5

++a  11                     b--  5  post 4
--a  10                     b++  4  post 5

      ++a * b-- - --a + b++
        
       11 * 5 - 10 + 4
        55-10+4
        45+4
         49

*/

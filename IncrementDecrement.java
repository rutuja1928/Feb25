public class IncrementDecrement {
 public static void main(String[] args) {
 int x = 5;
 int y = ++x - x-- + --x + x++;
 System.out.println(y);
 }
} 

/*
x = 5

++x     6

x--     6      post 5

--x     4 

x++     4      post 5

  6-6+4+4= 8

*/
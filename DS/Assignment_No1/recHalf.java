3. Dry run for n = 20. How many recursive calls? What values are printed?
void recHalf(int n) {
 if (n <= 0) return;
 System.out.print(n + " ");
 recHalf(n / 2);
}

Output:
  n          print
  20          20   
  10          10
  5            5
  2            2
  
  4 recursive call
  print 20,10,5,2
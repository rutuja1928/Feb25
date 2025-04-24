4. Dry run for n = 3. How many total calls are made? What’s the time complexity?
void fun(int n) {
 if (n == 0) return;
 fun(n - 1);
 fun(n - 1);
}

 1	fun(3)	Calls fun(2), fun(2)
 2	fun(2)	Calls fun(1), fun(1)
 3	fun(1)	Calls fun(0), fun(0) (stops here)
 4	fun(1)	Calls fun(0), fun(0) (stops here)
 5	fun(2)	Calls fun(1), fun(1)
 6	fun(1)	Calls fun(0), fun(0) (stops here)
 7	fun(1)	Calls fun(0), fun(0) (stops here)
 
     3:7
	 
	Time Complexity: O(2^n)
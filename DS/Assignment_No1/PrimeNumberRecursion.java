import java.util.Scanner;
class PrimeNumberRecursion{
     static boolean isPrimeRecursive(int num,int divisior){
		if(divisior==1){
		    return true;
			}
		if(num%divisior==0){
		    return false;
			}
		return isPrimeRecursive(num,divisior-1);
	 }
	static boolean isPrime(int num) {
    if (num <= 1) {
        return false; 
    }
    return isPrimeRecursive(num, num - 1); 
}
	 
      public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  int num=sc.nextInt();
	  
	  if (isPrime(num)) {
	      System.out.println(num + " is a prime number.");
        } 
	  else{
          System.out.println(num + " is not a prime number.");
        }
  }
}
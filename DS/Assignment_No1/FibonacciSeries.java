import java.util.*;
class FibonacciSeries{
      static int fibonacciSeries(int n,int[] index){
	     if(n<=1){
		 return 1;
		 }
		 if(index[n]!=0){
			 return index[n];
		 } 
		 else{
		   return index[n]=fibonacciSeries(n-1,index)+fibonacciSeries(n-2,index);
		   
		 }
	  }
		
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);{
	  System.out.println("Enter a number: ");
	  int n=sc.nextInt();
	  int[] index = new int[n + 1];
	  
	  System.out.println("Fibonacci Series:");
	  for(int i=0;i<n;i++)
	  {
	  System.out.print(fibonacciSeries(i,index)+" ");
	  }
	}
   }
}
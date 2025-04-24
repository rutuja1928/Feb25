import java.util.*;
class SumOfDigit{
        static int sumOfDigit(int n){
		 if(n==0){
		    return 0;
			}
		  else{
		     return n%10 + sumOfDigit(n/10);
			 }
		}
     public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number: ");
			int number=sc.nextInt();
			System.out.println("Sum of "+number+":"+sumOfDigit(number));
			}
	}
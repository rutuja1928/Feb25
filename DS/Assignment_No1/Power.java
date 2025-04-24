import java.util.*;
class Power{
     static int powerOf(int a,int b){
	 if(b==0){
	   return 1;
	   }
	 else {
	 return a*powerOf(a,b-1);
	 }
}
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter A: ");
	   int a=sc.nextInt();
	   
	   System.out.println("Enter B: ");
	   int b=sc.nextInt();
	   
	   System.out.println(powerOf(a,b));
	   }
}
import java.util.Scanner;
class Palindrome1{
     static boolean isPalindrome(String str,int left,int right){
	    if(left>=right){
		return true;
		}
		if(str.charAt(left)!=str.charAt(right)){
		  return false;
		  }
		return isPalindrome(str,left+1,right-1);
	}
	 
    public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  String str=sc.next();
	  
	  System.out.println(isPalindrome(str,0,str.length()-1));
	  }
}
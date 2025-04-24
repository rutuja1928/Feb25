import java.util.*;
class SecondLarge{
     static int secondlarge(int[] arr){
	    Arrays.sort(arr);
		
		for(int i=arr.length-2;i>=0;i--){
		   if(arr[i]!=arr[arr.length-1]){
		      return arr[i];
			  }
		}
		return -1;
	}
	
	static void movezerotoEnd(int[] arr){
		 int count=0;
		 
	for(int i=0;i<arr.length;i++){
		if(arr[i]!=0){
			arr[count++]=arr[i];
		}
	}
	while(count<arr.length){
		arr[count++]=0;
	}
}
	
	   
    public static void main(String[] args){
	int arr[]={10, 0, 5, 20, 0, 8, 15};
	System.out.println("Second large: "+secondlarge(arr));
	movezerotoEnd(arr);
		for(int n:arr){
			System.out.print(n+" "); 
		}
	}
}
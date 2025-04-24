class Problem3{
    static int findElement(int[] arr,int key){
	int low=0;
	int high=arr.length-1;
	while(low<=high){
	int mid=low+(high-low)/2;
	
	if(arr[mid]==key){
	     return mid;
		 }
	if(arr[mid]>key){
	   high=mid-1;
	   }
	if(arr[mid]<key){
	   low=mid+1;
	  }
	}
	return -1;
}

static int findFirstOccurrence(int[] arr,int key){
	int low=0;
	int high=arr.length-1;
	int result = -1;
	while(low<=high){
	int mid=low+(high-low)/2;
	
	if(arr[mid]==key){
	     result= mid;
		 high=mid-1;
		 }
	if(arr[mid]>key){
	   high=mid-1;
	   }
	if(arr[mid]<key){
	   low=mid+1;
	  }
	}
	return result;
}

static int findLastOccurrence(int[] arr,int key){
	int low=0;
	int high=arr.length-1;
	int result = -1;
	while(low<=high){
	int mid=low+(high-low)/2;
	
	if(arr[mid]==key){
	     result= mid;
		 low=mid+1;
		 }
	if(arr[mid]>key){
	   high=mid-1;
	   }
	if(arr[mid]<key){
	   low=mid+1;
	  }
	}
	return result;
}

      static int countOfKey(int[] arr,int key){
		  if(findFirstOccurrence(arr,key)==-1){
			  return 0;
		  }
		  return findLastOccurrence(arr,key)-findFirstOccurrence(arr,key)+1;
	  }
	
    public static void main(String[] args){
	   int arr[]={1, 3, 3, 3, 5, 6, 8};
	   int key=3;
	   
	   System.out.println("Key Element: "+findElement(arr,key));
	   System.out.println("First occurance: "+findFirstOccurrence(arr, key));
	   System.out.println("Last occurance: "+findLastOccurrence(arr, key));
	   System.out.println("Count key: "+countOfKey(arr,key));
	   }
}
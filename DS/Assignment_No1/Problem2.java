import java.util.*;
class Problem2{
     static boolean isAnagrams(String str1,String str2){
	   char[] arr1=str1.toCharArray();
	   char[] arr2=str2.toCharArray();
	   
	   Arrays.sort(arr1);
	   Arrays.sort(arr2);
	   
	   return Arrays.equals(arr1,arr2);
	   }
	 static String longestWord(String sentence){
        String[] words=sentence.split(" ");
        String longest="";

        for(String word:words){
           if(word.length()>longest.length()){
             longest=word;
		   }
		}
       return longest;
	 }	
     static int[] countVowelsAndConsonants(String sentence){
		 int vowels=0;
		 int consonants=0;
        sentence=sentence.toLowerCase().trim();

        for(int i=0;i<sentence.length();i++){
             char ch=sentence.charAt(i);
           if (Character.isLetter(ch)) {
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
               ++vowels;
		   }
		   else{
			   consonants++;
		   }
		}
	}
	 return new int[]{vowels, consonants};
}
	   
    public static void main(String[] args){
	 String str1="listen";
	 String str2="silent";
	 
	 System.out.println("Is Anagrams: "+isAnagrams(str1,str2));
	 
	 String sentence="Practice makes a man perfect";
	 System.out.println("Longest word: "+longestWord(sentence));

      int[] counts = countVowelsAndConsonants(sentence);
        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);
	 }
}
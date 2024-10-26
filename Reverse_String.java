package leetcode_String;

public class Reverse_String {
//	Input: s = ["h","e","l","l","o"]
//	Output: ["o","l","l","e","h"]
//	You must do this by modifying the input array in-place with O(1) extra memory.
	public static void main(String[] args) {
		String s1 = "Shubham Nikam is now looking out for job";
//		char[] s = {'h','e','l','l','o'};
		char[] s = s1.toCharArray();
		System.out.println(s);
		char[] ans = reverseString(s);
		System.out.println(ans);
	}
	
	 public static char[] reverseString(char[] s) {
	        int len = s.length;
	        char temp;
	        int end=s.length-1;
	        int start=0;
	        while(start<end) {
	        	//swap here 
	        	//h e l l o   len = 5/2=2
	        	
	        	temp = s[end];
	        	s[end] = s[start];
	        	s[start] = temp;
	        	
	        	start++;
	        	end--;
	        	
	        }
	        
//	        System.out.println(s);
	        return s;
	 }

}

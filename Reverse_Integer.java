package leetcode_String;

public class Reverse_Integer {
//eg. 1 - Input: x = 123, Output: 321	
//eg. 2 - Input: x = -123, Output: -321
//eg. 3 - Input: x = 120, Output: 21
	public static void main(String[] args) {
		int x = -123;
		int ans = reverse(x);
		System.out.println(ans);
		
	}
	
	public static int reverse(int x) {
//		int rev = 0;
//		while(x>0) {
//	        	int pop = x%10;
//	        	x/=10;
//	        	 if (
//	                     rev > Integer.MAX_VALUE / 10 ||
//	                     (rev == Integer.MAX_VALUE / 10 && pop > 7)
//	                 ) return 0;
//	                 if (
//	                     rev < Integer.MIN_VALUE / 10 ||
//	                     (rev == Integer.MIN_VALUE / 10 && pop < -8)
//	                 ) return 0;
//	        	rev = rev * 10 + pop;
//		}
//	    return rev;
		System.out.println(Math.abs(x));
		String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
	    System.out.println(reversed); 
		try {
	         return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
	     } catch (NumberFormatException e) {
	         return 0;
	     }
	}
	
//	Another solution
//	 String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
//     try {
//         return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
//     } catch (NumberFormatException e) {
//         return 0;
//     }

}

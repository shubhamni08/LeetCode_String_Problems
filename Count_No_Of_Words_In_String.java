package leetcode_String;

public class Count_No_Of_Words_In_String {

	public static void main(String[] args) {
		String s = "Shubham Nikam is looking for a job";
		
		String[] s1 = s.split(" ");
		int count = 0;
		for(String x:s1) {
			System.out.println(x);
			count++;
		}

		System.out.println(count);
	}

}

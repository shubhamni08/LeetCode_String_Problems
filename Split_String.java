package leetcode_String;

public class Split_String {

	public static void main(String[] args) {
		String s = "Java,Python,SQL,TestNG,   Maven   ";

		split(s);

	}

	private static void split(String s) {
		
		String[] s1 = s.split(",");
		
		for(String x:s1) {
//			x=x.replaceAll("\\s", "");
			x=x.trim();
			System.out.print(x+" ");
		}
	}
}

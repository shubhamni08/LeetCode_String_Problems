package leetcode_String;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args)  {
		FileWriter fw = null;
		try {
			fw = new FileWriter("abc.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(fw.toString());
	}

}

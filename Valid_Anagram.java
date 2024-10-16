package leetcode_String;

import java.util.HashMap;
public class Valid_Anagram {

	public static void main(String[] args) {
		String s = "level";
		String t = "velel";
		System.out.println(isAnagram(s, t));
	}
	
	public static boolean isAnagram(String s, String t) {
		s = s.toLowerCase();
		t = t.toLowerCase();
		if(s.length()!=t.length())
			return false;
		
	 HashMap<Character, Integer> hm1 = new HashMap<>();
	 HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i=0;i<s.length();i++) {
        	if(hm1.containsKey(s.charAt(i))) {
        		//if key already present then value++
        		int val = hm1.get(s.charAt(i));
        		val++;
        		hm1.put(s.charAt(i), val);
        	}else {
        		//first time add then value = 1
        		hm1.put(s.charAt(i), 1);       	
        	}
        }
        for(int i=0;i<t.length();i++) {
        	if(hm2.containsKey(t.charAt(i))) {
        		//if key already present then value++
        		int val = hm2.get(t.charAt(i));
        		val++;
        		hm2.put(t.charAt(i), val);
        	}else {
        		//first time add then value = 1
        		hm2.put(t.charAt(i), 1);       	
        	}
        }
        
        System.out.println(hm1);
        System.out.println(hm2);
	    
	   return hm1.equals(hm2);
    }

}

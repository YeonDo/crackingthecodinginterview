package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class pro1_2 {
	public static Boolean CkPermu(String arg0, String arg1) {
		if (arg0.length()==arg1.length()) {
			ArrayList<Character> ar_word1 = new ArrayList<>();
			ArrayList<Character> ar_word2 = new ArrayList<>();
			for(int i=0;i<arg0.length();i++) {
				ar_word1.add(arg0.charAt(i));
				ar_word2.add(arg1.charAt(i));
			}
			Collections.sort(ar_word1);
			Collections.sort(ar_word2);
			if (ar_word1.equals(ar_word2)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CkPermu("wo rKdd", "ddw orK"));
	}


}

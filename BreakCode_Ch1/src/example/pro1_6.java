package example;

import java.util.ArrayList;

public class pro1_6 {
	public static Boolean samechar (Character arg0, Character arg1) {
		if (arg0 == arg1) {
			return true;
		}else {
			return false;
		}
	}
	public static String StrCompress(String arg0) {
		StringBuffer ss = new StringBuffer();
		ArrayList<Character> ar_word = new ArrayList<>();
		for(int i=0;i<arg0.length();i++) {
			ar_word.add(arg0.charAt(i));
		}
		int a=1;
		for(int i=0;i<arg0.length()-1;i++) {
			if (samechar(ar_word.get(i),ar_word.get(i+1))){
				a++;
			}else {
				ss.append(ar_word.get(i));
				ss.append(a);
				a=1;
			}
		}
		ss.append(ar_word.get(arg0.length()-1));
		ss.append(a);
		return ss.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StrCompress("aabcccccaaaCccd"));
	}

}

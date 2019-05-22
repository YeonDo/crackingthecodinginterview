package example;

import java.util.ArrayList;

public class pro1_5 {
	public static Boolean OneAway (String arg0, String arg1) {
		ArrayList<Character> ar_word1 = new ArrayList<>();
		ArrayList<Character> ar_word2 = new ArrayList<>();
		for(int i=0;i<arg0.length();i++) {
			ar_word1.add(arg0.charAt(i));
		}
		for(int i=0;i<arg1.length();i++) {
			ar_word2.add(arg1.charAt(i));
		}
		int a=0;
		if (ar_word1.size() == ar_word2.size()) {
			// 글자 하나 변경
			for(int i=0;i<ar_word1.size();i++) {
				if(ar_word1.get(i) != ar_word2.get(i)) {
					a++; //한글자씩 비교 후 다른 글자수 체크
				}
			}
			if(a <2) {
				return true;
			}else {
				return false;
			}
		}else if(Math.abs(ar_word1.size() - ar_word2.size()) ==1) {
			// 글자 하나 추가
			if (ar_word1.size()>ar_word2.size()) {
				//arg1이 더 긴 글자	
				for(int i=0;i<ar_word1.size();i++) {
					ArrayList<Character> ar_word3 = new ArrayList<>();
					ar_word3.addAll(ar_word1);
					ar_word3.remove(i);
					if (ar_word3.equals(ar_word2)) {
						return true;
					}
				}
			}else {
				for(int i=0;i<ar_word2.size();i++) {
					ArrayList<Character> ar_word3 = new ArrayList<>();
					ar_word3.addAll(ar_word2);
					ar_word3.remove(i);
					if (ar_word3.equals(ar_word1)) {
						return true;
					}
				}
			}
			
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(OneAway("pale","pales"));
	}

}

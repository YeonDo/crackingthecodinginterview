package example;

import java.util.Enumeration;
import java.util.Hashtable;

public class pro1_4 {
	public static Boolean PalPer(String arg0) {
		String arg1 = arg0.toLowerCase();
		arg1 = arg1.replaceAll(" ", "");
		String[] ar_word = arg1.split("");
		Hashtable<String,Integer> ht = new Hashtable<String, Integer>();
		for (int i=0;i<arg1.length();i++) {
			if(ht.containsKey(ar_word[i])) {
				int a= ht.get(ar_word[i]);
				ht.put(ar_word[i], a+1);
			}else {
				ht.put(ar_word[i], 1);
			}
		}
		Enumeration e =ht.keys();
		String key;
		int val;
		int cnt=0;
		while(e.hasMoreElements()) {
			key=(String)e.nextElement();
			val=ht.get(key);
			if (val % 2 ==1) {
				cnt++;
			}
		}
		if (cnt>1) {
			return false;
		}else {
			return true;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(PalPer("Tact Coad"));
	}

}

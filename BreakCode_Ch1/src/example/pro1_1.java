package example;

public class pro1_1 {
	public static Boolean IsUnique(String arg0) {
		String[] ar_word = arg0.split("");
		for(int i=0;i<ar_word.length;i++) {
			for(int j=0;j<i;j++) {
				if( ar_word[i].equals(ar_word[j]) && i!=j) {
					return true;
				}
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IsUnique("Workdd"));
	}

}

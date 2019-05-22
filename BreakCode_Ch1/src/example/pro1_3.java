package example;

public class pro1_3 {
	public static String URLify(String arg0, Integer arg1) {
		StringBuffer sb = new StringBuffer();
		char[] ss = new char[arg1];
		for (int i=0;i<arg1;i++) {
			ss[i] = arg0.charAt(i);
			if (ss[i]==' ') {
				sb.append("%20");
			}else {
				sb.append(ss[i]);
			}
		}
		
		
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(URLify("Mr John Smiths",14));
	}

}

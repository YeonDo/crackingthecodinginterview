package example;

public class pro1_9 {
	public static Boolean isSubstring(String arg0, String arg1) {
		// arg0�� arg1�� ���꽺Ʈ������ ����
		if(arg1.indexOf(arg0)!=-1) {
			return true;
		}else {
			return false;
		}
	}
	public static Boolean StrRot(String arg0, String arg1) {
		int cnt=-1;
		if (arg0.length()!= arg1.length()) {
			return false; // ���̰� �ٸ���  rotate �ص� ������������
		}
		for(int i=arg0.length();i>0;i--) {
			String str = arg0.substring(0, i);
			if(isSubstring(str,arg1)) {
				cnt = i;
				break;
			}
		}
		if(cnt==-1) {
			return false;
		}else {
			String subarg0 = arg0.substring(cnt);
			String subarg1 = arg1.substring(0,arg1.length()-cnt);
			if (subarg0.equals(subarg1)) {
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StrRot("waterbottle","erbottlewat"));
	}

}

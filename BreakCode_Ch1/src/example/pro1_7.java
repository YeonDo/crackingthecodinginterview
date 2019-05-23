package example;

public class pro1_7 {
	public static int[][] RotateMat(int[][] arg0){
		int le = arg0[0].length; // 행렬 크기
		int[][] arg1 = new int[le][le];
		for(int i=0;i<le;i++) {
			for(int j=0;j<le;j++) {
				// 행렬의 각 값들을 하나씩 입력
				arg1[4-j][i]=arg0[i][j]; 
			}
		}
		
		return arg1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int[][] b = RotateMat(a);
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				// 행렬의 각 값들을 하나씩 입력
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
	}

}

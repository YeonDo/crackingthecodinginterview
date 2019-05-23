package example;

import java.util.ArrayList;

public class pro1_8 {
	public static int[][] ZeroMat(int[][] arg0){
		ArrayList<Integer> aa = new ArrayList<>();
		for(int i=0; i<arg0.length;i++) {
			for(int j=0;j<arg0[0].length;j++) {
				if (arg0[i][j] ==0) {
					aa.add(i);
					aa.add(j);
				}
			}
		}
		for(int k=0;k<aa.size()/2;k++) {
			int i=aa.get(2*k);
			int j=aa.get(2*k+1);
			for(int l=0;l<arg0.length;l++) {
				arg0[l][j]=0;
			}
			for(int l=0;l<arg0[0].length;l++) {
				arg0[i][l]=0;
			}
		}
		return arg0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] aa ={{1,2,3,4,5},{6,7,8,9,10},{11,0,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{13,13,0,13,13}};
		int[][] b = ZeroMat(aa);
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				// 행렬의 각 값들을 하나씩 입력
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
	}

}

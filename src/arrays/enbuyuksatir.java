package arrays;

public class enbuyuksatir {
	public static void main(String[] args) {
		int [][]x = {{3, 5}, {11,7}, {1,26}, {-3, -7}};
		for(int i=0; i<2; i++) {
		int enb = x[i][0];
		int sat =i;
		int sut=0;
		for(int j=0; j<4; j++) {
			if(x[i][j] > enb) {
				enb=x[i][j];
				sat =i;
				sut=j;
			}
		}
		System.out.println(enb);
	
	}
}
}
package arrays;

public class satırtoplam {
	public static void main(String[] args) {
		int [][]x = {{3, 5}, {11,7}};
		for(int i = 0; i<2; i++) {
			int top=0;
			int sat=0;
			for(int j=0; j<2; j++) {
				sat += x[i][j]; 
			}
			System.out.println(sat);
		}
	}

}

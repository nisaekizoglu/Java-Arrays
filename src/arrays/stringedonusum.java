package arrays;

public class stringedonusum {
	public static void main(String[] args) {
		String [][]str = {{"abcd", "ali"}, {"klmn","prst"}};
		String bos =" ";
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				bos = bos+ str[i][j];
			}
		System.out.println(bos);
		}
	}
}
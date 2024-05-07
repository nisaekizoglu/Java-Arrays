package arrays;

public class buyukA {
	public static void main(String[] args) {
		String [][]str = {{"abcd", "ali"}, {"klmn","prst"}};
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				if(str[i][j].charAt(0)=='a') {
					System.out.println(str[i][j]);
				}
			}
			

}
}
}
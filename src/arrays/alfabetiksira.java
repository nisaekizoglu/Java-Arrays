package arrays;

public class alfabetiksira {
	public static void main(String[] args) {
		String str []= {"abcde", "acdef", "adefg", "klmno", "zezzz"};
		String enb = str[0];
		for(int i = 1; i <= 4; i++ ) {
			for (int j = 0; j <= 4; j++) {
				if(enb.charAt(j) < str[i].charAt(j)) {
					enb = str[i];
					break;
				}
			}
		}
		System.out.println(enb);
	}

}

package arrays;
//büyük karakterleri küçüğe küçük karakterleri büyüğe çeviriniz.
public class buyukucukcevirme {
	public static void main(String[] args) {
		String bos = " ";
		String str[] = {"abcde", "acdef", "adefg", "klmno", "zezzz"};
		for(int i = 0; i < str.length; i++ ) {
			String s = str[i];
			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);
				if(ch <= 'z' && ch >= 'a') {
					bos = bos+(char)(ch - 32);
				}
				if(ch <= 'Z' && ch >= 'A') {
					bos = bos+(char)(ch+32);
				}
			}
			bos = bos + " ";
			
		}
		System.out.println(bos);
	}

}

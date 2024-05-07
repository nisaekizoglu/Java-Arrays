package arrays;

public class tekBoyutluString {
	public static void main (String [] args) {
		String str = "";
		String [][] s = {{"ali", "veli", "ayaz"}, {"abc", "klm", "a"}, {"a", "b","c"}};
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				str = str + s[i][j];
			}
			System.out.println(str);
			str = "";
		}
		}
}
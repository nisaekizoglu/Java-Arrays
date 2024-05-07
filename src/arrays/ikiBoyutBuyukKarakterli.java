package arrays;

//iki boyutlu string dizisinde büyük karakter içeren stringleri yazdıran java kodunu yazın.
public class ikiBoyutBuyukKarakterli {

	public static void main(String[] args) {

		String a[][] = { { "nisa", "aRDA", "algoRITmA" }, { "Algoritma", "alAcAtI" } };
		String str = " ";
		boolean found = false;
		char bos;
		int indis;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				str = a[i][j];
				for (int k = 0; k < str.length(); k++) {
					char c = str.charAt(k);
					if (c <= 'Z' && c >= 'A') {
						bos = c;
						System.out.println(c);
					}
				}
			}
		}

	}
}
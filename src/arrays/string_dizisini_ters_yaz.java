package arrays;

//string dizisinin her elemanını okunuş olarak tersten ekrana yazan java kodunu yazınız
public class string_dizisini_ters_yaz {
	public static void main(String[] args) {
		String a[] = { "nisa", "ARDA", "algoRITmA" };
		String bos = " ";
		for (int i = 0; i < a.length; i++) {
			String s = a[i];
			for (int j = s.length() - 1; j >= 0; j--) {
				bos += s.charAt(j);
			}
		}
		System.out.println(bos);
	}

}

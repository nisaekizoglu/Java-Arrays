package arrays;
//en uzun stringin indisini ekrana yazdıran java kodunu yazınız
public class string_indisi {
	public static void main(String[] args) {
		String a[] = { "nisa", "ARDA", "algoRITmA"};
		String max = a[0];
		int indis = 0;
		for (int i = 0; i < a.length; i++) {
		if(a[0].length() < a[i].length()) {
			a[0] = a[i];
			indis = i;
		}
	}
		System.out.println(indis);
	}
}

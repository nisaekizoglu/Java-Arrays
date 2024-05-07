package arrays;

public class ascıı {
	public static void main(String[] args) {
		char kelime = ' ';
		int max = 0;
		int k = 0;
		String dizi[] = { "nisa", "arda", "savaş", "ebru" };
		for (int i = 0; i < dizi.length; i++) {
			String yedek = dizi[i];
			for (int j = 0; j < yedek.length(); j++) {
				k = yedek.charAt(j);
				if (k > max) {
					max = k;
					kelime = yedek.charAt(j);
				}

			}

		}
		System.out.println("En buyuk karakter:" + kelime + " ascii degeri: " + max);
	}
}
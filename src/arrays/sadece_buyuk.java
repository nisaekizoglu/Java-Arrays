package arrays;

import java.util.Scanner;

//sadece büyük karakterleri ekrana yazan java kodunu yazınız
public class sadece_buyuk {
	public static void main(String[] args) {
		String a[] = { "nisa", "ARDA", "algoRITmA" };
		String bos = " ";
		for (int i = 0; i < a.length; i++) {
			String s = a[i];
			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);
				if (ch <= 'Z' && ch >= 'A') {
					bos = bos + ch;
				}

			}
		}
		System.out.println(bos);
	}
}
package arrays;

import java.util.Scanner;

//klavyeden girilen diziyi tersten yazdırınız(10 eleman)
public class diziyiTersYazma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ters[] = new String[10];
		System.out.println("10 Elemanlı dizi girniz");
		for (int i = 0; i < ters.length; i++) {
			ters[i] = scanner.next();
		}
		for (int j = ters.length - 1; j >= 0; j--) {
			System.out.print(ters[j] + " ");
		}

	}
}

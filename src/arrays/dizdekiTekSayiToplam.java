package arrays;

import java.util.Scanner;

//klavyeden girilen dizideki tek sayıları toplayan kodu yazın
public class dizdekiTekSayiToplam {
	public static void main(String[] args) {
		int toplam = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("10 elemanlı int dizisini giriniz: ");
		int teksayi[] = new int[10];
		for (int i = 0; i < teksayi.length; i++) {
			teksayi[i] = scanner.nextInt();
			if (teksayi[i] % 2 != 0) {
				toplam += teksayi[i];
			}
		}
		System.out.println("Dizideki tek sayilarin toplami: " + toplam);

	}

}

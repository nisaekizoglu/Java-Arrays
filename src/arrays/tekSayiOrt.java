package arrays;

import java.util.Scanner;

//tek sayıların ort
public class tekSayiOrt {
	public static void main(String[] args) {
		int toplam = 0;
		int ort = 0;
		int sayac = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("10 elemanlı int dizisini giriniz: ");
		int teksayi[] = new int[10];
		for (int i = 0; i < teksayi.length; i++) {
			teksayi[i] = scanner.nextInt();
			if (teksayi[i] % 2 != 0) {
				toplam += teksayi[i];
				sayac++;
				ort = toplam / sayac;
			}
		}
		System.out.println("Dizideki tek sayilarin ortalamasi: " + ort);

	}

}

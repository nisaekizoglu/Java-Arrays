package arrays;

import java.util.Scanner;

//klavyeden girilen diziyi bir sağa kaydıran java kodunu yazınız
public class sagaKaydirma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String dizi[] = new String[10];
		String yedek;
		System.out.print("10 elemanlı dizi giriniz: ");
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = scanner.next();
		}
		yedek = dizi[0];
		for (int j = 0; j < dizi.length - 1 ; j++) {
			dizi[j] = dizi[j + 1];
		}
		System.out.println("====================");

		dizi[9] = yedek;
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);

		}
	}
}
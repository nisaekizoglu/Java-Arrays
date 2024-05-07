package arrays;

import java.util.Scanner;

//klavyeden girilen dizisindeki tek sayıları toplayan kodu yazın
public class tekSayilarinToplam {
	public static void main (String  [] args) {
		int toplam = 0;
		Scanner k = new Scanner(System.in);
		int [] sayilar= {1,2,3,4,5,6,7,8,9,11};
		int say=0;
		
		for (int i = 0; i < sayilar.length; i++) {
			
			if (sayilar[i] % 2 != 0) {
				toplam += sayilar[i];
				say++;
			}
		}
		System.out.println(toplam/say);
	}
 
}

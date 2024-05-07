package arrays;

import java.util.Scanner;

//klavyeden girilen 10 elemanlı string dizisindeki en uzun stringin bulunduğu indisi ekrana yazan java kodunu yazınız
public class enuzunString {
	public static void main(String[] args) {
		String dizi[] = new String[10];
		int indis = 0 ;
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("10 string giriniz:");
		
			for (int j = 0; j < dizi.length; j++) {
				dizi[j] = scanner.next();
				if (max < dizi[j].length()) {	
					max = dizi[j].length();	
					indis = j;
				}
			}
		System.out.println("en uzun string uzunlugu:" +max +" "+ indis +".indis");
	}
}
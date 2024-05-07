package arrays;
//klavyeden girilen diziyi bir sağa kaydıran
public class kaydirma {
	public static void main (String  [] args) {
		int sayilar [] = {3,9,2,0,8,1,5,6,7,4};
		int yedek = sayilar [0];
		for(int i = 1; i<9; i++) {
			sayilar [i-1] = sayilar [i];
			
		}
		sayilar[9] = yedek;
		for(int i = 0; i <= 9; i++) {
			System.out.print(sayilar[i]);
		}
	}

}

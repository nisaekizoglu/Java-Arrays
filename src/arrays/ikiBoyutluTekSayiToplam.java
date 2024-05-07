package arrays;

//2 boyutlu tam sayı dizisindeki tek sayıların toplamını bulan java kodunu yazınız
public class ikiBoyutluTekSayiToplam {
	public static void main(String[] args) {
		double a[][] = { { 1, 2, 4, 7, 8 }, { 3, 5, 9, 2 } };
	    double tekSayi = 0;
		double toplam = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 != 0) {
					toplam = toplam + a[i][j];
				}
			}

		}
		System.out.println(toplam);
	}
}

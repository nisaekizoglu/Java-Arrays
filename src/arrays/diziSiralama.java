package arrays;

//10 elemanlı bir diziyi sıralayan kodu yazınız.(2 döngü)
public class diziSiralama {
	public static void main(String[] args) {
		int sıralama[] = { 2, 4, 8, 7, 9, 12, 34, 54, 1, 0 };
		int gecici[] = new int[sıralama.length];
		int maxIndex;
		for (int i = 0; i < sıralama.length; i++) {
			maxIndex = 0;
			for (int j = 1; j < sıralama.length - i; j++) {
				if (sıralama[j] > sıralama[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp = sıralama[sıralama.length - i - 1];
			sıralama[sıralama.length - i - 1] = sıralama[maxIndex];
			sıralama[maxIndex] = temp;

			gecici[i] = sıralama[sıralama.length - i - 1];
		}
		System.out.print("Sayilarin büyükten kücüge siralanisi: ");
		for (int i = 0; i < gecici.length; i++) {
			System.out.print(gecici[i] + " ");
		}
	}
}

package arrays;

public class yıldız {
	public static void main(String[] args) {
		int[] x = { 1, 3, 2, 6, 4, 8, 22, 16, 73, 7 };
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= x[i]; j++) {
				System.out.println("*");
			}
			System.out.println(" ");
		}

	}
}
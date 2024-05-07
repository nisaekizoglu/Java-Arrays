package arrays;
//her bir elemanı tersten yazan
public class ikiBoyutTersYazma {
	public static void main(String[] args) {
		String a[][] = {{ "nisa", "ARDA", "algoRITmA"},{"Algoritma", "AlAcAtI"} };
		String str = " ";
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				String b = a[i][j];
				for (int k = b.length() -1; k >= 0; k--) {
					str = str + b.charAt(k);
					
				}
				 str = str + " ";
			}
		}
		System.out.println(str);
	}
}

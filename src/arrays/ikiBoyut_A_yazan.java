package arrays;
//iki boyutlu string dizisnde büyük a karakteriyle başlayanları yazan
public class ikiBoyut_A_yazan {
	public static void main(String[] args) {
		String a[][] = {{ "nisa", "ARDA", "algoRITmA"},{"Algoritma", "AlAcAtI"} };
		for(int i = 0; i < a.length; i++) {	
			for(int j = 0; j < a[i].length; j++) {
				String str = a[i][j];
				char ch = str.charAt(0);
				if (ch == 'A') {
					System.out.println(str);
				}
				
			}
			
		}
		
	}

}

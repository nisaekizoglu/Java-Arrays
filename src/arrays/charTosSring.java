package arrays;
//10 elemanlı bu karakter dizisini string olarak birleştirip ekrana yazdırınız
public class charTosSring {
	public static void main(String[] args) {
		char [] isim = {'n','i','s','a'};
		for (int i = 0; i < isim.length; i++) {
			String str = new String(isim);
			String [] dizi = {str};		
		}
		System.out.println(isim);
	}

}

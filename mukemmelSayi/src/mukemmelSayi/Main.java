package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		//kendinden başka pozitif tam bölenlerin sayısının toplamının kendisine eşit olan sayı.
		//örneğin 6 -> 2 , 3 ,1 -> 2+3+1=6
		int number = -9;
		if(number<0) {
			System.out.println("Geçersiz sayı");
			return;
		}
		int toplam = 0;
		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				toplam += i;
			}
		}
		if(toplam == number) {
			System.out.println("sayı mükemmel sayıdır");
		}
		else {
			System.out.println("sayı mükkemmel sayı değildir");
		}
	}

}

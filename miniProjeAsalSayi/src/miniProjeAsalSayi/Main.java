package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number =-2 ;
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("Sayi asal değil ");
			return;
		}
		
		if(number <0) {
			System.out.println("Geçersiz sayı ");
			return;
		}
		for(int i=2; i<number;i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println("Sayi asal ");
			
		}else {
			System.out.println("Sayi asal değil");
		}
	}
}

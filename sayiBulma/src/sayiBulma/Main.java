package sayiBulma;

public class Main {

	public static void main(String[] args) {
		//aranacak sayı sayılar içinde var mı yok mu 
		int[] sayilar = new int[] {1,2,3,5,6,4,8};
		int aranacak = 1;
		boolean varMi = false;
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] == aranacak) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Var");
		}
		else {
			System.out.println("Yok");
		}
	}

}

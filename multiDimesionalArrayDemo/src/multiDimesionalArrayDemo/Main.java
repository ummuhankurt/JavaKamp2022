package multiDimesionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		// İki boyutlu diziler.
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "İzmir";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";
														
		for(int i = 0; i<= 2; i++) {
			for(int j = 0; j<=2; j++) {
				System.out.println(sehirler[i][j]);
			}
			System.out.println("----------------");
		}

	}

}

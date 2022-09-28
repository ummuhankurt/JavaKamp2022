package intro;

import java.util.Iterator;

public class Main {
	// ctrl + space kısayol.
	public static void main(String[] args) {
		System.out.println("Hello world");
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		
		double dolarDun = 17.85;
		double dolarBugun = 16.12;
		boolean dolarDustumu = false;
		String okYonu = "";
		if (dolarBugun < dolarDun) {
			dolarDustumu = true;
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun > dolarDun) {
			dolarDustumu = false;
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		//arrays
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbaktan Alanlar","Mutlu Emekli"};
		System.out.println("Krediler");
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}
}

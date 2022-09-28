package stringsDemo;

public class Main {
	public static void main(String[] args) {
		//StringDemo1();
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj.replace(" ", "")); // Boşlukları yok etti. Yeni bir metin oluşturur.Mesajın ilk hali korunur.
		System.out.println(mesaj);
		System.out.println(mesaj.replace("a", ".")); // a olan yerleri . ile değiştirdi.
		System.out.println(mesaj.substring(2)); // ikinci elemandan itibaren alır.2 dahil.
		System.out.println(mesaj.substring(2,5)); // 2.elemandan başla 4 e kadar git, 4 dahil değil.4.indexi istiyorsan 5 yaz.
		for (String kelime : mesaj.split(" ")) { // Boşluğa göre ayır.
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); // bütün harfleri küçük harfe çevirir.
		System.out.println(mesaj.toUpperCase()); // bütün harfleri büyük harfe çevirir.
		System.out.println("bana bağırma".toUpperCase());
		
		String mesaj2 = "            bugün hava çok güzel        ";
		System.out.println(mesaj2.trim()); // metnin başındaki ve sonundaki boşlukları yok eder.
		
	}

	private static void StringDemo1() {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("Beşinci eleman : " + mesaj.charAt(4));
		//String birlestirme
		System.out.println(mesaj.concat("Yaşasın!"));
		//startsWith and endsWitsh
		System.out.println(mesaj.startsWith("B")); // boolean döndürür
		System.out.println(mesaj.endsWith("."));
		//karakterleri al. Mesajın ilk beş karakterini almak istiyorum.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); 
		//-> 0 dan başla 4.indexe kadar git(5.eleman yani), nereye aktarıcam?karakterler arrayine.karakterlerin kaçıncı indexinden balayarak atayayım?0.
		//4 dü dahil etmediği için 5 yazıyoruz
		System.out.println(karakterler);
		//bir karakterin mesajın içinde kaçıncı eleman olduğunu bilelim.
		System.out.println(mesaj.indexOf('a'));	// ilk bulduğu a da işi bitirir.
		// String olarak bir metni de bulabiliriz.
		System.out.println(mesaj.indexOf("av")); // aynı sonucu verdi.
		//Bunun bir de tam tersi var.
		System.out.println(mesaj.lastIndexOf("a")); // sağdan başladığı zaman ilk gördüğünüz verir.
	}
}

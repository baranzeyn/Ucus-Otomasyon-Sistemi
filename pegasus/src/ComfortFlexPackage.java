import java.util.Scanner;

public class ComfortFlexPackage extends Package implements IEat, IFlyNWatch {
	
	public ComfortFlexPackage() {
		
	}
	
	Scanner scan = new Scanner(System.in);
	//*************************************31.METHOD
	public void yemekGoruntule() {
		System.out.println("İçecekler için 1'i\nYemekler için 2'yi\nTatlılar için 3'ü tuşlayınız. ");
		int secim2 = scan.nextInt();

		String[] dizi1 = { "Su", "Çay", "Kahve", "Kola", "Fanta", "Sprite", "Salep", "ingiliz Çayı", "Soda",
				"Meyve Suyu" };
		int[] dizi2 = { 20, 30, 45, 40, 40, 40, 35, 50, 30, 35 };

		String[] dizi3 = { "Tost", "Sandviç", "Patates Kızartması", "Hamburger", "Pizza", "Su Böreği", "Lahmacun",
				"Çiğköfte", "Etliekmek", "Maklube" };
		int[] dizi4 = { 60, 70, 80, 120, 130, 95, 150, 85, 170, 180 };

		String[] dizi5 = { "Tiramisu", "Kazandibi", "Sütlaç", "Profiterol", "San Sebastian", "Magnolia",
				"Saray Sarması", "Künefe", "Şekerpare", "Karpuz Kaldıran" };
		int[] dizi6 = { 150, 85, 90, 95, 200, 85, 110, 115, 120, 0};

		switch (secim2) {
		case 1:
			for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
				System.out.println((i + 1) + "." + dizi1[i] + " : " + dizi2[j]);
			}
			System.out.println("Seçiminizi yapınız");
			int secim = scan.nextInt();
			tutarHesapla(dizi2[secim - 1]);
			break;
		case 2:
			for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
				System.out.println((i + 1) + "." + dizi3[i] + " : " + dizi4[j]);
			}
			System.out.println("Seçiminizi yapınız");
			int secim1 = scan.nextInt();
			tutarHesapla(dizi4[secim1 - 1]);
			break;
		case 3:
			for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
				System.out.println((i + 1) + "." + dizi5[i] + " : " + dizi6[j]);
			}
			System.out.println("Seçiminizi yapınız");
			int secim3 = scan.nextInt();
			tutarHesapla(dizi6[secim3 - 1]);
			break;
		default:
			System.out.println("Hatalı tuşlama yaptınız.");
		}
	}

	int toplam1 = 0;
	//*************************************32.METHOD
	public int tutarHesapla(int secim) {

		System.out.println("Kaç adet almak istersiniz:");
		int adet = scan.nextInt();
		System.out.println("Alışverişinizi tamamladınız mı?");
		String cevap = scan.next();
		if (cevap.equalsIgnoreCase("evet")) {
			System.out.println("Toplam Tutar: " + (toplam1 + (adet * secim)));
		} else if (cevap.equalsIgnoreCase("hayır")) {
			toplam1 = adet * secim;
			yemekGoruntule();
		} else {
			System.out.println("Hatalı tuşlama yaptınız");
		}
		return 0;
	}
	//*************************************33.METHOD
	@Override
	public void yemek() {
		System.out.println("Menüyü Görüntüleniyor...");
		yemekGoruntule();
	}
	//*************************************34.METHOD
	public void flyNwatch() {
		int netflix;
		System.out.println("Fly&Watch Hizmetine Hoşgeldiniz");
		System.out.println("Dizileri görüntülemek için 1'e\nFilmleri görüntülemek için 2'i tuşlayınız");
		netflix = scan.nextInt();
		switch (netflix) {
		case 1:
			diziGoruntule();
			System.out.println("Seçiminizi yapınız.");
			int choice1 = scan.nextInt();
			System.out.println(diziler[choice1 - 1] + " başlıyor.Keyifli seyirler dileriz...");
			break;
		case 2:
			filmGoruntule();
			System.out.println("Seçiminizi yapınız.");
			int choice2 = scan.nextInt();
			System.out.println(filmler[choice2 - 1] + " başlıyor.Keyifli seyirler dileriz...");
			break;
		default:
			System.out.println("Hatalı tuşlama yaptınız ");
			break;
		}
	}
	//*************************************35.METHOD
	@Override
	public void diziGoruntule() {// 10.
		// TODO Auto-generated method stub
		for (int i = 0; i <= 12; i++) {
			System.out.println(diziler[i]);
		}

	}
	//*************************************36.METHOD
	@Override
	public void filmGoruntule() {// 11.
		// TODO Auto-generated method stub
		for (int i = 0; i <= 12; i++) {
			System.out.println(filmler[i]);
		}

	}

}

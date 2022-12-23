import java.util.Scanner;

public class AdvantagePackage extends Package implements IEat,IFlyNWatch{
	Scanner scan = new Scanner(System.in);

	@Override
	public void yemek() {   //7.method
		System.out.println("Menüyü Görüntüleniyor...");
		yemekGoruntule();

	}

	@Override
	public void yemekGoruntule() {//8.method
		System.out.println("İçecekler için 1'i\nYemekler için 2'yi\nTatlılar için 3'ü tuşlayınız. ");
		int secim2 = scan.nextInt();

		String[] dizi1 = { "Su", "Çay", "Kahve", "Kola", "Sprite", "Soda", "Meyve Suyu" };
		int[] dizi2 = { 20, 30, 45, 40, 40, 35, 35 };

		String[] dizi3 = { "Tost", "Sandviç", "Patates Kızartması", "Hamburger", "Pizza", "Su Böreği", "Çiğköfte" };
		int[] dizi4 = { 60, 70, 80, 120, 130, 95, 85, };

		String[] dizi5 = { "Tiramisu", "Kazandibi", "Sütlaç", "Magnolia", "Künefe", "Şekerpare", "Karpuz Kaldıran" };
		int[] dizi6 = { 80, 85, 90, 95, 100, 100, 0 };

		switch (secim2) {
		case 1:
			for (int i = 0, j = 0; i < 7 && j < 7; i++, j++) {
				System.out.println((i + 1) + "." + dizi1[i] + " : " + dizi2[j]);
			}
			System.out.println("Seçiminizi yapınız");
			int secim = scan.nextInt();
			tutarHesapla(secim - 1);
			break;
		case 2:
			for (int i = 0, j = 0; i < 7 && j < 7; i++, j++) {
				System.out.println((i + 1) + "." + dizi3[i] + " : " + dizi4[j]);
			}
			System.out.println("Seçiminizi yapınız");
			int secim1 = scan.nextInt();
			tutarHesapla(secim1 - 1);
			break;
		case 3:
			for (int i = 0, j = 0; i < 7 && j < 7; i++, j++) {
				System.out.println((i + 1) + "." + dizi5[i] + " : " + dizi6[j]);
			}
			System.out.println("Seçiminizi yapınız");
			int secim3 = scan.nextInt();
			tutarHesapla(secim3 - 1);
			break;
		default:
			System.out.println("Hatalı tuşlama yaptınız.");
		}

	}

	@Override
	public int tutarHesapla(int secim) {//9.method

		System.out.println("Kaç adet almak istersiniz:");
		int adet = scan.nextInt();
		System.out.println("Alışverişinizi tamamladınız mı?");
		String cevap = scan.nextLine();
		if (cevap.equalsIgnoreCase("evet")) {
			return adet * secim;
		} else if (cevap.equalsIgnoreCase("hayır")) {
			yemekGoruntule();
		} else {
			System.out.println("Hatalı tuşlama yaptınız");
		}
		return 0;

	}
	public void flyNwatch() {
		int netflix;
		System.out.println("Fly&Watch hizmetine hoşgeldiniz");
		System.out.println("Dizileri görüntülemek için 1'e\nFilmleri görüntülemek için 2'i tuşlayınız");
		netflix=scan.nextInt();
		switch(netflix) {
		case 1:
			diziGoruntule();
			break;
		case 2:
			filmGoruntule();
			break;
			default:
				System.out.println("Hatalı tuşlama yaptınız ");
				break;
		}
	}

	@Override
	public void diziGoruntule() {//10.
		// TODO Auto-generated method stub
		for(int i=0;i<=12;i++) {
			System.out.println(diziler[i]);
		}
		
	}

	@Override
	public void filmGoruntule() {//11.
		// TODO Auto-generated method stub
		for(int i=0;i<=12;i++) {
			System.out.println(filmler[i]);
		}
		
	}

}

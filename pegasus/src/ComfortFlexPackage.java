import java.util.Scanner;

public class ComfortFlexPackage implements IEat {
	Scanner scan = new Scanner(System.in);

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
		int[] dizi6 = { 80, 85, 90, 95, 100, 105, 110, 115, 120, 0 };

		switch (secim2) {
		case 1:
			for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
				System.out.println((i + 1) + "." + dizi1[i] + " : " + dizi2[j]);
			}
			System.out.println("Seçiminizi yapınız");
			int secim = scan.nextInt();
			tutarHesapla(secim - 1);
			break;
		case 2:
			for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
				System.out.println((i + 1) + "." + dizi3[i] + " : " + dizi4[j]);
			}
			System.out.println("Seçiminizi yapınız");
			int secim1 = scan.nextInt();
			tutarHesapla(secim1 - 1);
			break;
		case 3:
			for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
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

	public int tutarHesapla(int secim) {
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

	@Override
	public void yemek() {
		System.out.println("Menüyü Görüntüleniyor...");
		yemekGoruntule();
	}

}
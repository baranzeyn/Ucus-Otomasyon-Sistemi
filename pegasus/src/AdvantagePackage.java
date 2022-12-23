import java.util.Scanner;

public class AdvantagePackage implements IEat {
	Scanner scan = new Scanner(System.in);

	@Override
	public void yemek() {
		System.out.println("Menüyü Görüntüleniyor...");
		yemekGoruntule();

	}

	@Override
	public void yemekGoruntule() {
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

}

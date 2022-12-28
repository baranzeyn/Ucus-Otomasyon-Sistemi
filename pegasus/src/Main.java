import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ad = "", soyad = "";
		int secenek = 0;
		System.out.println("***Kasaba Official Airlines Hizmetinizde***\n");
		System.out.println("Seçenekler Görüntüleniyor...\n");
		System.out.println(
				"1.Bilet Al\n2.Online Check-in\n3.Ek Hizmetlerden Yararlan\n4.Bagaj İşlemleri\n5.Kasaba Official Kafeden Yararlan\n6.Fly&Watch\n7.Ulaşım\n8.Hediye Kartı");
		try {
			System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
			secenek = sc.nextInt();
		} catch (InputMismatchException e) {
				System.out.println("Harf Giremezsiniz!");
				throw new InputMismatchException();
		}

		Package package1 = new Package();

		switch (secenek) {
		case 1:
			package1.bilgiler();
			if (package1.isFlight) {
				System.out.println("Check-in yapmak istiyor musunuz?\n1-Evet\n2-Hayır");
				int secim = sc.nextInt();

				switch (secim) {
				case 1:
					package1.check_in();
					break;
				case 2:
					break;
				}
			}
			break;
		case 2:
			package1.check_in2();
			break;
		case 3:
			package1.ekHizmetgoruntule();
			break;
		case 4:
			Bagaj bagaj1 = new Bagaj();
			break;
		case 5:
			System.out.println("Uçuş paketinizi giriniz:");
			String paket2 = sc.next();
			if (paket2.equalsIgnoreCase("avantaj")) {
				AdvantagePackage avantaj = new AdvantagePackage();
				avantaj.yemek();
				break;
			} else if (paket2.equalsIgnoreCase("comfort-flex")) {
				ComfortFlexPackage comfort = new ComfortFlexPackage();
				comfort.yemek();
				break;
			} else {
				System.out.println("Seçtiğiniz paket bu hizmeti sunamıyor");
			}
			break;

		case 6:
			System.out.println("Uçuş paketinizi giriniz:");
			String paket3 = sc.next();
			if (paket3.equalsIgnoreCase("Avantaj")) {
				AdvantagePackage avantaj = new AdvantagePackage();
				avantaj.flyNwatch();
				break;
			} else if (paket3.equalsIgnoreCase("comfort-flex")) {
				ComfortFlexPackage comfort = new ComfortFlexPackage();
				comfort.flyNwatch();
				break;
			} else {
				System.out.println("Seçtiğiniz paket bu hizmeti sunamıyor");
			}
			break;
		case 7:
			package1.ulasim();
			break;
		case 8:
			package1.hediyeKarti();
			break;
		default:
			System.out.println("Hatalı tuşlama yaptınız..");
		}
	}
}

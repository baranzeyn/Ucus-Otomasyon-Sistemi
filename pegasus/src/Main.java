import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int secenek;
		System.out.println("***Kasaba Official Airlines Hizmetinizde***\n");
		System.out.println("Seçenekler Görüntüleniyor...\n");
		System.out.println(
				"  1.Bilet Al\n  2.Online Check-in\n  3.Ek Hizmetlerden Yararlan\n  4.Bagaj İşlemleri\n  5.Kasaba Official Kafeden Yararlan\n  6.Fly&Watch\n  7.Ulaşım");
		System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
		secenek = sc.nextInt();

		Package package1 = new Package();

		switch (secenek) {
		case 1:
			package1.bilgiler(); 
			System.out.println("Check-in yapmak istiyor musunuz?\n1-Evet\n2-Hayır");
			int secim = sc.nextInt();
			switch (secim) {
			case 1:
				package1.check_in();
				break;
			case 2:
				break;
			}
			break;
		case 2:
			package1.check_in2();
			break;
		case 3:
			package1.ekHizmetgoruntule();
			break;
		case 4:
			Bagaj bagaj1=new Bagaj();
			break;
		case 5:
			System.out.println("Uçuş paketinizi giriniz:");
			String paket2=sc.next();
			if(paket2.equalsIgnoreCase("Avantaj")){
				AdvantagePackage avantaj=new AdvantagePackage();
				avantaj.yemek();
				break;
			}
			else if(paket2.equalsIgnoreCase("comfort-flex")) {
				ComfortFlexPackage comfort=new ComfortFlexPackage();
				comfort.yemek();
				break;
			}
			else {
				System.out.println("Seçtiğiniz paket bu hizmeti sunamıyor");
			}
			break;
			
		case 6:
			System.out.println("Uçuş paketinizi giriniz:");
			String paket3=sc.next();
			if(paket3.equalsIgnoreCase("Avantaj")){
				AdvantagePackage avantaj=new AdvantagePackage();
				avantaj.flyNwatch();
				break;
			}
			else if(paket3.equalsIgnoreCase("comfort-flex")) {
				ComfortFlexPackage comfort=new ComfortFlexPackage();
				comfort.flyNwatch();
				break;
			}
			else {
				System.out.println("Seçtiğiniz paket bu hizmeti sunamıyor");
			}
			break;
		case 7:
			package1.ulasim();
			break;
		default:
			System.out.println("Hatalı tuşlama yaptınız..");
		}
	}
}

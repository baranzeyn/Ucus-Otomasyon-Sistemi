
import java.util.Scanner;

public class Package implements IPassenger, ITicket, IAdditionalServices {
	Scanner scan = new Scanner(System.in);

	public Package() {
		int a;
		System.out.println("Paket seçimi için 1'i\nPaketlerin özelliklerini görmek için 2'i tuşlayınız ");
		a = scan.nextInt();
		if (a == 1) {
			paketSecim();
		} else if (a == 2) {
			listele();
		} else {
			System.out.println("Hatalı tuşlama yaptınız...");
		}
	}

	public int paketSecim() {
		int secim;
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Aşağıdaki paketlerden birini seçiniz\n1-Eco Paket\n2-Avantaj Paket\n3-Comfort Flex Paket\n4-Super Eco Paket ");
		secim = scan.nextInt();
		return secim;
	}

	public void listele() {
		Scanner scan = new Scanner(System.in);
		String choice;
		System.out.println("Eco Paket\n");
		System.out.println("*****************");
		System.out.println(
				"en uygun fiyat\n yurt içinde 15 kg, Kıbrıs ve yurt dışında 20 kg bagaj hakkı\n Eko Paket'i ihtiyacına uygun ek hizmetlerle, dilediğin gibi şekillendirebilirsin.\n");
		System.out.println("Super Eco Paket\n");
		System.out.println("******************");
		System.out.println(
				"SADECE DIŞ HATLARDA GEÇERLİDİR\n yalnızca 1 adet ve boyutları en fazla 55x40x20 cm ebatlarında olan kabin bagajı hakkı");
		System.out.println("Avantaj Paket\n");
		System.out.println("******************");
		System.out.println(
				"ek hizmetlerini indirimli sunar\nKoltuk seçme (ekstra diz mesafesi hariç)\n 20 kg bagaj hakkı\nsandviç\nFly&Watch uçak içi eğlence hizmetleri");
		System.out.println("Comfort Flex Paket");
		System.out.println("******************");
		System.out.println(
				"ekstra konforlu ve esnek bir seyahat\nCezasız bilet değiştirme ve iptal hakkı\n 20 kg bagaj hakkı\nsandviç ikramı\n tek parça kabin bagajı ve koltuk seçme (ekstra diz mesafesi dahil)\nFly&Watch uçak içi eğlence ayrıcalıkları"
						+ "\n düzenlenen biletlerde tarifeli uçuş kalkış saatine 2 saat kalana dek yapılan iptal ve değişikliklerde işlem bedeli uygulanmaz\n bilet iptalinde bilet ücreti Hizmet Bedeli hariç kesintisiz olarak iade edilir"
						+ "\nTarifeli uçuş kalkış saatine 2 saatten az süre kalan durumda, Comfort Flex Paket kapsamında düzenlenen biletlerde değişiklik ve iptal talep edilmesi halinde misafirlerimize sadece Havalimanı Vergisi iade edilir.\n");
		System.out.println("Paket seçimi yapmaya hazır mısınız?");
		choice = scan.nextLine();
		if (choice.equalsIgnoreCase("EVET")) {
			paketSecim();
		} else if (choice.equalsIgnoreCase("hayır")) {
			System.out.println("Sistemden çıkış yapılıyor");
			System.exit(0);
		}
	}

	@Override
	public void check_in(String ad, String soyad, String biletNo) {

	}

	class Bagaj {
		public Bagaj() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Yapmak istediğiniz işlemi seçiniz:");
			System.out.println(" 1-Bagaj hakkını öğrenme\n 2-Bagaj durumu sorgulama\n 3-Kayıp bagaj bildirimi ");
			int secim1 = scan.nextInt();

			switch (secim1) {
			case 1:
				System.out.println("Uçuş paketinizi giriniz: ");
				String paket = scan.nextLine();
				paket = paket.toLowerCase();
				bagajHakkiniOgren(paket);
				break;
			case 2:
				System.out.println("Bilet numaranızı giriniz:");
				String no = scan.nextLine();
				bagajDurumuSorgulama(no);
				break;
			case 3:
				System.out.println("Bagaj kodunu giriniz:");
				String bagajNo = scan.nextLine();
				kayıpBagajBildirimi(bagajNo);
				break;
			default:
				System.out.println("Hatalı tuşlama yaptınız...");
				System.out.println("Sistemden çıkış yapılıyor");
			}

		}

		String bagajTakipNo;

		public void bagajHakkiniOgren(String paket) {
			if (paket.equalsIgnoreCase("Eco paket")) {
				System.out.println("Yurt içinde 15 kg, Kıbrıs ve yurt dışında 20 kg bagaj hakkınız bulunmaktadır.");
			}

			else if (paket.equalsIgnoreCase("Super Eco paket")) {
				System.out.println(
						"Yalnızca 1 adet ve boyutları en fazla 55x40x20 cm ebatlarında olan kabin bagajı hakkınız bulunmaktadır...");
			}

			else if (paket.equalsIgnoreCase("Avantaj paket")) {
				System.out.println("20 kg bagaj hakkınız bulunmaktadır...");
			}

			else if (paket.equalsIgnoreCase("Comfort Flex paket")) {
				System.out.println("Tek parça kabin ve 20 kg bagaj hakkınız bulunmaktadır...");
			}

			else {
				System.out.println("Hatalı tuşlama yaptınız...");
				bagajHakkiniOgren(paket);
				System.out.println("Sistemden çıkış yapılıyor...");
				System.exit(0);
			}
		}

		public void bagajDurumuSorgulama(String no) {
			System.out.println("Uçaktan ineli kaç dakika oldu: ");
			int saat = scan.nextInt();

			if (saat < 20 && saat > 0) {
				System.out.println("Bagajınız uçakta.");
			} else if (saat < 30 && saat >= 20) {
				System.out.println("Bagajınız transfer ediliyor.");
			} else if (saat < 50 && saat >= 30) {
				System.out.println("Bagajınızı teslim alabilirsiniz.");
			} else {
				System.out.println("Kayıp bagaj bildirimi yapabilirsiniz.");
			}
		}

		public void kayıpBagajBildirimi(String no) {
			System.out.println(no + " Numaralı bagaj hakkında en kısa zamanda dönüş yapılacaktır, iyi günler dileriz.");
		}
	}

	int[] koltuk = { 45, 16, 63, 72, 42, 65, 43, 34, 58, 66 };

	@Override
	public void koltukSec() {
		boolean empty = true;
		System.out.println("Değiştirmek istediğiniz koltuk numarasını giriniz:");
		int koltuk1 = scan.nextInt();
		System.out.println("Seçmek istediğiniz koltugu giriniz: ");
		int koltuk2 = scan.nextInt();

		for (int a : koltuk) {
			if (koltuk2 == a) {
				System.out.println("Koltuk değiştirme işleminiz başarıyla tamamlanmıştır. ");
				a = koltuk1;
			} else
				empty = false;

		}

		if (empty == false) {
			System.out.println("Koltuk değiştirme işleminiz başarısız. ");
		}
	}

	@Override
	public void ekBagaj() {
		System.out.println("-----Ek Bagaj Hizmeti Açıklaması-----");
		System.out.println(
				"Paketlerinizdeki bagajlara ek olarak bagaj kullanmak için kg başına 30 lira ücretlendirme alınır...");
		ekBagajHesapla();
	}

	@Override
	public void ekBagajHesapla() {
		System.out.println("Ekstra kaç kg bagajınız bulunmaktadır?");
		int bagaj = scan.nextInt();
		System.out.println("Bagaj için ödeyeceğiniz tutar:" + (bagaj * 30));
	}

	@Override
	public void ulasim() {
		System.out.println("Tercih ettiğiniz ulaşım yöntemini seçiniz:");
		System.out.println("1-Otobüs \n2-Minibüs \n3-Taksi \n4-İzban ");
		int secim5 = scan.nextInt();

		switch (secim5) {
		case 1:
			System.out.println("207 / 105 / 851 hatları ile havaalına ulaşabilirsiniz... ");
			break;
		case 2:
			System.out.println("GaziEmir havaalanı hattı ile ulaşabilirsiniz...");
			break;
		case 3:
			System.out.println("232 326 33 23 numarası ile taksiye ulaşabilirsiniz....");
			break;
		case 4:
			System.out.println("Havaalanı istasyonunda inebilirsiniz...");
			break;
		default:
			System.out.println("Hatalı tuşlama yaptınız...");

		}
	}

	@Override
	public void otel() {
		System.out.println("Otel Seçenekleri görüntüleniyor...");
		otelGoruntule();
	}

	@Override
	public void otelGoruntule() {
		System.out.println("-----5 Yıldızlı Oteller-----");
		System.out.println(
				"1-Rose Garden Hotel \n2-Euphoria Hotel \n3-Daisy Hotel \n4-Dandelion Hotel \n5-Lavender Hotel");
		System.out.println("-----3 Yıldızlı Oteller-----");
		System.out.println(
				"1-Transilvanya Hotel \n2-Sünger Bob Hotel \n3-Mickey Mouse Hotel \n4-Cartoon Network Hotel \n5-Garden Hotel");
	}

	@Override
	public void otoparkHizmeti() {
		System.out.println("-----Otopark Hizmeti Açıklaması-----");
		System.out.println(
				"Otopark hizmetinden yararlanan müşterilerimiz için ilk 3 gün 150 lira standart olarak ücretlendirilir.");
		System.out.println("3 günden sonra her gün için 200 lira ücretlendirilmesi bulunmaktadır.");
		otoparkTutarHesapla();
	}

	@Override
	public void otoparkTutarHesapla() {
		System.out.println("Aracınızın plakasını giriniz");
		String aracPlaka = scan.nextLine();
		System.out.println("Aracınız ne kadar zaman otoparkta bulunacaktır?");
		int aracZaman = scan.nextInt();
		if(aracZaman>0 &&  aracZaman<=3) {
			System.out.println("Otopark için ödeyeceğiniz tutar 150 liradır...");
		}
		else {
			System.out.println("Otopark için ödeyeceğiniz tutar:" + (150 + (aracZaman-3)*200 ) );
		}
	}
		
	}

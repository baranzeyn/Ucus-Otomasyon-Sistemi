import java.util.Scanner;
import java.util.ArrayList;

public class Package implements IPassenger, ITicket, IAdditionalServices {
	Scanner scan = new Scanner(System.in);

	ArrayList<String> biletalAd = new ArrayList<String>();
	ArrayList<String> biletalSoyad = new ArrayList<String>();
	ArrayList<String> biletalEmail = new ArrayList<String>();
	ArrayList<Integer> biletalYas = new ArrayList<Integer>();
	ArrayList<String> biletalTelno = new ArrayList<String>();
	ArrayList<Integer> biletSonTutar = new ArrayList<Integer>();
	ArrayList<Integer> biletalNo = new ArrayList<Integer>();
	ArrayList<Integer> checkinNo = new ArrayList<Integer>();

	public Package() {
	}
	// -----------------------------------------------------------

	public Package(int b) {
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
	// -----------------------------------------------------------

	public int paketSecim() {
		int secim;
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Aşağıdaki paketlerden birini seçiniz\n1-Eco Paket\n2-Avantaj Paket\n3-Comfort Flex Paket\n4-Super Eco Paket ");
		secim = scan.nextInt();
		return secim;
	}
	// -----------------------------------------------------------

	public void bilgiler() {

		System.out.println("Kaç kişi için bilet alınacaktır: ");
		int kisiS = scan.nextInt();

		for (int i = 0; i < kisiS; i++) {
			System.out.println("Adınız: : ");
			String ad1 = scan.next();
			biletalAd.add(ad1);
			System.out.println("Soyadınız: ");
			String soyad1 = scan.next();
			biletalSoyad.add(soyad1);
			System.out.println("Telefon Numaranız: . ");
			String tel1 = scan.next();
			biletalTelno.add(tel1);
			System.out.println("Yaşınız: ");
			int age = scan.nextInt();
			biletalYas.add(age);
			System.out.println("E-mail Adresiniz: ");
			String email = scan.next();
			biletalEmail.add(email);
			biletAl();
		}

	}

	// -----------------------------------------------------------
	public void biletAl() {

		System.out.println("Nereden: ");
		String nereden = scan.next();
		System.out.println("Nereye: ");
		String nereye = scan.next();
		System.out.println("1.Tek Yön\n2.Çift Yön");
		System.out.println("Seçiminizi yapınız: ");
		int yon = scan.nextInt();
		Package b = new Package(2);
		if (yon == 1) {
			for (int y : biletalYas) {
				if (y > 0 && y <= 6) {
					System.out.println("Bilet ücretiniz:" + biletHesaplaKid());
					biletSonTutar.add(biletHesaplaKid());
					biletAlNo();
					checkinNoAl();
				}

				else if (y > 6 && y < 65) {
					System.out.println("Bilet ücretiniz:" + biletHesapla());
					biletSonTutar.add(biletHesapla());
					biletAlNo();
					checkinNoAl();

				} else {
					System.out.println("Bilet ücretiniz:" + biletHesaplaOld());
					biletSonTutar.add(biletHesaplaOld());
					biletAlNo();
					checkinNoAl();

				}
			}
		}

		else if (yon == 2) {
			for (int z : biletalYas) {
				if (z > 0 && z <= 6) {
					System.out.println("Bilet ücretiniz:" + (biletHesaplaKid() * 2));
					biletAlNo();
					checkinNoAl();
				}

				else if (z > 6 && z < 65) {
					System.out.println("Bilet ücretiniz:" + biletHesapla() * 2);
					biletAlNo();
					checkinNoAl();
					
				}

				else {
					System.out.println("Bilet ücretiniz:" + (biletHesaplaOld() * 2));
					biletAlNo();
					checkinNoAl();
					
				}
			}

		} else {
			System.out.println("Hatalı tuşlama yaptınız...");
		}
		System.out.println("Toplam Tutar: " + biletToplamTutar());
	}

	// -----------------------------------------------------------
	public int biletAlNo() {
		int z = (int) (Math.random() * 100000);
		biletalNo.add(z);
		System.out.println("Bilet numaranız:" + z);
		return z;
	}

	// -----------------------------------------------------------
	public int checkinNoAl() {
		int k = (int) (Math.random() * 20000);
		checkinNo.add(k);
		System.out.println("Check-in Kodunuz:" + k);
		return k;
	}

	// -----------------------------------------------------------
	public int biletHesaplaKid() {
		return 26;

	}
	// -----------------------------------------------------------

	public int biletHesapla() {
		return 32;
	}
	// -----------------------------------------------------------

	public int biletHesaplaOld() {
		return 33;

	}
	// -----------------------------------------------------------

	public int biletToplamTutar() {
		int toplam = 0;
		for (int topla : biletSonTutar) {
			toplam += topla;
		}
		return toplam;

	}
	// -----------------------------------------------------------

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
	// -----------------------------------------------------------

	public void check_in() {
		Scanner scin = new Scanner(System.in);

		System.out.println("Adınızı Girin: ");
		String name = scin.next();
		System.out.println("Soyadınızı Girin: ");
		String lastname = scin.next();
		System.out.println("Bilet Numaranızı Girin: ");
		int ticketNo = scin.nextInt();
		System.out.println("Check-in Kodunu Giriniz: ");
		int kod = scin.nextInt();

		int s4 = biletalSoyad.indexOf(lastname);
		int s3 = biletalAd.indexOf(name);
		int s1 = checkinNo.indexOf(kod);
		int s2 = biletalNo.indexOf(ticketNo);
		if (s1 == s2 && s4 == s3) {
			System.out.println("Biletiniz onaylandı. Ek hizmetlerden yararlanabilirsiniz.");
		} else {
			System.out.println("Biletiniz onaylanmadı. Bilgilerinizi kontrol ediniz.");
		}
	}

	@Override
	public void koltukSec() {
		int[] koltuk = { 45, 16, 63, 72, 42, 65, 43, 34, 58, 66 };
		// TODO Auto-generated method stub
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


	// -------------------------------------------------------------------------

	@Override
	public void ulasim() {
		// TODO Auto-generated method stub
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
	//-------------------------------------------------------------------------
	public void hediyeKarti(String ad, String soyad) {
		Scanner sckart = new Scanner(System.in);

		String[] kartCepno = { "5466097235", "5396480714", "5056325465" };
		String[] kartSifre = { "sivas1071", "eniyisiKamilhoca", "zeynepama1.75" };
		int[] kartTutar = { 265, 480, 600 };

		String[] yenikayitNo = new String[1];
		String[] yenikayıtSifre = new String[1];
		int[] yenikayıtTutar = new int[1];

		System.out.println(
				"***Seyahat deneyimini sevdiklerinizle paylaşmanın en güzel yolu Çakma Pegasus Hediye Kart ile sevdiklerinize unutulmaz bir hatıra bırakın.***\n");

		System.out.println("Hediye kartı almak için bir işlem seçiniz.\n");
		System.out.println("1.Giriş Yap\n2.Üye Ol");
		int tercih = sckart.nextInt();

		switch (tercih) {
		case 1:
			System.out.println("Telefon Numarası: ");
			String telNo = sckart.next();
			System.out.println("Şİfre: ");
			String sifre = sckart.next();

			if (kartCepno[0].equals(telNo) && kartSifre[0].equals(sifre)) {
				System.out.println("Giriş başarılı bir şekilde gerçekleştirilmiştir.\n\n");
				System.out.println("Hediye kartınıza yüklemek istediğiniz tutarı girin: ");
				int tutar = sckart.nextInt();

				System.out.println("Hediye kartınızın yeni bakiyesi: " + (tutar + kartTutar[0]));
			} else if (kartCepno[1].equals(telNo) && kartSifre[1].equals(sifre)) {
				System.out.println("Giriş başarılı bir şekilde gerçekleştirilmiştir.\n\n");
				System.out.println("Hediye kartınıza yüklemek istediğiniz tutarı girin: ");
				int tutar = sckart.nextInt();

				System.out.println("Hediye kartınızın yeni bakiyesi: " + (tutar + kartTutar[1]));
			} else if (kartCepno[2].equals(telNo) && kartSifre[2].equals(sifre)) {
				System.out.println("Giriş başarılı bir şekilde gerçekleştirilmiştir.\n\n");
				System.out.println("Hediye kartınıza yüklemek istediğiniz tutarı girin: ");
				int tutar = sckart.nextInt();
				System.out.println("Hediye kartınızın yeni bakiyesi: " + (tutar + kartTutar[2]));
			} else {
				System.out.println("Telefon numaranızı veya sifrenizi hatalı girdiniz.");
			}

			break;

		case 2:
			System.out.println("Ad: ");
			String isim = sckart.next();
			System.out.println("Soyad: ");
			String soyisim = sckart.next();
			System.out.println("Telefon Numarası: ");
			String telNo1 = sckart.next();
			yenikayitNo[0] = ad;
			System.out.println("Şifre: ");
			yenikayıtSifre[0] = soyad;
			String sifre1 = sckart.next();
			System.out.println("Şifrenizi tekrar giriniz: ");
			String sifretekrar = sckart.next();
			if (sifre1.equals(sifretekrar)) {
				System.out.println(
						"Üyeliğiniz başarılı bir şekilde gerçekleşmiştir, telefon numaranız sisteme kaydedilmiştir.");
				System.out.println("Hediye kartınıza yüklemek istediğiniz tutarı giriniz: ");
				int tutar1 = sckart.nextInt();
				yenikayıtTutar[0] = tutar1;
				System.out.println("\nHediye kartınızın yeni bakiyesi: " + tutar1);
				System.out.println("\nSisteme kaydedilen bilgiler:\n");
				System.out.println("Telefon Numarası: " + yenikayitNo[0] + "\n" + "Şifre: " + yenikayıtSifre[0] + "\n"
						+ "Hediye Kartı Tutarı: " + yenikayıtTutar[0]);
			} else {
				System.out.println(
						"Hatalı tuşlama yaptığınızdan dolayı üyeliğiniz gerçekleşmedi. Lütfen tekrar deneyiniz.");
			}
		}
	}

	// -------------------------------------------------------------------------

	@Override
	public void otel() {
		// TODO Auto-generated method stub
		System.out.println("Otel Seçenekleri görüntüleniyor...");
		otelGoruntule();

	}
	// -------------------------------------------------------------------------

	@Override
	public void otelGoruntule() {
		// TODO Auto-generated method stub
		System.out.println("-----5 Yıldızlı Oteller-----");
		System.out.println(
				"1-Rose Garden Hotel \n2-Euphoria Hotel \n3-Daisy Hotel \n4-Dandelion Hotel \n5-Lavender Hotel");
		System.out.println("-----3 Yıldızlı Oteller-----");
		System.out.println(
				"1-Transilvanya Hotel \n2-Sünger Bob Hotel \n3-Mickey Mouse Hotel \n4-Cartoon Network Hotel \n5-Garden Hotel");

	}
	// -------------------------------------------------------------------------

	@Override
	public void otoparkHizmeti() {
		// TODO Auto-generated method stub
		System.out.println("-----Otopark Hizmeti Açıklaması-----");
		System.out.println(
				"Otopark hizmetinden yararlanan müşterilerimiz için ilk 3 gün 150 lira standart olarak ücretlendirilir.");
		System.out.println("3 günden sonra her gün için 200 lira ücretlendirilmesi bulunmaktadır.");
		otoparkTutarHesapla();

	}
	// -------------------------------------------------------------------------

	@Override
	public void otoparkTutarHesapla() {
		System.out.println("Aracınızın plakasını giriniz");
		String aracPlaka = scan.nextLine();
		System.out.println("Aracınız ne kadar zaman otoparkta bulunacaktır?");
		int aracZaman = scan.nextInt();
		if (aracZaman > 0 && aracZaman <= 3) {
			System.out.println("Otopark için ödeyeceğiniz tutar 150 liradır...");
		} else {
			System.out.println("Otopark için ödeyeceğiniz tutar:" + (150 + (aracZaman - 3) * 200));
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void ekBagaj() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ekBagajHesapla() {
		// TODO Auto-generated method stub
		
	}
}
// -----------------------------------------------------------

class Bagaj {
	Scanner scan = new Scanner(System.in);

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
	// -----------------------------------------------------------

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
	// -----------------------------------------------------------

	public void bagajDurumuSorgulama(String no) {
		Scanner scan = new Scanner(System.in);
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
	// -----------------------------------------------------------

	public void kayıpBagajBildirimi(String no) {
		System.out.println(no + " Numaralı bagaj hakkında en kısa zamanda dönüş yapılacaktır, iyi günler dileriz.");
	}
	//-------------------------------------------------------------------------
		
		public void ekBagaj() {
			// TODO Auto-generated method stub
			System.out.println("-----Ek Bagaj Hizmeti Açıklaması-----");
			System.out.println(
					"Paketlerinizdeki bagajlara ek olarak bagaj kullanmak için kg başına 30 lira ücretlendirme alınır...");
			ekBagajHesapla();

		}
		// -------------------------------------------------------------------------

		public void ekBagajHesapla() {
			// TODO Auto-generated method stub
			System.out.println("Ekstra kaç kg bagajınız bulunmaktadır?");
			int bagaj = scan.nextInt();
			System.out.println("Bagaj için ödeyeceğiniz tutar:" + (bagaj * 30));

		}
	// -----------------------------------------------------------

	
	
}
//-----------------------------------------------------------

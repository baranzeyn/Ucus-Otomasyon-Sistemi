import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Package implements IPassenger, ITicket, IAdditionalServices, IFlights {
	int kisiS;
	boolean isFlight = true;
	Scanner scan = new Scanner(System.in);
	ArrayList<String> biletalAd = new ArrayList<String>();
	ArrayList<String> biletalSoyad = new ArrayList<String>();
	ArrayList<String> biletalEmail = new ArrayList<String>();
	ArrayList<Integer> biletalYas = new ArrayList<Integer>();
	ArrayList<String> biletalTelno = new ArrayList<String>();
	ArrayList<Integer> biletSonTutar = new ArrayList<Integer>();
	ArrayList<Integer> biletalNo = new ArrayList<Integer>();
	ArrayList<Integer> checkinNo = new ArrayList<Integer>();
	ArrayList<Integer> uygunKalkis = new ArrayList<Integer>();
	ArrayList<Integer> uygunİnis = new ArrayList<Integer>();
	ArrayList<Integer> uygunTarih = new ArrayList<Integer>();
	ArrayList<Integer> uygunUcret = new ArrayList<Integer>();

	public Package() {
	}
	// -----------------------------------------------------------OVERLOADING

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

	public int paketSecim() {//*************************************1.METHOD
		int secim;
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Aşağıdaki paketlerden birini seçiniz\n1-Eco Paket\n2-Avantaj Paket\n3-Comfort-Flex Paket\n4-Super-Eco Paket ");
		secim = scan.nextInt();
		return secim;
	}
	// -----------------------------------------------------------

	public void bilgiler() {//*************************************2.METHOD
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
	public int biletAlNo() {//*************************************3.METHOD
		int m = (int) (Math.random() * 100000);
		biletalNo.add(m);
		System.out.println("Bilet Numaranız:" + m);
		return m;
	}

	// -----------------------------------------------------------
	public int checkinNoAl() {//*************************************4.METHOD
		int k = (int) (Math.random() * 20000);
		checkinNo.add(k);
		System.out.println("Check-in Kodunuz:" + k);
		return k;
	}

	// -----------------------------------------------------------
	public int biletHesaplaKid(int uygun) {//*************************************5.METHOD
		return uygun * (3 / 4);

	}
	// -----------------------------------------------------------

	public int biletHesapla(int uygun) {//*************************************6.METHOD
		return uygun;
	}
	// -----------------------------------------------------------

	public int biletHesaplaOld(int uygun) {//*************************************7.METHOD
		return uygun * (1 / 10);

	}
	// -----------------------------------------------------------

	public int biletToplamTutar() {//*************************************8.METHOD
		int toplam = 0;
		for (int topla : biletSonTutar) {
			toplam += topla;
		}
		return toplam;

	}
	// -----------------------------------------------------------

	public void listele() {//*************************************9.METHOD
		Scanner scan = new Scanner(System.in);
		String choice;
		System.out.println("Eco Paket\n");
		System.out.println("*****************");
		System.out.println(
				"En uygun fiyat\nYurt içinde 15 kg, Kıbrıs ve yurt dışında 20 kg bagaj hakkı\nEko Paket'i ihtiyacına uygun ek hizmetlerle dilediğin gibi şekillendirebilirsin.\n");
		System.out.println("Super Eco \n");
		System.out.println("******************");
		System.out.println(
				"SADECE DIŞ HATLARDA GEÇERLİDİR\nYalnızca 1 adet ve boyutları en fazla 55x40x20 cm ebatlarında olan kabin bagajı hakkı");
		System.out.println("Avantaj Paket\n");
		System.out.println("******************");
		System.out.println(
				"Ek hizmetlerini indirimli sunar\nKoltuk seçme (ekstra diz mesafesi hariç)\n20 kg bagaj hakkı\nSandviç\nFly&Watch uçak içi eğlence hizmetleri");
		System.out.println("Comfort Flex Paket");
		System.out.println("******************");
		System.out.println(
				"Ekstra konforlu ve esnek bir seyahat\nCezasız bilet değiştirme ve iptal hakkı\n20 kg bagaj hakkı\nSandviç ikramı\nTek parça kabin bagajı ve koltuk seçme (ekstra diz mesafesi dahil)\nFly&Watch uçak içi eğlence ayrıcalıkları"
						+ "\nDüzenlenen biletlerde tarifeli uçuş kalkış saatine 2 saat kalana dek yapılan iptal ve değişikliklerde işlem bedeli uygulanmaz\nBilet iptalinde bilet ücreti Hizmet Bedeli hariç kesintisiz olarak iade edilir"
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
	public void check_in() {//*************************************10.METHOD
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
		if ((s1 == 0) && (s2 == 0) && s4 == s3) {
			System.out.println("Biletiniz onaylandı. Ek hizmetlerden yararlanabilirsiniz.");
		} else {
			System.out.println("Biletiniz onaylanmadı. Bilgilerinizi kontrol ediniz.");
		}
	}

	public void biletAl() {//*************************************11.METHOD
		System.out.println("Nereden: ");
		String nereden = scan.next();
		System.out.println("Nereye: ");
		String nereye = scan.next();
		System.out.println("Gidiş tarihini ay ve gün olarak giriniz:");
		double tarih1 = scan.nextDouble();
		System.out.println("1.Tek Yön\n2.Çift Yön");
		System.out.println("Seçiminizi yapınız: ");
		int yon = scan.nextInt();
		System.out.println("1-En yakın tarihli bilet bulma\n2-Uygun fiyatlı bilet bulma");
		int select3 = scan.nextInt();
		Package b = new Package(2);
		if (select3 == 1) {
			if (yon == 1) {
				for (int y : biletalYas) {
					if (y > 0 && y <= 6) {
						int g = yakınbiletBul(nereden, nereye);
						if (isFlight) {
							System.out.println("Bilet ücretiniz:" + biletHesaplaKid(g));
							biletSonTutar.add(biletHesaplaKid(g));
							biletAlNo();
							checkinNoAl();
						}
						break;
					} else if (y > 6 && y < 65) {
						int g1 = yakınbiletBul(nereden, nereye);
						if (isFlight) {

							System.out.println("Bilet ücretiniz:" + biletHesapla(g1));
							biletSonTutar.add(biletHesapla(g1));
							biletAlNo();
							checkinNoAl();
						}
						break;

					} else if (y >= 65 && y <= 130) {
						if (isFlight) {
							int g2 = yakınbiletBul(nereden, nereye);
							System.out.println("Bilet ücretiniz:" + biletHesaplaOld(g2));
							biletSonTutar.add(biletHesaplaOld(g2));
							biletAlNo();
							checkinNoAl();
						}
					} else {
						System.out.println("Hatalı tuşlama yaptınız...");
					}
				}
			}

			else if (yon == 2) {
				System.out.println("Dönüş tarihini giriniz:");
				double tarih2 = scan.nextDouble();
				for (int z : biletalYas) {
					if (z > 0 && z <= 6) {
						int g3 = yakınbiletBul(nereden, nereye);
						if (isFlight) {
							System.out.println("Bilet ücretiniz:" + (biletHesaplaKid(g3) * 2));

							biletAlNo();
							checkinNoAl();
						}
					} else if (z >= 65) {
						int g4 = yakınbiletBul(nereden, nereye);
						if (isFlight) {
							System.out.println("Bilet ücretiniz:" + (biletHesaplaOld(g4) * 2));
							biletAlNo();
							checkinNoAl();
						}
					} else if (z > 6 && z < 65) {

						int g5 = yakınbiletBul(nereden, nereye);
						if (isFlight) {
							System.out.println("Bilet ücretiniz:" + biletHesapla(g5) * 2);
							biletAlNo();
							checkinNoAl();
						}
					} else {
						System.out.println("Hatalı tuşlama yaptınız...");

					}

				}

			}
		}
		if (select3 == 2) {
			if (yon == 1) {
				for (int y : biletalYas) {
					if (y > 0 && y <= 6) {
						int r = uygunbiletBul(nereden, nereye, tarih1);
						if (isFlight) {
							System.out.println("Bilet ücretiniz:" + biletHesaplaKid(r));
							biletSonTutar.add(biletHesaplaKid(r));
							biletAlNo();
							checkinNoAl();
						}
					} else if (y > 6 && y < 65) {
						int r1 = uygunbiletBul(nereden, nereye, tarih1);
						if (isFlight) {
							System.out.println("Bilet ücretiniz:" + biletHesapla(r1));
							biletSonTutar.add(biletHesapla(r1));
							biletAlNo();
							checkinNoAl();
						}
					} else if (y >= 65 && y <= 130) {
						int r2 = uygunbiletBul(nereden, nereye, tarih1);
						if (isFlight) {

							System.out.println("Bilet ücretiniz:" + biletHesaplaOld(r2));
							biletSonTutar.add(biletHesaplaOld(r2));
							biletAlNo();
							checkinNoAl();
						}
					} else {
						System.out.println("Hatalı tuşlama yaptınız...");
					}
				}
			} else if (yon == 2) {
				for (int z : biletalYas) {
					if (z > 6 && z < 65) {
						int r3 = uygunbiletBul(nereden, nereye, tarih1);
						if (isFlight) {

							System.out.println("Bilet ücretiniz:" + biletHesapla(r3) * 2);
							biletSonTutar.add(biletHesaplaOld(r3) * 2);
							biletAlNo();
							checkinNoAl();
						}
					} else if (z <= 6 && z > 0) {
						int r4 = uygunbiletBul(nereden, nereye, tarih1);
						if (isFlight) {

							System.out.println("Bilet ücretiniz:" + (biletHesaplaKid(r4) * 2));
							biletSonTutar.add(biletHesaplaOld(r4) * 2);
							biletAlNo();
							checkinNoAl();
						}

					} else if (z >= 65 && z < 130) {
						int r5 = uygunbiletBul(nereden, nereye, tarih1);
						if (isFlight) {

							System.out.println("Bilet ücretiniz:" + (biletHesaplaOld(r5) * 2));
							biletSonTutar.add(biletHesaplaOld(r5) * 2);
							biletAlNo();
							checkinNoAl();
						}
					} else {
						System.out.println("Hatalı giriş yaptınız...");
					}
				}
			}

		}

	}

	public void check_in2() {//*************************************12.METHOD

		System.out.println("Adınızı Girin: ");
		String name1 = scan.next();
		System.out.println("Soyadınızı Girin: ");
		String lastname1 = scan.next();
		System.out.println("Bilet Numaranızı Girin: ");
		int ticketNo1 = scan.nextInt();
		System.out.println("Check-in Kodunu Giriniz: ");
		int kod1 = scan.nextInt();
		if (name1.equals(IPassenger.ad) && lastname1.equals(IPassenger.soyad) && ticketNo1 == (IPassenger.biletNumarası)
				&& kod1 == IPassenger.check_inNumarası) {
			System.out.println("Biletiniz onaylandı. Ek hizmetlerden yararlanabilirsiniz.");
		} else {
			System.out.println("Biletiniz onaylanmadı. Bilgilerinizi kontrol ediniz.");
		}
	}
//------------------------------------------------------------------------------
	public void ekHizmetgoruntule() {//*************************************13.METHOD
		int secim2;
		System.out.println("1-Koltuk Seç\n2-Otel Konaklama\n3-Ek Bagaj\n4-Otopark Hizmeti");
		secim2 = scan.nextInt();
		switch (secim2) {
		case 1:
			koltukSec();
			break;
		case 2:
			otel();
			break;
		case 3:
			ekBagaj();
			break;
		case 4:
			otoparkHizmeti();
			break;

		}
	}
//-------------------------------------------------------------------------------------
	@Override
	public void koltukSec() {//*************************************14.METHOD
		int[] koltuk = { 45, 16, 63, 72, 42, 65, 43, 34, 58, 66 };
		System.out.println("Boş Koltuklar:");
		for (int b = 0; b < koltuk.length; b++) {
			System.out.print(koltuk[b] + ", ");
		}
		boolean empty = true;
		int koltuk1 = 0, koltuk2 = 0;
		try {
			System.out.println("\nDeğiştirmek istediğiniz koltuk numarasını giriniz:");
			koltuk1 = scan.nextInt();
			for (int bos : koltuk) {
				if (koltuk1 == bos) {
					throw new InputMismatchException();

				}
			}

			System.out.println("Seçmek istediğiniz koltugu giriniz: ");
			koltuk2 = scan.nextInt();
			for (int a : koltuk) {
				if (koltuk2 == a) {
					System.out.println("Koltuk değiştirme işleminiz başarıyla tamamlanmıştır. ");
					a = koltuk1;
					empty = true;
					break;
				} else {
					empty = false;

				}
			}
		} catch (InputMismatchException e) {
			System.out.println("İşleminiz başarısız.");

		}

		if (empty == false) {
			System.out.println("Koltuk değiştirme işleminiz başarısız.Seçmek istediğiniz koltuk doludur.");
		}

	}

	// -------------------------------------------------------------------------

	public void ulasim() {//*************************************15.METHOD
		System.out.println("Tercih ettiğiniz ulaşım yöntemini seçiniz:");
		System.out.println("1-Otobüs\n2-Minibüs\n3-Taksi\n4-İzban");
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

	// -------------------------------------------------------------------------
	public void hediyeKarti() {//*************************************16.METHOD
		Scanner sckart = new Scanner(System.in);

		String[] kartCepno = { "5466097235", "5396480714", "5056325465" };
		String[] kartSifre = { "sivas1071", "eniyisiKamilhoca", "zeynepama1.75" };
		int[] kartTutar = { 265, 480, 600 };

		String[] yenikayitNo = new String[1];
		String[] yenikayıtSifre = new String[1];
		int[] yenikayıtTutar = new int[1];

		System.out.println(
				"***Seyahat deneyimini sevdiklerinizle paylaşmanın en güzel yolu Kasaba Official Hediye Kartı ile sevdiklerinize unutulmaz bir hatıra bırakın.***\n");

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
			yenikayitNo[0] = isim;
			System.out.println("Şifre: ");
			yenikayıtSifre[0] = soyisim;
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
			break;
		default:
			System.out.println("Hatalı Tuşlama Yaptınız..");

		}

	}

	// -------------------------------------------------------------------------

	@Override
	public void otel() {//*************************************17.METHOD
		System.out.println("Otel Seçenekleri görüntüleniyor...");
		otelGoruntule();

	}
	// -------------------------------------------------------------------------

	@Override
	public void otelGoruntule() {//*************************************18.METHOD
		int gnYUcreti = 0;
		int gnCUcreti = 0;
		System.out
				.println("Otel tipi seçiniz\n" + "1- 5 yıldızlı otel seçenekleri\n" + "2- 3 yıldızlı otel seçenekleri");
		int otelTipiSecimi = scan.nextInt();
		if (otelTipiSecimi == 2) {
			System.out.println("-----3 Yıldızlı Oteller-----");
			System.out.println(
					"1-Transilvanya Hotel \n2-Sünger Bob Hotel \n3-Mickey Mouse Hotel \n4-Cartoon Network Hotel \n5-Garden Hotel");
			System.out.println("Otel seçiminizi yapınız:");
			int otelSecim = scan.nextInt();
			System.out.println("Kaç yetişkin kişi kalacaksınız:");
			int otelYKisi = scan.nextInt();
			System.out.println("Kaç çocuk kişi kalacaksınız:");
			int otelCkisi = scan.nextInt();
			System.out.println("Kaç gün kalacaksınız");
			int otelGun = scan.nextInt();
			switch (otelSecim) {
			case 1:
				gnYUcreti = 500;
				gnCUcreti = 375;
				System.out.println("Transilvanya Oteli seçtiniz\nBir günlük yetişkin konaklama ücreti " + gnYUcreti
						+ "\nBir günlük çocuk(0-6 yaş) konaklama ücreti " + gnCUcreti + "TL");
				System.out.println("Toplam tutar:"
						+ otelGun * otelTutarHesaplama(otelYKisi, otelCkisi, gnYUcreti, gnCUcreti) + "TL");
				break;
			case 2:
				gnYUcreti = 475;
				gnCUcreti = 350;
				System.out.println("Sünger Bob Otelini seçtiniz.\nBir günlük yetişkin konaklama ücreti " + gnYUcreti
						+ "\nBir günlük çocuk(0-6 yaş) konaklama ücreti " + gnCUcreti + "TL");
				System.out.println("Toplam tutar:"
						+ otelGun * otelTutarHesaplama(otelYKisi, otelCkisi, gnYUcreti, gnCUcreti) + "TL");
				break;
			case 3:
				gnYUcreti = 550;
				gnCUcreti = 450;
				System.out.println("Mickey Mouse Otelini seçtiniz.\nBir günlük yetişkin konaklama ücreti " + gnYUcreti
						+ " TL\nBir günlük çocuk(0-6 yaş) konaklama ücreti " + gnCUcreti + "TL");
				System.out.println("Toplam tutar:"
						+ otelGun * otelTutarHesaplama(otelYKisi, otelCkisi, gnYUcreti, gnCUcreti) + "TL");
			case 4:
				gnYUcreti = 525;
				gnCUcreti = 460;
				System.out.println("Cartoon Network Otelini seçtiniz.\nBir günlük yetişkin konaklama ücreti "
						+ gnYUcreti + "TL\nBir günlük çocuk(0-6 yaş) konaklama ücreti " + gnCUcreti + "TL");
				System.out.println("Toplam tutar:"
						+ otelGun * otelTutarHesaplama(otelYKisi, otelCkisi, gnYUcreti, gnCUcreti) + "TL");
				break;
			case 5:
				gnYUcreti = 455;
				gnCUcreti = 370;
				System.out.println(
						"Garden Otelini seçtiniz.\nBir günlük yetişkin konaklama ücreti 455TL\nBir günlük çocuk(0-6 yaş) konaklama ücreti 370TL");
				System.out.println("Toplam tutar:"
						+ otelGun * otelTutarHesaplama(otelYKisi, otelCkisi, gnYUcreti, gnCUcreti) + "TL");
				break;
			default:
				System.out.println("Hatalı tuşlama yaptınız...");
				break;
			}
		} else if (otelTipiSecimi == 1) {
			System.out.println("-----5 Yıldızlı Oteller-----");
			System.out.println(
					"1-Rose Garden Hotel \n2-Euphoria Hotel \n3-Daisy Hotel \n4-Dandelion Hotel \n5-Lavender Hotel");
			System.out.println("Otel seçiminizi yapınız:");
			int otelSecim1 = scan.nextInt();
			System.out.println("Kaç yetişkin kişi kalacaksınız:");
			int otelYKisi = scan.nextInt();
			System.out.println("Kaç çocuk kişi kalacaksınız:");
			int otelCkisi = scan.nextInt();
			System.out.println("kaç gün kalacaksınız");
			int otelGun = scan.nextInt();
			switch (otelSecim1) {
			case 1:
				gnYUcreti = 500;
				gnCUcreti = 375;
				System.out.println("Rose Garden Otelini seçtiniz.\nBir günlük yetişkin konaklama ücreti " + gnYUcreti
						+ "TL\nBir günlük çocuk(0-6 yaş) konaklama ücreti " + gnCUcreti + "TL");
				System.out.println("Toplam tutar:"
						+ otelGun * otelTutarHesaplama(otelYKisi, otelCkisi, gnYUcreti, gnCUcreti) + "TL");
				break;
			case 2:
				gnYUcreti = 650;
				gnCUcreti = 520;
				System.out.println("Euphoria Otelini seçtiniz.\nBir günlük yetişkin konaklama ücreti " + gnYUcreti
						+ "TL\nBir günlük çocuk(0-6 yaş) konaklama ücreti " + gnCUcreti + "TL");
				System.out.println("Toplam tutar:"
						+ otelGun * otelTutarHesaplama(otelYKisi, otelCkisi, gnYUcreti, gnCUcreti) + "TL");
				break;
			case 3:
				gnYUcreti = 550;
				gnCUcreti = 450;
				System.out.println("Daisy Otelini seçtiniz.\nBir günlük yetişkin konaklama ücreti " + gnYUcreti
						+ "TL\nBir günlük çocuk(0-6 yaş) konaklama ücreti " + gnCUcreti + "TL");
				System.out.println("Toplam tutar:"
						+ otelGun * otelTutarHesaplama(otelYKisi, otelCkisi, gnYUcreti, gnCUcreti) + "TL");
				break;
			case 4:
				gnYUcreti = 525;
				gnCUcreti = 460;
				System.out.println("Dandelion Otelini seçtiniz.\nBir günlük yetişkin konaklama ücreti " + gnYUcreti
						+ "TL\nBir günlük çocuk(0-6 yaş) konaklama ücreti " + gnCUcreti + "TL");
				System.out.println("Toplam tutar:"
						+ otelGun * otelTutarHesaplama(otelYKisi, otelCkisi, gnYUcreti, gnCUcreti) + "TL");
				break;
			case 5:
				gnYUcreti = 455;
				gnCUcreti = 370;
				System.out.println("Lavender Otelini seçtiniz.\nBir günlük yetişkin konaklama ücreti " + gnYUcreti
						+ "TL\nBir günlük çocuk(0-6 yaş) konaklama ücreti " + gnCUcreti + "TL");
				System.out.println("Toplam tutar:"
						+ otelGun * otelTutarHesaplama(otelYKisi, otelCkisi, gnYUcreti, gnCUcreti) + "TL");
				break;
			default:
				System.out.println("Hatalı tuşlama yaptınız...");
				break;
			}

		}

	}

	// ------------------------------------------------------------------------OVERLOADING
	//*************************************19.METHOD
	public int otelTutarHesaplama(int yetiskinS, int cocukS, int gnlkYetiskinUcreti, int gnlkCocukUcreti) {
		int toplam = 0;
		toplam += yetiskinS * gnlkYetiskinUcreti;
		toplam += cocukS * gnlkCocukUcreti;

		return toplam;
	}

	// ----------------------------------------------------------------------------
	//*************************************20.METHOD
	public int otelTutarHesaplama(int yetiskinS, int gnlkYetiskinUcreti) {
		int toplam = 0;
		toplam += yetiskinS * gnlkYetiskinUcreti;
		return toplam;
	}

	// -------------------------------------------------------------------------

	@Override
	public void otoparkHizmeti() {//*************************************21.METHOD

		System.out.println("-----Otopark Hizmeti Açıklaması-----");
		System.out.println(
				"Otopark hizmetinden yararlanan müşterilerimiz için ilk 3 gün 300 lira standart olarak ücretlendirilir.");
		System.out.println("3 günden sonra her gün için 200 lira ücretlendirilmesi bulunmaktadır.");
		otoparkTutarHesapla();

	}
	// -------------------------------------------------------------------------
	//*************************************22.METHOD
	@Override
	public void otoparkTutarHesapla() {
		System.out.println("Aracınızın plakasını giriniz");
		String aracPlaka = scan.next();
		System.out.println("Aracınız ne kadar zaman otoparkta bulunacaktır?");
		int aracZaman = scan.nextInt();
		if (aracZaman > 0 && aracZaman <= 3) {
			System.out.println("Otopark için ödeyeceğiniz tutar 150 liradır...");
		} else {
			System.out.println("Otopark için ödeyeceğiniz tutar:" + (150 + (aracZaman - 3) * 200));
		}

	}// ------------------------------------------------------------------------
	//*************************************23.METHOD
	@Override
	public void ekBagaj() {

		System.out.println("-----Ek Bagaj Hizmeti Açıklaması-----");
		System.out.println(
				"Paketlerinizdeki bagajlara ek olarak bagaj kullanmak için kg başına 30 lira ücretlendirme alınır...");
		ekBagajHesapla();

	}// -------------------------------------------------------------------------
	//*************************************24.METHOD
	@Override
	public void ekBagajHesapla() {

		System.out.println("Ekstra kaç kg bagajınız bulunmaktadır?");
		int bagaj = scan.nextInt();
		System.out.println("Bagaj için ödeyeceğiniz tutar:" + (bagaj * 30));

	}// ---------------------------------------------------------------------OVERLOADING
	//*************************************25.METHOD
	public void ekBagajHesapla(int gecmeMik) {
		System.out.println("Bagaj için ödeyeceğiniz tutar:" + (gecmeMik * 30));

	}

//-------------------------------------------------------------------------------
	//*************************************26.METHOD
	@Override
	public int uygunbiletBul(String kalkis1, String inis1, double tarih1) {

		int i;
		for (i = 0; i < kalkisyer.length; i++) {
			if (kalkisyer[i].equalsIgnoreCase(kalkis1)) {
				uygunKalkis.add(i);
			}
		}
		for (i = 0; i < inisyer.length; i++) {
			if (inisyer[i].equalsIgnoreCase(inis1)) {
				uygunİnis.add(i);
			}
		}
		for (i = 0; i < date.length; i++) {
			if (date[i] == tarih1) {
				uygunTarih.add(i);
			}
		}
		for (int x : uygunKalkis) {
			for (int y : uygunİnis) {
				for (int z : uygunTarih) {
					if ((x == y) && (y == z)) {
						uygunUcret.add(x);
					}
				}
			}
		}
		System.out.println("İsteklerinize uygun " + uygunUcret.size() + " bilet görüntüleniyor");
		int k = uygunUcret.size();
		int uygunFiyat = 0;

		if (k == 1) {
			uygunFiyat = ucret[uygunUcret.get(k - 1)];
		}

		else if (k == 0) {
			System.out.println("Aradığınız kriterde bilet bulunmamaktadır.");
			isFlight = false;
			return 0;
		} else {
			for (int l = 1; l < k; l++) {

				if (ucret[uygunUcret.get(l)] > ucret[uygunUcret.get(l - 1)]) {
					uygunFiyat = ucret[uygunUcret.get(l - 1)];
				} else if (ucret[uygunUcret.get(l)] == ucret[uygunUcret.get(l - 1)]) {
					uygunFiyat = ucret[uygunUcret.get(l)];
				}
			}

		}
		System.out.println("Aranan kriterlerdeki bilet ücreti:" + uygunFiyat);
		return uygunFiyat;
	}

//-----------------------------------------------------------------------------------
	//*************************************27.METHOD
	@Override
	public int yakınbiletBul(String kalkis2, String inis2) {
		int i;
		int z = 0;
		for (i = 0; i < kalkisyer.length; i++) {
			if (kalkisyer[i].equalsIgnoreCase(kalkis2)) {
				uygunKalkis.add(i);
			}
		}
		for (i = 0; i < inisyer.length; i++) {
			if (inisyer[i].equalsIgnoreCase(inis2)) {
				uygunİnis.add(i);
			}
		}
		for (int x : uygunKalkis) {
			for (int y : uygunİnis) {
				if (x == y) {
					uygunTarih.add(x);
				}
			}
		}
		System.out.println("İsteklerinize uygun " + uygunTarih.size() + " bilet görüntüleniyor");
		int k = uygunTarih.size();
		double uyguntarih1;
		if (k == 0) {
			System.out.println("İstenilen kriterlere uygun sefer bulunmamaktadır...");
			isFlight = false;
			return 0;

		} else if (k == 1) {
			uyguntarih1 = date[uygunTarih.get(k - 1)];
			System.out.println("İstenilen kriterlerdeki seferin tarihi(ay.gün olarak):" + uyguntarih1
					+ " başlangıç ücreti:" + ucret[k - 1]);
			z = uygunKalkis.get(0);

		} else {

			for (int p = 1; p < uygunTarih.size(); p++) {

				if (date[uygunTarih.get(p)] > date[uygunTarih.get(p - 1)]) {
					uyguntarih1 = date[uygunTarih.get(p)];
					z = uygunİnis.get(p);
					System.out.println("İsteğiniz kriterlere uygun biletin tarihi(ay-gün olarak):" + uyguntarih1
							+ " Saati:" + saat[z]);

				} else if (date[uygunTarih.get(p)] == date[uygunTarih.get(p - 1)]) {
					uyguntarih1 = date[uygunTarih.get(p)];
					z = uygunİnis.get(p);
					System.out.println("İsteğiniz kriterlere uygun biletin tarihi(ay.gün olarak):" + uyguntarih1
							+ "Saati:" + saat[z]);

				}

			}

		}

		return ucret[z];
	}
}
// -----------------------------------------------------------

class Bagaj implements IBagaj {
	Scanner scan8 = new Scanner(System.in);

	public Bagaj() {
		System.out.println("Yapmak istediğiniz işlemi seçiniz:");
		System.out.println("1-Bagaj hakkını öğrenme\n2-Bagaj durumu sorgulama\n3-Kayıp bagaj bildirimi ");
		int secim8 = scan8.nextInt();

		switch (secim8) {
		case 1:
			System.out.println("-Eco Paket\n-Avantaj Paket\n-Comfort-Flex Paket\n-Super-Eco Paket ");
			System.out.println("Uçuş paketinizi giriniz: ");
			String paket5 = scan8.next();
			bagajHakkiniOgren(paket5);
			break;
		case 2:
			System.out.println("Bilet numaranızı giriniz:");
			String no = scan8.next();
			bagajDurumuSorgulama(no);
			break;
		case 3:
			System.out.println("Bagaj kodunu giriniz:");
			String bagajNo = scan8.next();
			kayıpBagajBildirimi(bagajNo);
			break;
		default:
			System.out.println("Hatalı tuşlama yaptınız1...");
			System.out.println("Sistemden çıkış yapılıyor");
			break;

		}

	}
	// -----------------------------------------------------------

	String bagajTakipNo;
	//*************************************28.METHOD
	public void bagajHakkiniOgren(String paket1) {
		if (paket1.equalsIgnoreCase("eco")) {
			System.out.println("Yurt içinde 15 kg, Kıbrıs ve yurt dışında 20 kg bagaj hakkınız bulunmaktadır.");
		}

		else if (paket1.equalsIgnoreCase("Super-Eco")) {
			System.out.println(
					"Yalnızca 1 adet ve boyutları en fazla 55x40x20 cm ebatlarında olan kabin bagajı hakkınız bulunmaktadır...");
		}

		else if (paket1.equalsIgnoreCase("Avantaj")) {
			System.out.println("20 kg bagaj hakkınız bulunmaktadır...");
		}

		else if (paket1.equalsIgnoreCase("Comfort-Flex")) {
			System.out.println("Tek parça kabin ve 20 kg bagaj hakkınız bulunmaktadır...");
		}

		else {
			System.out.println("Hatalı tuşlama yaptınız...");
			System.out.println("Sistemden çıkış yapılıyor...");
			System.exit(0);
		}
	}
	// ----------------------------------------------------------
	//*************************************29.METHOD
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
	//*************************************30.METHOD
	public void kayıpBagajBildirimi(String no) {
		System.out.println(no + " Numaralı bagaj hakkında en kısa zamanda dönüş yapılacaktır, iyi günler dileriz.");
	}
	// -------------------------------------------------------------------------

}

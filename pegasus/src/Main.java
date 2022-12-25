import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int secenek;

		System.out.println("***Kasaba Official Airlines Hizmetinizde***\n");
		System.out.println("Seçenekler Görüntüleniyor...\n");
		System.out.println(
				"  1.Bilet Al\n  2.Online Check-in\n  3.Ek Hizmetlerden Yararlan\n  4.Bagaj İşlemleri\n  5.Pegasus Kafeden Yararlan\n  6.Fly&Watch\n  7.Opsiyonel Bilet İşlemleri\n");
		System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
		secenek = sc.nextInt();

		Package package1 = new Package();

		switch (secenek) {
		case 1:
			package1.bilgiler();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		default:
			System.out.println("Hatalı tuşlama yaptınız..");
		}
	}
}


public interface IFlights {

	String[] kalkisyer = { "İstanbul", "Konya", "İzmir", "Sivas", "Şanlıurfa ", "Ordu", "Yozgat", "Gaziantep",
			"Eskişehir", "Sakarya", "Van", "Mardin", "Diyarbakır", "Yozgat", "Gaziantep", "Eskişehir", "Sakarya", "Van",
			"Mardin", "Diyarbakır", "Bursa", "İstanbul", "Konya", "İzmir", "Sivas", "Şanlıurfa ", "Ordu" ,"Eskişehir"};

	String[] inisyer = { "Sivas", "İzmir", "Konya", "İstanbul", "Ordu", "Şanlıurfa", "Gaziantep", "Yozgat", "Sakarya",
			"Eskişehir", "Mardin", "Van", "Bursa", "Gaziantep", "Yozgat", "Sakarya", "Eskişehir", "Mardin", "Van",
			"Bursa", "Diyarbakır", "Sivas", "İzmir", "Konya", "İstanbul", "Ordu", "Şanlıurfa" ,"Sakarya"};

	double[] saat = { 13.00, 10.00, 16.00, 15.00, 11.45, 21.35, 20.00, 22.00, 19.30, 21.20, 11.00, 06.45, 08.40, 07.45,
			12.25, 21.15, 17.55, 13.12, 11.40, 09.50, 01.25, 02.02, 12.12, 23.30, 03, 55, 07.23, 22.37, 16.16 };
	
	int[] ucret = { 750, 675, 675, 750, 900, 900, 700, 700, 725, 725, 1300, 1300, 1750, 1750, 800, 725, 625, 650, 950,
			950, 720, 675, 775, 775, 1600, 1200, 1450, 1250 };
	String[] gate = { "B7", "A6", "K9", "H8", "L8", "C6", "H3", "Z7", "B3", "A3", "C7", "K2", "L2", "H1", "B7", "A6",
			"K9", "H8", "L8", "C6", "H3", "Z7", "B3", "A3", "C7", "K2", "L2", "H1" };

	Double[] date = { 11.26, 01.01, 12.12, 04.01, 06.26, 10.07, 07.02, 03.05, 09.23, 02.14, 10.27, 05.01, 09.15, 07.14,
			08.26, 03.01, 10.12, 02.01, 04.21, 08.04, 02.18, 03.16, 07.18, 03.07, 04.01, 02.11, 07.22, 09.09 };

	int uygunbiletBul(String kalkis1, String inis1, double tarih1);

	int yakınbiletBul(String kalkis2, String inis2);

}

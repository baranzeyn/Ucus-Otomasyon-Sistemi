
public interface ITicket {
	public String biletNo = "J0897";
	public String kalkisYeri = "Urfa-GAP H";
	public String inisYeri = "İzmir-Adnan Menderes H";
	public String durumBilgisi = "delayed";
	// kalkış\iniş saati eklenecek

	public void check_in(String ad, String soyad, String biletNo);
}

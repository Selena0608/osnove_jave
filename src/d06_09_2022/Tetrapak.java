package d06_09_2022;

public class Tetrapak extends Ambalaza{
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		atribut koji kaze da li se moze reciklirati
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu tako da ispunjava uslova:
//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena
//		metoda stampaj stampa sve podatke iz klase tetrapak.
	
	private boolean zaReciklazu;
	private double cena;
	

	
	public Tetrapak(String barKod, String nazivArtikla, int netoTezina, int brutoTezina, boolean zaReciklazu, double cena) {
		super(barKod,nazivArtikla,netoTezina,brutoTezina);
		this.zaReciklazu = zaReciklazu;
		this.cena = cena;
	}





	public boolean isZaReciklazu() {
		return zaReciklazu;
	}
	public void setZaReciklazu(boolean zaReciklazu) {
		this.zaReciklazu = zaReciklazu;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	
//	racuna cenu tako da ispunjava uslova:
//	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//	ako nije u cenu ulazi samo osnovna cena	
	
	@Override
	public double cenaArtikla() {
		if(this.zaReciklazu == true) {
			return this.tezinaPakovanja() * 1.5 + this.cena;
		} else {
			return this.cena;
		}
	}
	
//	metoda stampaj stampa sve podatke iz klase tetrapak.	
	@Override
	public void stampaj() {
		System.out.println("Naziv artikla: " + this.nazivArtikla);
		System.out.println("Barkod: " + this.barKod);
		System.out.println("Bruto tezina: " + this.brutoTezina + ", Neto tezina: " + this.netoTezina);
		if(this.zaReciklazu == true) {
			System.out.println("Od recikliranog materijala.");
		} else {
			System.out.println("Nije od recikliranog materijala.");
		}
		System.out.println("Osnovna cena: " + this.cena);
		
	}
	
	
	

}

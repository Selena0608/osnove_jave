package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza{
//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//		kaucija za flasu
//		atribut koji kaze da li se za flasu placa kaucija
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu
//		ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//		ako se ne placa, (osnovna cena) * 1.2
//		metoda stampaj stampa sve podatke iz klase staklena flasa.
	
	private double kaucija;
	private boolean isPlatiKauciju;
	private double osnovnaCena;
	
	
	public StaklenaAmbalaza(String barKod, String nazivArtikla, int netoTezina, int brutoTezina, double kaucija, boolean isPlatiKauciju, double osnovnaCena) {
		super(barKod,nazivArtikla,netoTezina,brutoTezina);
		this.kaucija = kaucija;
		this.isPlatiKauciju = isPlatiKauciju;
		this.osnovnaCena = osnovnaCena;
	}
	
	
	public double getKaucija() {
		return kaucija;
	}
	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}
	public boolean isPlatiKauciju() {
		return isPlatiKauciju;
	}
	public void setPlatiKauciju(boolean isPlatiKauciju) {
		this.isPlatiKauciju = isPlatiKauciju;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	@Override
	public double cenaArtikla() {
		if(this.isPlatiKauciju == true) {
			return this.osnovnaCena * 1.2 + this.kaucija;
		} else {
			return this.osnovnaCena * 1.2;
		}
	}
	@Override
	public void stampaj() {
		System.out.println("Naziv artikla: " + this.nazivArtikla);
		System.out.println("Barkod: " + this.barKod);
		System.out.println("Bruto tezina: " + this.brutoTezina + ", Neto tezina: " + this.netoTezina);
		if(this.isPlatiKauciju == true) {
			System.out.println("Kaucija je:" + this.kaucija);
		} else {
			System.out.println("Nema kaucije na ambalazu.");
		}
		System.out.println("Osnovna cena: " + this.osnovnaCena);
		
		
	}

	
	
}

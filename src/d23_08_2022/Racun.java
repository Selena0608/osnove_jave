package d23_08_2022;

public class Racun {
//	Kreirati klasu Racun koja ima:
//		broj racuna (npr: 170-289328923-23)
//		ime i prezime osobe
//		trenutno stanje na racunu (npr: 100, 1220)
//		gettere i setter za sve atribute, sem settera
//		za stanje na racunu
//		metodu koja menja stanje na racunu za prosledjenu 
//		vrednost (stanje na racunu ne moze da bude manje od nule)
//		metodu koja stampa podatke o racunu u formatu:
//		Ime i prezime  -  broj racuna
//		stanje na racunu je (trenutno stanje) rsd.

	private String brojRacuna;
	private String ime;
	private int stanjeNaRacunu;

	public Racun(String brojRacuna, String ime, int stanjeNaRacunu) {
		this.brojRacuna = brojRacuna;
		this.ime = ime;
		this.stanjeNaRacunu = stanjeNaRacunu;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getStanjeNaRacunu() {
		return stanjeNaRacunu;
	}

	public int novoStanjeRacuna(int vrednost) {
		return this.stanjeNaRacunu - vrednost;
		if(this.stanjeNaRacunu < 0) {
			this.stanjeNaRacunu = 0;
	}
	
		
	public void print(){
		System.out.println(this.ime + " - " + this.brojRacuna);
		System.out.println("Stanje na racunu je: " + this.stanjeNaRacunu + "rsd.");
	}
		
		
		
	
	}

}

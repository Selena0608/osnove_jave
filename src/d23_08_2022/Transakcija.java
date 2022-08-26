package d23_08_2022;

public class Transakcija {

	private String id;
	private Racun racunPrenos;
	private Racun racunPrijem;

	public Transakcija() {

	}

	public Transakcija(String id, Racun racunPrenos, Racun racunPrijem) {
		this.id = id;
		this.racunPrenos = racunPrenos;
		this.racunPrijem = racunPrijem;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Racun getRacunPrenos() {
		return racunPrenos;
	}

	public void setRacunPrenos(Racun racunPrenos) {
		this.racunPrenos = racunPrenos;
	}

	public Racun getRacunPrijem() {
		return racunPrijem;
	}

	public void setRacunPrijem(Racun racunPrijem) {
		this.racunPrijem = racunPrijem;
	}

	private double provizija(double visinaTransakcije) {
		if (visinaTransakcije <= 4500) {
			return 45;
		} else
			return visinaTransakcije * 0.01;
	}

//	metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi.
//	Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//	Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), 
//	a na drugi racun dodaje samo (trazena suma).
//	(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava

	public void transakcija(double visinaTransakcije) {
		if( this.racunPrenos.getStanjeNaRacunu() > (visinaTransakcije + provizija(visinaTransakcije))) {
		 this.racunPrenos.getStanjeNaRacunu() = this.racunPrenos.getStanjeNaRacunu() - visinaTransakcije - provizija(visinaTransakcije);
		} this.racunPrijem.getStanjeNaRacunu() + visinaTransakcije;
	}

	
	public void  stampaj() {
		System.out.println("ID transakcije: " + this.id);
		System.out.println("Racun sa: " + this.racunPrenos.getIme() + " - " + this.racunPrenos.getBrojRacuna());
		System.out.println("Racun sa: " + this.racunPrijem.getIme() + " - " + this.racunPrijem.getBrojRacuna());
	}
	

}

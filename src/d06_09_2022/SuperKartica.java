package d06_09_2022;

public class SuperKartica {
//	broj kartice
//	ime i prezime vlasnika
//	popust (200, 500, … )
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere 
//	metodu stampaj koja stampa karticu u formatu:
//	(broj kartice), (ime i prezime)
	
	private String brKartice;
	private String vlasnik;
	private double popust;
	
	

	public SuperKartica() {
		super();
	}

	public SuperKartica(String brKartice, String vlasnik, double popust) {
		super();
		this.brKartice = brKartice;
		this.vlasnik = vlasnik;
		this.popust = popust;
	}

	public String getBrKartice() {
		return brKartice;
	}

	public void setBrKartice(String brKartice) {
		this.brKartice = brKartice;
	}

	public String getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}
	
	
	public double getPopust() {
		return popust;
	}

	public void setPopust(double popust) {
		this.popust = popust;
	}

	public void stampaj() {
		System.out.println("Broj kartice: " + this.brKartice + " Ime i prezime vlasnika: " + this.vlasnik);
	}
	

}

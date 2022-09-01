package d26_08_2022;

public class Igrac extends Osoba {

//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

	private int broj;
	private String pozicija;
	private boolean kapiten;
	
	
	public Igrac() {
		super();
	}


	public Igrac(String ime, String jmbg, int godina) {
		super(ime, jmbg, godina);
		
	}


	public int getBroj() {
		return broj;
	}


	public void setBroj(int broj) {
		this.broj = broj;
	}


	public String getPozicija() {
		return pozicija;
	}


	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}


	public boolean isKapiten() {
		return kapiten;
	}


	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	
	public void KapitenStampa() {
		if (this.kapiten == true) {
			System.out.println("Kapiten je.");
		} System.out.println("Nije kapiten.");
	}
	
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println(this.broj + ", Pozicija: " + this.pozicija + ", Kapiten: " + this.kapiten);
	}
	
	
	
	
}

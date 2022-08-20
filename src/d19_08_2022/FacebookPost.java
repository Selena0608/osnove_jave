package d19_08_2022;

public class FacebookPost {
//	Kreirati klasu FacebookPost koja ima:
//		   Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen 
//		post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja
//		 Konstruktore:
//		difoltni konstuktor
//		konstuktor koji postavlja ime i prezime korisnika ko 
//		je objavio, korisnika na kom je profilu objavnljen i tekst objave
//		  Od metoda:
//		like(), koja povecava broj lajkova za 1.
//		dislike(), koja smanjuje broj lajkova za 1 (broj 
//				lajkova ne moze da bude manji od nule)
//		share(), koja povecava broj deljenja za 1
//		print(), koja stampa objavu u formatu:
//		(ime i prezime osobe koja je objavila) >>> (ime i 
//				prezime na cijem profilu)
//		(tekst objave)
//		Likes (broj lajkova) | Shares (broj deljenja)

	private String ime;
	private String imePost;
	private String tekst;
	private int lajkovi;
	private int deljenja;

	public FacebookPost() {

	}

	public FacebookPost(int lajkovi, int deljenja) {
		this.lajkovi = lajkovi;
		this.deljenja = deljenja;
	}
	
	
	
	public FacebookPost(String ime, String imePost, String tekst, int lajkovi, int deljenja) {
		this.ime = ime;
		this.imePost = imePost;
		this.tekst = tekst;
		this.lajkovi = lajkovi;
		this.deljenja = deljenja;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public void setImePost(String imePost) {
		this.imePost = imePost;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public void setLajkovi(int lajkovi) {
		this.lajkovi = lajkovi;
	}

	public void setDeljenja(int deljenja) {
		this.deljenja = deljenja;
	}

	public String getIme() {
		return this.ime;
	}

	public String getImePost() {
		return this.imePost;
	}

	public String getTekst() {
		return this.tekst;
	}

	public int getLajkovi() {
		return lajkovi;
	}

	public int getDeljenja() {
		return deljenja;
	}

	
	
	
	public void like() {
		this.lajkovi = this.lajkovi + 1;
	}

	public void dislike() {
		this.lajkovi = this.lajkovi - 1;
		if (this.lajkovi < 0) {
			this.lajkovi = 0;
		}
	}

	public void share() {
		this.deljenja = this.deljenja + 1;
	}

	public void print() {
		System.out.println(this.ime + " >>> " + this.imePost);
		System.out.println(this.tekst);
		System.out.println("Likes " + this.lajkovi + " |  Shares " + this.deljenja);
	}

}

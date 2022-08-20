package d18_08_2022;

public class FacebookPost {
//	Kreirati klasu FacebookPost koja ima:
//		   Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen post
//		(posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja
//		  Od metoda:
//		like(), koja povecava broj lajkova za 1.
//		dislike(), koja smanjuje broj lajkova za 1 (broj lajkova 
//				ne moze da bude manji od nule)
//		share(), koja povecava broj deljenja za 1
//		print(), koja stampa objavu u formatu:
//		(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//		(tekst objave)
//		Likes (broj lajkova) | Shares (broj deljenja)

public String ime;
public String imePost;
public String tekst;
public int lajkovi;
public int deljenja;


public void like() {
	this.lajkovi = this.lajkovi + 1;
}
	
public void dislike() {
	this.lajkovi = this.lajkovi - 1; 
	if(this.lajkovi < 0) {
		this.lajkovi = 0;
	}
}	

public void share() {
	this.deljenja = this.deljenja + 1;
}

public void print() {
	System.out.println(this.ime + " >>> " + this.imePost);
	System.out.println(this.tekst);
	System.out.println("Likes " + this.lajkovi  + " |  Shares " +  this.deljenja);
}


}

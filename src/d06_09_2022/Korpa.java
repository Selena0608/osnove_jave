package d06_09_2022;

import java.util.ArrayList;

public class Korpa {
//	niz ambalaza
//	metodu dodaj ambalazu
//	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije
//	se prima Super karticu iz koje se cita popust.

	private ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();

	public void dodajAmbalazu(Ambalaza ambalaza) {
		this.ambalaze.add(ambalaza);
	}

	public void izbaciAmbalazu(String barKod) {
		
		for (int i = 0; i < ambalaze.size(); i++) {
			if (barKod.equals(this.ambalaze.get(i).getBarKod())) {
				this.ambalaze.remove(i);
			}
		}

	}
	
	private double cenaSaPopustom(double popust) {
		double suma = 0;
		for (int i = 0; i < ambalaze.size(); i++) {
			suma += this.ambalaze.get(i).cenaArtikla();
		}
		return suma - popust;
	}	
	
	public double cenaKorpe(SuperKartica kartica) {
		return this.cenaSaPopustom(kartica.getPopust());
	}
}

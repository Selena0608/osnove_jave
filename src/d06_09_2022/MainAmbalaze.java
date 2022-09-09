package d06_09_2022;

public class MainAmbalaze {
//	U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko
//	Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

	Korpa korpa1 = new Korpa();
	SuperKartica kartica1 = new SuperKartica("005", "Selena Radovanovic", 100);
	
	Tetrapak sok = new Tetrapak ("94643563", "Sok", 800, 900, true, 350);
	Tetrapak mleko = new Tetrapak ("009077", "Mleko", 300, 400, true, 250);
	StaklenaAmbalaza pivo = new StaklenaAmbalaza ("46487748", "Pivo", 400, 500,20, true, 550);
	StaklenaAmbalaza vino = new StaklenaAmbalaza ("42324242", "Vino", 700, 800, 30, false, 1500);
	korpa1.dodajAmbalazu(sok);
	korpa1.dodajAmbalazu(mleko);
	korpa1.dodajAmbalazu(pivo);
	korpa1.dodajAmbalazu(vino);
	

	System.out.println("Ukupna cena korpe je: " + korpa1.cenaKorpe(kartica));
	
	korpa1.izbaciAmbalazu("46487748");

	
}

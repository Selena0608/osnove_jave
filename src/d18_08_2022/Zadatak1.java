package d18_08_2022;

import d18_08_2022.Proizvod;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Proizvod brasno = new Proizvod();
		brasno.nazivProizvoda = "brasno";
		brasno.cena = 50;
		brasno.tezinaProizvoda = 70000;
		
		brasno.stampaj();
		brasno.povecajCenu(20);
		
		System.out.println("Cena sa popustom je: " + brasno.vratiCenuSaPopustom(10) + "RSD") ;
		System.out.println("Cena postarine je: " + brasno.racunajPostarinu() + "RSD");
		
	}

}

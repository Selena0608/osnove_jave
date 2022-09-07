package d05_09_2022;

public class Zadatak1 {
//	U glavnom programu kreirati jednog magacionera i jednog menadzera, 
//	postaviti sektore u kojima rade i ispisati platu za svakog

	public static void main(String[] args) {
		
		
		Magacioner magacioner1 = new Magacioner("Milos Pavlovic");
		Menadzer menadzer1 = new Menadzer("Ivana Vlastic");
		
		
		Sektor nabavka = new Sektor("prodaja", 90000);
		Sektor prodaja = new Sektor("nabavka", 130000);
		Sektor finansije = new Sektor("marketing", 150000);
		
		magacioner1.zaposliUSektor(nabavka);
		magacioner1.zaposliUSektor(prodaja);
		
		menadzer1.zaposliUSektor(finansije);
		
	}

}

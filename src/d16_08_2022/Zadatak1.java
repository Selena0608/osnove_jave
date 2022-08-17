package d16_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Proizvod proizvod = new Proizvod();
		proizvod.naziv = "brasno";
		proizvod.cena = 50;
		proizvod.tezina = 70000;
		
		proizvod.stampaj();

		System.out.println("Tezina u kilogramima: " + proizvod.konvertuj("kg"));
		System.out.println("Tezina u tonama: " + proizvod.konvertuj("t"));
		System.out.println();
		
		
		Proizvod ulje = new Proizvod();
		ulje.naziv = "ulje";
		ulje.cena = 100;
		ulje.tezina = 56000;
		
		ulje.stampaj();

		System.out.println("Tezina u kilogramima: " + ulje.konvertuj("kg"));
		System.out.println("Tezina u tonama: " + ulje.konvertuj("t"));


	}

}

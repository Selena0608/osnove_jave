package d15_08_2022;

public class Zadatak4 {
//	Napisati metodu koja stampa podatke o korisniku u formatu:
//		JMBG: [jmbg]
//		Ime: [ime]
//		Prezime: [prezime]
//		God. rodjenja: [god]
//		Aktivan: [true/false]
//		Metoda prima jmbg, ime, prezime, god rodjenja i da li 
//		je aktivan kao parametre metode.Metoda nista ne vraca

	public static void main(String[] args) {
		podaciKorisnika("0508842768927", "Selena", "Ravodanovic", "1990");

	}
	public static void podaciKorisnika(String jmbg, String ime, String prezime,
			String godinaRodjenja) {
		System.out.println("JMBG: " + jmbg);
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("God. rodjenja: " + godinaRodjenja);
		System.out.println();
		
	}
}

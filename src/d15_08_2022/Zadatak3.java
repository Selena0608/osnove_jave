package d15_08_2022;

public class Zadatak3 {
//	Napisati funkciju koja za dva jednocifrena broja koja 
//	su ulazni parametri funkcije vraca novu vrednost koja 
//	se formira kao na primeru. METODA NISTA NE STAMPA.
//	ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//	ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
	public static void main(String[] args) {
		spajanjeBrojeva(2,3);
		spajanjeBrojeva(4,5);
		spajanjeBrojeva(6,7);
	}
	public static int spajanjeBrojeva(int a, int b) {
		
		return a*10 +b;
		
	}
}

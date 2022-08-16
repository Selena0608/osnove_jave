package d15_08_2022;

public class Zadatak1 {
//	Napisati metodu stampajVrednostZa10Vecu u kojoj 
//	se stampa prosledjena vrednost za 10 veca.Iz main-a 
//	pozvati izvrsenje metode za razlicite vrednosti.

	public static void main(String[] args) {
		System.out.println("Broj uvecan za 10 iznosi: " + stampajVrednostZa10Vecu(4));
		System.out.println("Broj uvecan za 10 iznosi: " + stampajVrednostZa10Vecu(3));
		System.out.println("Broj uvecan za 10 iznosi: " + stampajVrednostZa10Vecu(2));
	}

	public static int stampajVrednostZa10Vecu(int n) {
		return n * 10;
	}

}

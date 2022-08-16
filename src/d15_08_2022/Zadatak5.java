package d15_08_2022;

public class Zadatak5 {
//	Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//	Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//	/ / / / /
//	Napomena: Metoda nista ne vraca

	public static void main(String[] args) {
		printSlash(5,'/');
		System.out.println();
		printSlash(4,'&');
		System.out.println();
		printSlash(3,'*');
		System.out.println();

	}
	public static void printSlash(int n, char simbol) {
		
		for (int i =0; i < n ; i++) {
			System.out.print(simbol);
			
			
		}
		
	}

}

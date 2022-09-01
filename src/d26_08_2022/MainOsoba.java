package d26_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class MainOsoba {

	public static void main(String[] args) {
		
//	U glavnom programu kreirati niz igraca i niz trenera, na kraju programa 
//	ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.

		Igrac igrac1 = new Igrac("Nikola Jovanovic", "298784337495", 2002);
		
		igrac1.setBroj(16);
		igrac1.setPozicija("napadac");
		igrac1.setKapiten(true);
		
		igrac1.stampaj();
		
		Trener trener1 = new Trener("Dragan Nikolic", "20956922434", 1983);
		
		trener1.setGodineIskustva(10);
		trener1.setTipTrenera("personalni");
		
		trener1.stampaj();
		
		Scanner s = new Scanner(System.in);
		ArrayList<Igrac> igraci = new ArrayList<Igrac>();
		ArrayList<Trener> treneri = new ArrayList<Trener>();
		
		System.out.println();
		System.out.println("Unesite N: ");
		int n = s.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Unesite ime i prezime igraca: ");
			String ime = s.next();

			System.out.println("Unesite JMBG: ");
			String jmbg = s.next();

			System.out.println("Unesite godinu rodjenja: ");
			int godina = s.nextInt();
			
			System.out.println("Unesite broj koji igrac nosi na dresu: ");
			int broj = s.nextInt();
			
			System.out.println("Unesite poziciju na kojoj je igrac: ");
			String pozicija = s.next();
			
			System.out.println("Da li je igrac kapiten: ");
			boolean kapiten = s.nextBoolean();
			
			
			
			Igrac igrac = new Igrac(ime, jmbg, godina);
			igrac.setBroj(broj);
			igrac.setPozicija(pozicija);
			igrac.setKapiten(kapiten);

			igraci.add(igrac);
			
		}
		
		
		System.out.println("Unesite T: ");
		int t = s.nextInt();
		
		for(int i = 0; i < t; i++) {
			System.out.println("Unesite ime i prezime trenera: ");
			String ime = s.next();

			System.out.println("Unesite JMBG: ");
			String jmbg = s.next();

			System.out.print("Unesite godinu rodjenja: ");
			int godina = s.nextInt();
			
			System.out.println("Unesite godine iskustva: ");
			int iskustvo = s.nextInt();
			
			System.out.println("Unesite tip trenera: ");
			String tiptrenera = s.next();
			
			Trener trener = new Trener(ime, jmbg, godina);
			trener.setGodineIskustva(iskustvo);
			trener.setTipTrenera(tiptrenera);

			treneri.add(trener);
			
			
		}
		
		for (int i = 0; i< igraci.size(); i++) {
			igraci.get(i).stampaj();
		}

		System.out.println();
		
		for (int i = 0; i< treneri.size(); i++) {
			treneri.get(i).stampaj();
		}
	}

}

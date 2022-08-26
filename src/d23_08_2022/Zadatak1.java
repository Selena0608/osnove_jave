package d23_08_2022;

import java.util.ArrayList;

public class Zadatak1 {
//	Zadatak
//	Kreirati klasu ZeleniKarton koja ima:
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
//
//		U glavnoj klasi:
//	kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//	(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//	(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
//

	public static void main(String[] args) {

		ZeleniKarton prvi = new ZeleniKarton("Jovan Jovanovic", "209/09", "Hidrobiologija", "Igor Eric", 5);

		ZeleniKarton drugi = new ZeleniKarton("Ana Milic", "201/09", "Algologija", "Petar Peric", 10);

		ZeleniKarton treci = new ZeleniKarton("Marija Micic", "202/09", "Ekologija", "Milos Petrovic", 6);

		ZeleniKarton cetvrti = new ZeleniKarton("Nikola Rankovic", "203/09", "Mikologija", "Ivana Glisic", 7);

		ZeleniKarton peti = new ZeleniKarton("Kosta Popovic", "204/09", "Genetika", "Jovana Ilic", 5);

		ZeleniKarton sesti = new ZeleniKarton("Jasmina Cendic", "205/09", "Evoluciona", "Milena Nikolic", 10);

		ZeleniKarton sedmi = new ZeleniKarton("Jovan Jovanovic", "206/09", "Hidrobiologija", "Igor Eric", 7);

		ZeleniKarton osmi = new ZeleniKarton("Jovan Jovanovic", "207/09", "Hidrobiologija", "Igor Eric", 9);

		ZeleniKarton deveti = new ZeleniKarton("Jovan Jovanovic", "220/09", "Hidrobiologija", "Igor Eric", 8);

		ZeleniKarton deseti = new ZeleniKarton("Jovan Jovanovic", "221/09", "Hidrobiologija", "Igor Eric", 10);

		ArrayList<ZeleniKarton> nizKartona = new ArrayList<ZeleniKarton>();

		nizKartona.add(prvi);
		nizKartona.add(drugi);
		nizKartona.add(treci);
		nizKartona.add(cetvrti);
		nizKartona.add(peti);
		nizKartona.add(sesti);
		nizKartona.add(sedmi);
		nizKartona.add(osmi);
		nizKartona.add(deveti);
		nizKartona.add(deseti);

		for(int i = 0; i < nizKartona.size(); i++) {
			nizKartona.get(i).stampaj();
		}
		
		int suma = 0;
		int prosek = 0;
		for (int i = 0; i < nizKartona.size(); i++) {
			suma = suma + nizKartona.get(i).getOcena();
			prosek = suma / nizKartona.size();
		}
		System.out.println("Prosek ocena je: " + prosek);
		


		int brojPolozenih = 0;
		int sumaPolozenih = 0;
		int prosekPolozenih = 0;

		for (int i = 0; i < nizKartona.size(); i++) {
			if (nizKartona.get(i).polozenIspit() == true) {
				sumaPolozenih = sumaPolozenih + nizKartona.get(i).getOcena();
				brojPolozenih++;
			}
		} 
		prosekPolozenih = sumaPolozenih / brojPolozenih;
		System.out.println("Prosecna ocena polozenih ispita: " + prosekPolozenih);
	}

}

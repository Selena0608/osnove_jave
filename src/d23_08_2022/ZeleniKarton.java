package d23_08_2022;

public class ZeleniKarton {

	
//	/*
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne 
//	(ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime*/

	private String imeStudenta;
	private String brIndeksa;
	private String nazivPredmeta;
	private String imeProfesora;
	private int ocena;
	
	public ZeleniKarton() {
		
	}
	
	public ZeleniKarton(String imeStudenta, String brIndeksa, String nazivPredmeta, String imeProfesora, int ocena) {
		super();
		this.imeStudenta = imeStudenta;
		this.brIndeksa = brIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeProfesora = imeProfesora;
		this.ocena = ocena;
	}
	
	
	public String getImeStudenta() {
		return imeStudenta;
	}


	public String getBrIndeksa() {
		return brIndeksa;
	}


	public String getNazivPredmeta() {
		return nazivPredmeta;
	}


	public String getImeProfesora() {
		return imeProfesora;
	}

	
	public int getOcena() {
		return ocena;
	}

	

	public boolean polozenIspit() {
		if (ocena > 5) {
			return true;
		} else {
			return false;
		}
	}
	
	public void stampaj() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.imeStudenta + " broj indeksa: " + this.brIndeksa);
		System.out.println("Profesor " + this.imeProfesora);
		System.out.println();
	}
	
	
	
}

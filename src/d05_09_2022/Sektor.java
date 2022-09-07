package d05_09_2022;

public class Sektor {
//	Zadatak  
//	Kreirati klasu Sektor koja ima:
//	naziv sektora
//	platu koja je za taj sektor

	private String sektor;
	private double plata;
	
	public Sektor(String sektor, double plata) {
		super();
		this.sektor = sektor;
		this.plata = plata;
	}

	public String getSektor() {
		return sektor;
	}

	public double getPlata() {
		return plata;
	}
	
	
	
	
}

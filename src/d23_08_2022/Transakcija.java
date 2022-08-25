package d23_08_2022;

public class Transakcija {

	
	private int id;
	private String racunPrenos; 
	private String racunPrijem; 
	
	
	
	public Transakcija() {
		
	}
	
	public Transakcija(int id, String racunPrenos, String racunPrijem) {
		this.id = id;
		this.racunPrenos = racunPrenos;
		this.racunPrijem = racunPrijem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRacunPrenos() {
		return racunPrenos;
	}

	public void setRacunPrenos(String racunPrenos) {
		this.racunPrenos = racunPrenos;
	}

	public String getRacunPrijem() {
		return racunPrijem;
	}

	public void setRacunPrijem(String racunPrijem) {
		this.racunPrijem = racunPrijem;
	}
	
	
	private double provizija(double visinaTransakcije) {
		if(visinaTransakcije <= 4500) {
			return 45;
		} else return visinaTransakcije * 0.01;
	}

	
	
}

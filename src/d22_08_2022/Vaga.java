package d22_08_2022;

public class Vaga {

	private String mernaJedinica;
	private Proizvod proizvod;
	
	public Vaga() {
		
	}

	public String getMernaJedinica() {
		return mernaJedinica;
	}

	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	
	
	public double sracunajCenu(double tezina) {
		if(this.mernaJedinica.equals("kg")) {
			return this.proizvod.getCenaKg() * tezina;
		} else if(this.mernaJedinica.equals("lb")) {
			return this.proizvod.getCenaLb() * tezina;
		} return 0.0;
	}
	
	public void stampaj(double tezina) {
		this.proizvod.print();
		System.out.println(this.proizvod.getCenaKg() + " "+ this.mernaJedinica + " * " + tezina);
		System.out.println("Ukupno: " + sracunajCenu(10));
	}
}

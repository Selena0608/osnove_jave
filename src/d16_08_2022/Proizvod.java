package d16_08_2022;

public class Proizvod {

	public String naziv;
	public double cena;
	public double tezina;
	
	
	public void stampaj() {
		System.out.println("{{" + this.naziv + "}}," + " {{" + this.cena + "}}," + " {{" + this.tezina + "}}" );
		
	}
	
	public double konvertuj(String jedinicaMere) {
		if(jedinicaMere == "kg") {
			return this.tezina / 1000;
		} else if (jedinicaMere == "t") {
			return this.tezina  / 1000000;
		} else return 0.0;
		
	}
}

package d05_09_2022;

public class Magacioner extends Radnik{
//	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//	ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//	suma plata svih sektor / broj sektora * 0.5
//	override uje metodu za platu, tako da se plata racuna po formuli:
//	(prosecna plata za sve sektore u kojima radi) * (broj sektora).
	
	public Magacioner(String ime) {
		super(ime);
		// TODO Auto-generated constructor stub
	}

	private double prosecnaPlataZaSektore() {
		int sumaPlata = 0;
		for (int i = 0; i < this.nizSektora.size(); i++) {
			sumaPlata += this.nizSektora.get(i).getPlata();
		}
		 return sumaPlata / this.nizSektora.size() * 0.5;
	}
	
	@Override
	public double plataRadnika() {
		return this.prosecnaPlataZaSektore() * this.nizSektora.size();
	}

	
	
	
}

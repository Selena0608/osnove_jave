package d05_09_2022;

public class Menadzer extends Radnik{

	
//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//	override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
	
	public Menadzer(String ime) {
		super(ime);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double plataRadnika() {
		double sumaPlata = 0;
		for(int i = 0; i < this.nizSektora.size(); i++) {
			sumaPlata =+ nizSektora.get(i).getPlata(); 
	} return sumaPlata;
	}

	
		
	
}

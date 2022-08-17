package d16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		SmartAirConditioning x = new SmartAirConditioning();

		x.marka = "Gree";
		x.izabranaTemp = 25;
		x.mode = "hladi";
		x.stampaj();
		System.out.println("Razlika spoljasnja i unutrasnja temp: " + x.razlikaUTemperaturi(35));
		System.out.println();
		SmartAirConditioning y = new SmartAirConditioning();
		
		y.marka = "Tesla";
		y.izabranaTemp = 22;
		y.mode = "greje";
		y.stampaj();
		System.out.println("Razlika spoljasnja i unutrasnja temp: " + x.razlikaUTemperaturi(5));
		System.out.println();
	}

}

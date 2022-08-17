package d16_08_2022;

public class SmartAirConditioning {

	public String marka;
	public int izabranaTemp;
	public String mode;
	
	
	public void stampaj() {
		System.out.println("Marka klime je - " + this.marka);
		System.out.println("Izabrana temperatura - " + this.izabranaTemp);
		System.out.println("Klima - " + this.mode);
	}
	
	public int razlikaUTemperaturi(int spoljasnjaTemp) {
		if (this.izabranaTemp > spoljasnjaTemp) {
			return this.izabranaTemp - spoljasnjaTemp;
		} else if (this.izabranaTemp < spoljasnjaTemp) {
			return spoljasnjaTemp -this.izabranaTemp;
		} else return 0;
		
	}
	
}

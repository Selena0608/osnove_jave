package mini_projekat;

public class Player {
//	Kreirati klasu Player koja ima:
//	ime i prezime
//	gettere i settere
//	konstuktore
//	metodu print, koja stampa ime i prezime igraca
	
	private String fullName;

	
	public Player() {
		
	}
	
	public Player(String fullName) {
	super();
	this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public void print() {
		System.out.println("Ime i prezime igraca je: " + this.fullName);
	}
	
	
	

}

package d26_08_2022;

public class Osoba {

//	Kreirati klasu Osoba koja ima:
//	ime i prezime
//	jmbg
//	godinu rodjenja
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere 
//	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)

protected String ime;
protected String jmbg;
protected int godina;


public Osoba() {
	super();
}


public Osoba(String ime, String jmbg, int godina) {
	super();
	this.ime = ime;
	this.jmbg = jmbg;
	this.godina = godina;
}


public String getIme() {
	return ime;
}


public void setIme(String ime) {
	this.ime = ime;
}


public String getJmbg() {
	return jmbg;
}


public void setJmbg(String jmbg) {
	this.jmbg = jmbg;
}


public int getGodina() {
	return godina;
}


public void setGodina(int godina) {
	this.godina = godina;
}


//metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)

public void stampaj() {
	System.out.println(this.ime + ", " + this.jmbg + ", " + this.godina);
}

	
}

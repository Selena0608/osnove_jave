package d22_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proizvod a = new Proizvod("24982-31424","brasno",50);
		Vaga brasno = new Vaga();
		brasno.setMernaJedinica("lb");
		brasno.setProizvod(a);
		brasno.stampaj(10);
		
		Proizvod b = new Proizvod("56-25526-24","ulje",10);
		Vaga ulje = new Vaga();
		ulje.setMernaJedinica("kg");
		ulje.setProizvod(b);
		ulje.stampaj(10);
	}

}

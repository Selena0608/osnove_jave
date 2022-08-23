package d22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Autor autor1 = new Autor("Mihail","Bulgakov");
		Knjiga a = new Knjiga();
		a.setIsbn("123-435-4563-534");
		a.setAutor(autor1);
		a.setGodina(2002);
		a.setNaziv("Majstor i Margarita");
		a.print();
		
		System.out.println();
		
		Autor autor2 = new Autor("Knut","Hamsun");
		Knjiga b = new Knjiga();
		b.setIsbn("4242543-2465-25625");
		b.setAutor(autor2);
		b.setGodina(2013);
		b.setNaziv("Glad");
		b.print();
		
		System.out.println();
		
		Autor autor3 = new Autor("Zoze","Saramago");
		Knjiga c = new Knjiga();
		c.setIsbn("456-246-256-25-2456");
		c.setAutor(autor3);
		c.setGodina(2002);
		c.setNaziv("Opsada Lisabona");
		c.print();

	}

}

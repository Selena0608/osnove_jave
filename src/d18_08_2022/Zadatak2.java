package d18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		FacebookPost x = new FacebookPost();

		x.ime = "Ana Miric";
		x.imePost = "Marija Peric";
		x.tekst = "Cao, cao!";
		x.lajkovi = 2;
		x.deljenja = 1;
		x.like();
		x.dislike();
		x.share();
		x.print();
		System.out.println();
		
		FacebookPost y = new FacebookPost();

		y.ime = "Petar Petrovic";
		y.imePost = "Nikola Nikolic";
		y.tekst = "Zdravo";
		y.lajkovi = -1;
		y.deljenja = 0;
		y.like();
		y.dislike();
		y.share();
		y.print();
		System.out.println();
		
		FacebookPost a = new FacebookPost();

		a.ime = "Igor Ilic";
		a.imePost = "Milica Nikolic";
		a.tekst = "Kako si?";
		a.lajkovi = -1;
		a.deljenja = 1;
		a.like();
		a.dislike();
		a.share();
		a.print();
		System.out.println();
		
		FacebookPost b = new FacebookPost();

		b.ime = "Milos Markovic";
		b.imePost = "Ivan Gajic";
		b.tekst = "Srecan rodjendan!";
		b.lajkovi = 3;
		b.deljenja = 1;
		b.like();
		b.dislike();
		b.share();
		b.print();
		System.out.println();
	}

}

package d19_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		
		FacebookPost post1 = new FacebookPost("Milica Petkovic", "Ivan Nesic", "Zdravo,kako si?",2,3);
		post1.like();
		post1.dislike();
		post1.share();
		post1.print();
	}

}

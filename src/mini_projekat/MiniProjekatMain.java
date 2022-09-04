package mini_projekat;

import java.util.Scanner;

public class MiniProjekatMain {

	public static void main(String[] args) {
//		Ucitati podatke za igrace
//		Kreirajte objekat klase XandOGame 
//		Startujte igru, tada je na potezu igrac X
//		Saveti za dobar zadatak
//		Igra treba da traje dok (while petlja)
//		nije kraj igre - imamo metodu za to
//		Ili dok ne dobijemo pobednika
//		U petlji
//		Trazimo od aktuelnog igraca da unese potez
//		Ukoliko je pozicija validna i ako je to slobodno mesto, igramo potez
//		Prebacujemo red na drugog igraca
//		Stampamo tablu
//		Ukoliko nije validna pozicija ili nije slobodno mesto stampamo poruku
//		"You enter invalid position."
//		Nakon zavrsetka igre, racunamo skor i stampamo rezultat igre i podatke za igrace
		
		Scanner s = new Scanner(System.in);
		
		XandOGame game = new XandOGame();
		
		Player playerX = new Player("Nikola Milovanovic");
		Player playerO = new Player("Milan Ilic");
		
		game.setPlayerX(playerX);
		game.setPlayerO(playerO);
		
		
		game.startGame();
		System.out.println("Start game ");
		
		while(game.isGameOver() == false || game.isWinnerX() == true || game.isWinnerO() == true) {
			System.out.println();
			System.out.println(game.getNextPlayer().getFullName() + " insert your move:");
			
			int position = s.nextInt();
			
			if(game.isValidMove(position) == true && game.isFieldFree(position) == true) {
				game.makeAMove(position);
				game.printTable();
				game.playNext();
			}
			else {
				System.out.println("You enter invalid position.");
			}
			
			if(game.gameScore() == 1) {
				System.out.println("Winner is: " + playerX.getFullName());
			} else if (game.gameScore() == 2) {
				System.out.println("Winner is: " + playerO.getFullName());
			}
			
		}
		
		
		
		
		
	}

}

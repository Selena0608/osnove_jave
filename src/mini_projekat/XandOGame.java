package mini_projekat;

import java.util.ArrayList;

public class XandOGame {

//	Kreirati klasu XandOGame koja ima:
//	table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
//	nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima vrednosti x ili o
//	playerX - igrac X
//	playerO - igrac O
//	Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “ “
//	Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor radi sve sto radi i difoltni samo sto dodatno postavlja i igraca
//	gettere i settere za igrace

	private ArrayList<String> table = new ArrayList<String>();
	private Player nextPlayer;
	private Player playerX;
	private Player playerO;

//	Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “ “
	public XandOGame() {
		for (int i = 0; i < 9; i++) {
			table.add(" ");
		}

	}

//	Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor radi sve sto radi i difoltni samo sto dodatno postavlja i igraca

	public XandOGame(Player playerX, Player playerO) {
		for (int i = 0; i < 9; i++) {
			table.add(" ");
		}
		this.playerX = playerX;
		this.playerO = playerO;
	}

	public Player getNextPlayer() {
		return nextPlayer;
	}

	public Player setNextPlayer(Player nextPlayer) {
		this.nextPlayer = nextPlayer;
		return nextPlayer;
	}

	public Player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public Player getPlayerO() {
		return playerO;
	}

	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}

//	Metodu print koja stampa tablu sliku kao na slici. 
//	Stampanje se vrsi petljom. Ako je niz iz primera iznad stampa izgleda:
//	x | x | 0 |
//	0 | x | 0 |
//	x | 0 | x |

	public void printTable() {
		for (int i = 0; i < this.table.size(); i++) {
			if (i % 3 == 0 && i != 0) {
				System.out.println();

			}
			System.out.print(this.table.get(i) + " | ");
		}
	}

//	Metodu startGame, metoda postavlja sve elemente niza na prazan string “ “ i zatim postavlja da je na redu igrac X.

	public void startGame() {
		for (int i = 0; i < this.table.size(); i++) {
			this.table.set(i, " ");
		}
		this.setNextPlayer(this.playerX);
	}

//	Metodu isGameOver, igra je gotova ako su sva polja popunjena.

	public boolean isGameOver() {
		for (int i = 0; i < table.size(); i++) {
			if (table.get(i).equals(" ")) {
				return false;
			}
		}
		return true;
	}

//	Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. Metoda od parametara prima niz i poziciju za kojju se proverava. Polje je slobodno ako u njemu ne pise x ili o

	public boolean isFieldFree(int position) {
		if (this.table.get(position).equals(" ")) {
			return true;
		}
		return false;
	}

//	Metodu playNext, metoda prebacuje potez na sledeceg igraca, ako je bio igrac x prebacuje ga na o i obrnuto

	public Player playNext() {
		if (getNextPlayer() == playerX) {
			return this.setNextPlayer(playerO);

		}
		return this.setNextPlayer(playerX);
	}

//	Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.

	public void makeAMove(int position) {

		if (this.getNextPlayer() == playerO) {
			table.set(position, "O");
		} else {
			table.set(position, "X");
		}

	}

	public boolean isWinnerX() {
		if (this.table.get(0).equals("x") && this.table.get(1).equals("x") && this.table.get(2).equals("x")
				|| this.table.get(3).equals("x") && this.table.get(4).equals("x") && this.table.get(5).equals("x")
				|| this.table.get(6).equals("x") && this.table.get(7).equals("x") && this.table.get(8).equals("x")
				|| this.table.get(0).equals("x") && this.table.get(3).equals("x") && this.table.get(6).equals("x")
				|| this.table.get(1).equals("x") && this.table.get(4).equals("x") && this.table.get(7).equals("x")
				|| this.table.get(2).equals("x") && this.table.get(5).equals("x") && this.table.get(8).equals("x")
				|| this.table.get(0).equals("x") && this.table.get(4).equals("x") && this.table.get(8).equals("x")
				|| this.table.get(2).equals("x") && this.table.get(4).equals("x") && this.table.get(6).equals("x")) {
			return true;
		} else {

			return false;
		}
	}

	public boolean isWinnerO() {
		if (this.table.get(0).equals("o") && this.table.get(1).equals("o") && this.table.get(2).equals("o")
				|| this.table.get(3).equals("o") && this.table.get(4).equals("o") && this.table.get(5).equals("o")
				|| this.table.get(6).equals("o") && this.table.get(7).equals("o") && this.table.get(8).equals("o")
				|| this.table.get(0).equals("o") && this.table.get(3).equals("o") && this.table.get(6).equals("o")
				|| this.table.get(1).equals("o") && this.table.get(4).equals("o") && this.table.get(7).equals("o")
				|| this.table.get(2).equals("o") && this.table.get(5).equals("o") && this.table.get(8).equals("o")
				|| this.table.get(0).equals("o") && this.table.get(4).equals("o") && this.table.get(8).equals("o")
				|| this.table.get(2).equals("o") && this.table.get(4).equals("o") && this.table.get(6).equals("o")) {

			return true;
		} else {

			return false;
		}
	}

//	Metodu isValidMove koja vraca informaciju da li je pozicija na koju igrac zeli da odigra potez validna. Pozicija je validna ako je u opsegu od 0 do 8

	public boolean isValidMove(int pozicija) {
		if (pozicija >= 0 && pozicija < 9) {
			return true;
		}
		return false;
	}

//	Metodu gameScore, metoda vraca informaciju za kraj igre.
//	Ukoiko je pobednik igrac x, metoda vraca 1
//	Ukoliko je pobednik igrac o, metoda vraca 2
//	Ukoliko nemam pobednika vracamo 0

	public int gameScore() {
		if (this.isWinnerX() == true) {
			return 1;
		} else if (this.isWinnerO() == true) {
			return 2;
		} else {
			return 0;
		}
	}

}

import java.util.Scanner;

class GesserPerson{
	
	int gessNumber;
	
	int gessNumberFromGesserPerson() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to be gussed by players: ");
		int result = sc.nextInt();
		return result;
		
	}
}

class Player{
	
	int gessNumberFromPlayer1;
	int gessNumberFromPlayer2;
	int gessNumberFromPlayer3;
	
	public int gessNumberFromPlayer1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Guss the number from player1: ");
		int result = sc.nextInt();
		return result;
		
	}
	
	public int gessNumberFromPlayer2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Guss the number from player2: ");
		int result = sc.nextInt();
		return result;
		
	}
	
	public int gessNumberFromPlayer3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Guss the number from player3: ");
		int result = sc.nextInt();
		return result;
		
	}
	
	
}


class Ampaire{
	
	int numberFromGesser;
	int numberFromPlayer1;
	int numberFromPlayer2;
	int numberFromPlayer3;
	
	void getNumberFromGeser() {
		
		GesserPerson gp = new GesserPerson();
		numberFromGesser = gp.gessNumberFromGesserPerson();
				
	}
	
	void getNumberFromPlayers() {
		
		Player p = new Player();
		numberFromPlayer1 = p.gessNumberFromPlayer1();
		numberFromPlayer2 = p.gessNumberFromPlayer2();
		numberFromPlayer3 = p.gessNumberFromPlayer3();
		
	}
	
	void getCompare() {
		
		if(numberFromGesser==numberFromPlayer1) {
			
			if(numberFromGesser==numberFromPlayer2 && numberFromGesser==numberFromPlayer3) {
				System.out.println("All Gessed right answer. Game Draw");
			}
			else if(numberFromGesser == numberFromPlayer2) {
				System.out.println("Player1 And Player2 Won!");
			}
			else {
				System.out.println("Player 1 Won!");
			}
			
			
		}
		else if(numberFromGesser==numberFromPlayer2) {
			
			if(numberFromGesser==numberFromPlayer3) {
				System.out.println("Player2 And Player3 Won!");
			}
			else {
				System.out.println("Player 2 Won!");
			}
			
		}
		else if(numberFromGesser==numberFromPlayer3) {
			System.out.println("Plyer3 is Won!");
		}
		else {
			System.out.println("Game lost Try Agin!!!");
		}
	}
		
	
}



public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ampaire amp = new Ampaire();
		amp.getNumberFromGeser();
		amp.getNumberFromPlayers();
		amp.getCompare();
		
		System.out.println("\nThank You!");

	}

}

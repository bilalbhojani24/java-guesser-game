import java.util.Scanner;

class Guesser {
	int guessNum;
	
	int guessNumber(){
		System.out.println("Guesser kindly guess the number...");
		Scanner sc = new Scanner(System.in);
		guessNum = sc.nextInt();
		return guessNum;
	}
}

class Player {
	int guessNum;
	
	int guessNumber(){
		System.out.println("Player kindly guess the number...");
		Scanner sc = new Scanner(System.in);
		guessNum = sc.nextInt();
		return guessNum;
	}
}

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	
	void collectNumberFromGuess(){
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber();
		if(g.guessNum < 0 || g.guessNum > 100) {
			System.out.println("Out of range : Range is 1 to 100. Please try again");
			collectNumberFromGuess();
		}
	}
	
	void collectNumberFromPlayers(){
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.guessNumber();
		numFromPlayer2 = p2.guessNumber();
		numFromPlayer3 = p3.guessNumber();
	}
	
	void checkWinner() {
		if(numFromGuesser == numFromPlayer1) {
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("Game tied all three players guessed correctly...!!");
			}
			else if(numFromGuesser == numFromPlayer2) {
				System.out.println("Player 1 and Player 2 won the game...!!");
			}
			else if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player 1 and Player 3 won the game...!!");
			}
			else {
				System.out.println("Player 1 won the match...!!");
			}
		}
		else if(numFromGuesser == numFromPlayer2) {
			 if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 and player 3 won the game...!!");
			}
			else {
				System.out.println("Player 2 won the match...!!");
			}
			
		}
		else if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player 3 won the match...!!");
		}
		else  {
			System.out.println("No winner...!!");
		}
	}
	
}



public class NumberMain {
	public static void main(String[] args) {
		Umpire u = new Umpire();
		
		u.collectNumberFromGuess();
		u.collectNumberFromPlayers();
		u.checkWinner();
		
	}
}



































































































































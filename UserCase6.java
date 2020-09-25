package SnakeLadder;

public class UserCase6 {
	
	static final int NoPlay = 0;
	static final int Ladder = 1;
	static final int Snake = 2;
	static int Sum = 0;
	static int c = 0;
	public static void main(String[] args) {

		while (Sum < 100) {
			int Dice = (int) (Math.random() * 6) + 1;
			System.out.println("Dice Number: " + Dice);
			int option = (int) Math.floor(Math.random() * 10) % 3;

			if (option == Ladder) {
				if (Sum <= 100 && (Sum + Dice <= 100))
					Sum = Sum + Dice;
				System.out.println("Ladder");
			} 
			else if (option == Snake) {
				
				if (Sum > 0 && (Sum - Dice) >= 0) {
					Sum = Sum - Dice;
					System.out.println("Snake");
				}
			}
			else {
				System.out.println("No Play");
			}

			System.out.println("Position of dice is " + Sum+".");
			c++;
		}
		System.out.println("Number of Times, The Dice Was Played is " + c+".");
		System.out.println(Sum);

	}
}

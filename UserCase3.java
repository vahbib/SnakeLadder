package SnakeLadder;

public class UserCase3 {
	static final int NoPlay = 0;
	static final int Ladder = 1;
	static final int Snake = 2;
	static int Sum = 0;

	
	public static void main(String[] args) {
			int die = (int) (Math.random() * 6) + 1;
			
			System.out.println("The Dice Number is " + die+".");
			
			int opt = (int) Math.floor(Math.random() * 10) % 3;

			if (opt == Ladder) {
					Sum = Sum + die;
				System.out.println("Ladder");
			} 
			else if (opt == Snake) {
				
					Sum = Sum - die;
					System.out.println("Snake");

			} 
			else {
				System.out.println("No Play");
			}

	}

}

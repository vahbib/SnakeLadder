package SnakeLadder;

public class UserCase7 {
	static final int NoPlay = 0;
	static final int Ladder = 1;
	static final int Snake = 2;
	static int Sum1 = 0;
	static int Sum2 = 0;
	static int c = 0;
	
	public static void main(String[] args) {
		
		boolean Player1 = true;

		while (Sum1 < 100 && Sum2 < 100) {

			int current_sum = Player1 ? Sum1 :Sum2 ;
			int die = (int) (Math.random() * 6) + 1;
			System.out.println("Turn: " +( Player1 ? "Player 1" : "Player 2"));
			System.out.println("The Dice Number is " + die+".");
			
			int opt = (int) Math.floor(Math.random() * 10) % 3;

			if (opt == Ladder) {
				if (current_sum <= 100 && (current_sum + die <= 100))
					current_sum = current_sum + die;
				System.out.println("Ladder");
			} 
			else if (opt == Snake) {
				
				if (current_sum > 0 && (current_sum - die) >= 0) {
					current_sum = current_sum - die;
					System.out.println("Snake");
				}

			} 
			else {
				System.out.println("No Play");
			}

		System.out.println("Position: " + current_sum);
			
		c++;
		
		if (Player1 )
			Sum1 = current_sum;
		else 
			Sum2 = current_sum;
		
		
		if (opt != Ladder)
			Player1 = !Player1;

	}
		System.out.println("Number of Times The Dice was Played is " + c+".");
		System.out.println(Sum1>=100? "Player 1 Won" : "Player 2 Won");

	}

}

import java.util.Random;
import java.util.Scanner;

public class RandomHands {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		String[] suit = { "♣", "♦", "♥", "♠" };
		
		Random random = new Random();
		
		int randomNum = 0;
		
		for (int k = 0; k < n; k++) {	
			for (int i = 0; i < 5; i++) {
				randomNum = random.nextInt((12 - 0) + 1) + 0;
				System.out.print(cards[randomNum]);
				randomNum = random.nextInt((3 - 0) + 1) + 0;
				System.out.print(suit[randomNum]+" ");		
			}
			System.out.println();
		}
	}
}
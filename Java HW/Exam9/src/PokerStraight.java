import java.util.Scanner;

public class PokerStraight {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int targetWeight = in.nextInt();

        String[] cardFaces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] cardSuits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        int count = 0;
        for (int face = 0; face < cardFaces.length - 4; face++)
        {
            for (int suit1 = 0; suit1 < cardSuits.length; suit1++)
            {
                for (int suit2 = 0; suit2 < cardSuits.length; suit2++)
                {
                    for (int suit3 = 0; suit3 < cardSuits.length; suit3++)
                    {
                        for (int suit4 = 0; suit4 < cardSuits.length; suit4++)
                        {
                            for (int suit5 = 0; suit5 < cardSuits.length; suit5++)
                            {
                                int weight = 
                                    (face + 1) * 10 + suit1 + 1 +
                                    (face + 2) * 20 + suit2 + 1 +
                                    (face + 3) * 30 + suit3 + 1 +
                                    (face + 4) * 40 + suit4 + 1 +
                                    (face + 5) * 50 + suit5 + 1;
                                if (weight == targetWeight)
                                {
                                    count++;

                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);

	}

}

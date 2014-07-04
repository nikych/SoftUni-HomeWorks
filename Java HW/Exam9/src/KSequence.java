import java.util.Scanner;

public class KSequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String inputLine = in.nextLine();
        int k = in.nextInt();
        
        inputLine = inputLine + " " + Integer.MAX_VALUE;
        String[] inputTokens = inputLine.split(" ");
        int equalCount = 1;
        int prev = Integer.parseInt(inputTokens[0]);
        for (int i = 1; i < inputTokens.length; i++)
        {
            int num = Integer.parseInt(inputTokens[i]);
            if (num == prev)
            {
                equalCount++;
            }
            else
            {
                // Print (count % k) times the number num
                for (int counter = 0; counter < equalCount % k; counter++)
                {
                    System.out.print(prev + " ");
                }
                equalCount = 1;
            }
            prev = num;
        }

	}

}

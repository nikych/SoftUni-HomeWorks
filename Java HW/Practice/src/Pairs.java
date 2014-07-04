import java.util.Scanner;


public class Pairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String inputLine = in.nextLine();
		String[] inputArray = inputLine.split(" ");
		int[] numbers = new int[inputArray.length];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(inputArray[i]);
		}
		
		int firstNumber = numbers[0];
		int secondNumber = numbers[1];
		int prevSum = firstNumber + secondNumber;
		int maxdiff = 0;
		
		for (int i = 2; i < numbers.length - 1; i+=2) {
			firstNumber = numbers[i];
			secondNumber = numbers[i+1];
			int lastSum = firstNumber + secondNumber;
			int diff = Math.abs(lastSum - prevSum);
			maxdiff = Math.max(diff, maxdiff);
			prevSum = lastSum;
		}
		
		if (maxdiff == 0) {
			System.out.println("Yes, value=" + prevSum);
		}
		else {
			System.out.println("No, maxdiff=" + maxdiff);
		}
	}

}

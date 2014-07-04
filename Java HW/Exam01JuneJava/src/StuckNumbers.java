import java.util.Scanner;

public class StuckNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] numbers = new int[n];
		String firstSum = "";
		int counter = 1;
		int maxCounter = 1;
		int position = 0;
		String temp = "";
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
		}
		
		for (int i = 0; i < numbers.length-1; i++) {
			String firstNumber = Integer.toString(numbers[i]);
			String secondNumber = Integer.toString(numbers[i+1]);
			firstSum = firstNumber + secondNumber;
		
			if (temp == firstSum) {
				System.out.print(" " + numbers[i]);
				firstSum = "";
				counter++;
				System.out.println(firstNumber);
			}

			
		}
		
	}
}


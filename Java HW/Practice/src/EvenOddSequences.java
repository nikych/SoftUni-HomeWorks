import java.util.Scanner;

public class EvenOddSequences {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
        String[] inputNumbers = str.split(" ");
        int[] numbers = new int[inputNumbers.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(inputNumbers[i]);
		}
		
	        double oddSum = 0;
	        double oddMin = Integer.MAX_VALUE;
	        double oddMax = Integer.MIN_VALUE;
	        double evenSum = 0;
	        double evenMin = Integer.MAX_VALUE;
	        double evenMax = Integer.MIN_VALUE;
	        int counterTemp = 1;
			int counter = 1;
			int positionOfIntEven = 0;
			int positionOfIntOdd = 0;

	        for (int i = 1; i < inputNumbers.length; i++) {
	        	if ((numbers[i] % 2 == 0) && ((numbers[i - 1] % 2) == 0)) {
					counterTemp++;
	        	} else {
					counterTemp = 1;
				}
				if (counterTemp > counter) {
					counter = counterTemp;
					positionOfIntOdd = i;
				}
	            
	            if (numbers[i]%2==0)
	            {
	                oddSum += numbers[i];
	                oddMin = Math.min(oddMin, numbers[i]);
	                oddMax = Math.max(oddMax, numbers[i]);
	            }
	            else
	            {
	                evenSum += numbers[i];
	                evenMin = Math.min(evenMin, numbers[i]);
	                evenMax = Math.max(evenMax, numbers[i]);
	            }
	        }
	        for (int j = 0; j < counter; j++) {
				System.out.print(numbers[positionOfIntOdd - counter + 1 + j] + " ");
			}
	        
	        System.out.println();
	        System.out.println("Odd Sum="+oddSum);
	        System.out.println("Even Sum="+evenSum);
	        System.out.println("Odd Max="+oddMax);
	        System.out.println("Even Max="+evenMax);
	        System.out.println("Odd Min="+oddMin);
	        System.out.println("Even Min="+evenMin);

	        
	}

}

import java.util.Scanner;

public class PythagoreanNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean foundresults = false;
		
        int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = in.nextInt();
		}
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				for (int d = 0; d < numbers.length; d++) {
					int firstnumber = numbers[i];
					int secondnumber = numbers[j];
					int thirdnumber = numbers[d];
					
					if(firstnumber <= secondnumber){
						if((firstnumber * firstnumber) + (secondnumber * secondnumber) == thirdnumber * thirdnumber)
						{
							System.out.println(firstnumber+"*"+firstnumber +" + "+ secondnumber+"*"+secondnumber+" = "+thirdnumber+"*"+thirdnumber);	
							foundresults = true;
						}
					}
				}
			}
		}
		if(!foundresults){
			System.out.println("No");
		}
		
	}

}

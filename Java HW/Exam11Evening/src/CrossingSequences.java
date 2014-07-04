import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


public class CrossingSequences {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int trib1 = in.nextInt();
		int trib2 = in.nextInt();
		int trib3 = in.nextInt();
		int spiralStart = in.nextInt();
		int spiralStep = in.nextInt();
		int constSpiralStep = spiralStep;
		
		//tribonacci
		int nextTrib = 0;
		ArrayList<Integer> tribonacci = new ArrayList<>();
		
		tribonacci.add(trib1);
		tribonacci.add(trib2);
		tribonacci.add(trib3);
		
		
		while (nextTrib < 1000000) {
			nextTrib = trib1 + trib2 + trib3;
			tribonacci.add(nextTrib);
			trib1 = trib2;
			trib2 = trib3;
			trib3 = nextTrib;
		}
		
		//spiral
		int counter = 0;
		boolean found = false;
		
		for (int i = spiralStart; i < 100; i+=spiralStep) {
			if (counter == 2) {
				spiralStep += constSpiralStep;
				counter = 1;
			}
			else {
				counter++;
			}
			for (int j = 0; j < tribonacci.size(); j++) {
				if (tribonacci.get(j) == i) {
					System.out.print(i + " ");
					
					found = true;
					return;
				}
			}
		}
		
		if (!found) {
			System.out.println("No");
		}
		
	}

}

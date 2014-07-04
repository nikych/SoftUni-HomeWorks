import java.util.Scanner;
public class ProgrammerDNA {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int totalLength = in.nextInt();
        String str = in.next();
        char printChar = str.charAt(0);

        char spaceChar = '.';

        int blockSize = 7;
        int midPoint = blockSize / 2;
        int diff = 0;
        int diffCounter = 0;

        for (int counter = 0; counter < totalLength; counter++)
        {
            // Print Block
            for (int i = 0; i < blockSize; i++)
            {
                if (i >= midPoint - diff && i <= midPoint + diff)
                {
                    System.out.print(printChar);

                    // Change Letter
                    if (printChar=='G')
                    {
                        printChar = 'A';
                    }
                    else
                    {
                        printChar++;
                    }
                }
                else
                {
                	System.out.print(spaceChar);
                }
            }

            if (diffCounter >= midPoint)
            {
                diff--;
            }
            else
            {
                diff++;
            }

            diffCounter++;

            if (diffCounter == blockSize)
            {
                diffCounter = 0;
                diff++;
            }

            System.out.println();
        }

	}

}

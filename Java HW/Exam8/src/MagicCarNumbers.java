import java.util.Scanner;

public class MagicCarNumbers {
	static int count = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int magicWeight = in.nextInt();

		char[] letters = { 'A', 'B', 'C', 'E', 'H', 'K', 'M', 'P', 'T', 'X' };

        for (int l1 = 0; l1 < letters.length; l1++)
        {
            for (int l2 = 0; l2 < letters.length; l2++)
            {
                for (int a = 0; a <= 9; a++)
                {
                    CheckCarNumber("CA" + a + a + a + a + letters[l1] + letters[l2], magicWeight);
                    for (int b = 0; b <= 9; b++)
                    {
                        if (b != a)
                        {
                            CheckCarNumber("CA" + a + a + a + b + letters[l1] + letters[l2], magicWeight);
                            CheckCarNumber("CA" + a + b + b + b + letters[l1] + letters[l2], magicWeight);
                            CheckCarNumber("CA" + a + a + b + b + letters[l1] + letters[l2], magicWeight);
                            CheckCarNumber("CA" + a + b + a + b + letters[l1] + letters[l2], magicWeight);
                            CheckCarNumber("CA" + a + b + b + a + letters[l1] + letters[l2], magicWeight);
                        }
                    }
                }
            }
        }

        System.out.println(count);
	}
	
	public static void CheckCarNumber(String carNumber, int magicSum)
    {
        int weight = 0;
        for (char ch : carNumber.toCharArray())
        {
            if (ch >= '0' && ch <= '9')
            {
                weight += (ch - '0');
            }
            else
            {
                weight += (10 * (ch - 'A' + 1));
            }
        }

        if (weight == magicSum)
        {
            count++;
            //System.out.println(carNumber);
        }
    }

}

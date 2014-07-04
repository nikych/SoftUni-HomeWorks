import java.util.Scanner;

public class Illuminati {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String charss = in.nextLine();	
		char[] msg = charss.toCharArray();
		int vowels = 0;
        int total = 0;
        int totalA = 0;
        int totalE = 0;
        int totalI = 0;
        int totalO = 0;
        int totalU = 0;

        for (int j = 0; j < msg.length; j++)
        {
            if (msg[j] == 'a' || msg[j] == 'A' || msg[j] == 'e' || msg[j] == 'E' || msg[j] == 'i' || msg[j] == 'I' || msg[j] == 'o' || msg[j] == 'O' || msg[j] == 'u' || msg[j] == 'U')
            {
                vowels++;
            }
            if (msg[j] == 'a' || msg[j] == 'A')
            {
                totalA++;
            }
            if (msg[j] == 'e' || msg[j] == 'E')
            {
                totalE++;
            }
            if (msg[j] == 'i' || msg[j] == 'I')
            {
                totalI++;
            }
            if (msg[j] == 'o' || msg[j] == 'O')
            {
                totalO++;
            }
            if (msg[j] == 'u' || msg[j] == 'U')
            {
                totalU++;
            }
        }

        total = (totalA * 65) + (totalE * 69) + (totalI * 73) + (totalO * 79) + (totalU * 85);

        System.out.format("%d%n", vowels);
        System.out.format("%d%n", total);
	}

}

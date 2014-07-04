import java.util.Scanner;

public class StudentCables {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int totalLength = 0;
        int joins = 0;
        for (int i = 0; i < n; i++)
        {
            int length = in.nextInt();
            String measure = in.next();
            if (measure.equals("meters"))
            {
                // Convert meters to centimeters
                length = length * 100;
            }
            if (length >= 20)
            {
                totalLength += length;
                joins++;
            }
        }

        // Substract the lost length for joining the cables
        totalLength = totalLength - 3 * (joins - 1);

        int cablesCount = totalLength / 504;
        int remainder = totalLength % 504;

        System.out.println(cablesCount);
        System.out.println(remainder);

	}

}

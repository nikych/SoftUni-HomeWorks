import java.util.Scanner;

public class AngleUnitConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String input = "";
		String measure = "";

		for (int i = 0; i <= n; i++) {
			input = sc.nextLine();
			input = input.replaceAll("\\s+", "");
			measure = input.replaceAll("\\d+", "");
			measure = measure.replace(".", "");
			input = input.replaceAll("[^0-9.,]+", "");

			if (measure.equals("deg")) {
				System.out.format("%.6f rad%n",
						degreesToRadians(Double.parseDouble(input)));
			} else if (measure.equals("rad")) {
				System.out.format("%.6f deg%n",
						radiansToDegrees(Double.parseDouble(input)));
			}
		}
	}

	public static double degreesToRadians(double degrees) {
		double convertedValue = degrees * 0.0174532925;
		return convertedValue;
	}

	public static double radiansToDegrees(double degrees) {
		double convertedValue = degrees / 0.0174532925;
		return convertedValue;
	}
}
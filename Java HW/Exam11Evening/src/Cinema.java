import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String typeOfMovies = in.nextLine();	
		int rows = in.nextInt();
		int columns = in.nextInt();
		
		double result = 0;
		
		if (typeOfMovies.equals("Premiere")) {
            result = rows * columns * 12;
        }
        if (typeOfMovies.equals("Normal")) {
            result = rows * columns * 7.50;
        }
        if (typeOfMovies.equals("Discount")) {
            result = rows * columns * 5;
        }
        System.out.format("%.2f leva", result);
	}

}

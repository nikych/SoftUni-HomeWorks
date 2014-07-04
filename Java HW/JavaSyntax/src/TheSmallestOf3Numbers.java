import java.util.Scanner;

public class TheSmallestOf3Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double first = Double.parseDouble(sc.next());
        double second = Double.parseDouble(sc.next());
        double third = Double.parseDouble(sc.next());
        double smallest = Math.min(first, Math.min(second, third));
        System.out.println(smallest);
	}

}

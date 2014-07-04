import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String hex = Integer.toHexString(number);
        System.out.println(hex.toUpperCase());

	}

}

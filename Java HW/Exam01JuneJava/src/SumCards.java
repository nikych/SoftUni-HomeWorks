import java.util.Scanner;

public class SumCards {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		String[] cards = input.split(" ");
		String[] numbers = new String[cards.length];
		int sum = 0;

		// transform string array on int array
		for (int i = 0; i < cards.length; i++) {
			numbers[i] = cards[i].replaceFirst(".$","");
		}
		for (int i = 1; i < numbers.length; i++) {
			switch (numbers[i-1]) {
			case "2":
				sum +=2;
				break;
			case "3":
				sum +=3;
				break;
			case "4":
				sum +=4;
				break;
			case "5":
				sum +=5;
				break;
			case "6":
				sum +=6;
				break;
			case "7":
				sum +=7;
				break;
			case "8":
				sum +=8;
				break;
			case "9":
				sum +=9;
				break;
			case "10":
				sum +=10;
				break;
			case "J":
				sum +=12;
				break;
			case "Q":
				sum +=13;
				break;
			case "K":
				sum +=14;
				break;
			case "A":
				sum +=15;
				break;
			default:
				break;
			}
			if(numbers[i].equals(numbers[i-1])){
				sum *=2;
			}
			
		}
		System.out.println(sum);
	}
}
		


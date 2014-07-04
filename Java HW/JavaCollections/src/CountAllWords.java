import java.util.Scanner;

public class CountAllWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();		
		String[] words = str.split("\\W+");				
		System.out.println(words.length);
	}

}

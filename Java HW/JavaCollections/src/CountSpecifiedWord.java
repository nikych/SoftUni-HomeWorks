import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input =  in.nextLine().toUpperCase();;
		String word = in.nextLine().toUpperCase();
		int count = 0;


		String noLetter = "\\s*"+word+"\\s+" ;
		Pattern readText = Pattern.compile(noLetter);
		Matcher matcher = readText.matcher(input);
		while (matcher.find()) {
			matcher.group();
			count++;
		}
		System.out.println(count);
		in.close();
	}

}

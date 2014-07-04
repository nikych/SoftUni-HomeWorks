package firstProject;
import java.util.Scanner;

public class FirstProject {

	public static void main(String[] args) {
		System.out.printf("Welcome"); 
		int n;
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		 
		for(int i=1; i<=n; i++){
			System.out.println(i);
		}
	} 
}

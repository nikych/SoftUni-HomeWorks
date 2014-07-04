import java.util.Scanner;

public class NewHouse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int n = in.nextInt();
		
		// Print the tree
        for (int i = 0; i < n/2 + 1; i++)
        {
            String dash = newString('-', (n / 2) - i);
            String stars = newString('*', (i * 2) + 1);
            System.out.print(dash);
            System.out.print(stars);
            System.out.print(dash);
            System.out.println();
        }
        for (int i = 0; i < n; i++)
        {
        	System.out.print("|");
        	String zv = newString('*', (n - 2));
        	System.out.print(zv);
        	System.out.print("|");
        	System.out.println();
        }
	}
	
	public static String newString(char ch, int size) {
        return new String(new char[size]).replace('\0', ch);
    }

}

import java.util.Scanner;
public class SymmetricNumbers {
	public static boolean checkSymm(int number){
		if (Integer.toString(number).equals(new StringBuilder(Integer.toString(number)).reverse().toString()))
	        return true;
	    else
	        return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		for(int number = start ; number<=end ; number++){
			if(checkSymm(number)==true){
				System.out.print(number);
				if(number!=end) System.out.print(" ");
			}
		}
	}

}

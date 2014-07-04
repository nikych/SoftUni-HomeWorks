import java.util.Scanner;


public class FitBoxInBox {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int w1 = in.nextInt();
        int h1 = in.nextInt();
        int d1 = in.nextInt();

        int w2 = in.nextInt();
        int h2 = in.nextInt();
        int d2 = in.nextInt();

        // Try to fit the first box inside the second box (6 possibilities)
        CheckBoxes(w1, h1, d1, w2, h2, d2);
        CheckBoxes(w1, h1, d1, w2, d2, h2);
        CheckBoxes(w1, h1, d1, h2, w2, d2);
        CheckBoxes(w1, h1, d1, h2, d2, w2);
        CheckBoxes(w1, h1, d1, d2, w2, h2);
        CheckBoxes(w1, h1, d1, d2, h2, w2);

        // Try to fit the second box inside the first box (6 possibilities)
        CheckBoxes(w2, h2, d2, w1, h1, d1);
        CheckBoxes(w2, h2, d2, w1, d1, h1);
        CheckBoxes(w2, h2, d2, h1, w1, d1);
        CheckBoxes(w2, h2, d2, h1, d1, w1);
        CheckBoxes(w2, h2, d2, d1, w1, h1);
        CheckBoxes(w2, h2, d2, d1, h1, w1);
	}
	
	public static void CheckBoxes(
	        int firstWidth, int firstHeight, int firstDepth,
	        int secondWidth, int secondHeight, int secondDepth)
	    {
	        if (firstWidth < secondWidth && firstHeight < secondHeight && firstDepth < secondDepth)
	        {
	            System.out.format("(%d, %d, %d) < (%d, %d, %d)%n",
	                firstWidth, firstHeight, firstDepth, secondWidth, secondHeight, secondDepth);
	        }
	    }

}

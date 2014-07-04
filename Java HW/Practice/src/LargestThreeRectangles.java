import java.util.ArrayList;
import java.util.Scanner;

public class LargestThreeRectangles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        String inputRectangles = input.nextLine();
        String[] rectangles = inputRectangles.split("\\D+");
       
        ArrayList<Integer> areas = new ArrayList<Integer>();
       
        for (int i = 1; i < rectangles.length; i += 2) {
                int firstSide = Integer.parseInt(rectangles[i]);
                int secondSide = Integer.parseInt(rectangles[i + 1]);
                areas.add(firstSide * secondSide);
        }
       
        int currentArea = 0;
        int maxArea = 0;
       
        for (int i = 0; i < areas.size() - 2; i++) {
                currentArea = areas.get(i) + areas.get(i + 1) + areas.get(i + 2);
               
                if (currentArea > maxArea) {
                        maxArea = currentArea;
                }
        }
       
        System.out.println(maxArea);

	}

}

import java.util.Scanner;

public class InsideTheBuilding {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();
        int x4 = in.nextInt();
        int y4 = in.nextInt();
        int x5 = in.nextInt();
        int y5 = in.nextInt();

        System.out.println(IsPointInTheBuilding(x1, y1, size));
        System.out.println(IsPointInTheBuilding(x2, y2, size));
        System.out.println(IsPointInTheBuilding(x3, y3, size));
        System.out.println(IsPointInTheBuilding(x4, y4, size));
        System.out.println(IsPointInTheBuilding(x5, y5, size));
	}
	
	public static String IsPointInTheBuilding(int x, int y, int size)
    {
        boolean insideDown =
            (x >= 0) && (x <= 3 * size) && (y >= 0) && (y <= size);
        boolean insideUp =
            (x >= size) && (x <= 2 * size) && (y >= size) && (y <= 4 * size);
        boolean inside = insideDown | insideUp;
        String result = inside ? "inside" : "outside";
        return result;
    }

}

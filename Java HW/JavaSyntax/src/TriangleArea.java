import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int bx = sc.nextInt();
        int by = sc.nextInt();
        int cx = sc.nextInt();
        int cy = sc.nextInt();
        int area = (ax*(by-cy) + bx*(cy-ay) + cx*(ay-by))/2;
        if(area>=0) System.out.println(area);
        else System.out.println(area*-1);

	}

}

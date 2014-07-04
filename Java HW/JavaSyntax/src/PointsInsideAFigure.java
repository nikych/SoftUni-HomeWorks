import java.util.Scanner;

public class PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double y = sc.nextInt();
        if(y<6 || y> 13.5) System.out.println("Outside");
        else
        {
                if(x<12.5 || x>22.5) System.out.println("Outside");
                else
                {
                        if(x>17.5&&x<20&&y>8.5) System.out.println("Outside");
                        else System.out.println("Inside");
                }
        }
	}

}

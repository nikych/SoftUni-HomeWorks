import java.util.Locale;
import java.util.Scanner;

public class Triagle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner in = new Scanner(System.in);

		int aX = in.nextInt();
        int aY = in.nextInt();
        int bX = in.nextInt();
        int bY = in.nextInt();
        int cX = in.nextInt();
        int cY = in.nextInt();
        
        double A = Math.sqrt((bX - aX) * (bX - aX) + (bY - aY) * (bY - aY));
        double B = Math.sqrt((cX - bX) * (cX - bX) + (cY - bY) * (cY - bY));
        double C = Math.sqrt((aX - cX) * (aX - cX) + (aY - cY) * (aY - cY));

        boolean isTriangle = A + B > C && B + C > A
            && A + C > B;
       
        if (isTriangle)
        {
            System.out.println("Yes");
            double p = (A + B + C) / 2;
            double area = Math.sqrt(p * (p - A) *
                (p - B) * (p - C));
            System.out.format("%.3g%n", area);
        }
        else
        {
        	System.out.println("No");
            System.out.format("%.3g%n", A);
        }

	}

}

import java.math.BigInteger;
import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger a = input.nextBigInteger();
        //input.nextLine();
        BigInteger b = input.nextBigInteger();
        //input.nextLine();
        BigInteger c = input.nextBigInteger();
        //input.nextLine();
        int n = input.nextInt();

        BigInteger temp;

            while (n > 3) {
                temp = a;
                a = b;
                b = c;
                c = temp.add(b).add(a);
                n = n - 1;
            }
            if (n > 3) {
                System.out.println(c);
            } else if (n == 3) {
                System.out.println(c);
            }else if (n == 2) {
                System.out.println(b);
            } else if (n == 1) {
                System.out.println(a);
            }

    }
}
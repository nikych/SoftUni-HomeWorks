import java.util.Scanner;

public class Disk {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int fieldSize = in.nextInt();
        int radius = in.nextInt();
        int diskCenterRow = fieldSize / 2,
            diskCenterCol = fieldSize / 2;

        for (int currentRow = 0; currentRow < fieldSize; currentRow++)
        {
            for (int currentCol = 0; currentCol < fieldSize; currentCol++)
            {
                int deltaX = currentCol - diskCenterCol,
                    deltaY = currentRow - diskCenterRow;
                double distanceToCenter = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
                boolean isWithinDisk = distanceToCenter <= radius;

                if (isWithinDisk)
                {
                	System.out.print('*');
                }
                else
                {
                	System.out.print('.');
                }
            }
            System.out.println();
        }
	}

}

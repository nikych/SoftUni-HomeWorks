import java.util.Scanner;


public class VideoDurations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String videoLenght = "";
        int hoursLenght = 0;
        int minutesLenght = 0;
        int hoursSum = 0;
        int minutesSum = 0;
        
		while(true){
			videoLenght = in.nextLine();
			if (videoLenght.equals("End")) {
                break;
			}
			
			String[] times = videoLenght.split(":");
			hoursLenght = Integer.parseInt(times[0]);
            minutesLenght = Integer.parseInt(times[1]);
           
            hoursSum += hoursLenght;
            minutesSum += minutesLenght;
           
            if (minutesSum >= 60) {
                    hoursSum += 1;
                    minutesSum -= 60;
            }
		}
		String mins = String.format("%2d", minutesSum).replace(' ', '0');
        
        System.out.printf("%d:%s",hoursSum, mins);
	}

}

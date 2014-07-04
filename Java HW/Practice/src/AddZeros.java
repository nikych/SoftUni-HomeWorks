import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


public class AddZeros {

	public static void main(String[] args) {
		 
     try {
	    	 BufferedReader reader;
	    	 BufferedWriter writer = null;
             reader = new BufferedReader(new FileReader("src/input.txt"));
             String text = null;
             ArrayList<String> arr = new ArrayList<>();
             while ((text = reader.readLine()) != null) {
                arr.add(text);
             }
             System.out.println(arr);
             reader.close();
             
             writer = new BufferedWriter(new FileWriter("src/outputText.txt"));
                  
			 for (int i = 0; i < arr.size(); i++) {
				 String current = arr.get(i);
				 current = "0" + arr.get(i);
				 writer.write(current + "\r\n");
			}
			 writer.close();
             
         }
         catch (Exception e) {
             System.out.println("Error");
         }
	}

}

import java.util.Locale;
import java.util.Scanner;

import javax.script.ScriptEngine;  
import javax.script.ScriptEngineManager;  
import javax.script.ScriptException; 
import javax.swing.text.html.HTMLEditorKit.Parser;

public class SimpleExpression {

	public static void main(String[] args) throws ScriptException {
		Locale.setDefault(Locale.ROOT);
		Scanner in = new Scanner(System.in);

		String input = in.nextLine().replaceAll("\\s+","");
		String st = input;
		String expression = input;
		double result;
		for(int i=0;i<st.length();i++)
		{
		  if((st.charAt(i)=='+') && (st.charAt(i)=='-'))
		  {
		    result=Double.parseDouble(st.substring(0, i))+Double.parseDouble(st.substring(i+1, st.length()));
		    System.out.println(result);
		  }         
		}
		
		
		
		
		

		
	}
}
		


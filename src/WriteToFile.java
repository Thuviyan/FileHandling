import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {

	public static void main(String[] args) {
		
		File file = new File("textfile.txt");
		
		String oneline = "I'm being written to a textfile.txt";
		char[] cArray = "and i am a char array being written to a textfile.txt".toCharArray();
		
		try {
			
			PrintWriter writer = new PrintWriter(new FileWriter(file, true));
			
			writer.println(oneline);
			writer.println(cArray);
			
			writer.close();
			
		}
		catch(IOException ex) {
			System.err.println("I failed to write these contenets ");
		}

	}

}

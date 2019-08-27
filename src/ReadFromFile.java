import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {
		
		File file = new File("textfile.txt");
		
		BufferedReader reader;
		
		String line;
		
		try {
			reader = new BufferedReader(new FileReader(file));
			
			while((line = reader.readLine()) != null ) {
				System.out.println(line);
			}
			
			reader.close();
		}
		
		catch(IOException ex) {
			System.err.println("I failed to read from the specified file!");
		}

	}

}

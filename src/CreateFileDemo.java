import java.io.File;
import java.io.IOException;

public class CreateFileDemo {

	public static void main(String[] args) {
		
		File newFile = new File("E:\\Users\\Thuviyan\\Desktop\\thuviyan.bat");
		
		try {
			if(newFile.createNewFile()) {
				System.out.println("textfile.txt has been created successfully!");
			}
			else {
				System.err.println("textfile.txt already exists!");
			}
		}
		catch(IOException ioEx) {
			System.err.println("textfile.txt could not be created for some dumb reason! ");
		}

	}

}

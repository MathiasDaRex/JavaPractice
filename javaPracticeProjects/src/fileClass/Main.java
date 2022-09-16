package fileClass;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		// file = An abstract representation of file and directory pathnames 
		// if the file is in the project folder :
		File file = new File("message.txt");
		File notFile = new File("\"C:\\Users\\matyas.gyorke\\Desktop");
		
		// if anywhere else on our computer
		// File file = new File("C:\\Users\\matyas.gyorke\\Desktop\\message.txt");
		
		if(file.exists()) {
			System.out.println("That file exists! :o");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			System.out.println(notFile.isFile());
			file.delete();
			
		} else {
			System.out.println("That file doesn't exist. :(");
		}

	}

}

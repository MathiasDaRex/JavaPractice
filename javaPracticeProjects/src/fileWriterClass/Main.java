package fileWriterClass;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("output.txt");
			
			writer.write("Roses are red \nViolets are blue \nGive me my beer \nOr I will punch you");
			writer.append("\n(A pem by Igor Fyaszticskovec]");
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

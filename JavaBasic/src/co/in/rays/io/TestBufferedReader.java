package co.in.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedReader {
	
	public static void main (String [] args) throws IOException {
		
		BufferedReader file = new BufferedReader(new FileReader("C://Users//abhis//OneDrive//Desktop//text3.txt"));
		
		String line = file.readLine();

		while (line != null) {
			System.out.println(line);
			line = file.readLine();
		}
		
		file.close();
		
	}

}

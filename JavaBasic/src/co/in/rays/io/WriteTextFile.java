package co.in.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	
	public static void main (String [] args) throws IOException {
		
		FileWriter file = new FileWriter("C://Users//abhis//OneDrive//Desktop//text2.txt");
		
		file.write("who are you");
		
		System.out.println("text data write successfully ");
		
		file.close();
	}

}

package co.in.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestKeyboardinput {
	
	public static void main (String []args) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter("C://Users//abhis//OneDrive//Desktop//text5.txt"));
		System.out.println("Write your text -----------");
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String str = br.readLine();
		while(!str.equals("stop")) {
			out.println(str);
			str = br.readLine();
		}
		
		br.close();
		out.close();
		in.close();
	}

}


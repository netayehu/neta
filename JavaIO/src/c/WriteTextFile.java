package c;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTextFile {

	public static void main(String[] args) {
		File directory = new File("C:/neta/temp/a");
		if (!directory.exists()) {
			directory.mkdirs();
		}
		//the file we want to write to
		File file = new File(directory,"/file2.txt");
		//create buffer that can write text to file
		// if (file,true)= continue to write in the same file
		// if (file,false)= delete and write new file
		
		
		try(BufferedWriter out = new BufferedWriter(new FileWriter(file, true));) {
			out.write("this is the first line");
			out.newLine();
			out.write("this is the second line");
			System.out.println("text writen");
			int x=500;
			out.write(""+x);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//better way to write
		
		try(PrintWriter out = new PrintWriter(new FileWriter(file, true));) {
			out.println("this is the first line");
			out.println(8);
			out.println("this is the second line");
			System.out.println("text writen");
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		

	}

}

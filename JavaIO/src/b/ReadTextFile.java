package b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) {

		try (FileReader in = new FileReader("C:/neta/temp/file.txt");) {

			int c = in.read();
			System.out.println(c);
			System.out.println((char) c);

			while (c != -1) {
				System.out.print((char) c);
				c = in.read();
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("=====================");

		// buffer
		File file2 = new File("C:/neta/temp/file.txt");
		try (BufferedReader in = new BufferedReader(new FileReader(file2));) {

			String line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}

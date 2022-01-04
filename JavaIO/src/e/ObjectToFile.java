package e;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectToFile {

	public static void main(String[] args) {
		person p= new person(123,"eli",33,"Jerusalem");
		File file = new File("files/person.obj");
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));){
			out.writeObject(p);
			System.out.println("object writen");
			System.out.println(p);
	
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}

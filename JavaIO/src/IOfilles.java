import java.io.File;
import java.io.IOException;

public class IOfilles {

	public static void main(String[] args) {

		String path = "C:/neta/temp/file.txt";

		try {
			File file = new File(path);
			System.out.println(file.exists());

			if (!file.exists()) {

				file.createNewFile();
				System.out.println("file created" + file);
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	

}

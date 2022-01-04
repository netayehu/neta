package d;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Calculator {
	
	

	private double res;
	
	public void storeResult() {
		File dir = new File("files");//relative path,created in the same folder
		dir.mkdirs();
		File file = new File(dir,"res.data");
		try (DataOutputStream out= new DataOutputStream(new FileOutputStream(file));){
			out.writeDouble(res);
			System.out.println("data stored in"+file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public double getStoredResult() {
		
		File dir = new File("files");//relative path,created in the same folder
		File file = new File(dir,"res.data");
		try(DataInputStream in= new DataInputStream(new FileInputStream(file));) {
			double storedResult = in.readDouble();
			return storedResult;
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return res;
	}
	
	public void add(double val) {
		res+=val;
	}
	public void sub(double val) {
		res-=val;
	}
	public void mul(double val) {
		res*=val;
	}
	public void div(double val) {
		res/=val;
	}
	public void clear(double val) {
		res=0;
	}
	public void getResulet() {
		
	}
	
		

	

}

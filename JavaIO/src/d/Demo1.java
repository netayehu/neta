package d;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {
		int n1 = 123;
		byte n2 = 50;
		double n3 = 2.548;
		boolean d = true;
		long n4 = 9999999999999L;

	

	
//create file and loud

	File file = new File ("files/primitiv.data");
	
	
	try (DataOutputStream out= new DataOutputStream(new FileOutputStream(file));){
		out.writeInt(n1);
		out.writeByte(n2);
		out.writeDouble(n3);
		out.writeBoolean(d);
		out.writeLong(n4);
		
		System.out.println("data stored in"+file);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	//read from file
	
	try(DataInputStream in= new DataInputStream(new FileInputStream(file));) {
		
		int x1 = in.readInt();
		byte x2=in.readByte();
		double x3=in.readDouble();
		boolean x4=in.readBoolean();
		long x5=in.readLong();
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
	
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}

		
	



	
	
	
}}

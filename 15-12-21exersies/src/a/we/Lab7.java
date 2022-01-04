package a.we;
import java.util.*;

public class Lab7 {


	public static void main(String[] args) {
		//1
		 char[] arr = {'a','b','c','a','b','d','r','c'};
		 System.out.println(arr.length);
		 int num = 0;
		 
		 for (int i = 0; i < arr.length; i++) {
			 if ((arr[i]=='a')||(arr[i]=='c')){
			 	num++;
			 }
			
		 } 
		 System.out.println("number of 'a'+'c': "+ num);
		 
		 
		//2

		 
		 String s1="John Bryc";  
		 char[] ch = new char[s1.length()];
		 ch=s1.toCharArray();  
		 for(int i=0;i<ch.length;i++){  
			 System.out.print(ch[i]); 
		 }
		 System.out.println();
		 num=0;
		 for (int i = 0; i < ch.length-1; i++) {
			 if (ch[i]=='h'){
			 	num++;
			 	}
		 }
		 System.out.println("number of 'h': "+num);
		 
		 //3
	
		 String str = "Sara Shara Shir Cameach";
		 char[] ch1 = new char[str.length()];
		 ch1=str.toCharArray();  
		 for(int i=0;i<ch1.length;i++){  
			 System.out.print(ch1[i]);
		 }
		 
		 System.out.println();
		 
		 num=0;
		 for (int i = 0; i < ch1.length; i++) {
			 if ((ch1[i]=='A')||(ch1[i]=='a')||
			    (ch1[i]=='E')||(ch1[i]=='e')||
			    (ch1[i]=='I')||(ch1[i]=='i')||
			    (ch1[i]=='O')||(ch1[i]=='o')||
			    (ch1[i]=='U')||(ch1[i]=='u')){
				 num++;
			 	
			 }
		 }
		 
		 System.out.println("number of Vowels: "+num);
		 
		 
		 
		 
		 
		 
		 
		 

	}

}

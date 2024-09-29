package interviewTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Interview {

	public static void main(String[] args) throws IOException  {
		String s="hari**123dhanya";
		StringBuffer s1=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='a'&& s.charAt(i)<='z'))
			{
				s1.append(s.charAt(i));
			}
		}
		System.out.println(s1);
		
		
		
		String st= "java is good and java id robust";
		  String[] words=st.split("\\s");
		  int count=0;
		  for(int i=0;i<words.length;i++)
		  {
		      if(words[i].equals("java"))
		      {
		          count++;
		      }
		  }
		  System.out.println("java count is : "+count);
		
		  
		  File f=new File("C:\\Users\\Hari\\eclipse-workspace\\JavaCodingTest\\src\\main\\java\\interviewTest\\data.txt");
		  FileReader fr=new FileReader(f);
		 BufferedReader br=new BufferedReader(fr);
		 System.out.println(br.readLine());
		 
		 
	

	}


}

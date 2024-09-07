package stringPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MostRepeatedwordFromTxtFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//open file in read-only mode
		FileReader file=new FileReader("C:\\Users\\Hari\\eclipse-workspace\\JavaCodingTest\\src\\main\\resources\\data.txt");
		BufferedReader data=new BufferedReader(file);
		//use arrayalist to read the data
		//Read Each line
		String line="";
		int length1=0;
		if((line=data.readLine())!=null)
		{
			String[] words=line.toLowerCase().split("\\s");

			length1=length1+words.length;
		
			
			int count=0;
			String maxrp="";
			int save=0;
			int i=0;
			for(i=0;i<words.length;i++)
			{
				count=0;
				for(int j=i+1;j<words.length;j++)
				{
					
					if(words[i].equals(words[j]))
					
					{
	                 count++;

					}
				}
				if(save<count)
				{
					maxrp=words[i];
					save=count;
					
				}
			}
			
			System.out.println(maxrp);
			System.out.println(length1);
			
			//write the result to the file
			FileWriter file1=new FileWriter("C:\\Users\\Hari\\eclipse-workspace\\JavaCodingTest\\src\\main\\resources\\data1.txt");
			BufferedWriter data1=new BufferedWriter(file1);
			data1.write(maxrp);
			data1.close();
			
			

		}
		

		}
		
		
	
	}



package fileAndexceptionHandling;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//creating a file
		File file=new File("file.txt");
		if(file.createNewFile())
		{
			System.out.println("File is created : "+file.getAbsolutePath());
		}
		else
		{
			System.out.println("File not created");
		}
		
		//write to the file created
		FileWriter writer=new FileWriter("file.txt");
		BufferedWriter bwriter=new BufferedWriter(writer);
		bwriter.write("Hello Sunflower!");
		bwriter.close();
		//read the data from the file
		FileReader reader=new FileReader("file.txt");
		BufferedReader breader=new BufferedReader(reader);
		String data=breader.readLine();
		System.out.println("read data : "+data);
		

	}

}

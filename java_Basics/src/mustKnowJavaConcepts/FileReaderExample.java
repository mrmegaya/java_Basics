package mustKnowJavaConcepts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		String location="F:\\Workspace\\readingexample\\reading.txt";//to point the file location		
		FileReader filereader=new FileReader(location);//Read the file from location
		BufferedReader buffered=new BufferedReader(filereader);//Read the contents from the file
		String line;
		int count=0;//to count the no of lines
		while ((line = buffered.readLine())!=null) //reading line
		{
			System.out.println(line);//Print the line
			count=count+1;
		}
		System.out.println("Total No of lines : "+count);
		buffered.close();

	}

}

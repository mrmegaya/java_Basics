package mustKnowJavaConcepts;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	//File writing using FileWriter class - Direct method
	public void DirectMethod() throws IOException
	{
		String location="F:\\Workspace\\writingExample\\filewriteexample.txt";
		String content="Hi and Hello";
		FileWriter filewrite=new FileWriter(location);
		filewrite.write(content);
		System.out.println("Using FileWriter class Complete");
		filewrite.close();
	}
	//Using Buffered Writer
	public void bufferedwriter() throws IOException
	{
		String location="F:\\Workspace\\writingExample\\Bufferedwriteexample.txt";
		String content="Using Buffered Writer";
		FileWriter filewrite=new FileWriter(location);
		BufferedWriter buffered=new BufferedWriter(filewrite);
		buffered.write(content);
		System.out.println("Using Buffered Writer Complete");
		buffered.close();		
	}
	// using file output stream
	public void fileoutputstream() throws IOException
	{
		String location="F:\\Workspace\\writingExample\\fileoutputstream.txt";
		String content="Using File Output Stream";
		FileOutputStream fos=new FileOutputStream(location);
		byte[] bytes = content.getBytes();		
		fos.write(bytes);
		System.out.println("Using File output stream Complete");
		fos.close();
	}
	public static void main(String[] args) throws IOException {
		FileWriterExample obj=new FileWriterExample();
		obj.DirectMethod();
		obj.bufferedwriter();
		obj.fileoutputstream();				
	}
}

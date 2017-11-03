
import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;

public class FileMove
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		// Creating new files
		int count = 8;
		for(int i = 1; i <= count; i++)
		{
			Files.createFile(Paths.get("Y:\\Selenium\\File Moving Task\\Sub Folder\\File" +i+ ".txt"));
			//System.out.println("File"+i+" Created\n");
		}
		System.out.println(+count+" Files Created\n");
		
		// Moving files from Sub folder to Main Folder
		for(int j = 1; j <= count; j++)
		{
			Path source = Paths.get("Y:\\Selenium\\File Moving Task\\Sub Folder\\File" +j+ ".txt");
			Path destination = Paths.get("Y:\\Selenium\\File Moving Task\\File" +j+ ".txt");
			Files.move(source, destination);
			//System.out.println("File"+j+" Moved\n");
		}
		System.out.println(+count+" Files Moved");
		
	}
}

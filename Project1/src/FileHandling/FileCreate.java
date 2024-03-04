package FileHandling;
import java.io.*;
import java.util.*;
public class FileCreate {

	public static void main(String[] args) {
		try {
			File f=new File("hello.txt");
			if(f.createNewFile()) {
				System.out.println("File created successfully");
			}
			else {
				System.out.println("File already exit");
			}
		}catch(IOException i) {
			
		}
		
		

	}

}

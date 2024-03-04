package FileHandling;
import java.io.*;
public class CopyFile {

	public static void main(String[] args) {
		try {
		FileInputStream r=new FileInputStream("Kishor1.txt");
		FileOutputStream w=new FileOutputStream("Hello.txt");
		int i;
		while((i=r.read())!=-1) {
			w.write((char)i);
			
		}
		System.out.println("Data copy successfully");

	}catch(IOException i) {}
	}

}

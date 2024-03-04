package FileHandling;
import java.io.*;
public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("Kishor.txt");
			fw.write("Hello java is my favorite language");
			fw.close();
		}catch(IOException e) {}
		System.out.println("write successfully");
	}

}

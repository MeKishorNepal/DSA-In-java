package FileHandling;
import java.io.*;
public class ReadFile {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("Kishor.txt");
			try {
				int i;
			    while((i=fr.read())!=-1) {
					System.out.print((char)i);
				}
				
	
			}finally {
				fr.close();
				System.out.println(" File closed");
			}
		}catch(IOException e) {}

	}

}

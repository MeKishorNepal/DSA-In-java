package FileHandling;
import java.io.*;
public class FileRename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			File r=new File("Kishor.txt");
			File n=new File("Kishor1.txt");
			if(r.exists()) {
				System.out.println(r.renameTo(n));
				
			}else {
				System.out.println("file does not exist");
				
			}
		

	}

}

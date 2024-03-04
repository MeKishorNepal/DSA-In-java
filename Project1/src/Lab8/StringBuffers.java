package Lab8;

public class StringBuffers {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello ");
		sb.append("java");
		System.out.println("Original String is :: "+sb);
		System.out.println();
		
		StringBuffer s1= new StringBuffer("Kishor ");
		s1.insert(7, "Nepal");
		System.out.println("Inserting the string Nepal in index 8 is "+s1);
		System.out.println();
		
		StringBuffer s2= new StringBuffer("World");
		s2.replace(1,2,"io");
		System.out.println("We replace the Srting at index 1 to 2 and add io result is:: "+s2);
		System.out.println();
		
		StringBuffer s3= new StringBuffer("Jungle");
		s3.reverse();
		System.out.println( "We reverse the string result is :: "+s3);
		System.out.println();
		
		StringBuffer s4=new StringBuffer("Hello world ");
		System.out.println("We find the capacity of string i.e "+s4.capacity());
		System.out.println();
		s4.append("I am Kishor");
		System.out.println("We add the or append the String i.e "+s4);
		System.out.println();
		s4.ensureCapacity(50);//(28*2)+2
		System.out.println("We ensure the capacity of String i.e "+s4.capacity());
		
		
			
		
		
		
		

	}

}

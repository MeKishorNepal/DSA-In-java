package unite9;
import java.util.*;
public class EnumExample {
	enum days{
		sunday,
		Monday,
		tuesday,
		Wednesday,
		Thusday,
		friday,
		saturday
		
	}

	public static void main(String[] args) {
		
		System.out.println(days.sunday);
		
		days today=days.friday;
		switch(today) {
		case sunday:
			System.out.println("Weekend");
			break;
		case Monday:
		case tuesday:
		case Wednesday:
		case Thusday:
		case friday:
			System.out.println("Good day");
			break;
		case saturday:
			
		}
try {
			
			System.out.println(days.friday);
			Thread.sleep(2000);
		
			}catch(InterruptedException e) {}
		
		
		
		

	}

}

package basic;

public class Switchupdate {
	public static void main(String[]args) {
		String day="Sunday";
		String result="";
		result=switch(day) {
		case "Saturday","Sunday"-> "7am";
		case "Monday"-> "5am";
		default->result=("6am");
		};
		System.out.println(result);
	}

}

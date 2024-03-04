package basic;

import java.util.ArrayList;
import java.util.List;

public class ListNumberEx {
	public static void process(
			List< Number> list) {
		list.add(5);
		list.add(4.5f);
		list.add(1.22232443);
		System.out.println(list);
		
		
	}
	

	public static void main(String[] args) {
		List< Number>ints=new ArrayList<>();
		
		process(ints);
	}

}

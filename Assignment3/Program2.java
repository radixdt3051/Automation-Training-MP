package demo3;
import java.util.ArrayList;

public class Program2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(2);
		
		
		list.add(1);
		list.add(3);
		list.add(5);
		
		
		System.out.println("First List:" + list);
		
		
	ArrayList<Integer> list2 = new ArrayList<Integer>(4);
		
		list2.add(7);
		list2.add(8);
		list2.add(9);
		list2.add(10);
		list2.add(11);
		
		System.out.println("Second List:" + list2);
		
		
		
		list.addAll(list2);
		System.out.println("\nFinallist:" + list);
		
	}
	
}
		


	
		
		
	   	
	
		
		


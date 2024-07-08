package Madhuri_Package;

import java.util.Scanner;

public class Program3 {
	
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	//System.out.println("Enter your first name:"+fn);
	//System.out.println("Enter your last name:");
    //StringBuilder ab = new StringBuilder("Madhuri");
    //System.out.println(str.toString());
   // ab.append(" Parekh");
	System.out.println("Enter your first five name:");
	String a = sc.nextLine();
	System.out.println(a);
	
	System.out.println("Enter your last five name:");
	String b = sc.nextLine();
	System.out.println(b);
	
	
	
	
String name = a.concat(" "+ b);

System.out.println(name);
	
//	String ab = new String();
//	ab.append();


    //System.out.println(ab);
  }
}


	
	
	



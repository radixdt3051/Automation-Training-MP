package Madhuri_Package;

import java.util.Scanner;

public class program4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Year of job started. :");
		System.out.println("month of job started. :");
		System.out.println("Find Total experience with Current Month:");
		
		int jobstarted = sc.nextInt();
	//	int mjobstarted = sc.nextInt();
	
	
		//System.out.println(exp);
		
		
		
		int expmonth = sc.nextInt();
		//System.out.println(age);
		int CY = 2024;
		//int CM = 07;
		int totalexp = (CY-jobstarted);
		//int totalm = (CM - mjobstarted);
		System.out.println("count exp:" +totalexp);


		if(jobstarted <= 2002 && expmonth <= 07)
	
		
			
		{
			
			System.out.println("You are eligible!");
		}
		else

		{
			System.out.println("You are not eligible");
		}
		
	}

}




package demo3;
import java.util.Arrays;
public class program1 {

	public static void main(String[] args) {
		
	int rows = 2;
	int columns = 5;
	
	int[][] arr = new int [rows][columns];
	 arr[0][0]=10;
	 arr[0][1]=20;
	 arr[0][2]=30;
	 arr[0][3]=40;
	 arr[0][4]=50;
	 arr[1][0]=100;
	 arr[1][1]=200;
	 arr[1][2]=300;
	 arr[1][3]=400;
	 arr[1][4]=500;
	/* arr[2][0]=10*10;
	 arr[2][1]=20*20;
	 arr[2][2]=30*30;
	 arr[2][3]=40*40;
	 arr[2][4]=50*50;*/
	 
	
	 
	 System.out.println("Array value:" + arr[0][4]);
	 
	 
	 
			 int i ;
			 
//quantity
	 for (i=0;i<=5;i++)
	 {
		 
		 
		 
		  if (i == arr[0][2])
		  {
			    continue;
		 }
			  System.out.println("Quantity:" + arr[0][3]);
			}
	 
//price	 
	 
	 
 for (i=0;i<=5;i++)
	 {
		 
		  if (i == arr[0][2]) 
		  {
			    break;
		  }
			  System.out.println("Price:" + arr[1][1]);
			}
	 
	/* for (i=0;i<=5;i++)
	 {
		 
		  if (i == 40*40) {
			  
			  
			    return ;
			    
			  }
		  System.out.println(i);*/
		  
		 
	}
	 
	 }
		
	



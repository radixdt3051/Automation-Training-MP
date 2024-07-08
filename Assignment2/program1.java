package Madhuri_Package;

public class program1 {
	
	public static void main(String[] args) {
			//String mp ="Hello World!";
			//System.out.println(mp);
			program1 m = new program1(50,5);
			program1 u = new program1();
			m.substract();
		    m.test();
		    m.multiply();
		}

	public program1() {
		
		int a=40;
		int b=60;
		int c=(a+b);
		System.out.println(c);
		}


	public void substract() {
		 float a = 45.547654f;
		 float b = 96.454354f;
		 float c = (b-a);
		 System.out.println(c);
		
	}

	public void test() {
		int ab = 4;
		System.out.println(ab);

		}

	public program1(int d, int e) {
		
		
		int f=(d/e);
	    System.out.println(f);
		
	}
	public void multiply() {
		 long a = 4589378439458l;
		 long b = 8327426374324l;
		 long c = (a*b);
		 System.out.println(c);
		 
	}

 }







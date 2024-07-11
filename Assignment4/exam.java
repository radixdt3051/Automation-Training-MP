package assignment4;


	abstract class Marks {
	  
	    public abstract float getPercentage();
	}

	
	class Student1 extends Marks {
	    
	    private int marks1;
	    private int marks2;
	    private int marks3;

	   
	    public Student1(int marks1, int marks2, int marks3) {
	        this.marks1 = marks1;
	        this.marks2 = marks2;
	        this.marks3 = marks3;
	    }

	
	    public float getPercentage() {
	        
	        int totalMarks = marks1 + marks2 + marks3;
	       return (totalMarks / 3.0f); 
	    }
	}


	class Student2 extends Marks {
	  
	    private int marks1;
	    private int marks2;
	    private int marks3;
	    private int marks4;

	 
	    public Student2(int marks1, int marks2, int marks3, int marks4) {
	        this.marks1 = marks1;
	        this.marks2 = marks2;
	        this.marks3 = marks3;
	        this.marks4 = marks4;
	    }

	  
	    public float getPercentage() {
	    
	        int totalMarks = marks1 + marks2 + marks3 + marks4;
	      return (totalMarks / 4.0f); 
	    }
	}


	public class exam {
	    public static void main(String[] args) {
	      
	        Student1 studentA = new Student1(65, 85, 92);
	        Student2 studentB = new Student2(95, 75, 85, 80);

	        System.out.println("Percentage of Student 1: " + studentA.getPercentage() + "%");
	        System.out.println("Percentage of Student 2: " + studentB.getPercentage() + "%");
	    }
	}
	
	


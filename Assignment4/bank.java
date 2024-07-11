package assignment4;

class banktest{
    float getIntRate() {
        return 0.0f;
    }

}

class SBI extends banktest {
   
    float getIntRate() {
        return 7.0f;
    }
}


class ICICI extends banktest {
    
    float getIntRate() {
        return 9.0f; 
    }
}

class AXIS extends banktest {
   
    float getIntRate() {
        return 8.0f; 
    }

}
	class Bank {
		
	public static void main(String[] args) {
		        SBI sbi = new SBI();
		        ICICI icici = new ICICI();
		        AXIS axis = new AXIS();

		        System.out.println("SBI: " + sbi.getIntRate() + "%");
		        System.out.println("ICICI: " + icici.getIntRate() + "%");
		        System.out.println("AXIS: " + axis.getIntRate() + "%");
		    }
	}
	
	
	
	
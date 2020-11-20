import java.util.Scanner;

	public class ProtonSaga extends Proton{
		
		private String fuel;
		private String color;
		
		ProtonSaga(){
			this.color = "color";
		}
			
			
		public void color() {
	    	System.out.println("Preferred Color: ");
	    	Scanner in = new Scanner(System.in);
	    	String color = in.next();  
	    	System.out.println("This color is available for booking");
	    	
		 }

		//Getter method for fuel
	    public String getFuel() {
	    	return fuel;   	
	    }
	    	
	    //Setter method for fuel
	    public void setFuel(String fuel) {
	    	this.fuel=fuel;
			
		}
		
		public void run() {
		    	System.out.println("Proton Saga is running safely.");
		    	System.out.println();
			
			
		}

	
}

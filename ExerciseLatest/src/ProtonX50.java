import java.util.Scanner;

	public class ProtonX50 extends ProtonX70{

		private String park;
		private String color;
		

		ProtonX50(){
			this.color = "color";

		}
		public void color() {
		
			System.out.println("Preferred Color: ");
	    	Scanner in = new Scanner(System.in);
	    	String color = in.next();  
	    	System.out.println("Not available");
	    	
	    	
	    	System.out.println("Any other preferred color : ");
	    	Scanner in1 = new Scanner(System.in);
	    	String color1 = in.next();  
	    	System.out.println("Available");
	    	
		}
	    //Setter method for park
	    public void setPark(String parking) {
	    	this.park = parking;  	
		}
	    
	  //Getter method for park
	    public String getPark() {
	    	return park;   	
	    }
		  public void run() {
		    	System.out.println("Proton X50 is running safely.");
		    	System.out.println();
			    	
			
		}
		

	
}

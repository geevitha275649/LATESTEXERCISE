import java.util.Scanner;

	public class ProtonX70 extends Proton{
		
	 	private String windows ;
	 	
	 	
	 	 //Setter method for window
	    public void setWindow(String windows) {
	    	this.windows=windows;
	  		
		}
		
	 	//Getter method for window
	    public String getWindow() {
	    	return windows;   	
	    }
	    
		public void color() {
			System.out.println("Preferred Color : ");
	    	Scanner in = new Scanner(System.in);
	    	String color = in.next(); 
	    	System.out.println("Not available");
	    	
		}
		
		  public void run() {
		    	System.out.println("Proton X70 is running safely.");
		    	System.out.println();
		}
		
}

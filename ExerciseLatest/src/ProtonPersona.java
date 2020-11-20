
import java.util.Scanner;


	public class ProtonPersona extends Proton {

		private String bigBoot; 
		private String radio;   
		private String color; 
		private String key = "Remote";
		
		
		
		ProtonPersona() {
			
			System.out.println("Boot space: ");
			Scanner in = new Scanner(System.in);
			String boot = in.next();
						
					this.bigBoot=boot;
					this.color = "color";
			
		}
		
	    public void boot() {
	    	System.out.println("- Bigger boot space\n" + bigBoot);
	    	
	    }
	    
	    public void color() {
	    	System.out.println("Preferred Color : ");
	    	Scanner in = new Scanner(System.in);
	    	String color = in.next();  
	    	System.out.println("This color is available for booking");
	    	
	    }
	    
	    //Setter method for radio
	    public void setRadio(String radio) {
	    	this.radio=radio;
	    }
	    	
	    //Getter method for radio
	    public String getRadio() {
	    	return radio;   	
	    }
	    	
	    //Setter method for key
	    public void setKey(String key) {
	    	this.key=key;
	    }
	    
	  //getter method for key
	  	public String getKey() {
	  		return key;
	 
	    }
	    
	    public void run() {
	    	System.out.println("Proton Persona is running safely.");
	    	System.out.println();
	    }
		
	
}

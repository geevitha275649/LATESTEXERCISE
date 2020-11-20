
public class MainProton {

	public static void main(String[] args) {
		ProtonSaga s = new ProtonSaga();
		System.out.println("1) Proton Saga ");
		s.printProton();
		s.color();
		
		//ENCAPSULATION
		s.setFuel("Save & Efficient");		
		System.out.println("Fuel consumption : "+s.getFuel());
		s.run();
		
		
		System.out.println("\t");
		
		
		ProtonPersona p = new ProtonPersona();
		System.out.println("\n2) Proton Persona ");
		p.boot();
		p.color();
		
		//ENCAPSULATION 
		p.setRadio("Panasonic");
		System.out.print("Radio Brand         : "+p.getRadio()+"\n");
		p.getKey();
		System.out.println("Key type            : "+p.getKey());
		p.run();
		
		
		System.out.println("\t");
		
		
		ProtonX70 p1 = new ProtonX70();
		System.out.println("3) Proton X70");
		
		//ENCAPSULATION
		p1.setWindow("Tinted");
		System.out.println("Windows type      : "+p1.getWindow());
		p1.printProton();
		p1.color();
		p1.run();
		
		
		System.out.println("\t");
		
		
		ProtonX50 p2 = new ProtonX50();
		System.out.println("4) Proton X50 ");
	
		//ENCAPSULATION
		p2.setPark("Auto-parking");
		System.out.println("Parking  : "+p2.getPark());
		p2.printProton();
		
		p2.color();
		p2.run();
		
	}
}

package cat;

public class Main {

	public static void main(String[] args) {
//		Cat normalCat = new Cat(25.0);
		Cat houseCat = new HouseCat("wiskers", 20.0);
		
//		System.out.println(normalCat.noise());
		System.out.println(houseCat.noise());
		
		//houseCat.isSatisfied();		// Won't work!
		
		
		System.out.println(houseCat instanceof Cat);
//		System.out.println(normalCat instanceof Cat);
		if(houseCat instanceof HouseCat) {
			// safely cast
		}
	}
	
	
}

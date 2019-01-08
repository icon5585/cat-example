package cat;

public class SuperHouseCat extends HouseCat {

	public SuperHouseCat(String aName, double aWeight) {
		super(aName, aWeight);
		super.noise();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String abstractNoise() {
		// TODO Auto-generated method stub
		return null;
	}

}

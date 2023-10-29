package week10;

class Football extends Ball{

	Football(String brandName) {
		super(brandName);
	}

	@Override
	void bounce() {
		System.out.println("Football is bounced");
	}
	
	@Override
	public void toss() {
		System.out.println("Football is tossed");
	}
	
}

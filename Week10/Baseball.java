package week10;

class Baseball extends Ball implements Tossable{

	Baseball(String brandName) {
		super(brandName);
	}

	@Override
	void bounce() {
		System.out.println("Baseball is bounced");
		
	}

	@Override
	public void toss() {
		System.out.println("Baseball is tossed");
	}
}

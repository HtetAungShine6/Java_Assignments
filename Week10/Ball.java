package week10;

abstract class Ball implements Tossable{

	private String brandName;

	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Ball(String brandName) {
		this.brandName = brandName;
	}

	abstract void bounce();
}
package week10;

public class Main {

	public static void main(String[] args) {
		Baseball bb = new Baseball("Tigers");
		Football fb = new Football("Manchester");
		Rock rock = new Rock() {};
		bb.toss();
		bb.bounce();
		System.out.println(bb.getBrandName());
		fb.toss();
		fb.bounce();
		System.out.println(fb.getBrandName());
		rock.toss();
	}

}

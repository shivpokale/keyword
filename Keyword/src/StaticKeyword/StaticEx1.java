package StaticKeyword;

public class StaticEx1 {
	
	static int i = m1();
	
	private static int m1() {
		return 10;
	}
	
	static {
		System.out.println("static block");
	}
	
	

}

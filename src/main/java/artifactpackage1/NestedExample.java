package artifactpackage1;

public class NestedExample {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		methodA();

	}

	static void methodA() {
		// TODO Auto-generated method stub
		methodB();
	}

	static void methodB() {
		// TODO Auto-generated method stub
		try {
			String string = null;
			System.out.println(string.length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Caught: " + e.getMessage());
			e.printStackTrace();
		}
		
		try {
			Integer.parseInt("abc");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Caught: " + e.getMessage());
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(-1000);
		} catch ( Exception e) {
			// TODO: handle exception
			System.out.println("Caught: " + e.getMessage());
			e.printStackTrace();
		} 
		
		try {
			Thread.sleep(-1000);
		} catch ( Exception e) {
			// TODO: handle exception
			System.out.println("Caught: " + e.getMessage());
			e.printStackTrace();
		} 
		
	}
	
}

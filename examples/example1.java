public class Example {
	int counter = 5;
	/*
	 * JavaDoc comment
	 */
	public static void main(String[] args) {
		System.out.println(add(2, 3));
		System.out.println(add(2, 3));
		System.out.println(add(2, 3));
	}

	/*
	 * JavaDoc comment
	 * this is good
	 */
	public static int add(final int a, final int b) {
		return a + b;
	}

  public double divide(double a, double b){
    return 1.0 * a / b; // Line Comment
  }

}

public class Example2 {
	
	int counter = 5;
	public static void main(String[] args) {
		/*
		 * huhu
		 * frfrfrfrfr
		 * rfrfrfr
		 * rfrfrf
		 * 
		 */
		System.out.println(2);
		System.out.println(3);
	}
}


public class SecondClass {

	public void print(int a) {
		System.out.println(a);
	}

  public static void main(String[] args) {
		System.out.println(2);
	}
}

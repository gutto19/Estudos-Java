
public class expressoesMaiores {

	public static void main(String[] args) {
		double a = 3.0;
		double b = 4.0;
		double c = -5.0;
		double x1, x2, delta;
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println(delta);
		System.out.println(x1);
		System.out.println(x2);

	}

}

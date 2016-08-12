public class Calculate {
	public static void main(String[] arg){
		System.out.println("Calculate..");
		int one = Integer.valueOf(arg[0]);
		int two = Integer.valueOf(arg[1]);
		int sum = one + two;
		System.out.println("Summ " + sum);
		int three = Integer.valueOf(arg[0]);
		int four = Integer.valueOf(arg[1]);
		int sub = three - four;
		System.out.println("Sub " + sub);
		int five = Integer.valueOf(arg[0]);
		int six = Integer.valueOf(arg[1]);
		int mult = five * six;
		System.out.println("Mult " + mult);
		double seven = Integer.valueOf(arg[0]);
		int ache = Integer.valueOf(arg[1]);
		double div = seven / ache;
		System.out.println("Div " + div);
		
		
	}
	
}
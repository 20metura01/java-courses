public class Calculate {
	public static void main(String[] arg){
		System.out.println("Calculate..");
		int one = Integer.valueOf(arg[0]);
		int two = Integer.valueOf(arg[1]);
		int sum = one + two;
		int sub = one - two;
		int mult = one * two;
		double div = (double)one / two;
		System.out.println("Summ " + sum);
		System.out.println("Sub " + sub);
		System.out.println("Mult " + mult);
		System.out.println("Div " + div);
		
		
		
	}
	
}
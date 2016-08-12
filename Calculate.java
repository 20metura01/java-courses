public class Calculate {
	public static void main(String[] arg){
		System.out.println("Calculate..");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int sum = first + second;
		System.out.println("Summ " + sum);
		int tw = Integer.valueOf(arg[0]);
		int tr = Integer.valueOf(arg[1]);
		int sub = tw - tr;
		System.out.println("Sub " + sub);
		
	}
	
}
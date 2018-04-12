public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		double first = Integer.valueOf(arg[0]);
		double second = Integer.valueOf(arg[1]);
		double summ = first+second;
		double result = first - second;
		double mp = first * second;
		double div = (second/first);
		double power = Math.pow(first,second);
		System.out.println("Sum " + summ);
		System.out.println("Res " + result);
		System.out.println("Multipl " + mp);
		System.out.println("Divi " + div);
		System.out.println("Pow " + power);
		}
}

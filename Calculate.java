public class Calculate{
	public static void main(String[] arg){
        System.out.println("Calculate...");
	int a = Integer.valueOf(arg[0]);
	int b = Integer.valueOf(arg[1]);
        int sum = a + b;
	int summ = a - b;
	int sumn = a / b;
	int sumt = a * b;
	System.out.println("Sum " + sum);
	System.out.println("Sum " + summ);
	System.out.println("Sum " + sumn);
	System.out.println("Sum " + sumt);
} 
}
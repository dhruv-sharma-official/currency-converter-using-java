import java.util.Scanner;

class currency{
	public double ruppee(double amount){
		return amount * 83;
	}
	public double dollar(double amount){
		return amount / 83;
	}
}

public class main{

	public static void main(String[] args){
	boolean a = true;
	Scanner scanner = new Scanner(System.in);
	currency convert = new currency();
	while (a) {
		System.out.println("\n############ Currency Converter ############ \n1 -> to convert ruppee in dollar\n2 -> to convert dollar in ruppee\n0 -> to exit\n");
		int inp = scanner.nextInt();
		System.out.println("\nEnter amount:");
		double amnt = scanner.nextInt();

		if (inp == 1) {
			System.out.println("ruppees "+amnt+" equals to "+convert.dollar(amnt)+" in dollar");
		
		} else if (inp == 2) {
			System.out.println("dollar "+amnt+" equals to "+convert.ruppee(amnt)+" in ruppees");
			
		
		} else if (inp == 0) {
			System.out.println("exiting");
			a = false;

		} else {
			System.out.println("invalid input");
		}
	}
	scanner.close();
		
	}

}
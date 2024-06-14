import java.text.DecimalFormat;
import java.util.Scanner;

class currency {
	public double ruppee(double amount) {
		return amount * 83;
	}

	public double dollar(double amount) {
		return amount / 83;
	}
}

public class main {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner scanner = new Scanner(System.in);
		currency convert = new currency();
		while (true) {
			System.out.println(
					"\n############ Currency Converter ############ \n1 -> to convert ruppee in dollar\n2 -> to convert dollar in ruppee\n0 -> to exit\n");
			int inp = scanner.nextInt();
			double amnt;
			switch (inp) {
				case 1:
					System.out.println("\nEnter amount:");
					amnt = scanner.nextDouble();
					System.out.println("ruppees " + amnt + " equals to " + df.format(
							convert.dollar(amnt)) + " in dollar");
					break;
				case 2:
					System.out.println("\nEnter amount:");
					amnt = scanner.nextDouble();
					System.out.println("dollar " + amnt + " equals to " + df.format(
							convert.dollar(amnt)) + " in ruppees");
					break;
				case 0:
					break;

			}
			if (inp == 0) {
				break;
			}

		}
	}

}
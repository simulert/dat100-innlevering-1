import java.util.Scanner;

public class o1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hva er bruttolønnen din per nå i år?: ");
		double svar = Double.valueOf(scanner.nextLine());
		
		if (svar <= 217400 && svar >= 0) {
			System.out.println("Du betaler 0 kr i trinnskatt");
			
		} else if (svar >= 217401 && svar <= 306050) {
			System.out.println("Du betaler " + svar*0.017 + "kr i trinnskatt");
			
		} else if (svar >= 306051 && svar <= 697150) {
			System.out.println("Du betaler " + svar*0.04 + "kr i trinnskatt");
			
		} else if (svar >= 697151 && svar <= 942400) {
			System.out.println("Du betaler " + svar*0.137 + "kr i trinnskatt");
			
		} else if (svar >= 942401 && svar <= 1410750) {
			System.out.println("Du betaler " + svar*0.167 + "kr i trinnskatt");
			
		} else System.out.println("Du betaler " + svar*0.177 + " kr i trinnskatt");
	}
}


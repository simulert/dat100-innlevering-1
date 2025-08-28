import java.util.Scanner;

public class o3 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Skriv inn et positivt heltall: ");
        int n = Integer.valueOf(scanner.nextLine());
		int fakultet = 1; // begrenser meg selv til 32!, selv om jeg her kunne brukt long/BigInteger for int.
		if (n < 0) {
			System.out.println("Ugyldig");
		} else {
			for (int i = 1; i <= n; i++) {
				fakultet *= i;
			}
			System.out.println(n + "! = " + fakultet);
		}
	}
}
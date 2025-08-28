import java.util.Scanner;

public class o2 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	//for (int i = 1; i <= 10; i++) { (Oppgave O2b)
	/* For oppgave O2c endrer jeg hele løkken til
	   en while-løkke og benytter "inntast" slik
	   at ugyldige poengsummer ikke teller med.
	*/
	
	int inntast = 0;
	while (inntast < 10) {
		System.out.print("Hvor mange poeng (0-100) fikk du?: ");
		int poeng = Integer.valueOf(scanner.nextLine());
	
		if (poeng <= 100 && poeng >= 90) {
			System.out.println("A");
			inntast++;
		} else if (poeng <= 89 && poeng >= 80) {
			System.out.println("B");
			inntast++;
		} else if (poeng <= 79 && poeng >= 60) {
			System.out.println("C");
			inntast++;
		} else if (poeng <= 59 && poeng >= 50) {
			System.out.println("D");
			inntast++;
		} else if (poeng <= 49 && poeng >= 40) {
			System.out.println("E");
			inntast++;
		} else if (poeng <= 39 && poeng >= 0) {
			System.out.println("F");
			inntast++;
		} else
			System.out.println("Ugyldig poengsum");
			/*
			her ønsker jeg ikke telle iterasjoner,
			slik at 10/10 iterasjoner må være gyldige.
			*/
	}
}		
}


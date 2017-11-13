import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		double prozentsatz = Double.valueOf(scanner.nextLine());
		double population = 1;
		int jahre = 0;
		while (population < 2) {
			population += population * prozentsatz / 100;
			jahre++;
		}
		System.out.println("Nach " + jahre + " Jahren ist die Population verdoppelt!");
	}

}

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String password = "112233";

		System.out.println("L�tfen �ifrenizi Girin: ");

		String sifre = scanner.nextLine();

		if (sifre.equals(password)) {

			System.out.println("Giri� Ba�ar�l�!");

		}

		else {
			System.out.println("Giri� Ba�ar�s�z");
		}
		
		scanner.close();
	}

}


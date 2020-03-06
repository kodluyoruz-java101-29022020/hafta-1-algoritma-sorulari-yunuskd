import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String password = "112233";

		System.out.println("Lütfen Þifrenizi Girin: ");

		String sifre = scanner.nextLine();

		if (sifre.equals(password)) {

			System.out.println("Giriþ Baþarýlý!");

		}

		else {
			System.out.println("Giriþ Baþarýsýz");
		}
		
		scanner.close();
	}

}


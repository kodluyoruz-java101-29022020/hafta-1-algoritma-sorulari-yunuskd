
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Question5 {
	

	public static void main(String[] args) {

		Random random = new Random();
		
		List<Integer> oddList = new ArrayList<Integer>();
		
		List<Integer> evenList = new ArrayList<Integer>();
		
		int count = 0;
		
		for (int i = 0; i < 100; i++) {
			
			count++;
			
			int randomNumber = random.nextInt(101);
			
			if (randomNumber % 2 == 0) {
				
				evenList.add(randomNumber);
				System.out.println("Even: " + randomNumber + " Count: " + count);
				
			} else {
			
				oddList.add(randomNumber);
				System.out.println("Odd: " + randomNumber + " Count: " + count);
				
			}
		}
		
		
	}

}


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Question3 {

	public static void main(String[] args) {
		
	    Random random = new Random();
	    ArrayList<Integer> randomList = new ArrayList<Integer>();
	    
	    for(int i=0; i<100; i++)
	    {
	    	int randomNumber=random.nextInt(101);
	    	randomList.add(randomNumber);
	    	System.out.println("Random Number: " + randomNumber);
	    }
	    
	    System.out.println("Avarage of list: " + averageOf(randomList));

	}
	
	public static double averageOf(List<Integer> list) {
	    double total = 0;

	    for (int element=0; element < list.size(); element++) {
	        total = total + element;
	    }
	    return total/list.size();
	}
	
}



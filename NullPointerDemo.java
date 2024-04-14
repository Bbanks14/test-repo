import java.util.Optional;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class NullPointerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String firstName = null;
		//Map<String, String> myMap = new HashMap<>();
		//myMap.put("mike", "nielsen");
		//if Map.containsKey("john") {
			//System.out.println(myMap.isEmpty());
		//}
		//String john = myMap.get("john");
		
		//System.out.println(john);
		//getFullName(john);
		//System.out.println(getFullName(firstName).isEmpty());
		NullPointerDemo nullDemo = new NullPointerDemo();
		nullDemo.mapMethod();
		

			
		
		
	}

	//private static Optional<String> getFullName(String firstName) {
		//return Optional.ofNullable(firstName);	
	//}
	
	public static void mapMethod() {
		Random randInt = new Random();
		int randomNumber = randInt.nextInt(50) + 1;
		boolean checkIfNull;
		
		List<Integer> numbers = Arrays.asList(randomNumber);
		
		List<Integer> squaredNumbers = numbers.stream()
				.map(number -> number * number)
				.collect(Collectors.toList());
		
		System.out.println("Original Number:" + numbers);
		System.out.println("New Numbers: " + squaredNumbers);
		
	}
}

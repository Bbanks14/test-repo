import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number to check if it is an Armstrong number");
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();

		if (isAnArmstrongNumber(c)) {
			System.out.println(c + " is an Armstrong number");	
		}
		
		else {
			System.out.println(c + " is not an Armstrong number");
		}
		
		sc.close();
		
	}

	// Function to check if a function is an Armstrong number
	static boolean isAnArmstrongNumber(int num) {
		int originalNumber;
		int remainder;
		int result = 0;
		int n = 0;
		
		originalNumber = num;
		
		// Count the number of digits
		while (originalNumber != 0) {
			originalNumber /= 10;
			n++;
		}
		
		originalNumber = num;
		
		// Calculate the sum of nth power of each digit 
		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, n);
			originalNumber /=  10;
			
		}
		
		// Check if the result is equal to the original number  
		return result == num;
	}

}

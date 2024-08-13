package Numbers;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive number :: ");
		int num = Integer.parseInt(scanner.nextLine().trim());

		if( checkArmstrongNumber(num) == true )
			System.out.println("Given number "+num+" is a Armstrong Number.");
		else
			System.out.println("Given number "+num+" is NOT a Armstrong Number.");
		scanner.close();
	}
	
	private static boolean checkArmstrongNumber(int num){
		int digitsSum = 0;
		int tempNum = num;
		
		while( num > 0 ){
			//get the unit digits of the number
			int digit = num % 10;
			//sum the cubes of the unit digit
			digitsSum += digit * digit * digit;
			num = num / 10;
		}
				
		//check sum of the cubes of digits is equal to the number
		if(digitsSum == tempNum)
			return true;
		return false;
	}
}

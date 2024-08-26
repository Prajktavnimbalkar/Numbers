package Numbers;
import java.util.ArrayList;
import java.util.Scanner;

public class SmithNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive integer :: ");
		int num = Integer.parseInt(scanner.nextLine().trim());
		
		if(sumOfDigits(num) == getPrimeFactorsDigitSum(num))
			System.out.println("Given number : "+num+" is a Smith Number");
		else
			System.out.println("Given number : "+num+" is NOT a Smith Number");
		scanner.close();
	}
	
	private static int getPrimeFactorsDigitSum(int n){
		int sum =0;
		ArrayList<Integer> primeFactors = getPrimeFactors(n);
		for(int v : primeFactors)
			sum += sumOfDigits(v);
		return sum;
	}
	
	private static ArrayList<Integer> getPrimeFactors(int n){
		ArrayList<Integer> factors = new ArrayList<>();
		int len = (int) Math.sqrt(n);
		for(int i=2; i<= len;i++){
			while( n%i == 0 ){
				factors.add(i);
				n = n/i;
			}
		}
		if( n > 2 )
			factors.add(n);
		System.out.println("Prime Factors are : "+factors);
		
		
		if(factors.size() == 1)
			return new ArrayList<>();
		return factors;
	}
	
	private static int sumOfDigits(int n){
		int sum = 0;
		while( n > 0 ){
			int digit = n % 10;
			sum += digit;
			n = n / 10;
		}
		return sum;
	}
}

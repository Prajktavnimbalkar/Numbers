package Numbers;

public class PerfectNumberList {
	public static void main(String[] args) {
		System.out.println("Perfect Numbers from 1 to 1000 :: ");
		
		for(int i=1;i<=1000;i++)
			if(isPerfectNumber(i))
				System.out.print(i+" ");
	}
	
	private static boolean isPerfectNumber(int num) {
		int tempNum = num;
		int divisorSum = 1;
		for (int i = 2; i <= num / 2; i++)
			if (num % i == 0)
				divisorSum += i;

		if(tempNum == divisorSum)
			return true;
		return false;
	}

}

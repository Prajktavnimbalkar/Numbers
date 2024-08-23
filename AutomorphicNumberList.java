package Numbers;

public class AutomorphicNumberList {
	
	public static void main(String[] args) {
		System.out.println("Automorphic Number from 1 to 1000 :: ");
		
		for(int i=1;i<=1000;i++)
			if(isAutomorphicNumber(i))
				System.out.print(i+" ");
	}
	
	private static boolean isAutomorphicNumber(int n){
		int sqrt = n * n;
		while (n > 0){
			int reminder1 = n % 10;
			int reminder2 = sqrt % 10;
			if(reminder1 != reminder2)
				return false;
			n = n/10;
			sqrt = sqrt/10;
		}
		return true;
	}

}

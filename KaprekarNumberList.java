package Numbers;
import java.util.Scanner;

public class KaprekarNumberList {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaprekar Number from 2 to 1000 :: ");
		for(int i = 2;i<=1000;i++){
			if(isKaprekarNumber(i) == true)
				System.out.print(i+" ");
		}
		scanner.close();
	}
	
	public static boolean isKaprekarNumber(int num){
		long square = num * num;
		String str = Long.toString(square);
		for(int i=1;i<str.length();i++){
			String part1 = str.substring(0,i);
			String part2 = str.substring(i,str.length());
			long l1 = Long.valueOf(part1);
			long l2 = Long.valueOf(part2);
			if(l1 > 0 && l2 > 0 && l1+l2 == num)
				return true;
		}
		return false;
	}
}

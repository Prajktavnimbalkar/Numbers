package Numbers;
import java.util.Scanner;

public class RamanujamNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive integer : ");
		int n = Integer.parseInt(scanner.nextLine().trim());
		if(isRamanugamNumber(n))
			System.out.println("Given number "+n+" is a Ramanujam Number");
		else
			System.out.println("Given number is NOT a Ramanujam Number");
		scanner.close();
	}
	
	private static boolean isRamanugamNumber(int n){
		int a=0, b=0;
		int x=0, y=0;
		
		for(int i=1; i<=100; i++)
			for(int j=1; j<=100; j++){
				int temp = (i*i*i) + (j*j*j);
				if(temp == n){
					a = i;
					b = j;
					break;
				}
			}
		
		for(int i=1; i<=100; i++)
			for(int j=1; j<=100; j++){
				int temp = (i*i*i) + (j*j*j);
				if(temp == n && i != a){
					x = i;
					y = j;
					break;
				}
			}
				
		if(a != 0 && x != 0){
			String str = String.format("[%d,%d] and [%d,%d]", a,b,x,y);
			System.out.println(n+" can be expressed as "+str);
			return true;
		}
		return false;
	}
}

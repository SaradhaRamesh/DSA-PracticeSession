import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOfPrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter the size of the array");
		int n=s.nextInt();
		ArrayPrimeNumberFunction p =new  ArrayPrimeNumberFunction();
		ArrayList <Integer> obj= new ArrayList<Integer>();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
			System.out.println("Prime number"+p.primeNumber(a));
	
	}

}

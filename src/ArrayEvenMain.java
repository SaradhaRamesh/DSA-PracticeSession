import java.util.Scanner;

public class ArrayEvenMain {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		EvenNumberArray obj =new EvenNumberArray();
		System.out.println("The Even numbers :"+obj.even(a));
		

	}

}

import java.util.Scanner;

public class StringArrayPalindrome {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
			arr[i]=s.next();
		PalindromeArrayFunction obj =new PalindromeArrayFunction();
		System.out.println("The Even numbers :"+obj.findPalindromes(arr));
		

	}

}

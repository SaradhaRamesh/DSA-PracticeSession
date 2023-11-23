import java.util.ArrayList;

public class ArrayPrimeNumberFunction {
	
	public  ArrayList<Integer>  primeNumber(int a[]) {
		int count=0;
		ArrayList <Integer> obj= new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
		for(int j=2;j<a[i];j++){
			if(a[i]%j==0) {
				count++;
			}
				}
		
		
		if(count==0 &&a[i]!=1 ) {
			obj.add(a[i]);
		}
		count =0;
		}
		
		return obj;
	}
}

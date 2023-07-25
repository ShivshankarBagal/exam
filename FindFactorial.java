package exam;

public class FindFactorial {

	
	static int fac=4;
	 
	public static void main(String[] args) {
		
		int ans=factorialMethod(fac);
		System.out.println(ans);	
		
		
	}

	public static int factorialMethod(int fac2) {
		
		if(fac2==1)
			return fac2;
		
		return fac2 * factorialMethod(fac2 -1);
	}

	
}

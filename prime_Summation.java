
public class prime_Summation {
	public static boolean isPrime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit=2000000;
		long sum=0;
		for(int i=2;i<limit;i++) {
			if(isPrime(i)) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}

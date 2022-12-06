
import java.util.*;
public class larg_palin_prod {

	public static boolean pali(long num) {
		String x=num+"";
		StringBuilder sb=new StringBuilder(x);
		String st=sb.reverse().toString();
		if(x.equals(st))
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		long max=Long.MIN_VALUE;
		for(int i=100;i<=999;i++) {
			for(int j=100;j<=999;j++) {
				if(pali(i*j)) {
					max=Math.max(max, i*j);
				}
			}
		}
		System.out.println(max);
	}
}

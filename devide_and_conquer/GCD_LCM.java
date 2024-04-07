import java.util.*;
public class GCD_LCM{
	public static int gcd(int m,int n){
		if (m == 0 && n == 0) return -1;
		if (m==0)
			return n;
		if (n==0)
			return m;
		return gcd(n%m,m);
	}
	public static int lcm(int m,int n){
		return (m*n)/gcd(m,n);
	}
	public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();                 // Reading input from STDIN
        for (int i=0;i<t;i++) {
            int m = s.nextInt();
            int n = s.nextInt();
            System.out.println("gcd " + gcd(m,n));
            System.out.println("lcm " + lcm(m,n));
        }
    }
}
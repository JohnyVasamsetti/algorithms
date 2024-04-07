public class Power{
	public static int Power(int a,int n){
		if (n == 0){
			return 1;
		}
		if (n==1){
			return a;
		}
		int res = Power(a,n/2);
		if (n%2 == 1)
			return res * res * a;
		return res * res;
	}
	public static int Power2(int a, int n){
		int res = 1;
		while(n>0){
			if (n % 2 == 1) // this will store the missed term(odd) , at last also this will be executed because of 1.
				res = res * a;
			a = a * a;
			n >>=1;
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(Power2(2,10));
	}
}
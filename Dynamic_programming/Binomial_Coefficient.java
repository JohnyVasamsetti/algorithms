// Binomial Coefficient

public class Binomial_Coefficient{
	int Coefficient(int n,int k){
		int c[][] = new int[n+1][k+1];
		for (int i=0;i<=n;i++) {
			for (int j=0;j<=Math.min(i,k);j++) {
				if (j==0 || i==j)
					c[i][j] = 1;
				else{
					c[i][j] = c[i-1][j-1] + c[i-1][j];
				}
			}
		}
		return c[n][k];
	}
	public static void main(String[] args) {
		System.out.println(new Binomial_Coefficient().Coefficient(4,2));
	}
}
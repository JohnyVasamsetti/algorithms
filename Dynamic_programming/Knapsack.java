public class Knapsack{
	int helper(int profit[] , int weights[] , int n , int weight){
		int K[][] = new int[n+1][weight+1];
		for (int i=0;i<=n;i++) {
			for (int w=0;w<=weight;w++) {
				if (i == 0 || w == 0)
					K[i][w] = 0;
				else if (weights[i] <= w){
					K[i][w] = Math.max( K[i-1][weight] , profit[i] + K[i-1][w-weights[i]] );
				}
				else{
					K[n][w] = K[i-1][w];
				}
			}
		}
		return K[n][weight];
	}
	public static void main(String[] args) {
		int p[]= new int[] {0,1,2,5,6};
		int wt[] = new int[] {0,2,3,4,5};
		int W=8;
		System.out.println(new Knapsack().helper(p,wt,wt.length-1,W));
	}
}
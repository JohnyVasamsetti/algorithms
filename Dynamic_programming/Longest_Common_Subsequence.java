// Longest Common Subsequence
import java.util.*;
public class Longest_Common_Subsequence{
	public int lcs(String a,String b){
		int n=a.length(),m=b.length();
		int dp[][] = new int[n+1][m+1];

		for (int i=1;i<n+1;i++) {
			for (int j=1;j<m+1;j++) {
				if(a.charAt(i-1) == b.charAt(j-1)){
					dp[i][j] = Math.max(dp[i-1][j-1]+1,dp[i][j]); 
				}
				else{
					dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		for (int i=0;i<dp.length;i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
		return dp[n][m];
	}
	public static void main(String[] args) {
		System.out.println(new Longest_Common_Subsequence().lcs("AGGTAB","GXTXAYB"));
	}
}
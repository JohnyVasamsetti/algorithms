// Longest non-decresing subsequence
import java.util.Arrays;
public class Longest_Subsequence{
	public int lnds(int[] nums){
		int d[] = new int[nums.length];
		Arrays.fill(d,1);
		for (int i=1;i<nums.length;i++) {
			for (int j=0;j<i;j++) {
				if(nums[j] <= nums[i]){   // we get Longest Increasing Subsequence by changing the symbol from <= to strictly <.
					d[i] = Math.max(d[i],d[j]+1); // present or previous + 1
				}
			}
		}
		int max=d[0];
		for (int i=1;i<nums.length;i++) {
			if(max < d[i])
				max = d[i];
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println(new Longest_Subsequence().lnds(new int[]{-1,3,4,5,2,2,2,2}));
	}
}
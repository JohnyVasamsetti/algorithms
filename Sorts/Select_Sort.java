// implementing selection sort.
// The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and 
// putting it at the beginning
import java.util.*;
public class Select_Sort{
	public static void main(String[] args) {
		int[] n = new int[] {5,3,7,1,0,6};
		for (int i=0;i<n.length - 1;i++) {
			int min = i;
			for (int j=i+1;j<n.length;j++ ) {
				if (n[j] < n[min]){
					min = j;
				}
			}
			int temp = n[i];
			n[i] = n[min];
			n[min] = temp;
		}
		System.out.println(Arrays.toString(n));
	}
}
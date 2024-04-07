// implementing Insersiont sort
import java.util.*;
public class Insertion_Sort{
	public static void main(String[] args) {
		int[] n = new int[] {5,3,7,1,0,6};
		for (int i=1;i<n.length;i++ ) {
			int key = n[i];
			int j = i-1;
			/* Move elements of arr[0..i-1], that are 
	        greater than key, to one position ahead 
	        of their current position */
			while(j>=0 && n[j]>key){
				n[j+1] = n[j];
				j -= 1;
			}
			n[j+1] = key;
		}
		System.out.println(Arrays.toString(n));
	}
}
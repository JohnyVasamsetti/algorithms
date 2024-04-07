// finding the element which is a[i] == i
import java.util.*;
public class Bin1{
	public static int find(int[] array){
		int f = 0,l=array.length;
		while(l>=f){
			int mid = (f+l)/2;
			if (array[mid] == mid){
				return mid;
			}
			else{
				if (array[mid] < mid){
					f = mid + 1;
				}
				else{
					l = mid -1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int array[] = new int[]{-50,-40,-30,-5,2,0,3,5,7,9,30,80,100};
		System.out.println(find(array));
	}
}
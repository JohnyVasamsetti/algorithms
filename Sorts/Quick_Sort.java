import java.util.*;
public class Quick_Sort{
	public static int partition(int[] arr,int l,int r){
		int pivot = arr[r];
		int i=l;
		for (int j=l;j<= r-1 ;j++) {
			if(arr[j] < pivot){
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				i++;
			}
		}
		int t = arr[i];
		arr[i]=arr[r];
		arr[r]=t;
		return i;
	}
	public static void quickSort(int[] arr,int l,int r){
		if(l < r){
			int pi = partition(arr,l,r);
			quickSort(arr,l,pi-1);
			quickSort(arr,pi+1,r);
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[]{1,7,3,5,1,8,10};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
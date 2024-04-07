import java.util.*;
public class Merge_Sort{
	public static void merge(int[] arr,int l,int m,int r){
		int n1 = m-l+1;
		int n2 = r-m;
		int i=0;
		int L[] = new int[n1];
		int R[] = new int[n2];
		while(i<n1){
			L[i] = arr[l+i];
			i++;
		}
		i=0;
		while(i<n2){
			R[i] = arr[m+1+i];
			i++;
		}
		i=0;
		int j=0,k=l;
		while(i<n1 && j<n2){
			if (L[i] < R[j]){
				arr[k++]=L[i++];
			}
			else{
				arr[k++]=R[j++];
			}
		}
		while(i<n1){
			arr[k++]=L[i++];
		}
		while(j<n2){
			arr[k++] = R[j++];
		}
	}
	public static void mergeSort(int[] arr,int l,int r){
		if (l < r){
			int m=l+(r-l)/2;
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}
	public static void main(String[] args) {
		int[] n = new int[]{4,6,3,6,7,1,23,0};
		mergeSort(n,0,n.length-1);
		System.out.println(Arrays.toString(n));
	}
}
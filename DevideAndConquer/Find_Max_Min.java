import java.util.*;
public class Find_Max_Min{
	public static int[] maxmin(int []array,int i,int j){
		// small
		if (i == j){
			return (new int[] {array[i],array[i]});
		}
		if (j-1+1 == 2){
			if (array[i] < array[j]){
				return (new int[]{array[i],array[j]});
			}
			return (new int[]{array[j],array[i]});
		}
		// devide
		int mid = (i+j)/2;
		int temp[] , temp2[];
		// conquer
		temp = maxmin(array,i,mid);
		temp2 = maxmin(array,mid+1,j);
		// combine
		if (temp[0] > temp2[0]){
			temp[0] = temp2[0];
		}
		if (temp[1] < temp2[1]){
			temp[1] = temp2[1];
		}
		return (temp);
	}
	public static void main(String[] args) {
		int array[] = new int[]{12,7,-44,0,345,12,456};
		System.out.println(Arrays.toString(maxmin(array,0,array.length-1)));
	}
}
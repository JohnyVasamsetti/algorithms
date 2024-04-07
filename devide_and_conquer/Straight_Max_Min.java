import java.util.*;
public class Straight_Max_Min{
	public static int[] maxmin(int []array){
		if (array.length == 0){
			return (new int[] {0,0});
		}
		int max = array[0] , min = array[0];
		for (int i=1;i<array.length;i++) {
			if (array[i] > max){
				max = array[i];
			}
			if (array[i] < min){
				min = array[i];
			}
		}
		return (new int[]{min,max});
	}
	public static void main(String[] args) {
		int array[] = new int[]{12,7,44,0,345,12,456};
		System.out.println(Arrays.toString(maxmin(array)));
	}
}
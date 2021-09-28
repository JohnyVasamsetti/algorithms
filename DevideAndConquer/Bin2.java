// finding the spliting point -> increasing ...point...decreasing
public class Bin2{
	public static int find(int[] array){
		int i=0,j=array.length-1;
		while(j>=i){ // small
			// divide
			int mid = (i+j)/2;
			if (array[mid-1] < array[mid] && array[mid] > array[mid+1]){
				return array[mid];
			}
			if (array[mid-1] < array[mid]){
				i = mid+1;
			}
			else{
				j = mid -1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int array[] = new int[]{0,3,5,7,9,30,50,80,100,40,30,5,2,0,-1};
		System.out.println(find(array));
	}
}
import java.util.*;
public class Shell_Sort{
	public static void main(String[] args) {
		int[] n = new int[]{4,6,3,6,7,1,23,0};
		int l = n.length;
		for (int i=l/2;i>0;i/=2) {
			for (int j=i;j<l ;j++ ) {
				for (int k=j-i;k>=0 ; k=k-i) {
					if(n[k+i] >= n[k]){
						break;
					}	
					else{
						int temp = n[k+i];
						n[k+i] = n[k];
						n[k]=temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(n));
	}
}
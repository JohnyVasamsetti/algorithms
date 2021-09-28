import java.util.*;
class mergesort
{
	static int count = 0;
	static void Merge(int array[], int left_pos, int mid_pos, int right_pos)
	{
		int n1 = mid_pos - left_pos + 1;
		int n2 = right_pos - mid_pos;

		int Left[] = new int[n1];
		int Right[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			Left[i] = array[left_pos + i];

		for (int j = 0; j < n2; ++j)
			Right[j] = array[mid_pos + 1 + j];

		int i = 0, j = 0;

		int k = left_pos;
		while (i < n1 && j < n2) {
			if (Left[i] <= Right[j]) {
				array[k] = Left[i];
				i++;
			}
			else {
				array[k] = Right[j];
				j++;
				count += n1 - i + 1;
			}
			k++;
		}

		while (i < n1) {
			array[k] = Left[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = Right[j];
			j++;
			k++;
		}
	}

	static void MergeSort(int array[], int left_pos, int right_pos)
	{
		if (left_pos < right_pos) {
			int mid_pos =left_pos+ (right_pos-left_pos )/2;
			MergeSort(array, left_pos, mid_pos);
			MergeSort(array, mid_pos + 1, right_pos);
			Merge(array, left_pos, mid_pos, right_pos);
		}
	}
	public static void main(String args[])
	{
		int array[] = {};
		MergeSort(array, 0, array.length - 1);
		System.out.println(count);
	}
}

package sort;

import java.util.Arrays;

// 插入排序
// 左边排序、右边未排序
// 遍历右边数据，在找到左边的位置，插入数据
public class Insertion {
	public static int[] sort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int value = arr[i];
			for(; j >= 0; j--) {
				if(arr[j] > value) {
					arr[j+1] = arr[j];
				} else {
					break;
				}
			}
			arr[j+1] = value;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,1,5,2,7,9};
		System.out.println(Arrays.toString(sort(arr)));
	}
}

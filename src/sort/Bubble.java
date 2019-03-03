package sort;

import java.util.Arrays;

// 冒泡排序
// 从左到右比较相邻元素，不断冒泡,一轮排序后，如果没有交换元素，则直接退出
public class Bubble {
	public static int[] bubbleSort(int[] arr) {
		boolean flag = false;
		for(int i = 0; i < arr.length && !flag; i++) {
			flag = true;
			for(int j = 0; j < arr.length - i - 1; j++) {
				int tmp;
				if(arr[j] > arr[j+1]) {
					flag = false;
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,1,5,2,7,9};
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}
}

package sort;

import java.util.Arrays;

//归并排序
//平均时间复杂度： O(NLogN)
//最好情况时间复杂度： O(NLogN)
//最差情况时间复杂度： O(NLogN)
//所需要额外空间： 递归：O(N + LogN)， 非递归：O（N）
//稳定性： 稳定
//如果一个数组有n个数据，则可以把这个数组看作n个有序的子序列，每个子序列的长度为1，
//然后两两归并，就能得到[n/2]个长度为2（或者1，落单的)的字序列，再不断地两两归并，
//直到得到一个长度为n的有序数组。
public class MergeSort {
	public static void mergeSort(int[] arr, int low, int high) {
		int mid = (low+high)/2;
		if(low < high) {
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr, low, mid, high);
		}
	}
	
	public static void merge(int[] arr, int low, int mid, int high) {
		int i = low; // 左半边下标
		int j = mid+1; // 右半边下标
		int[] tmp = new int[high - low +1];
		int k = 0;
		// 小到大 放入tmp
		for(; i <= mid && j <= high; k++) {
			if(arr[i] < arr[j]) {
				tmp[k] = arr[i++];
			} else {
				tmp[k] = arr[j++];
			}
		}
		// 循环放入剩余数组
		while(i <= mid) {
			tmp[k++] = arr[i++];
		}
		while(j <= high) {
			tmp[k++] = arr[j++];
		}
		
		for(int l = 0; l < tmp.length; l++) {
			arr[low + l] = tmp[l];
		}
	}
	
	public static void mergeSort2(int[] arr) {
		int len = arr.length;
		int k = 1;
		// 使用非递归实现归并排序
		while(k < len) {
			mergePass(arr, k, len);
			k *= 2;
		}
	}
	
	// 将相邻的有k个元素的序列进行归并
	public static void mergePass(int[] arr, int k, int n) {
		int i = 0;
		int j;
		while(i < n - 2*k + 1) {
			merge(arr, i, i + k -1, i + 2*k - 1);
			i += 2*k;
		}
		// 落单不足两两merge的部分进行归并
		if(i < n - k) {
			merge(arr, i, i+k-1, n-1);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,1,5,2,7,9};
		mergeSort(arr, 0, 5);
		System.out.println(Arrays.toString(arr));
	}
}

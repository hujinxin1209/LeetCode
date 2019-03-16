package sort;

// 快速排序
// 1）选择一个基准数 a ，例如左边第一个
// 2) right-- left++ 分别与a进行判断，交换
// 3) 一轮排序下来，找到 a 的位置，左边小于 a , 右边大于 a
// 4) 递归
public class QuickSort {
	public static void sort(int[] arr, int left, int right) {
		if(right < left) {
			return ;
		}
		int i = right;
		int j = left;
		int tmp = arr[left];
		int t;
		while( i != j) {
			while(arr[i] >= tmp && i > j) {
				i--;
			}
			while(arr[j] <= tmp && i > j) {
				j++;
			}
			if(i > j) {
				t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
		arr[left] = arr[i];
		arr[i] = tmp;
		
		sort(arr, left, j - 1);
		sort(arr, j + 1, right);
 	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,1,5,4,7,8};
		sort(arr, 0, arr.length-1);
		for(int i : arr) {
			System.out.println(i);
		}
	}
}

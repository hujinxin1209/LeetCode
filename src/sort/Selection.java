package sort;

import java.util.Arrays;

// 选择排序
// 左边排序，右边未排序
// 选择右边最小的元素，插入到左边最后
public class Selection {
	public static int[] sort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			int value; // 记录值
			int pos = i; // 记录位置
			for(int j = i + 1; j < a.length; j++) {
				if(a[j] < a[pos]) {
					pos = j;
				}
			}
			if(pos != i) {
				value = a[pos];
				a[pos] = a[i];
				a[i] = value;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,1,5,2,7,9};
		System.out.println(Arrays.toString(sort(arr)));
	}
}

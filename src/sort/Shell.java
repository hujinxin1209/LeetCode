package sort;

import java.util.Arrays;

//直接插入排序法，如果数据原来就已经按要求的顺序排列，则在排序过程中不需要进行数据移动操作，
//即可得到有序数列。但是，如果最初的数据是按倒序排列的，则在进行插入排序时每次的比较都需要向后移动数据，
//这样，将导致算法的效率很低。
//希尔排序的思想是把数列划分为若干个较小的数列，对每组数列使用直接插入排序算法排序，
//随着增量逐渐减少，每组包含的数字越来越多，当增量减至1时，整个数列恰被分成一组，
//最后再使用一次直接插入排序对整个数列进行排序

public class Shell {
	public static void sort(int[] a) {
		int step = a.length;
		while(true) {
			// 确定步长
			step = step / 2;
			// 确定分组
			for(int i = 0; i < step; i++) {
				// 插入排序
				for(int j = i + step; j < a.length; j = j + step) {
					int tmp = a[j];
					int k;
					for(k = j - step; k >= 0; k = k - step) {
						if(tmp < a[k]) {
							a[k+step] = a[k];
						} else {
							break;
						}
					}
					a[k+step] = tmp;
				}
			}
			if(step == 1) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] {3,1,5,2,7,9};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

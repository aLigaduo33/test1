package test;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		
//		for(int i=0;i<5;i++) {
//			System.out.println("我是一个测试"+" "+i);
//		}
		
		int[] arr= {33,22,21,4,6,11};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
 }
	/*
	 * 冒泡排序
	 */
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}

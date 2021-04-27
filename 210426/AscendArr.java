package Exercises;

import java.util.Scanner;

public class AscendArr {
	public static void main(String[] args) {
		
		int[] arr = {12,36,66,72,99,123};
		
		System.out.println("============ arr ===============");
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		//copy arr to new
		int [] arrNew = new int[arr.length +1];
		for(int i = 0;i < arrNew.length - 1;i++) {
			arrNew[i] = arr[i];
		}
		
		//input a number
		System.out.println("\nplease enter a number:");
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.next());
		
		arrNew[arr.length] = num;//赋值到arrNew最后一个数
		
		//有小到大 排序
		for(int i = 0; i < arrNew.length - 1;i++) {
			for(int j = 0; j< arrNew.length - 1 - i;j++)
			if(arrNew[j] >= arrNew[j + 1]) {
				int temp = arrNew[j + 1];
				arrNew[j + 1] = arrNew[j];
				arrNew[j] = temp;
			}
		}
		
		//输出
		System.out.println("============ Newarr ===============");
		for(int i = 0; i < arrNew.length;i++) {
			System.out.print(arrNew[i] + " ");
		}
		
		
	}

}

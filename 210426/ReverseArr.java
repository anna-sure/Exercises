package Exercises;

public class ReverseArr {
	public static void main(String[] args) {
		
		//随机生成10个整数（1-100）保存到阵列，并倒序打印
		//以及求平均值，求最大值和最大值的下标
		//并查找里面是否有数字7

		int [] arr = new int[10];
		System.out.println("========= Original Arr ============");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
			System.out.print(arr[i] + " ");
		}
			
		
		System.out.println("\n======== Reverse Arr ===========");
		for(int i = arr.length -1;i >= 0;i--) {
			System.out.print(arr[i] + " ");
			}
		
		
		int max = arr[0];
		double sum = arr[0];
		int maxIndex = 0;
		for(int i =1;i<arr.length;i++) { //从第二个开始比对
	        
			sum += arr[i];  //get sum
	        
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		
		System.out.println("\nAverage = " + sum/(arr.length) +" max = "+max + " maxIndex ="+maxIndex);
		
		
		for(int i =1;i<arr.length;i++) { 
		
			if(arr[i] == 7) {
				System.out.println("there is 7 in arr,index = " + i);
				break;
			}
		}
		

  }
}

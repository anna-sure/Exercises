import java.util.Scanner;

public class Bubble {
	public static void main(String[] args) {
		
		int arr [] = new int[10];
		
		for(int i = 0;i<arr.length;i++) {
		//input 10 numbers
		System.out.println("please enter a number:");
		Scanner myscanner = new Scanner(System.in);
		int num = Integer.parseInt(myscanner.next());
		arr[i] = num;
		}
		

		System.out.println("===============顺序输出===============");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		System.out.println("\n===============由大到小===============");
		for(int i = 0;i < arr.length - 1;i++) {
			for(int j = 0;j < arr.length - 1 - i;j++) {
				if(arr[j] <= arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		System.out.println("\n===============由小到大===============");
			for(int i = 0;i < arr.length - 1;i++) {
				for(int j = 0;j < arr.length - 1 - i;j++) {
					if(arr[j] >= arr[j + 1]) {
						int temp = arr[j + 1];
						arr[j + 1] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
			for(int i =0;i<arr.length;i++) {
				System.out.print(arr[i] + " ");
		
	    }
	}
}


	

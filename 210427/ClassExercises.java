
public class ClassExercises {
	public static void main(String[] args) {
		
		double[]arr = {12.1,24.3,52.1,68.3,99.9,108.5,77.7,66,99.7};
	    
		A01 a = new A01();
		
		System.out.println(a.max(arr));
		
	}

}

class A01 {
	
	public Double max(double[] arr) { // 包装类 大写D
		
		if(arr.length > 0) {
		double max = arr[0];
		for(int i =1;i<arr.length;i++) {
			if(max <= arr[i]) {
				max = arr[i];
			}
		}
		return max;
	} else {
		return null;
	}
}
}
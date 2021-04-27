
public class FindStrIndex {

	public static void main(String[] args) {
		String[] strs = {"jack","mash","david","cooool"};
		
		A02 a02 = new A02();
		int index = a02.find("david", strs);
		System.out.println(index);
		
	}
}

class A02 {
	
	public int find (String findStr, String[] strs) {
		//直接遍历
		for(int i = 0;i<strs.length;i++) {
			if(findStr.equals(strs[i])) {
				return i;
			} 
		}
		return -1;	
	}
}
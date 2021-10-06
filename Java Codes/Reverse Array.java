public class Exercise {

    public static void main(String[] args) {
      
       int arr1 [] = {1,2,3,4,5,6};
       int arr2 [] = new int[arr1.length];

       // reverse method 1
       for (int i = 0; i < arr1.length; i++) {
           arr2[i] = arr1[arr1.length - 1 - i];
           System.out.println(arr2[i]);
       }

       System.out.println("----------------------");
      
       // reverse method 2
       for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
           arr2[j] = arr1[i];
           System.out.println(arr2[j]);
       }
      
      
    }
}

package chapter05;

public class Test {
    public static void main(String[] args) {

        char [] arr1 ={'a','z','b','c'};
        char [] arr2 =arr1;

        arr1[2] = '哈';

        for(int i=0;i<arr2.length;i++){
            System.out.println(arr1[i]+","+arr2[i]);
        }


    }
}

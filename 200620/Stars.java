package chapter05;

public class Stars {
    public static void main(String[] args) {

        int totalLine = 20;
        for (int i = 1; i <= totalLine ; i++) {
            for (int k = 1;k<=totalLine-1;k++){
                System.out.print(" ");
            }

            for (int j = 1; j <=2*i-1 ; j++) {
                if(j==1||j==2*i-1||i ==totalLine){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


    }
}

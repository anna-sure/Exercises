package saturday_424;

import java.util.Scanner;

public class SignInWithpwd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("name:");
            String name = scanner.next();
            System.out.println("pwd:");
            String pwd = scanner.next(); //使用string，不要使用int，避免空指針

            if ("sure".equals(name) && "666".equals(pwd)) {
                //字符比較用.equals 並且使用"sure"(實數)在前比較，避免空指針 ***
                System.out.println("sign in success:)");
                break;
            } else {
                System.out.println("have "+ (3-i) + " times to sign in");
            }

        }


    }
}

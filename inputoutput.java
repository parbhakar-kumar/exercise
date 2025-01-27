package exercise;

import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        int a =2;
        // System.out.println(a);
        // System.out.println(args[0]);
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the user inpput");
        a = scan.nextInt();
        System.out.println("output ="+a);
        System.out.println("enter the string");
        scan.nextLine();
        String str = scan.nextLine();
        System.out.println("output="+str);


    }
}

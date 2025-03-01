package exercise;

import java.util.Scanner;

public class loopproblam {
    // *****************************Problem: Write a program that calculates the factorial of a given number using a loop.*****************************************
    
   //  public static void main (String[]args){
   //    Scanner scanner = new Scanner(System.in);
   //    System.out.print("Enter your number for factorial:");
   //    int num = scanner.nextInt();
   //    if(num<0){
   //       System.out.println("Factorial is not defined for negative numbers");
   //    }else{
   //       long factorial = 1;
   //       for(int i=1; i<= num; i++){
   //          factorial*=i;
   //       }
   //       System.out.println( "Factorial of " + num + " is " + factorial);
   //    }
   //    scanner.close();
   //  }

   //*************************** Problem: Create a program that prints the Fibonacci series up to a specified number of terms.***************************************
   // public static void main(String[]ares){
   //    Scanner scanner = new Scanner (System.in);
   //    System.out.print("Enter number of term for Fibonaci Serries");
   //    int terms = scanner.nextInt();
   //    if(terms<0){
   //       System.out.println("plz Enter posetive numberr");
   //    }else{
   //      int firsttrem = 0;
   //       int secondterm = 1;
   //       for(int i =1; i<=terms;i++){
   //          System.out.print(firsttrem + " ");
   //          int sum = firsttrem+secondterm;
   //          firsttrem=secondterm;
   //          secondterm=sum;
   //       }
   //       scanner.close();
   //    }

   // }

   //**************************************Problem: Write a program that calculates the sum of the first N natural numbers.****************************************
    public static  void main(String[]ages){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter number of term for sum of first N natural numbers");
      int n = scanner.nextInt();
      int sum =0;
    for(int i=0; i<=n; i++){
       sum +=i;

      }
      System.out.println("sun of"+ n+"natural number is "+ sum);
      

    }

 
}

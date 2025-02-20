package exercise;
import java.util.Scanner;
public class Problam {
public static void main(String[]args){
     
     //*********Write a program that takes an integer input from the user and checks whether it is odd or even. *********/

     // //creat scanner object to tacke user input 

     // Scanner scanner = new Scanner(System.in);    

     // //prompt the user to enter an interger

     // System.out.print("enter an integer ");
     // int number = scanner.nextInt();
     
     // if(number%2==0){
     //      System.out.println(number + " is an even number.");
     // }else{
     //      System.out.println(number + "is an odd number ");
     // }
     // scanner.close();


     // *********endregion Create a program that checks if a given number is positive, negative, or zero.*********

     // Scanner scanner = new Scanner(System.in);
     // System.out.print("enter an integer ");
     // int number = scanner.nextInt();
     // if(number>0){
     //      System.out.println(number + " is a posetiv number");
     // }else if (number<0) {
     //      System.out.println(number + "is a negative number ");
     // }else{
     //      System.out.println("zero");
     // }
     
     //*****************************************************************************************************************8 */

     // Scanner scanner = new  Scanner(System.in);
     // System.out.print("Enter your totel money ");
     // int money = scanner.nextInt();
     // System.out.print("Watch Note");
     // int note = scanner.nextInt();
     // System.out.println(money/note + "Your totel Note");

     
// ********************************************** Write a program that checks if a given year is a leap year.*************************************
//      Scanner scanner = new Scanner(System.in);
//      System.out.print("Enter a year ");
//      int year = scanner.nextInt();
//      if (year%4==0){
//           System.out.println("this is leap yeaer");

//      }else{
//           System.out.println("this is not leap year");
//      }

//****************************Create a program that checks if a number is divisible by both 3 and 5. */

// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter your number ");
// int number = scanner.nextInt();
// if(number%3==0&&number%5==0){
//      System.out.println(number + " is divisible by both 3 and 5");
// }else{
//      System.out.println(number +"is not divisible by both 3 and 5");
// }

//*****************Write a program that takes three numbers as input and determines the largest among them. */
 Scanner scanner = new Scanner(System.in);
System.out.print("Enter your first number ");
int a1 = scanner.nextInt();
System.out.println("Enter your second number ");
int b2 = scanner.nextInt();
System.out.println("Enter your third number");
int c3 = scanner.nextInt();
if(a1>=b2&&b2>=a1){
     System.out.println("The largest number is " + a1);
}else if (b2>=a1&&b2>=c3) {
     System.out.println("The largest number is " + b2);
    
}else{
     System.out.println("The largest number is " + c3);
}




}
}

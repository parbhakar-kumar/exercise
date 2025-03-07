package exercise;
import java.util.Scanner;
public class Problam {
public static void main(String[]args){
    
     //*********Write a program that takes an integer input from the user and reverses it. *********/
//   canner scanner = new Scanner(System.in);
//      System.out.print("Enter an integer: ");
//      int number = scanner.nextInt();
//      int reversSedNumber = 0;

//      while (number != 0) {
//          int digit = number % 10; // Get the last digit
//          reversedNumber = reversedNumber * 10 + digit; // Append it to the reversed number
//          number /= 10; // Remove the last digit from the original number
//      }
//      System.out.println("Reversed number: " + reversedNumber);
//      scanner.close();
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
//      System.out.println(number + " is divisible by both 3 and 5");
// }else{
//      System.out.println(number +"is not divisible by both 3 and 5");
// }

//*****************Write a program that takes three numbers as input and determines the largest among them. */
//  Scanner scanner = new Scanner(System.in);
// System.out.print("Enter your first number ");
// int a1 = scanner.nextInt();
// System.out.println("Enter your second number ");
// int b2 = scanner.nextInt();
// System.out.println("Enter your third number");
// int c3 = scanner.nextInt();
// if(a1>=b2&&b2>=a1&&a1>=b2&&b2<=a1){
//      System.out.println("The largest number is " + a1);
// }else if (b2>=a1&&b2>=c3) {
//      System.out.println("The largest number is " + b2);   
// }else if(a1==b2&&b2==a1&&a1==c3&&c3==b2){
//      System.out.println("All number is equle" );
// }

//*****************************************Create a program that checks if a given character is a vowel or a consonant.***********************************************
//  Scanner scanner = new Scanner(System.in);
//  System.out.print("Enter your character ");
//  char ch = scanner.next().charAt(0);
//  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
//    ||ch=='A'||ch=='E'||ch=='I'||ch=='o'||ch=='U'){
//      System.out.println("this is vowel");   
//  }else{
//      System.out.println("this is consonant");
//  }
 

// **********************Write a program that takes a person's age as input and categorizes them as a child, teenager, adult, or senior citizen.********************
//  System.out.print("Enter your Age");
//  int Age = scanner.nextInt();
//  if(Age<=13){
//      System.out.println("You are a child");
//  }else if (Age<=18){
//      System.out.println("You are a teenager");
//  }else if(Age<=30){
//      System.out.println("You are an adult");
//  }else{
//      System.out.println("You are a senior citizen");
//  }

//**************/ Create a program that calculates the Body Mass Index (BMI) and categorizes the result (underweight, normal, overweight, obese).***************
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your weight in kg ");
double weight = scanner.nextDouble();
System.out.print("Enter your height in meters ");
double height = scanner.nextDouble();
double bmi = weight / (height * height);
if (bmi <18.5){
    System.out.println("Your BMI is " + bmi + " and you are underweight");
}else if( 18.5<=bmi&&bmi<25){
    System.out.println("Your BMI is " + bmi + " and you are normal");

}else{
    System.out.println("Your BMI is " + bmi + " and you are overweight");
}




}


}

# Exercise Programs in Java

This repository contains solutions to various programming problems and exercises written in Java, using the Spring Boot framework.

## Features

- **Problem Solving**: Includes solutions to multiple coding exercises and problems.
- **Spring Boot Integration**: Demonstrates the use of Spring Boot for building robust and scalable applications.

## Getting Started

### Installation

##########################################################################################################################
In Java, the syntax of an if condition is as follows:

if (condition) {
    // Code to execute if the condition is true
}

Example:

int num = 10;

if (num > 0) {
    System.out.println("The number is positive.");
}

if-else statement:

if (num > 0) {
    System.out.println("Positive number");
} else {
    System.out.println("Non-positive number");
}

if-else if-else statement:

if (num > 0) {
    System.out.println("Positive number");
} else if (num < 0) {
    System.out.println("Negative number");
} else {
    System.out.println("Zero");
}


In Java, loops are used to execute a block of code repeatedly based on a condition. Here are the basic loop syntaxes:
1. for loop

for (initialization; condition; update) {
    // Code to be executed
}

Example:

for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

2. while loop

while (condition) {
    // Code to be executed
}

Example:

int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}

3. do-while loop (Executes at least once)

do {
    // Code to be executed
} while (condition);

Example:

int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);

4. for-each loop (Used for arrays and collections)
for (type variable : array/collection) {
    // Code to be executed
    }
    Example:
    int[] numbers = {1, 2, 3, 4, 5};
    for (int number : numbers) {
        System.out.println(number);
        }
##################################################################################################################################

#### some qustion and problam 
  /*
     * 
*****************************************************Basic Problems*****************************************************************************************
Odd or Even:

Write a program that takes an integer input from the user and checks whether it is odd or even.



Positive, Negative, or Zero:

endregion Create a program that checks if a given number is positive, negative, or zero.

Grade Calculator:

Write a program that takes a student's score as input and outputs the corresponding grade (A, B, C, D, F).

Leap Year Checker:

Write a program that checks if a given year is a leap year.

Divisibility Check: 

Create a program that checks if a number is divisible by both 3 and 5.





****************************************************Intermediate Problems************************************************************************************




1)Largest of Three Numbers:

Write a program that takes three numbers as input and determines the largest among them.

2)Vowel or Consonant:

Create a program that checks if a given character is a vowel or a consonant.

3)Age Group: 

Write a program that takes a person's age as input and categorizes them as a child, teenager, adult, or senior citizen.

4)Simple Calculator: 

5)Implement a simple calculator that performs addition, subtraction, multiplication, and division based on user input.

6)Day of the Week: 

Write a program that takes a number (1-7) as input and prints the corresponding day of the week.




********************************************************Advanced Problems**************************************************************************************



BMI Calculator:

Create a program that calculates the Body Mass Index (BMI) and categorizes the result (underweight, normal, overweight, obese).

Discount Calculator: 


Write a program that calculates the discount on a product based on its price and applies different discount rates for different price ranges.

Triangle Type: 

Write a program that takes the lengths of three sides of a triangle and determines if it is an equilateral, isosceles, or scalene triangle.

Password Strength Checker:

Create a program that checks the strength of a password based on length and character variety (uppercase, lowercase, digits, special characters).

Temperature Converter:

Write a program that converts temperature from Celsius to Fahrenheit or vice versa based on user choice.




******************************************************Logic and Flow Control Problems************************************************************************************




Sum of Digits: 

Write a program that takes a positive integer and calculates the sum of its digits.

Fibonacci Series: 

Create a program that prints the Fibonacci series up to a specified number of terms using conditional statements.

Prime Number Checker: 

Write a program that checks if a given number is prime.

Palindrome Checker:

Create a program that checks if a given string is a palindrome.

Simple Voting System:

Write a program that checks if a person is eligible to vote based on their age.

**********************************************************Real-World Scenarios******************************************************************************************


Loan Eligibility:

Create a program that checks if a person is eligible for a loan based on their income and credit score.

Shipping Cost Calculator: 

Write a program that calculates shipping costs based on the weight of a package and the shipping method chosen.

Event Admission: Create a program that checks if a person can attend an event based on their age and the event's age restrictions.

Electricity Bill Calculator: 

Write a program that calculates the electricity bill based on the number of units consumed and applies different rates for different usage levels.

Student Pass/Fail: 

Create a program that checks if a student has passed or failed based on their scores in multiple subjects.




*******************************************************************Miscellaneous Problems**********************************************************************************




Character Case Converter:

Write a program that converts a character to uppercase if it is lowercase and vice versa.

Number Range Checker:

Create a program that checks if a number falls within a specified range (e.g., 1 to 100).

Discount Eligibility: 

Write a program that checks if a customer is eligible for a discount based on their membership status and purchase amount.

Weather Advisory:

Create a program that provides weather advisories based on temperature ranges (e.g., cold, warm, hot).

Simple Interest Calculator: 

Write a program that calculates simple interest based on principal, rate, and time, and checks if the interest exceeds a certain threshold.

These problems can be used for practice, coding interviews, or as exercises in a programming course. If you need help with any specific problem or want to see a solution, feel free to ask!

########################################################LOOP###########################################################################

1. Factorial Calculation
Problem: Write a program that calculates the factorial of a given number using a loop.

Input:

.
.
Number: 5
Output:

.
.
Factorial of 5 is 120.
2. Fibonacci Series
Problem: Create a program that prints the Fibonacci series up to a specified number of terms.

Input:

.
.
Number of terms: 7
Output:

.
.
Fibonacci series: 0, 1, 1, 2, 3, 5, 8
3. Sum of Natural Numbers
Problem: Write a program that calculates the sum of the first N natural numbers.

Input:

.
.
N: 10
Output:

.
.
Sum of the first 10 natural numbers is 55.
4. Multiplication Table
Problem: Create a program that prints the multiplication table of a given number.

Input:

.
.
Number: 3
Output:

.
.
Multiplication table of 3:
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30
5. Reverse a Number
Problem: Write a program that reverses a given integer.

Input:

.
.
Number: 12345
Output:
Reversed number: 54321


6. Prime Number Checker
Problem: Write a program that checks if a given number is prime and prints all prime numbers up to that number.

Input:

.
.
Number: 20
Output:

.
.
Prime numbers up to 20: 2, 3, 5, 7, 11, 13, 17, 19
7. Pattern Printing
Problem: Create a program that prints a right-angled triangle pattern of asterisks based on the number of rows specified by the user.

Input:

.
.
Number of rows: 5
Output:

.
.
*
**
***
****
*****
8. Count Digits in a Number
Problem: Write a program that counts the number of digits in a given integer.

Input:

.
.
Number: 987654321
Output:

.
.
The number of digits in 987654321 is 9.
These additional problems will further enhance your understanding of loops in Java. If you need assistance with the implementation of any of these problems, feel free to ask!

You

Pattern Printing more 3 q

BLACKBOXAI

Sure! Here are 3 more pattern printing problems along with their input and output examples.

1. Inverted Right-Angled Triangle
Problem: Write a program that prints an inverted right-angled triangle pattern of asterisks based on the number of rows specified by the user.

Input:

.
.
Number of rows: 5
Output:

.
.
*****
****
***
**
*
2. Pyramid Pattern
Problem: Create a program that prints a pyramid pattern of asterisks based on the number of rows specified by the user.

Input:

.
.
Number of rows: 5
Output:

.
.
    *
   ***
  *****
 *******
*********
3. Diamond Pattern
Problem: Write a program that prints a diamond pattern of asterisks based on the number of rows specified by the user. The number of rows will determine the height of the diamond.

Input:

.
.
Number of rows: 5
Output:

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

The number of digits in 987654321 is 9.
These additional problems will further enhance your understanding of loops in Java. If you need assistance with 

24. Student Grades

1. Clone the repository:
   ```bash
   git clone https://github.com/parbhakar-kumar/exercise.git
Contact

If you have any questions or feedback, feel free to reach out:

    
    Parbhakar Kumar: prabhakarpandey7061@gmail.com

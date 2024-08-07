Example Problems are from Introduction to Java Programming and Data Structures. 12th Edition.  By Daniel Liang

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Chapter 1: Introduction to Computers, Programs and Java.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Chapter 2: Elementary Programming

  * Exercise 2.7:  (Find the number of years)  Write a program that prompts the user to enter the minutes (e.g. 1 Billion), and display the maximum number of years and remaining days for the minutes.  For Simplicity, assume that a year has 365 
    days.
  
  * Exercise 2.14:  (Health Application: computing BMI) Body Mass Index (BMI) is a measure of health on weight.  It can be calculated by taking your weight in kilograms and divided by the square of your height in meters.  Write a program that         prompts the user to enter a weight in pounds and a height in inches and displays the BMI.  Note: 1 pound is 0.45359237 kilograms and one inch is 0.0254 meters.
  
  * Exercise 2.23:  (Cost of driving) Write a program that prompts the user to enter the distance to drive, fuel efficiency of the car in miles per gallon and the price per gallon.  Then display the cost of the trip.
  
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Chapter 3: Selections

  * Exercise 3.2:  (Game: Add three numbers)  The program in Listing 3.1 AdditionQuiz.Java generates two integers and prompts the user to enter the sum of these two integers.  Revise the program to generate three single-digit integers and prompts     the user to enter the sum of these three integers.

  * Exercise 3.4:  (Random Month) Write a program that randomly generates an integer between 1 and 12 and displays the English month names.  January, February..., December for the numbers 1,2...,12.

  * Exercise 3.11:  (Find the number of days in a month) Write a program that prompts the user to enter the month and year and displays the number of days in the month.  For example, if the user entered month 2 and year 2012, the program should       display that February 2012 has 29 days.  If the user entered month 3 and year 2015, the program should display that March 2015 has 31 days.

  * Exercise 3.17:  (Game: Scissors, Rock, Paper) Write a program that plays the popular scissors-rock-paper game.  (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock).  The program randomly generates a number         0,1, or 2 representing scissors, rock, and paper.  The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the computer or user wins, loses, or draws.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Chapter 4:  Mathematical Functions, Characters, and Strings

  * Exercise 4.18:  (Student major and status)  Write a program that prompts the user to enter two characters and displays the major and status represented in the characters.  The first character indicates the major and the second is a number of 
    1, 2, 3, or 4, which indicates whether a student is a freshman, sophomore, junior, or senior.  Suppose the following characters are used to denote majors: M: Mathematics, C: Computer Science, I: Information Technology.

  * Exercise 4.23:  (Financial Application)  Write a program that reads the following information and prints a payroll statement:
            Employee's name:
            Number of hours worked:
            Hourly pay rate:
            Federal Tax withholding:
            State tax withholding:

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Chapter 5:  Loops
  * Exercise 5.3: (Conversion from Kilograms to pounds)  Write a program that displays the following table (note 1 kilogram is 2.2 pounds)

  * Exercise 5.30:  (Financial application: compound value)  Write a program that prompts the user to enter an amount (e.g, 100), the annual interest rate (e.g., 5), and the number of months (e.g., 6) then display the amount in savings account        after the given month.

  * Exercise 5.32:  (Game: Lottery)  Revise Listing 3.8 lottery.java, to generate a lottery of a two-digit number.  The two digits in the number are distinct.  (Hint: generate the first digit.  Use a loop to continuously generate the second digit     until it is different from the first digit.)
  
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Chapter 6: Methods

  * Exercise 6.9:  (Conversion between feet and meters)  Write a class that contains the following two methods:

      public static double footToMeter (double foot)

      public static double meterToFoot (double meter)

      the formula for conversion is:
        meter = 0.305 * foot
        foot = 3.279 * meter

    Write a test program that these methods and displays a conversion table.
  
  * Exercise 6.11:  (Financial application: compute commissions)  Write an application that computes the commission, using the following scheme in programming exercise 5.39.  The header of the method is as follows:
      public static double computeCommission(double salesAmount)

    Write a program that displays a conversion table.

  * Exercise 6.18:  (Check Password)  Some websites impose certain rules for passwords.  Write a method that checks whether a string is a valid password.  Suppose the password rules are as follows:
      * A password must have at least 8 characters.
      * A password must contain only letters and digits.
      * A password must contain at least two digits.
    Write a program that prompts the user to enter a password and displays Valid Password if the rules are followed, or Invalid Password otherwise.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Chapter 7:  Single-Dimensional Arrays
  * Exercise 7.8:  (Average an array)  Write two overloaded methods that return the average of an array with the following headers

      public static double average (int[] array)
      public static double average (double [] array)

    Write a program that prompts the user to enter 10 integers, invokes the first method, then displays the average value; prompts the user to enter 10 double values, invokes the second method, then displays the average value.
    
  * Exercise 7.15: (Eliminate Duplicates)  Write a method that returns a new array by eliminating the duplicate values in the array by using the following method header:

      public static int[] eliminateDuplicates(int[] list)

    Write a test program that reads in 10 integers, invokes the method, and displays the distinct numbers separated by exactly one space.
            

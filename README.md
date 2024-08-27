Example Problems are from Introduction to Java Programming and Data Structures. 12th Edition.  By Daniel Liang

-------------------------------------------------------------------------------------------------------------------------------------------------------
Chapter 1: Introduction to Computers, Programs and Java.

-------------------------------------------------------------------------------------------------------------------------------------------------------

Chapter 2: Elementary Programming

  * Exercise 2.7:  (Find the number of years)  Write a program that prompts the user to enter the minutes (e.g. 1 Billion), and display the maximum number of years and remaining days for the minutes.  For Simplicity, assume that a year has 365 
    days.
  
  * Exercise 2.14:  (Health Application: computing BMI) Body Mass Index (BMI) is a measure of health on weight.  It can be calculated by taking your weight in kilograms and divided by the square of your height in meters.  Write a program that         prompts the user to enter a weight in pounds and a height in inches and displays the BMI.  Note: 1 pound is 0.45359237 kilograms and one inch is 0.0254 meters.
  
  * Exercise 2.23:  (Cost of driving) Write a program that prompts the user to enter the distance to drive, fuel efficiency of the car in miles per gallon and the price per gallon.  Then display the cost of the trip.
  
------------------------------------------------------------------------------------------------------------------------------------------------------
Chapter 3: Selections

  * Exercise 3.2:  (Game: Add three numbers)  The program in Listing 3.1 AdditionQuiz.Java generates two integers and prompts the user to enter the sum of these two integers.  Revise the program to generate three single-digit integers and prompts     the user to enter the sum of these three integers.

  * Exercise 3.4:  (Random Month) Write a program that randomly generates an integer between 1 and 12 and displays the English month names.  January, February..., December for the numbers 1,2...,12.

  * Exercise 3.11:  (Find the number of days in a month) Write a program that prompts the user to enter the month and year and displays the number of days in the month.  For example, if the user entered month 2 and year 2012, the program should       display that February 2012 has 29 days.  If the user entered month 3 and year 2015, the program should display that March 2015 has 31 days.

  * Exercise 3.17:  (Game: Scissors, Rock, Paper) Write a program that plays the popular scissors-rock-paper game.  (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock).  The program randomly generates a number         0,1, or 2 representing scissors, rock, and paper.  The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the computer or user wins, loses, or draws.

------------------------------------------------------------------------------------------------------------------------------------------------------

Chapter 4:  Mathematical Functions, Characters, and Strings

  * Exercise 4.18:  (Student major and status)  Write a program that prompts the user to enter two characters and displays the major and status represented in the characters.  The first character indicates the major and the second is a number of 
    1, 2, 3, or 4, which indicates whether a student is a freshman, sophomore, junior, or senior.  Suppose the following characters are used to denote majors: M: Mathematics, C: Computer Science, I: Information Technology.

  * Exercise 4.23:  (Financial Application)  Write a program that reads the following information and prints a payroll statement:
            Employee's name:
            Number of hours worked:
            Hourly pay rate:
            Federal Tax withholding:
            State tax withholding:

------------------------------------------------------------------------------------------------------------------------------------------------------

Chapter 5:  Loops
  * Exercise 5.3: (Conversion from Kilograms to pounds)  Write a program that displays the following table (note 1 kilogram is 2.2 pounds)

  * Exercise 5.30:  (Financial application: compound value)  Write a program that prompts the user to enter an amount (e.g, 100), the annual interest rate (e.g., 5), and the number of months (e.g., 6) then display the amount in savings account        after the given month.

  * Exercise 5.32:  (Game: Lottery)  Revise Listing 3.8 lottery.java, to generate a lottery of a two-digit number.  The two digits in the number are distinct.  (Hint: generate the first digit.  Use a loop to continuously generate the second digit     until it is different from the first digit.)
  
------------------------------------------------------------------------------------------------------------------------------------------------------

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

------------------------------------------------------------------------------------------------------------------------------------------------------

Chapter 7:  Single-Dimensional Arrays
  * Exercise 7.8:  (Average an array)  Write two overloaded methods that return the average of an array with the following headers

      public static double average (int[] array)
      public static double average (double [] array)

    Write a program that prompts the user to enter 10 integers, invokes the first method, then displays the average value; prompts the user to enter 10 double values, invokes the second method, then displays the average value.
    
  * Exercise 7.15: (Eliminate Duplicates)  Write a method that returns a new array by eliminating the duplicate values in the array by using the following method header:

      public static int[] eliminateDuplicates(int[] list)

    Write a test program that reads in 10 integers, invokes the method, and displays the distinct numbers separated by exactly one space.

  * Exercise 7.27: (Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are closed on the first day of school. As the students enter, the first student, denoted S1, opens every locker. Then the second student, S2, begins with the second locker, denoted L2, and closes every other locker.  Student S3 begins with the third locker and changes every third locker (closes it if it was open, and opens it if it was closed). Student S4 begins with locker L4 and changes every fourth locker. Student S5 starts with L5 and changes every fifth locker, and so on, until student S100 changes L100

After all the students have passed through the building and changed the lockers, which lockers are open? Write a program to find your answer and display all open locker numbers separated by exactly one space. (Hint: Use an array of 100 Boolean elements, each of which indicates whether a locker is open (true) or closed (false). Initially, all lockers are closed.)
            
------------------------------------------------------------------------------------------------------------------------------------------------------

Chapter 8: Multi-Dimensional Arrays
  * Exercise 8.37:  (Guess the capitals) Write a program that repeatedly prompts the user to enter a capital for a state.  Upon receiving the user input, the program reports whether the answer is correct.  Assume that 50 states and their         
    capitals are stored in a two-dimensional array, as shown in Figure 8.10.  The program prompts the user to answer all state capitals and displays the total correct count.

     Figure 8.10: A two-dimensional array stores states and their capitals.
------------------------------------------------------------------------------------------------------------------------------------------------------

Chapter 9: Objects and Classes
  * Exercise 9.1: (The Rectangle Class) Following the example of the Circle class in section 9.2, design a class named Rectangle to represent a rectangle.  This class contains:
      * Two double data fields named width and height that specify the width and height of the rectangle.  The default values are 1 for both width and height.
      * A no-arg constructor that creates a default rectangle.
      * A constructor that creates a rectangle with the specified width and height.
      * A method named getArea() that returns the area of this rectangle.
      * A method named getPerimeter() that returns the perimeter of this rectangle.

    Write a test program that creates two Rectangle objects-one with width 4 and height 40, and the other width 3.5 and height 35.9.  Display the width, height, area, and perimeter.

   * Exercise 9.7 (The Account class)  Design a class named Account that contains:
       * A private int data field named id for the account (default 0)
       * A private double data field named balance for the account (default 0)
       * A private double data field named annualInterestRate that stores the current interest rate (default 0).  Assume that all accounts have the same interest rate.
       * A private Date data field named dateCreated that stores the date when the date was created.
       * A no-arg constructor that creates a default account.
       * A constructor that creates an account with the specified id and initial balance.
       * The accessor and mutator methods for id, balance, and annualInterestRate,
       * The accessor method for dateCreated.
       * A method named getMonthlyInterestRate() that returns the monthly interest rate.
       * A method named getMonthlyInterest() that returns the monthly interest.
       * A method named withdraw that withdraws a specified amount from the account.
       * A method named deposit that deposits a specified amount to the account.
         
     Write a test program that creates an Account object with an account id of 1122, a balance of $20,000, and an annual interest rate of 4.5%.  Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, and print the       balance, the monthly interest, and the date when the account was created.

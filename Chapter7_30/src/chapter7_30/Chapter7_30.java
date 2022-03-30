/*
Chapter 7 Programming excercise 30
Riky Hernandez
9/16/21
Description: A program that prompts the user to enter a series of integer and it displays if there four consecutive numbers in a row
`;-.          ___,
  `.`\_...._/`.-"`
    \        /      ,
    /()   () \    .' `-._
   |)  .    ()\  /   _.'
   \  -'-     ,; '. <
    ;.__     ,;|   > \
   / ,    / ,  |.-'.-'
  (_/    (_/ ,;|.<`
    \    ,     ;-`
     >   \    /
    (_,-'`> .'
          (_,'
 */
package chapter7_30;

import java.util.Scanner;

public class Chapter7_30 {

    public static boolean isConsecutiveFour(int[] values){
        
       for (int i=0; i < values.length - 3; i++) {    //checking every value in the input
           boolean isEqual = true;
           for (int j= i; j <  i+3; j++){              //checking to see if the current input is the same as the next input     
               if (values[j] != values[j+1]){           //repeats to the next input if they dont match
                  isEqual =false;
                   break;
               }
           }
           if (isEqual)
               return true;
       }
       return false;
    }
    
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
       System.out.print("Enter the number of values: ");        //user inputs how many digits we can use, which is determined hpw many arrays we have
       int size = input.nextInt();
       
       int[] values = new int[size];
       
       System.out.print("Enter the values: ");              //user enters the numbers
       for (int i = 0; i  < values.length; i++){        
           values[i] = input.nextInt();                 //the numbers are going inside the arrays to be stored as values
       }
       
       if (isConsecutiveFour(values))                               //the method from above is used, if is true it prints that stament
           System.out.println("The list has conecutives fours");
       else
           System.out.println("The list has no consectives fours");     //if not true it prints this statement
       
    }
    
}

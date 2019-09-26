/*
 * Ryan Nance
 * nancera@mail.uc.edu
 * Sources: https://www.geeksforgeeks.org/pascal-triangle/ 
 * Due Date: 09/26/2019
 * Project Description:
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
package main;

public class Main {
	public static void main(String[] args) {
        int lines = 5, j = 0; //requested number of lines, lines =5
        for(int i = 1; i <= lines; ++i, j = 0) {//
            for(int space = 1; space <= lines - i; ++space) {
                System.out.print(" "); //for loop to print spaces to keep code center alligned and spaced 
            }
            while(j != 2 * i - 1) { //prints an incremental pyramid
                System.out.print(i);
                ++j;
            }
            System.out.println();//prints all print statements
        }
	}
}
	

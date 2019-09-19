/*
 * Ryan Nance
 * nancera@mail.uc.edu
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
        int lines = 5, j = 0;
        for(int i = 1; i <= lines; ++i, j = 0) {
            for(int space = 1; space <= lines - i; ++space) {
                System.out.print("  ");
            }
            while(j != 2 * i - 1) {
                System.out.print(i);
                ++j;
            }
            System.out.println();
        }
	}
}
	


/*
	public static void main(String[] args) {
		int lines = 5;
		for (int i = 1; i < lines; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
*/
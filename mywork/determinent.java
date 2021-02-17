package mywork;

import java.util.Scanner;

public class determinent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1, b = -11, c = 28;
       int root1, root2;

     int determinant = b * b - 4 * a * c;

        // condition for real and different roots
        if(determinant > 0) {
            root1 = (int)(-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (int)(-b - Math.sqrt(determinant)) / (2 * a);

            System.out.print(root1);
            System.out.print(root2);
        }
        // Condition for real and equal roots
        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);

            System.out.print(root1);
        }
        // If roots are not real
        else {
       
           

           
        }
    }
	}



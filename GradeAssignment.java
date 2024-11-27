package condition;

import java.util.Scanner;

public class GradeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
	      
        System.out.println("Enter The value of Hardness :");
		float hs = input.nextFloat();
		System.out.println("Enter The value of Carbon Content :");
		float cc = input.nextFloat();
		System.out.println("Enter The value of Tensile Strength :");
		float ts = input.nextFloat();
		
		 int grade;

		 if (hs> 50 && cc < 0.7 && ts > 5600) {
	            grade = 10;
	        } else if (hs> 50 && cc < 0.7) {
	            grade = 9;
	        } else if (cc < 0.7 && hs > 5600) {
	            grade = 8;
	        } else if (hs > 50 && hs > 5600) {
	            grade = 7;
	        } else if (hs> 50 || cc < 0.7 ||  ts > 5600) {
	            grade = 6;
	        } else {
	            grade = 5;
	        }

       
       
        System.out.println("The grade of the steel is: " + grade);

	}

}

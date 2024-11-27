package condition;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int number=100;
		
		while(number<=200) {
			if (number % 9==0) {
				sum+=number;
				
			}
			number++;
			
		}
		System.out.println("the sum of all divisible by 9"+sum);
	}

}

package Class_Object;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator.powerDouble(4, 2);
		Calculator.powerInt(16,2);

	}

}
class Calculator{
	static void powerInt(int num1,int num2) {
		System.out.println("The value is: "+Math.pow(num1, num2));
	}
	
	static void powerDouble(double num1,int num2) {
		System.out.println("The value is: "+Math.pow(num1, num2));
	}

}

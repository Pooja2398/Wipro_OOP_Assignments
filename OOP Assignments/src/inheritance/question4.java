package inheritance;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b=new Bird();
        b.eat();
        b.fly();
	}

}
class Bird extends Animals{
	void fly() {
		System.out.println("Bird can fly");
	}
}

class Animals{
	
	void eat() {
		System.out.println("Animal is eating.");
	}
	void sleep() {
		System.out.println("Animal is Sleeping.");

	}

}

package inheritance;

public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c=new Circle();
		Shape t=new Triangle();
		Shape s=new Square();
		
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();

	}

}
class Shape {
	void draw() {
		System.out.println("Drawing Shape");
	}
	void erase() {
		System.out.println("Erasing shape");
	}

}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
	public void erase() {
		System.out.println("Erasing Circle");
	}
}

class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	
	public void erase() {
		System.out.println("Erasing Triangle");
	}
}

class Square extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
	
	public void erase() {
		System.out.println("Erasing Square");
	}
}


package polymorphism;

public class question6 {
		// TODO Auto-generated method stub
		String name;
		String taste;
		int size;
		
		question6(String name,String taste, int size){
			this.name=name;
			this.taste=taste;
			this.size=size;
		}
		
		void eat() {
			System.out.println("Fruit "+ name+" taste "+taste);
		}

}
class Apple extends question6{
	
	Apple(String name,String taste,int size){
		super(name,taste,size);
	}
	@Override
	void eat() {
		System.out.println("Fruit "+ name+" taste "+taste);
	}
}

class Orange extends question6{
	
	Orange(String name,String taste,int size){
		super(name,taste,size);
	}
	@Override
	void eat() {
		System.out.println("Fruit "+ name+" taste "+taste);
	}

}

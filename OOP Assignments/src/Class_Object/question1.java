package Class_Object;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1=new Box(200,350,250);
		double vol=box1.volume();
		System.out.println("The volume of the box is "+ vol);
			

	}

}
class Box{
	double width;
	double depth;
	double height;
	
	public Box(double w, double h, double d)
    {
        System.out.println("Constructing Box");
        width = w;
        height = h;
        depth = d;
    }
	double volume()
    {
        return width * height * depth;
    }
}

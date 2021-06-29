package polymorphism;

public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Pooja yadav", 900000, 2021, "62ghg73");
		System.out.println(e);
	}

}
class Person {

	protected String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}
class Employee extends Person {
	private double annualSalary;
	private int YOJ;
	private String NIN;
	
	public Employee(String name, double annualSalary, int YOJ, String NIN) {
		super(name);
		this.annualSalary = annualSalary;
		this.YOJ = YOJ;
		this.NIN = NIN;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public int getYOJ() {
		return YOJ;
	}

	public String getNIN() {
		return NIN;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [annualSalary=" + annualSalary + ", yearOfJoining=" + YOJ + ", nationalInsuranceNo="
				+ NIN + ", name=" + name + "]";
	}
	
	
}

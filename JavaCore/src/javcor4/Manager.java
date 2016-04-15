package javcor4;

public class Manager extends Worker{
	
	private int salary;

	@Override
	public String toString() {
		return "Manager [salary=" + salary + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

	public Manager(String firstName, String secondName, int age, int salary) {
		super(firstName, secondName, age);
		this.salary = salary;
	}
	
	
}

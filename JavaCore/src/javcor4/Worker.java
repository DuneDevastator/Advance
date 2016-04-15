package javcor4;

public class Worker {
	
	private String FirstName;
	private String secondName;
	private int age;
	
	public Worker(String firstName, String secondName, int age) {
		super();
		FirstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}
	


	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Worker [FirstName=" + FirstName + ", secondName=" + secondName
				+ ", age=" + age + "]";
	}
	
	public void sayHello(){
		
		System.out.println("say from worker");//поліморфізм коли один об'єкт має різну форму 
		
		}
	
	

}

package javcor4;

public class Main {

	public static void main(String[] args) {
		
		Manager manager = new Manager ("auto","ivanov",23,10000);
		TaxiDriver driver = new  TaxiDriver("vova", "petrov", 12, 400);
		
		System.out.println(manager.toString());
		System.out.println(driver.toString());
		
		manager.sayHello();//ןמכ³למנפ³חל
		driver.sayHello();//ןמכ³למנפ³חל
		
		
	}

}

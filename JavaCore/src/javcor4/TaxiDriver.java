package javcor4;

public class TaxiDriver extends Worker{
	
	private int counter;

	@Override
	public String toString() {
		return "TaxiDriver [counter=" + counter +" "+super.toString()+ "]";
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	

	public TaxiDriver(String firstName, String secondName, int age, int counter) {
		super(firstName, secondName, age);
		this.counter = counter;
	}
	public void sayHello(){
		
		System.out.println("say from worker driver");//ןמכ³למנפ³חל
		
		}
	

}

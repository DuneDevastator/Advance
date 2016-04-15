package deleg;

public class Human {
	private  Hands hands = new Hands() ;
	private Legs legs = new Legs();
	
	public void clapping(){
		hands.clapping();
	
	}
	public void jumping(){
		legs.jumping();
	}	
	
	
	
}

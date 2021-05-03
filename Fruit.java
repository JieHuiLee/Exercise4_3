package Exercise4_3;

public class Fruit {
	protected String name;
	
	public Fruit(){ 
		this.name = " ";
	}
	
	public Fruit(String name){ 
		this.name = name;
		System.out.println(name+ " constructor is invoked.");
	}
	
	public String getName() { //overloading with no argument
		return name;
	}	
	
	public String getName(String n) { //overloading with 1 argument
		return n;
	}
	
	public String toString() { //overriding method
		return "Eat more "+ getName("Apple") + " will be more healthy.";
	}		
}// end for Fruit class

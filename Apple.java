package Exercise4_3;

public class Apple extends Fruit{ //sub class of Fruit
	protected double price;//p
	protected int quantity;//q
	
	public Apple() {//constructor for sub class without argument
		super(); //inherit data,method from super class (constructor with no argument)
		this.price = 0;	
		this.quantity = 0;	
	}
	
	public Apple(String name, double p,int q) {//constructor for sub class with 3 argument
		super(name);  //called method in superclass with passing parameter
		this.price = p;	
		this.quantity = q; 

		setInfo();
		setInfo(name);
    }
	
	 public void setInfo(){ 
		 System.out.println("The info: ");
	   } 
	
	 public void setInfo(String name){ 
		 System.out.println(name);
	   } 
	
		
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	 
	public int getQuantity(int q) {
		return q;
	}
	
	public double totalPrice() { //overloading with no argument
		return price * 3;
	}
	
	public double totalPrice(int q) { //overloading with 1 argument
		return price * q;
	}
	
	public double totalPrice(double p, int q) { //overloading with 2 arguments
		return p * q;
	}
	
	public String toString() {//overriding method
		return super.toString()
				+ "\nName\t: " + name 
				+ "\nPrice\t: "+ price 
				+"\nQuantity: " + quantity + " pcs"
				+ "\nTotal Price : RM " + totalPrice(8) + " with " + getQuantity(8) + "pcs";
	}
	
}// end for class Apple extends

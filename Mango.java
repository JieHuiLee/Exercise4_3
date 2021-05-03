package Exercise4_3;

public class Mango extends Fruit{ //sub class of Fruit
	private int quantity;//q
	private String color;//c
	private double vitaminC;//v
	
	public Mango() { //constructor for sub class without argument
		super();
		this.quantity = 0;
		this.color = " ";
		this.vitaminC = 0.00;
	}
	
	public Mango(String name, int q, String c, double v) {//constructor for sub class with 3 argument
		super(name);
		this.quantity = q;
		this.color = c;
		this.vitaminC = v;
		
		setInfo();
		setInfo(name);
		setTotalVitaminC(q,v); //call method for overloading
	}
	
	public void setInfo() 
	 {
		 System.out.println("The info: ");
	 }
	
	public void setInfo(String name)
	 {
		 System.out.println(name);
	 }
	
	public void setTotalVitaminC(int q, double v) 
	{
	    if (q >= 0)
		    quantity = q;
		else 
		    quantity = 0;
   }
    
    public int getQuantity() {
		return this.quantity;
	}
    
    public int getQuantity(int q) {
		return q;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getVitaminC() { 
		return this.vitaminC;
	}
	
	public double calTotalVitaminC() { //overloading with no argument
		return quantity * 36.4;
	}
	
	public double calTotalVitaminC(int q) { //overloading with 1 argument
		return q *vitaminC;
	}
	
	public double calTotalVitaminC(int q,  double v) { //overloading with 2 arguments
		return q * v;
	}
	
	public String toString() {//overriding method
		return super.toString() 
				+ "\nColor\t: " + getColor()
				+"\nQuantity: " + quantity + " pcs"
				+ "\nVitamin C: " + getVitaminC()+" mg"
				+ "\nTotal Vitamin C: " + calTotalVitaminC(4, 36.4)+" mg with " + getQuantity(4) + " pcs";
	}

}// end for class Mango extends

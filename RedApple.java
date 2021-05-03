package Exercise4_3;

public class RedApple extends Apple{ //sub class of Apple
	private double weight;//w
	private int nutrient;//n
	
	public RedApple() { //constructor for sub class without argument
		super(); 
		this.weight = 0.00;
		this.nutrient = 0;
	}
	
	public RedApple(String name,double p, int q, double w, int n) { //constructor for sub class with 5 argument
		super(name,p,q);
		this.weight = w;
		this.nutrient = n;
		
		setWeight();
		setWeight(weight);
		//q = 7, w = 182grams
    }
	
	public void setWeight() 
	 {
		 System.out.println("The weight (grams): ");
	 }
	
	public void setWeight(double w) 
	 {
		 System.out.println(w);
	 }
	
	public int getQuantity() {
		return quantity;
	}
	 
	public int getQuantity(int q) {
		return q;
	}
	
	public double getWeight() {
		return weight;
	}
	 
	public double getWeight(double w) {
		return w;
	}
	
	public double TotalWeight(){ //overloading with no argument
		return quantity * 182.00;
	}
	
	public double TotalWeight(double w){ //overloading with 1 argument
		return quantity * w;
	}
	
	public double TotalWeight(int q, double w){ //overloading with 2 arguments
		return q* w;
	}
	
	public int getNutrient() {
		return this.nutrient;
	 }	
	
	public double calSumPrice() {
	     return super.price * super.quantity;
	}

	public String toString() {//overriding method
		return super.toString()
			+ "\nTotal Weight\t: "+ TotalWeight(8, 170.00) + " (grams) with " + getQuantity(8) + " pcs " + getWeight(170.00) + " grams"
			+ "\nNutrient\t: "+ getNutrient() + " calories"
			+ "\nTotal Price\t: RM " + calSumPrice();
	}
}// end for class RedApple extends 


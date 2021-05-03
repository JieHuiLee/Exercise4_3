package Exercise4_3;

public class GreenApple extends Apple{ //sub class of Apple
	private String taste;//t
	private double pHValue;//pH
	private double payment;//py
	
	public GreenApple() { //constructor for sub class without argument
		super();
		this.taste = "";	
		this.pHValue = 0.00;	
		this.payment = 0.00;	
	}
	
	public GreenApple(String name, double p,int q, String t, double pH, double py) { //constructor for sub class with 6 argument
		super(name,p,q);
		this.taste = t;	
		this.pHValue = pH;	
		this.payment = py;	
		
		setInfo();
		setInfo(name);
	}
	
	public void setInfo() 
	 {
		 System.out.println("The info: ");
	 }
	
	public void setInfo(String name)
	 {
		 System.out.println(name);
	 }
	

	public String getTaste() {
		return this.taste;
	}
	
	public double getpHValue() {
		return this.pHValue;
	 }		
	
	 public double getPayment() {
		return payment;
	}
	 
	 public double calSumPrice() { //overloading with no argument
		  return price * 4;
	 }
	 
	public double calSumPrice(double p) { //overloading with 1 argument
		  return p * quantity;
	 }
	
	public double calSumPrice(double p, int q) { //overloading with 2 arguments
		  return p * q;
	 }
	
	public double calDiscount() {
		return this.calSumPrice() - this.calSumPrice() * 0.10;
     }
	
	public double balance() {
		return this.payment - this.calDiscount() ;
	}
	
	public String toString() {//overriding method
		return super.toString() 
			+ "\nTaste\t: "+ getTaste()
			+ "\npH Value: "+ getpHValue() 
			+ "\nPayment\t: RM "+ getPayment()
			+ "\nTotal Price: RM "+ calSumPrice(30.09)
			+ "\nPrice after discount (10%): RM "+ calDiscount() 
			+ "\nBalance\t   : RM "+ balance();
	}
	
}// end for class GreenApple extends

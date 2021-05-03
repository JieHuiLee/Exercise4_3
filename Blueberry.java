package Exercise4_3;

public class Blueberry extends Fruit{ //sub class of Fruit
	private int size;//s (serving size)
	private int vitaminK;//vK
	
	public Blueberry() { //constructor for sub class without argument
		super();
		this.size = 0;	
		this.vitaminK= 0;
	}
	
	public Blueberry(String name, int s, int vK) { //constructor for sub class with 3 argument
		super(name);
		this.size = s;	
		this.vitaminK= vK;
		
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
	
	public int getSize() {
		return this.size;
	}
	
	public int getSize(int s) {
		return s;
	}
	
	
	public int getVitaminK() {
		return this.vitaminK;
	}
	

	
	public int calTotalVitaminK() { //overloading with no argument
		return size * 29;
	}
	
	public int calTotalVitaminK(int s) { //overloading with 1 argument
		return s * vitaminK;
	}
	
	public int calTotalVitaminK(int s, int vK) { //overloading with 2 arguments
		return s * vK;
	}	
	
	public String toString() {//overriding method
		return super.toString() 
				+ "\nSize\t: " + getSize() + " cup"
				+ "\nVitamin K: " + getVitaminK() + " mcg"
	         	+ "\nTotal Vitamin K: " + calTotalVitaminK(5,29)+" mcg with " + getSize(5) + "cup";
	}

}// end for class Blueberry extends


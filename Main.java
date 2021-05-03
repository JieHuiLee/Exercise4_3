package Exercise4_3; //Modify Exercise 4.2

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Fruit Shop");
		System.out.print("--------------------------\n");
		
		//Fruit f = new Fruit(); //universal
		System.out.println("      Fruit Detail");
		System.out.print("=============================");
		System.out.println();
		
		Apple a = new Apple ("Apple",18.00,5);
		System.out.println("==================\n"+a);
		System.out.println();
		
		GreenApple g= new GreenApple("Green Apple",30.09,4,"sour", 4.0, 150.00);
		System.out.println("\n==================\n"+g);
		System.out.println();
		
		RedApple r = new RedApple("Red Apple",11.90,7,182.00,52);
		System.out.println("\n==================\n"+r);
		System.out.println();
		
		Mango m = new Mango ("Mango",5,"Vivid yellow",36.4);
		System.out.println("\n==================\n"+m);
		System.out.println();
		
		Blueberry b = new Blueberry("Blueberry", 3, 29);
		System.out.println("\n==================\n"+b);
		System.out.println("\n=======Thank You======");

	}

}//end main class

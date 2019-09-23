/**
 * 
 * @author Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment - Decorator Design Pattern
 * 23 September 2019
 */
public class VanillaIceCream extends IceCream {

	//main constructor; initializes the description of the vanilla ice cream.
	public VanillaIceCream() {
		this.description = "Vanilla Ice Cream";
	}
	
	//sets the cost of the vanilla ice cream and returns it.
	public double getCost() {
		return 0.75;
	}
	
}

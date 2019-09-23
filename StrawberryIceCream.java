/**
 * @author Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment - Decorator Design Pattern
 * 23 September 2019
 */
public class StrawberryIceCream extends IceCream {

	//sets the description of the strawberry ice cream.
	public StrawberryIceCream() {
		this.description = "Strawberry Ice Cream";
	}
	
	//returns the cost of the strawberry ice cream.
	public double getCost() {
		return 0.8;
	}
}

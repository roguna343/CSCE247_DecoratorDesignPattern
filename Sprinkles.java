/**
 * @author Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment - Decorator Design Pattern
 * 23 September 2019
 */
public class Sprinkles extends ToppingsDecorator {

	//the IceCream object that will have the sprinkles added to.
	private IceCream iceCream;
	
	//initializes the parameter iceCream as the ice cream that will have toppings added.
	public Sprinkles(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	//returns the description of the ice cream with the sprinkles.
	public String toString() {
		return this.iceCream.toString() + " + sprinkles";
	}
	
	//returns the cost of the ice cream with the cost of sprinkles added.
	public double getCost() {
		return iceCream.getCost() + 0.2;
	}
}

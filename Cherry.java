/**
 * @author Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment - Decorator Design Pattern
 * 23 September 2019
 */
public class Cherry extends ToppingsDecorator {
	
	//the IceCream object that will receive the cherry topping.
	private IceCream iceCream;
	
	/**
	 * main constructor;
	 * @param iceCream the IceCream object that will receive the cherry topping.
	 */
	public Cherry(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	//returns the description of the ice cream with its respective topping.
	public String toString() {
		return this.iceCream.toString() + " + a cherry on top";
	}
	
	//returns the cost of the ice cream with the cherry added.
	public double getCost() {
		return this.iceCream.getCost() + 0.4;
	}

}

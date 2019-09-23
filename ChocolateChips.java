/**
 * @author Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment - Decorator Design Pattern
 * 23 September 2019
 */
public class ChocolateChips extends ToppingsDecorator {
	
	//the IceCream object that will receive the chocolate chips topping.
	private IceCream iceCream;
	
	//main constructor; initializes the parameter iceCream as the ice cream that will receive the topping.
	public ChocolateChips(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	//returns the description of the ice cream along with its topping.
	public String toString() {
		return this.iceCream.toString() + " + chocolate chips";
	}
	
	//returns the cost of the ice cream with the chocolate chips added.
	public double getCost() {
		return this.iceCream.getCost() + 0.3;
	}

}

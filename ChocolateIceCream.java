/**
 * 
 * @author Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment - Decorator Design Pattern
 * 23 September 2019
 */
public class ChocolateIceCream extends IceCream  {

	//main constructor; sets the description of the chocolate ice cream.
	public ChocolateIceCream() {
		this.description = "Chocolate Ice Cream";
	}
	
	//returns the cost of the chocolate ice cream.
	public double getCost() {
		return 0.9;
	}
}

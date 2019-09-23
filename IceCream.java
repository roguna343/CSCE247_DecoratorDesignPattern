/**
 * @author Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment - Decorator Design Pattern
 * 23 September 2019
 */
public abstract class IceCream {
	
	//the String value stating the type of ice cream.
	protected String description;
	
	//returns the name of the ice cream.
	public String toString() {
		return this.description;
	}
	
	//returns the cost of the ice cream.
	public abstract double getCost();

}

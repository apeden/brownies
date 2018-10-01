package brownies;

/**
 * This class will create tent objects that have a known capacity
 * i.e the number of brownies they can accommodate and a number as a
 * label. The tents also will have an array of brownie objects.
 *  The size of the array depends on the tents capacity. 
 * 
 * @author Alex Peden
 *
 */

public class Tent {
	
	private final int name;
	private final int capacity;
	private double happiness;
	private Brownie[] occupants;
	
	/**Creates a tent with a number label and a capacity for occupants
	 *
	 * @param name       the number label of the tent
	 * @param capacity   the number of brownies that can fit in the tent
	 */
	
	Tent(int tent_name, int tent_capacity){
		name = tent_name;
		capacity = tent_capacity;
		occupants = new Brownie[capacity];
	}

	/** Method: getCapacity   
	 * Returns the capacity of the tent 
	 * 
	 * @return capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	
	/** Method: getHappiness   
	 * Returns the happiness of the tent
	
	 * @return happiness
	 */
	public double getHappiness() {
		return happiness;
	}
	
	/** Method: getOccupants   
	 * Returns the occupants of the tent
	 * 
	 * @return occupants
	 */	
	public Brownie[] getOccupants() {
		return occupants;
	}
		
	/** Method: toString   
	 * Returns the tent name as a string identifier */
	public String toString() {
		String string_name;
		string_name = Integer.toString(name);
		return "Tent number " + string_name;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

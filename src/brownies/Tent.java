package brownies;

/**
 * This class will create tent objects that have a known capacity
 * i.e the number of brownies they can accommodate and a name which
 * could be a number or an int. The tents also will have an array 
 * of brownies objects. The size of the array depends on the tents 
 * capacity. 
 * 
 * @author Alex Peden
 *
 */

public class Tent {
	
	private int name;
	private int capacity;
	private double happiness;
	
	/**Creates a tent with a number label and a capacity
	 *
	 * @param name       the number label of the tent
	 * @param capacity   the number of brownies that can fit in the tent
	 */
	
	Tent(int tent_name, int tent_capacity){
		name = tent_name;
		capacity = tent_capacity;
	}

	/**Returns the tent name as a string identifier*/
	public String toString() {
		String string_name;
		string_name = Integer.toString(name);
		return "This is tent number " + string_name;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
